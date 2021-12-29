package fr.ensim.tp5;


public class Feature {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	private String type;
	private Geometry geometry;
	private Properties properties;
	
	@Override
	  public String toString() {
	    return geometry.toString() + properties.toString();
	 }
	
}
