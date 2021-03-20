package com.jumia.ass.utils;

import java.util.ArrayList;
import java.util.List;

import com.jumia.ass.dtos.Response;
import com.jumia.ass.entities.Customer;

public class PhoneNumbersUtils {
	public static List<Response> extractPhoneNumbersInfo(List<Customer> customers) {
		List<Response> responses = new ArrayList<Response>();
		for (Customer customer : customers) {
			String phone = customer.getPhone();
			String number = phone.substring(7);
			String code = phone.substring(1, 4);
			Response response = new Response(null, RegexUtils.NOT_VALID, code, number);
			
			switch (code) {
			case "237":
				response.setCountry(RegexUtils.CAM_COUNTRY);
				if (phone.matches(RegexUtils.CAM_REGEX)) {
					response.setState(RegexUtils.VALID);
				}
				break;
			case "251":
				response.setCountry(RegexUtils.ETH_COUNTRY);
				if (phone.matches(RegexUtils.ETH_REGEX)) {
					response.setState(RegexUtils.VALID);
				}
				break;
			case "212":
				response.setCountry(RegexUtils.MOR_COUNTRY);
				if (phone.matches(RegexUtils.MOR_REGEX)) {
					response.setState(RegexUtils.VALID);
				}
				break;
			case "258":
				response.setCountry(RegexUtils.MOZ_COUNTRY);
				if (phone.matches(RegexUtils.MOZ_REGEX)) {
					response.setState(RegexUtils.VALID);
				}
				break;
			case "256":
				response.setCountry(RegexUtils.UGA_COUNTRY);
				if (phone.matches(RegexUtils.UGA_REGEX)) {
					response.setState(RegexUtils.VALID);
				}
				break;
			}
			responses.add(response);
		}
		return responses;
	}
}
