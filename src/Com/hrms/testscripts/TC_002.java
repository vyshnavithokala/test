package Com.hrms.testscripts;
import Com.hrms.lib.General;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
public class TC_002 {
	//public static void main(String args[]) {
		@Test
		public void TC_002() {
			DOMConfigurator.configure("log4j.xml");
	General obj =new General();
	obj.openApplication();
	obj.login();
	obj.enterframes();
	obj.enter();
	obj.photo();
	obj.exitframes();
	obj.logout();
	obj.closeapplication();
		}
	
}

