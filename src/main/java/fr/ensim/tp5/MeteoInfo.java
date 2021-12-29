package fr.ensim.tp5;

public class MeteoInfo {
	private String img;
	private String description;
	public MeteoInfo(String img, String description, float temp, float temp_min, float temp_max, float feels_like,
			int humidity) {
		super();
		this.img = img;
		this.description = description;
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.feels_like = feels_like;
		this.humidity = humidity;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}
	public float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	public float getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(float feels_like) {
		this.feels_like = feels_like;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	private float temp;
	private float temp_min;
	private float temp_max;
	private float feels_like;
	private int humidity;


	
}
