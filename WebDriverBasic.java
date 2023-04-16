package a.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
        public static void main(String[] args) {
     //        2. Set up the chromedriver - path
            System.setProperty("webdriver.chrome.driver","/Users/WE/IdeaProjects/SeleniumProject/src/test/resources/Driver/chromedriver");
      //        1. Create an instance of Webdriver

            WebDriver driver = new ChromeDriver();
      //        3. Navigate to the Webpage
            driver.get("https://demo.nopcommerce.com/");

            }
            }







