package com.bs.MyFirstSampleMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

  public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
  public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "62.0");
    caps.setCapability("browserstack.local", "false");
    caps.setCapability("build", "BSSupport_M");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://localhost:8888/MAMP/?language=English");
   // WebElement element = driver.findElement(By.name("q"));

  //  element.sendKeys("BrowserStack");
  //  element.submit();

    System.out.println(driver.getTitle());
    driver.quit();

  }
}
