package ru.stqa.isna.front;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class GoToMgu {
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
    driver.manage().window().maximize();
    driver.get("http://10.61.42.5:3333/user/login");
    login("admin", "admin");
  }

  private void login(String username, String password) {
    driver.findElement(By.id("auth_login_username")).click();
    driver.findElement(By.id("auth_login_username")).clear();
    driver.findElement(By.id("auth_login_username")).sendKeys(username);
    driver.findElement(By.id("auth_login_password")).clear();
    driver.findElement(By.id("auth_login_password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @Test
  public void testGoToMgu() throws Exception {
    gotoArmOgd();
    gotoMgu();
  }

  private void gotoMgu() {
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu']")).click();
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu/monitoring']")).click();
  }

  private void gotoArmOgd() {
    driver.findElement(By.xpath("//a[@href ='/account/arm']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
}