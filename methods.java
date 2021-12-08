package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class methods {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
				    driver.navigate().to("http://rahulshettyacademy.com/locatorspractice/");
				    driver.findElement(By.id("inputusername")).sendKeys("vishu");
				    driver.findElement(By.name("inputpassword")).sendKeys("vishu@123");
				    driver.findElement(By.xpath("//*[@id='chkboxone']")).click();
				    driver.findElement(By.xpath("//*[@id='chkboxtwo']")).click();
	}
}