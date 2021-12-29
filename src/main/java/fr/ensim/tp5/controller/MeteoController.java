package fr.ensim.tp5.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp5.Feature;
import fr.ensim.tp5.Geometry;
import fr.ensim.tp5.MeteoInfo;
import fr.ensim.tp5.Quote;
import fr.ensim.tp5.Quote2;
import fr.ensim.tp5.Tp5Application;

@Controller
public class MeteoController {
	
	private static final Logger log = LoggerFactory.getLogger(Tp5Application.class);
	
	
    @PostMapping("/meteo")
    public String showAddresses(@ModelAttribute("address") String address, Model model) {
    	System.out.println("Adresse : " + address);
    	model.addAttribute("adresseClient", address);
    	address = address.replaceAll(" ","+");
    	
    	System.out.println("Adresse modifiée : " + address);
    	
    	String request = "https://api-adresse.data.gouv.fr/search/?q=" + address;
    	RestTemplate rest = restTemplate(new RestTemplateBuilder());
    	
    	List<MeteoInfo> meteoList = new ArrayList<MeteoInfo>();
    	try {
			Quote q = rest.getForObject(request, Quote.class);
			System.out.println(q);
			model.addAttribute("features", q.getFeatures());
			
			List<Feature> features = q.getFeatures();
			
			for(Feature feat:features) {
				float longitude = feat.getGeometry().getCoordinates().get(0);
				float latitude = feat.getGeometry().getCoordinates().get(1);
				
				String requestMeteo = "http://api.openweathermap.org/data/2.5/weather?lat=" + 
						latitude + "&lon=" + longitude + "&APPID=3055285378020ffea39c4b625c86d03f";
				
				RestTemplate rest2 = restTemplate(new RestTemplateBuilder());
				Quote2 q2 = rest2.getForObject(requestMeteo, Quote2.class);
				
				String icon = q2.getWeather().get(0).getIcon();
				String img = "http://openweathermap.org/img/wn/" + icon + "@2x.png";
				String description = upperCaseFirst(q2.getWeather().get(0).getDescription());
				float temperature = (float)(q2.getMain().getTemp() - 273.15);
				float temp_min = (float)(q2.getMain().getTemp_min() - 273.15);
				float temp_max = (float)(q2.getMain().getTemp_max() - 273.15);
				float temp_feel = (float)(q2.getMain().getFeels_like() - 273.15);
				int humidity = q2.getMain().getHumidity();
				System.out.println("---------- Meteo description ----------");
				System.out.println("Image : " + img);
				System.out.println("Description météo : " + description);
				System.out.println("Température : " + temperature);
				System.out.println("Température min : " + temp_min);
				System.out.println("Température max : " + temp_max);
				System.out.println("Température ressentie : " + temp_feel);
				System.out.println("Humidité : " + humidity + "%");
				System.out.println("---------- Meteo description ----------");
				
				// Récupérer icône du temps : http://openweathermap.org/img/wn/ICON@2x.png
				
				MeteoInfo meteo = new MeteoInfo(img,description,temperature,temp_min,temp_max,temp_feel,humidity);

				meteoList.add(meteo);
			}
			
			model.addAttribute("meteo",meteoList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "meteo";
    }
    
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	public static String upperCaseFirst(String val) {
	    char[] arr = val.toCharArray();
	    arr[0] = Character.toUpperCase(arr[0]);
	    return new String(arr);
	}
	
}
