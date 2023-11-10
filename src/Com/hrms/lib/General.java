package Com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.FileInputStream;
import Com.hrms.utility.Log;
public class General extends Global{
	
	// stanadrad rule we followed=to provide all reusable funtions/methods related whole application
		public void openApplication() {
			driver =new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("application opened");		
		}
	public void closeapplication() {
		driver.close();
	}
	public void login() {
		driver.findElement(By.name(tu)).sendKeys(un);
		driver.findElement(By.name(tw)).sendKeys(pw);
		driver.findElement(By.name(log)).click();
		System.out.println("login completed");
		}
	
	public void enterframes() {
		driver.switchTo().frame(emp);
		System.out.println("frames entred");
	}
	public void exitframes() {
		driver.switchTo().defaultContent();
	}
	public void enter() {
		driver.findElement(By.xpath(add)).click();
		driver.findElement(By.name(first)).sendKeys(fn);
		driver.findElement(By.name(last)).sendKeys(ln);
		Log.info("login completed");
	}
		public void photo() {
			WebElement fileInput = driver.findElement(By.
		              xpath(photo));                      
		fileInput.sendKeys("D:\\New folder\\Blank_image.jpg");
		driver.findElement(By.id(button)).click();
		}
		public void logout() {
			driver.findElement(By.linkText(lt)).click();
			System.out.println("logout completed");
		}	
	}



