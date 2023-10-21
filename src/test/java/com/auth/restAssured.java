package com.auth;

import java.io.FileNotFoundException;
import java.io.IOException;
import api.automation.BaseClassForAPI;
import io.restassured.response.Response;

public class restAssured extends BaseClassForAPI {
	// public void createUser()

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BaseClassForAPI.addHeader("accept", "application/json");
		basicAuth(getPropertyFileValue("userName"),getPropertyFileValue("password"));
		Response requestType = requestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		int statusCode = getStatusCode(requestType);
		System.out.println(statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(requestType);
		System.out.println(resBodyAsPrettyString);

	}

}
