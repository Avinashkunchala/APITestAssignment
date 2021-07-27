package com.APIAssignment.Tests;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APIAssignment.TestBase.TestBase;
import com.APIAssignment.Utilities.VerificationUtility;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class getAPI extends TestBase{
	
	
	@BeforeMethod
	
	public void baseURL() {
		
		RestAssured.baseURI=prop.getProperty("getAPIBaseURI");
	}
	
	
	@Test (description="Verifying the get API by passing the query param as name and value as sachin")
	
	public void getAPIRequest() {
		
		Response response=RestAssured.given().request(Method.GET, prop.getProperty("Params")+"="+prop.getProperty("value"));
		
		VerificationUtility.responseCodeValiddation(response, 200);
		
		VerificationUtility.responseTimeValidation(response);
		
		VerificationUtility.responseBodyValidation(response, "name", prop.getProperty("value"));
		
	}

}
