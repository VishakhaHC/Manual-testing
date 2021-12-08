package MavenProject1.MavenProject;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class freshwork{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String url = "https://www.freshworks.com/";
driver.get(url);
driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement txt = driver.findElement(By.xpath("//span[text()='Products']"));
Actions builder = new Actions(driver);
Action seriesOfActions = builder.moveToElement(txt).build();
seriesOfActions.perform();
driver.findElement(By.xpath("//span[text()=\"Delight your customers with effortless omnichannel service.\"]")).click();
driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
System.out.println("clicked on login");
driver.findElement(By.xpath("//*[@id=\"fdesk_login_form\"]/fieldset[1]/div/div[1]/input")).sendKeys("newaccount1638909218986");
System.out.println("Login sucessfull");
driver.close();


}
}