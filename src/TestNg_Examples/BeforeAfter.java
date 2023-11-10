package TestNg_Examples;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Reporter;
public class BeforeAfter {
@BeforeClass
public void login() {
	System.out.println("login completed");
	 Reporter.log("Application opened");
}
@AfterClass
public void logout() {
	System.out.println("logout completed");
	
}
@Test
public void Addemp() {
	System.out.println("added emp");
	
}
@Test 
public void delemp() {
	Reporter.log("deleted");
}
}
