package MavenProject1.MavenProject;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class multiplewindowhandling{
	public static void main(String[] args) {   
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys("shivani@gmail.com");
	   // driver.close();
		driver.quit();
	}
}



