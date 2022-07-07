package package_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class FB_Login {
	WebDriver driver;
	WebDriverWait wait;
	Actions act;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  act = new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("https://facebook.com/");
	  wait = new WebDriverWait(driver, Duration.ofSeconds(60));
  }

  @AfterClass
  public void afterClass() {
  }

}
