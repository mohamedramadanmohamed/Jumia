package com.jumia.ass.utils;

public class RegexUtils {
	public static String CAM_REGEX= "\\(237\\)\\ ?[2368]\\d{7,8}$";
	public static String ETH_REGEX= "\\(251\\)\\ ?[1-59]\\d{8}$ ";
	public static String MOR_REGEX= "\\(212\\)\\ ?[5-9]\\d{8}$";
	public static String MOZ_REGEX= "\\(258\\)\\ ?[28]\\d{7,8}$";
	public static String UGA_REGEX= "\\(256\\)\\ ?\\d{9}$";
	
	public static String CAM_COUNTRY= "Cameroon";
	public static String ETH_COUNTRY= "Ethiopia";
	public static String MOR_COUNTRY= "Morocco";
	public static String MOZ_COUNTRY= "Mozambique";
	public static String UGA_COUNTRY= "Uganda";
	
	public static String VALID= "Valid";
	public static String NOT_VALID= "Not Valid"; 
}
