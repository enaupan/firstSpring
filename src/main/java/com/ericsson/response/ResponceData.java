package com.ericsson.response;

public class ResponceData {

	private int responseCode;
	private String responseDescription;
	
	ResponseObject data;

	public ResponceData(int responseCode, String responseDescription) {
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
	}
	public ResponceData(int responseCode, String responseDescription,
			ResponseObject responceObject) {
		this(responseCode,responseDescription);
		this.data = responceObject;
	}	

	public int getresponseCode() {
		return responseCode;
	}

	public void setresponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getresponseDescription() {
		return responseDescription;
	}

	public void setresponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public ResponseObject getResponceObject() {
		return data;
	}

	public void setResponceObject(ResponseObject data) {
		this.data = data;
	}
	
	
}
