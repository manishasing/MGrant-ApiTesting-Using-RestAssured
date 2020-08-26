package getRequest;

import org.testng.annotations.Test;

import Utility.getUtility;

public class Master{
	
	getUtility util=new getUtility();
	String mtoken;
	
	//Constructor
	public Master(String mtoken_new) {
		mtoken=mtoken_new;
	}
	
//	String Local_token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjE0IiwibmFtZSI6IlNtaXRhUE0iLCJ1c2VybmFtZSI6InNtaXRhcG0iLCJsZXZlbF9pZCI6IjIiLCJlbWFpbCI6Im1hbmlzaGEuc2luZ2grMTIyQGRod2FuaXJpcy5jb20iLCJsb2dpbl9pZCI6MTUzMn0.Q8szUUasMATGeZFTBXYFKnRN-Lz12M36jZx_Q4jMoHU";

//	PostUtility login_token=new PostUtility();
//	PostUtility m=new PostUtility();
	
	@Test
	public void getOutreachist() {
		System.out.println(mtoken);
		
		util.getMethod(mtoken, "master/outreach-list","getOutreachist");
	}
	
	@Test
	public void getOutputlist() {
		
		util.getMethod(mtoken, "master/output-list","getOutputlist");
	
	}
	
	@Test
	public void getFinanceyear() {
		
		util.getMethod(mtoken, "master/finance-year-list","getFinanceyear");
	}
	
	@Test
	public void getCompanylist() {
		
		util.getMethod(mtoken, "master/outreach-list","getCompanylist");

	}
	
	@Test(priority =2)
	public void getCompanyBudgetlist() {
		
		util.getMethod(mtoken, "master/outreach-list","getCompanyBudgetlist");
//		System.out.println("=====Company Budget list Token ===="+mtoken);

	}
	
	@Test
	public void getNgopartnerlist() {
		
		util.getMethod(mtoken, "master/outreach-list","getNgopartnerlist");

	}
	
	@Test
	public void getThrustArealist() {
		
		util.getMethod(mtoken, "master/outreach-list","getThrustArealist");

	}
	
	@Test
	public void getProgramlist() {
		
		util.getMethod(mtoken, "master/program-list","getProgramlist");

	}
	
	@Test
	public void getOutcomelist() {
		
		util.getMethod(mtoken, "master/outcome-list","getOutcomelist");

	}

	
	

}
