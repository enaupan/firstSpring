package com.ericsson.model;

public class Address {

	private String addressFirstLine,addressSecondLine,landmark,city,state,country;
	private int pincode;
	public Address(String addressFirstLine, String addressSecondLine,
			String landmark, String city, String state, String country,
			int pincode) {
		super();
		this.addressFirstLine = addressFirstLine;
		this.addressSecondLine = addressSecondLine;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getAddressFirstLine() {
		return addressFirstLine;
	}
	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}
	public String getAddressSecondLine() {
		return addressSecondLine;
	}
	public void setAddressSecondLine(String addressSecondLine) {
		this.addressSecondLine = addressSecondLine;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressFirstLine=" + addressFirstLine
				+ ", addressSecondLine=" + addressSecondLine + ", landmark="
				+ landmark + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
}
