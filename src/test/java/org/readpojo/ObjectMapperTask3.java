package org.readpojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.readpojo.POJOClassForData;
import org.readpojo.POJOClassForListUser;
import org.readpojo.POJOClassForSupport;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperTask3 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\APITesting\\src\\test\\resources\\ListTask_2.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
	POJOClassForListUser e = mapper.readValue(file,POJOClassForListUser.class);
	int page = e.getPage();
	System.out.println(page);
	
	int per_page = e.getPer_page();
	System.out.println(per_page);
	
	int total = e.getTotal();
	System.out.println(total);
	
	int total_pages = e.getTotal_pages();
	System.out.println(total_pages);
	
	ArrayList<POJOClassForData> data = e.getData();
	for (POJOClassForData a : data) {
		System.out.println(a.getId());
		System.out.println(a.getEmail());
		System.out.println(a.getFirst_name());
		System.out.println(a.getLast_name());
		System.out.println(a.getAvatar());
	}
	POJOClassForSupport support = e.getSupport();
	System.out.println(support.getUrl());
	System.out.println(support.getText());
		
		

	}

}
