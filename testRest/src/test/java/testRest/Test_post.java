package testRest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_post {
	
	@Test
	public void validate_post() {
		JSONObject json = new  JSONObject();
		json.put("A", "Gaurav");
		json.put("B", "Manager");
	
		
		System.out.println(json.toJSONString());
		
	 given().
			body(json.toJSONString()).
		when()
			.post("https://reqres.in/api/users").
		then().statusLine("HTTP/1.1 201 Created");
		
		
	}

}
