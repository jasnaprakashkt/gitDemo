package IG_API.IG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APITesting {

	Response response;
	JsonPath jsonpath;
	int code;
	String header;
	int statuscode;
	String age;
	String role;
	String dob;
	String company;
	@BeforeTest
	public  void setup() {
		
		RestAssured.baseURI="http://demo4032024.mockable.io/apitest";
		
		RequestSpecification request=RestAssured.given();
		response=request.get();
			
		jsonpath = response.getBody().jsonPath();
		System.out.println(response.body().asString());
		
	
		
	
	}
		
		@Test
		public void statuscode() {
			/*code=response.getStatusCode();
			Assert.assertEquals(200, code);*/
			var gets=response.getBody().as(get.class);
			Assert.assertEquals(gets.getCode(), 200);

		}
		
		/*@Test
		public void header() {
			header = response.getHeader("Content-Type");
			Assert.assertEquals("application/json; charset=UTF-8", header);

		}
		
		@Test
		public void body() {
			statuscode=jsonpath.get("status");
			Assert.assertEquals(200, statuscode);
			
			age=jsonpath.get("employeeData.age").toString();
			Assert.assertEquals("[25]", age);

			role= jsonpath.get("employeeData.role").toString();
			Assert.assertEquals("[QA Automation Developer]", role);

			dob=jsonpath.get("employeeData.dob").toString();
			Assert.assertEquals("[25-02-1994]", dob);
			
			Assert.assertEquals("data retrieved successful", jsonpath.get("message"));


		}*/
		
		/*@Test
		public void company() {
			
			company=jsonpath.get("employeeData.company").toString();
			Assert.assertEquals("[ABC Infotech]", company);

			


		}*/
	
}

