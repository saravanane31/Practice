package com.saravanan.string;

public class IPAddressValidation {
	
	private static final String IP_ADDRESS_PATTERN = "^([0-255]\\d\\d)";
	private static String ip="24";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ip.matches(IP_ADDRESS_PATTERN));
	}

}
