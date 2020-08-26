package main;

import org.testng.annotations.Test;

//import Utility.PostUtility;
import getRequest.Master;
import postRequest.Login;

public class BaseClass {
	
	Login loginRequestt=new Login();
	Master masterRequest;
//	Master masterRequest=new Master();

	@Test
	public void runRequest() {
		
		loginRequestt.postLogin();
		
		masterRequest=new Master (loginRequestt.loginn.local_Token);
		
		masterRequest.getOutreachist();
		
		masterRequest.getOutputlist();
		
		masterRequest.getFinanceyear();
		
		masterRequest.getCompanylist();
		
		masterRequest.getCompanyBudgetlist();
		
		masterRequest.getNgopartnerlist();
		
		masterRequest.getThrustArealist();
		
		masterRequest.getProgramlist();
		
		masterRequest.getOutcomelist();

	}
	
	public void abc() {
		masterRequest.getFinanceyear();
	}
	
	
	
}
