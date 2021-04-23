package ru.stqa.isna.front;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
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

  protected void gotoMgu() {
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu']")).click();
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu/monitoring']")).click();
  }

  protected void gotoArmOgd() {
    driver.findElement(By.xpath("//a[@href ='/account/arm']")).click();
  }

  protected void gotoDocumentJournal() {
    driver.findElement(By.xpath("//a[@href ='/account/arm/admin-excis/reception-processing/document-processing-journal']")).click();
  }

  protected void gotoPriemObrabotka() {
    driver.findElement(By.xpath("//a[@href ='/account/arm/admin-excis/reception-processing']")).click();
  }

  protected void gotoExcise() {
    driver.findElement(By.xpath("//a[@href ='/account/arm/admin-excis']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
