package ru.stqa.isna.front;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoToExcise {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:/Devel/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("http://10.61.42.5:3333/user/login");
    driver.findElement(By.id("auth_login_username")).click();
    driver.findElement(By.id("auth_login_username")).clear();
    driver.findElement(By.id("auth_login_username")).sendKeys("admin");
    driver.findElement(By.id("auth_login_password")).clear();
    driver.findElement(By.id("auth_login_password")).sendKeys("admin");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("АРМ ОГДВыберите раздел")).click();
    driver.findElement(By.linkText("Администрирование подакцизной продукцииперейти")).click();
    driver.findElement(By.linkText("Приём и обработкаперейти")).click();
    driver.findElement(By.linkText("Журнал обработки документовперейти")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

