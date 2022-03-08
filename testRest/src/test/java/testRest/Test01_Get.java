package testRest;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test01_Get {
	
	@Test
	void test_01(){
		Response rs = get("https://reqres.in/api/users?page=2");
		System.out.println(rs.asString());
		System.out.println(rs.getStatusCode());
		System.out.println(rs.getBody());
		System.out.println(rs.getStatusLine());
		
		int count = rs.getStatusCode();
		Assert.assertEquals(count, 200);
	}
	
	@Test
	void test_02() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	
}
