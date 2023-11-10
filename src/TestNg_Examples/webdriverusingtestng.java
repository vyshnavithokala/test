package TestNg_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class webdriverusingtestng {
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
  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
  Reporter.log("Application opened"); //html report
  System.out.println("Application opened"); // console
  driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
  driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
  driver.findElement(By.name("Submit")).click();
  System.out.println("Login completed");
  Thread.sleep(3000);
  Reporter.log("Login completed");
  driver.findElement(By.linkText("Logout")).click();
  Reporter.log("Logout completed");
}
}

