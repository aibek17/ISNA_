package ru.stqa.isna.front;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class CreateDoc {
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
    driver.findElement(By.id("auth_login_username")).click();
    driver.findElement(By.id("auth_login_username")).clear();
    driver.findElement(By.id("auth_login_username")).sendKeys("admin");
    driver.findElement(By.id("auth_login_password")).clear();
    driver.findElement(By.id("auth_login_password")).sendKeys("admin");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//a[@href ='/account/arm']")).click();
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu']")).click();
    driver.findElement(By.xpath("//a[@href ='/account/arm/mgu/monitoring']")).click();
  }

  @Test
  public void testCreateDocResidency() throws Exception {
// 830327473449
    driver.findElement(By.xpath("//div[@id='root']/div/section/section/main/div/div[2]/div[2]/button/span")).click();
    driver.findElement(By.xpath("(//input[@value=''])[29]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[29]")).sendKeys("резидентства");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/li")).click();
    driver.findElement(By.name("iinBin")).click();
    driver.findElement(By.name("iinBin")).clear();
    driver.findElement(By.name("iinBin")).sendKeys("830327473449");
    driver.findElement(By.xpath("//form[@id='inclusionRegisterManufacturers']/fieldset/div/div/div/div[2]/div/div/span/span/span/button/span")).click();
    driver.findElement(By.xpath("//input[@value='1']")).click();
    driver.findElement(By.xpath("(//input[@value='1'])[2]")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_postcode")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_postcode")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_postcode")).sendKeys("101120");
    driver.findElement(By.id("inclusionRegisterManufacturers_regionId")).click();
    driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_districtId")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_cityId")).click();
    driver.findElement(By.xpath("//div[4]/div/div/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_streetId")).click();
    driver.findElement(By.xpath("//div[5]/div/div/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_buildingNumber")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_buildingNumber")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_buildingNumber")).sendKeys("154");
    driver.findElement(By.id("inclusionRegisterManufacturers_flatNumber")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_flatNumber")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_flatNumber")).sendKeys("15");
    driver.findElement(By.id("inclusionRegisterManufacturers_phoneNumber")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_phoneNumber")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_phoneNumber")).sendKeys("87787787878");
    driver.findElement(By.id("inclusionRegisterManufacturers_email")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_email")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_email")).sendKeys("example@mail.ru");
    driver.findElement(By.xpath("(//input[@value='1'])[3]")).click();
    driver.findElement(By.xpath("(//input[@value='2'])[4]")).click();
    driver.findElement(By.xpath("//*[@id=\"inclusionRegisterManufacturers\"]/fieldset[2]/div[1]/div[3]/div/div[2]/div/div/div/div[2]/label/span[1]/input")).click();
    driver.findElement(By.cssSelector("span.anticon.anticon-plus > svg")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_documentNumber")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_documentNumber")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_documentNumber")).sendKeys("123654025");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,400)", "");
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_paymentDay")).click();
    driver.findElement(By.xpath("//*[text() = '24']")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_paymentSum")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_paymentSum")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_apostilleFeePaymentInfos_0_paymentSum")).sendKeys("15000");
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_countryCode")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_countryCode")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_countryCode")).sendKeys("643");
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_countryName")).click();
    driver.findElement(By.xpath("//div[7]/div/div/div/div[2]/div/div/div/div/div")).click();
    jse.executeScript("window.scrollBy(0,100)", "");
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_taxPeriodFrom")).click();
    driver.findElement(By.xpath("//div[8]/div/div/div/div[2]/div/div/div/div/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_taxPeriodTo")).click();
    driver.findElement(By.xpath("//div[9]/div/div/div/div[2]/div/div/div/div[3]/div")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_copyNumber")).click();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_copyNumber")).clear();
    driver.findElement(By.id("inclusionRegisterManufacturers_confirmResidenceCountries_0_copyNumber")).sendKeys("1");
    driver.findElement(By.id("inclusionRegisterManufacturers_ogdId")).click();
    jse.executeScript("window.scrollBy(0,200)", "");
    driver.findElement(By.xpath("//div[2]/span[3]/span")).click();
    driver.findElement(By.xpath("//form[@id='inclusionRegisterManufacturers']/button[2]/span")).click();
    driver.findElement(By.xpath("//form[@id='inclusionRegisterManufacturers']/button[1]/span")).click();
    Thread.sleep(5000);
    //*[@id="inclusionRegisterManufacturers"]/button[2]/span
    //*[@id="inclusionRegisterManufacturers"]/button[1]/span
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
