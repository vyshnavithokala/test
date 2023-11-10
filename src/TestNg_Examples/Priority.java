package TestNg_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Priority {
@BeforeClass
public void login (){
	Reporter.log("login");
}
@AfterClass
public void logout() {
	Reporter.log("Logout completed");
}
@BeforeMethod
public void username() {
	System.out.println("username ");
}
@AfterMethod
public void password() {
	System.out.println("password");
}
@Test(priority=1)
public void addemp() {
	System.out.println("added emp");
}
@Test (priority=3)
public void ended() {
	System.out.println("END all");
}
@Test (priority=2)
public void newemp() {
	System.out.println("new added");
	}
}
