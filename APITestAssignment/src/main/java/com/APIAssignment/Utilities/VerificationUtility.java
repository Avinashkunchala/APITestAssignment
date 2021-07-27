package com.APIAssignment.Utilities;

import org.json.JSONObject;
import org.testng.Assert;


import io.restassured.response.Response;

public class VerificationUtility {
	
	public static void responseCodeValiddation(Response response, int statusCode) {

		try {
			Assert.assertEquals(statusCode, response.getStatusCode());
			
			System.out.println("Successfully validated status code, status code is :: " + response.getStatusCode());
			
		} catch (AssertionError e) {
			
			System.out.println(e.fillInStackTrace());
			
			System.out.println("Expected status code is :: " + statusCode + " , insted of getting :: " + response.getStatusCode());
			
		} catch (Exception e) {
			
			System.out.println(e.fillInStackTrace());
			
		}
	}
	
	public static void responseTimeValidation(Response response) {
		try {
			
			long time=response.time();
			
			System.out.println("Api response time is :: " + time);
			
		} catch (Exception e) {
			
			System.out.println(e.fillInStackTrace());
		}
	}
	
	public static void responseBodyValidation(Response response , String attributeName, String expectedValue) {
		
		try{
			
			JSONObject json= new JSONObject (response.asString());
			
			String actualValue=json.getString(attributeName);
			
			Assert.assertEquals(actualValue,expectedValue);
			
			System.out.println("Actual Value and Expected Value are same");
			
			System.out.println(attributeName + " : " + expectedValue);
			
			
		}catch (Exception e) {
			
			System.out.println(e.fillInStackTrace());
		}
	}

}
