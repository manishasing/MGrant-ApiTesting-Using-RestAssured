package postRequest;

import org.testng.annotations.Test;
import Utility.PostUtility;

public class Login{
//	public String mtoken;
	
	public PostUtility loginn=new PostUtility();
	
	@Test()
	public void postLogin() {
		
		loginn.postLoginMethod("smitapm", "Smita@12", "user/login");
		
	}

}
