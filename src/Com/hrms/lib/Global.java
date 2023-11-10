package Com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	
	
	// stanadrd rule we follow=to provide test data objects/element related whole application
		WebDriver driver;
		public String url="http://183.82.103.245/nareshit/login.php";
		public String un ="nareshit";
		public String pw ="nareshit";
		public String fn="java";
		public String ln="selenium";
		// to access object
		public String  tu="txtUserName";
		public String tw="txtPassword";
		public String log="Submit";
		public String lt="Logout";
		public String emp ="rightMenu";
		public String add=  "//input[@value='Add']";
		public String first="txtEmpFirstName";
		public String last="txtEmpLastName";
		public String photo="//input[@type='file'][@name='photofile']";
		public String button="btnEdit";
		
		
	}


