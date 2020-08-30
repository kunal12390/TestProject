package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	
	//1. GEt method
	
	public void get(String url) throws ClientProtocolException, IOException {
	CloseableHttpClient httpClient= HttpClients.createDefault();
	HttpGet httpget= new HttpGet(url);  //http get request
	
	CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpget);  //hit the GET URl
	
	
	//a. Status code
	     int statuscode=closeableHttpResponse.getStatusLine().getStatusCode();
	      System.out.println("Statuscode-------" + statuscode);
	
	
	//b.Json String
	    String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(),  "UTF-8");
	
		JSONObject responseJson= new JSONObject(responseString);
		System.out.println("Response JSOn from API--->" + responseJson);
		
		//c. All Headers
		 Header[] headerArray=closeableHttpResponse.getAllHeaders();
		
		HashMap<String, String> allHeaders=new HashMap<String, String>();
		
		for (Header header : headerArray) {
			
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Header Array---->" +allHeaders);
		
		
		
	}
	
	
}
