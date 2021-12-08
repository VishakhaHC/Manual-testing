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
public class freshwork3{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String url = "https://www.freshworks.com/";
driver.get(url);
driver.get(url);
driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement txt = driver.findElement(By.xpath("//span[text()='Resources']"));
Actions builder = new Actions(driver);
Action seriesOfActions = builder.moveToElement(txt).build();
seriesOfActions.perform();
driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/ul/li[2]/a/span")).click();
System.out.println("clicked on academy");
driver.close();






}
}

