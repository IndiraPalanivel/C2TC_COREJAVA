package com.tnsif.ifet.daythree;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String CustomerCity;
	public Customer() {
		System.out.println("Default constructor");
	}
	public Customer(String customerName, int customerId, String customerCity) {
		this();
		System.out.println("Parameterized constructor");
		this.CustomerName = customerName;
		this.CustomerId = customerId;
		this.CustomerCity = customerCity;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		this.CustomerId = customerId;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.CustomerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + ", CustomerCity="
				+ CustomerCity + "]";
	}
	
	
	

}
