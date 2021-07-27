package com.APIAssignment.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Listeners;


@Listeners(com.APIAssignment.Listeners.TestNGListeners.class)

public class TestBase {
	
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
			prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
