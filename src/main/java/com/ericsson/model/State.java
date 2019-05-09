package com.ericsson.model;

import com.ericsson.response.ResponseObject;

public class State implements ResponseObject{

	private int stateCode;
	private String stateName;
	private int numberOfDistrict;
	
	
	public State(int stateCode, String stateName, int numberOfDistrict) {
		super();
		this.stateCode = stateCode;
		this.stateName = stateName;
		this.numberOfDistrict = numberOfDistrict;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getNumberOfDistrict() {
		return numberOfDistrict;
	}
	public void setNumberOfDistrict(int numberOfDistrict) {
		this.numberOfDistrict = numberOfDistrict;
	}
}
