package fr.ensim.tp5;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

  private String type;
  private String version;
  private List<Feature> features;
  private String attribution;
  private String licence;
  private String query;
  private int limit;

  public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public List<Feature> getFeatures() {
	return features;
}

public void setFeatures(List<Feature> features) {
	this.features = features;
}

public String getAttribution() {
	return attribution;
}

public void setAttribution(String attribution) {
	this.attribution = attribution;
}

public String getLicence() {
	return licence;
}

public void setLicence(String licence) {
	this.licence = licence;
}

public String getQuery() {
	return query;
}

public void setQuery(String query) {
	this.query = query;
}

public int getLimit() {
	return limit;
}

public void setLimit(int limit) {
	this.limit = limit;
}

@Override
  public String toString() {
    return "Requête adressée à l'API : " + query + "\n\nRésultats : \n\n" + features.toString();
  }
}