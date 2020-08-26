package Utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getUtility {

	
	public void getMethod(String Token,String route ,String method_name) {
		
		RestAssured.baseURI="https://stgmgrant.dhwaniris.in/api/";
		RequestSpecification httpRequest=RestAssured.given().header("token", Token);
		Response response=httpRequest.get(route);
		System.out.println(method_name+ " => Response is:"+response.asString());
	}
}
