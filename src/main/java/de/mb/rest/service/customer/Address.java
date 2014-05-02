package de.mb.rest.service.customer;

public class Address {

	private String street;
	private String houseNumber;
	private String city;
	private String country;
	
	/**
	 * Streetname, i.e. Young Street
	 * @return street
	 */
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * Housenumber, i.e. 42a
	 * @return
	 */
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * City, i.e. San Diego
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Country, i.e. Canada, Germany
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
