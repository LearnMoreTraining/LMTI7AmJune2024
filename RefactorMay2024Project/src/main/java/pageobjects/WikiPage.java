package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;

    public WikiPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getColumnOneValues(){

      int columnOneSize=  driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).size();
        List<String> columnOneValues = new ArrayList<String>() ; //empty list
        for(int i =0 ; i < columnOneSize ;i++){
          String val=  driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::th")).get(i).getText();
            columnOneValues.add(val);
        }
        return columnOneValues;
    }

    public List<String> getColumnTwoValues(){

        int columnTwoSize=  driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).size();
        List<String> columTwoValues = new ArrayList<String>() ; //empty list
        for(int i =2 ; i < columnTwoSize ;i++){
            String val=  driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).get(i).getText();
            columTwoValues.add(val);
        }
        return columTwoValues;
    }
}
