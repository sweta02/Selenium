package a.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.driver","/Users/WE/IdeaProjects/SeleniumProject/src/test/resources/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");


    }
}
