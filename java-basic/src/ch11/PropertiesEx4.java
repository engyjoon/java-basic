package ch11;

import java.util.Properties;

class PropertiesEx4 {

	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println("java.version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		
		System.out.println();
		sysProp.list(System.out);
	}

}
