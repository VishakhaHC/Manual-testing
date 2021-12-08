package MavenProject1.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumBasicScript {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
String title=driver.getTitle();
System.out.println(title);	
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("vishu");
driver.findElement(By.name("inputPassword")).sendKeys("hello123");
driver.findElement(By.className("signInBtn")).click();
}
}