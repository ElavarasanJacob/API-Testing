package org.apitask;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListUserTask2 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader("src\\test\\resources\\ListTask_2.json");

		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonObject = (JSONObject) parse;
		System.out.println(jsonObject.get("page"));
		System.out.println(jsonObject.get("per_page"));
		System.out.println(jsonObject.get("total"));
		System.out.println(jsonObject.get("total_pages"));

		Object dataObj = jsonObject.get("data");
		JSONArray array = (JSONArray) dataObj;
		for (int i = 0; i < array.size(); i++) {
			Object arrayObj = array.get(i);
			JSONObject jsonObject2  = (JSONObject)arrayObj;
			System.out.println(jsonObject2.get("email"));
//			Set <Entry<String,Object>> d = jsonObject2.entrySet();
//			for (Entry<String, Object> entry : d) {
//				Object value = entry.getValue();
//				System.out.println(value);
//			}
			
		}
		
		Object object = jsonObject.get("support");
		System.out.println(object);
		JSONObject jsonObject2 = (JSONObject) object ;
		System.out.println(jsonObject2.get("text"));
	
	}
}
