package fr.ensim.tp5;

import java.util.List;

public class Geometry {
	private String type;
	private List<Float> coordinates;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Float> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}
	
	@Override
	  public String toString() {
	    return "\"----- Coordonnées :  lon : " + coordinates.get(0) + "; lat : " + coordinates.get(1);
	}
}
