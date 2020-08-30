package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	TestBase testbase;
	String serviceurl;
	String apiURl;
	String url;
	RestClient restClient;
	
	@BeforeMethod	
	public void setUp() throws ClientProtocolException, IOException {
		testbase=new TestBase();
		serviceurl=prop.getProperty("URL");
		apiURl= prop.getProperty("serviceURl");
		
		
		 url=serviceurl + apiURl;
		
		
	}
	
	
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
	    restClient=new RestClient();
		restClient.get(url);
		
		
	}
	
	
	
	
	
	

}
