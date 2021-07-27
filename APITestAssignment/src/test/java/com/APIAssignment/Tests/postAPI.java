package com.APIAssignment.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APIAssignment.TestBase.TestBase;
import com.APIAssignment.Utilities.VerificationUtility;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postAPI extends TestBase{
	
	@BeforeMethod
	
	public void baseURL() {
		
		RestAssured.baseURI=prop.getProperty("PostAPIBaseURI");
	}
	
	
	@Test (description="Validating the Post API request")
	
	public void postAPIRequest() {
		
		RequestSpecification httpRequest=RestAssured.given();

		httpRequest.header("Content-Type", "text/plain");
		
		httpRequest.body(prop.getProperty("PostAPIBody"));
		
		Response request =httpRequest.request(Method.POST, "/post");
		
		VerificationUtility.responseCodeValiddation(request, 200);
		
		VerificationUtility.responseTimeValidation(request);
		
		VerificationUtility.responseBodyValidation(request, "data", prop.getProperty("PostAPIBody"));
		
	}

}
