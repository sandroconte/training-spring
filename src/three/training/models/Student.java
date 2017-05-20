package three.training.models;

import java.util.LinkedHashMap;

public class Student {
	
	String firstName;
	String lastName;
	String country;	
	String favoriteLanguage;	
	String operatingSystem;
	
	public Student(){
	}	

	
	public String getFirstName() {
		return firstName;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operateSystem) {
		this.operatingSystem = operateSystem;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
