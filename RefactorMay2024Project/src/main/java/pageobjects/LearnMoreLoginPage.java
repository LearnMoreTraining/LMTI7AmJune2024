package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class LearnMoreLoginPage {

    WebDriver driver;

    public LearnMoreLoginPage(WebDriver driver){

        this.driver = driver;
    }

    public LearnMoreLoginPage enterUserName(){

      String userName=  driver.findElement(By.cssSelector(".label")).getText().split(" ")[1].substring(1);
        driver.findElement(By.cssSelector("#username")).sendKeys(userName);
     return this ;
    }

    public LearnMoreLoginPage enterPassword(){
        driver.findElement(By.cssSelector("#password")).sendKeys("learnmore@123");
    return this;
    }

    public LearnMoreLoginPage clickLoginButton(){

        driver.findElement(By.xpath("//button[text()='Login']")).click();
        return this;
    }

    public void switchToEventManagmentPage(){

       Set<String> windowsProperty= driver.getWindowHandles();
        System.out.println(windowsProperty);

        for(String output:windowsProperty){
            driver.switchTo().window(output);
           if(driver.getTitle().equals("Event Management")){
               break;
           }
        }

        System.out.println(driver.getTitle());


    }

    public void switchToParentWindow(){
        Set<String> windowsProperty= driver.getWindowHandles();
        System.out.println(windowsProperty);
        Iterator<String> iterator = windowsProperty.iterator();
        String parentWindow =  iterator.next();
        String childWindow = iterator.next();

        driver.switchTo().window(parentWindow);

    }


}
