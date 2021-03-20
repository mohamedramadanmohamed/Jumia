package com.jumia.ass.dtos;

public class Response {
	private String country;
	private String state;
	private String code;
	private String number;

	public Response(String country, String state, String code, String number) {
		super();
		this.country = country;
		this.state = state;
		this.code = code;
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
