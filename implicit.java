package MavenProject1.MavenProject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class implicit {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demo.guru99.com/test/radio.html");
List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' and @name='webform']"));
int size=checkbox.size();
System.out.println(size);
for(int i=0; i<size; i++) {
if(checkbox.get(i).getAttribute("value").contains("checkbox2")) {
System.out.println("Inside loop");
checkbox.get(i).click();
System.out.println("Clicked Checkbox");
break;
}
}
driver.close();
}
}