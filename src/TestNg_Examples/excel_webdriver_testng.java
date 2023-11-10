package TestNg_Examples;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class excel_webdriver_testng {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
	    driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
	driver.close();
	}
	@Test
	public void tc001() throws Exception{
	//Excel
	    FileInputStream file = new FileInputStream("D:\\New folder (2)\\Excel.xls");
	    Workbook   wb = Workbook.getWorkbook(file);
	    Sheet  st = wb.getSheet(0);
	   
	    String username = st.getCell(0,1).getContents();
	    String password = st.getCell(1,1).getContents();
	    Reporter.log(username);
	    Reporter.log(password);
	  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	  Reporter.log("Application opened"); //html report
	  System.out.println("Application opened"); // console
	  driver.findElement(By.name("txtUserName")).sendKeys(username);
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	  Thread.sleep(4000);
	  driver.findElement(By.name("Submit")).click();
	  System.out.println("Login completed");
	  Thread.sleep(3000);
	  Reporter.log("Login completed");
	  driver.findElement(By.linkText("Logout")).click();
	  Reporter.log("Logout completed");
	}
	}

