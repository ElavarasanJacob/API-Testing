package api.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class APIPracticeClass {
	
	public static void main(String[] args) throws IOException, ParseException {
	

		File file = new File("src\\test\\resources\\writejsonfile.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<POJOClassFor2step> l = new ArrayList<POJOClassFor2step>();
		POJOClassFor2step s = new POJOClassFor2step("ela", "s", 232444);
		POJOClassFor2step s1 = new POJOClassFor2step("ela", "s", 232444);
		POJOClassFor2step s2 = new POJOClassFor2step("ela", "s", 232444);
		POJOClassFor2step s3 = new POJOClassFor2step("ela", "s", 232444);
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		Address a = new Address("chennai", "BHARAT");
		
		
		POJOClassFor1step p = new POJOClassFor1step("Ela", "ela.s.arasan@gmail.com", 54234456576l, 1441,l,a);
		
		
		mapper.writeValue(file, p);
	
	
	
	
	
	
	
	
	
	
	}
}
