package edu.gcu.bootcamp.java.robloy.BusinesCase;

import java.util.Arrays;

public class BrickAndMortar extends Customer{
	
	private String streetAddress;
	private String city;
	private String state;
	private String postal;
	
	private String [] phoneNumber = new String[4];

	public BrickAndMortar(int custId, String firstName, String lastName, String streetAddress, String city,
			String state, String postal, String[] phoneNumber) {
		super(custId, firstName, lastName);
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.phoneNumber = phoneNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getPhoneNumber(int index) {
		return phoneNumber[index];
	}

	public void setPhoneNumber(int index, String phoneNumber) {
		this.phoneNumber[index] = phoneNumber;
	}

	@Override
	public String toString() {
		return "BrickAndMortar [firstname=" + getFirstName() + ", lastname=" + getLastName() + ",streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", postal="
				+ postal + ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
	}	

}
