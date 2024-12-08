package com.grats.mapcollection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	private static final String file="src/application.properties";
	
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(file);
		p.load(fis);
		
		String dbUseraName=p.getProperty("db.username");
		String dbPassword=p.getProperty("db.passowrd");
		String dbUrl=p.getProperty("db.url");
		System.out.println(":dbUseraName:"+dbUseraName);
		System.out.println(":dbPassword:"+dbPassword);
		System.out.println(":dbUrl:"+dbUrl);
		p.setProperty("port", "4444");
		p.store(new FileOutputStream(file), "updating properties");
	}
}