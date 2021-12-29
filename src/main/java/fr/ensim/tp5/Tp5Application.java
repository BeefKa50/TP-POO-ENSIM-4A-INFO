package fr.ensim.tp5;

import  org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp5Application {
	
	private static final Logger log = LoggerFactory.getLogger(Tp5Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Tp5Application.class, args);
		
	}
	
	/*
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://api-adresse.data.gouv.fr/search/?q=5+rue+Sapin", Quote.class);
			log.info(quote.toString());
		};
	}
	
	*/

}
