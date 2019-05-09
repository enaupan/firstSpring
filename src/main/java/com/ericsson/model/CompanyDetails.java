package com.ericsson.model;

import com.ericsson.response.ResponseObject;

public class CompanyDetails implements ResponseObject{
	
	private int companyCode;
	private String companyName;
	private Address address;
	
	public CompanyDetails(int companyCode, String companyName, Address address) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.address = address;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CompanyDetails [companyCode=" + companyCode + ", companyName="
				+ companyName + ", address=" + address + "]";
	}
}
