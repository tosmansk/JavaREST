package com.mycompany.javarest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class JavaRest {
	
	public void firstFunction() throws UnirestException  {
		
		String myJson = "{\n" +
				" \"id\": 1,\n" +
				" \"category\": {\n" +
				" \"id\": 0,\n" +
				" \"name\": \"string\"\n" +
				" },\n" +
				" \"name\": \"Tomek\",\n" +
				" \"photoUrls\": [\n" +
				" \"string\"\n" +
				" ],\n" +
				" \"tags\": [\n" +
				" {\n" +
				" \"id\": 0,\n" +
				" \"name\": \"string\"\n" +
				" }\n" +
				" ],\n" +
				" \"status\": \"available\"\n" +
				"}";
	
		
			HttpResponse<JsonNode> jsonResponse1 = Unirest.post("http://petstore.swagger.io/v2/pet")
			        .header("accept", "application/json")
			        .header("Content-Type", "application/json")
			        .body(myJson)
			        .asJson();
			
			HttpResponse<JsonNode> jsonResponse = Unirest.get("http://petstore.swagger.io/v2/pet/1")
				.header("accept", "application/json")
				.asJson();
			System.out.println(jsonResponse.getStatus());
			System.out.println(jsonResponse.getBody());

	}			
	

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		JavaRest obj = new JavaRest();
		obj.firstFunction();
				
	}

}
