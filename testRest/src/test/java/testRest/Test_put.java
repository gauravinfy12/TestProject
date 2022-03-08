package testRest;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_put {
		
		@Test
		public void validate_put() {
			JSONObject request = new JSONObject();
			request.put("name", "xyz");
			request.put("job", "Manager");
			
			given()
				.body(request.toJSONString()).
			when().
				put("https://reqres.in/api/users/2").
			then().statusCode(200);
				
			
		}
}
