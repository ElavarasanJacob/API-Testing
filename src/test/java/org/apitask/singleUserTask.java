package org.apitask;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class singleUserTask {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader("C:\\APITesting\\src\\test\\resources\\Employee.json");
		JSONParser Jsonparser = new JSONParser();
		Object obj = Jsonparser.parse(reader);
		JSONObject jsonObject = (JSONObject) obj;

		Object object = jsonObject.get("data");
		JSONObject data = (JSONObject) object;
//		System.out.println(keySet);
		
//		Collection values = data.values();
//		System.out.println(values);
		
		Set <Entry<String,Object>> f = data.entrySet();
	for (Entry<String, Object> entry : f) {
		Object value = entry.getValue();
		System.out.println(value);
	}
	Object support =jsonObject.get("support");
		JSONObject Jsonsupport = (JSONObject) support;
		Set <Entry<String,Object>> f1 = Jsonsupport.entrySet();
		for (Entry<String, Object> entry1 : f1) {
			Object value1 = entry1.getValue();
			System.out.println(value1);
			
		}
	}

}
