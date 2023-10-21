package api.automation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ListUserRestAssured {

	RequestSpecification reqSpec;
	String id;
	String customerId;

	@Test
	public void getPoint() throws ParseException {

		reqSpec = RestAssured.given().header("content-Type", "application/json");

		Response response = reqSpec.get("https://www.jiomart.com/mst/rest/v1//session/create/guest?channel=web");

		String asPrettyString = response.asPrettyString();

		JSONParser parser = new JSONParser();
		Object parse = parser.parse(asPrettyString);

		JSONObject object = (JSONObject) parse;

		Object object2 = object.get("result");

		JSONObject resultObj = (JSONObject) object2;
		Object sessionObject = resultObj.get("session");

		JSONObject session = (JSONObject) sessionObject;
		id = session.get("id").toString();
		System.out.println("id : " + id);
		customerId = session.get("customer_id").toString();
		System.out.println("customerId : " + customerId);

	}

}
