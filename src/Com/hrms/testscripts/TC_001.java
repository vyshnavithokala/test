package Com.hrms.testscripts;
import Com.hrms.lib.General;
public class TC_001 {
	public static void main(String args[]) {
		// test steps
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeapplication();
	}
	}


