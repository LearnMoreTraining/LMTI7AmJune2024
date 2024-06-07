package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnMoreExplicitPage {

    WebDriver driver;

    public LearnMoreExplicitPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickChangeTextButton(){

        driver.findElement(By.cssSelector("#quote")).click();
    }

    public String getChangeText(){
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(8));
            driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
      return  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
    }


}
