package a.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","/Users/WE/IdeaProjects/SeleniumProject/src/test/resources/Driver/msedgedriver");

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.navigate().refresh();

      //  driver.quit();

    }


}
