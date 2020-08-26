package Utility;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostUtility {
	
	public String local_Token="";

	public void postLoginMethod(String uname,String pass,String route) {
		
		RestAssured.baseURI="https://stgmgrant.dhwaniris.in/api/";
		
		RequestSpecification request=RestAssured.given();
		
		JSONObject requestParams=new JSONObject();
		
		requestParams.put("username",uname);
		
		requestParams.put("password",pass);
		
		request.header("Content-Type", "application/json");
		
		request.body(requestParams.toJSONString());
		
		Response response=request.post(route);
		
		//Getting Response
		String body=response.body().asString();
		
		System.out.println("Response body: " +body);

		JsonPath jsonPathEvaluator = response.jsonPath();
		
		//Getting token from response
		local_Token = jsonPathEvaluator.get("token");
		
		System.out.println("Response Token is :" + local_Token);
		
	}

}
