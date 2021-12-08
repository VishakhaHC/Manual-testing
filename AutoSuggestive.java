package MavenProject1.MavenProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AutoSuggestive {
	 public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
	        driver.findElement(By.id("autosuggest")).sendKeys("ind");
	        Thread.sleep(1000);
	        List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
	        for(WebElement option:options)
	        {
	        	if(option.getText().equalsIgnoreCase("Indonesia"))
	        	{
	        		option.click();
	        		break;
	        		
	        	}
	        }
	 }
}
