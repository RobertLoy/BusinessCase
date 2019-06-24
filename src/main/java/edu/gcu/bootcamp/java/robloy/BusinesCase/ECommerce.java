package edu.gcu.bootcamp.java.robloy.BusinesCase;

import java.util.Arrays;

public class ECommerce extends Customer {
	
	private String email;
	
	private String [] creditCard  = new String[4];;

	public ECommerce(int custId, String firstName, String lastName, String email, String[] creditCard) {
		super(custId, firstName, lastName);
		this.email = email;
		this.creditCard = creditCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditCard(int index) {
		return creditCard[index];
	}

	public void setcreditCard(int index, String creditCard) {
		this.creditCard[index] = creditCard;
	}

	@Override
	public String toString() {
		return "ECommerce [firstname=" + getFirstName() + ", lastname=" + getLastName() + ",email=" + email + ", creditCard=" + Arrays.toString(creditCard) + "]";
	}

}
