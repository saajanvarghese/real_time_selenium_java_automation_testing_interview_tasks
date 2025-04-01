package real_time_selenium_java_automation_testing_tasks.Interview_Task_4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class netBanking {

    WebDriver driver;
    

    public netBanking(WebDriver driver){
        this.driver = driver;
    }

    public void printKnowMorePoints(){

        try {
            driver.get("https://www.hdfcbank.com/");

        WebElement loginbtn_hover = driver.findElement(By.xpath("//button[@class='desktop-login position-find btn btn-primary login-btn hide-in-mobileApp ng-scope']"));

        Actions action = new Actions(driver);

        action.moveToElement(loginbtn_hover).perform();

        WebElement knowmore_click = driver.findElement(By.xpath("(//a[@class='register-btn'])[1]"));

        knowmore_click.click();

       List <WebElement> content = driver.findElements(By.xpath("//div[@class='contentBody2 all-you-wrapper col-lg-8 col-md-8 col-sm-8 col-xs-12']"));

       List <WebElement> heading = driver.findElements(By.xpath("//h4[@class='title']"));

       HashMap<String, String> contentMap = new HashMap<>();
       
       for (int i = 0; i < heading.size(); i++) {
        String headingText = heading.get(i).getText().trim();
        String contentText = content.get(i).getText().trim();
        contentMap.put(headingText, contentText);
    }

    for (Map.Entry<String, String> entry : contentMap.entrySet()) {
        System.out.println("Heading: " + entry.getKey());
        System.out.println("Content: " + entry.getValue());
        System.out.println("----------------------------");
    }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }  
    }
}