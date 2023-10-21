package api.automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClassForAPI {
	static RequestSpecification reqSpec;
	static Response response;

	public static void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}

	public void pathParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}

	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);

	}

	public void addBody(String payLoad) {

		reqSpec = reqSpec.body(payLoad);
	}

	public static Response requestType(String reqType, String endPoint) {
		switch (reqType) {
		case "GET":
			response = reqSpec.get(endPoint);
			break;
		case "POST":
			response = reqSpec.post(endPoint);
			break;
		case "PUT":
			response = reqSpec.put(endPoint);
			break;
		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}

	public static int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	public static ResponseBody getResBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}

	public String resBodyAsString(Response response) {
		String asString = getResBody(response).asString();
		return asString;
	}

	public static String getResBodyAsPrettyString(Response response) {
		String asPrettyString = getResBody(response).asPrettyString();
		return asPrettyString;
	}
//	public static String getPropertyFileValue(String key) throws IOException {
//		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
//		Properties properties = new Properties();
//		properties.load(stream);
//		Object name = properties.get(key);
//		String value = (String) name;
//		return value;
//
//	}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\config.properties"));
		Object object = properties.get(key);
		String obj = (String) object;
		return obj;
	}
	public static void basicAuth(String username,String password)
	{
		reqSpec= reqSpec.auth().preemptive().basic(username, password);
		
	}

}
