package real_time_selenium_java_automation_testing_tasks.Interview_Task_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class printNewsHeadlines {

    WebDriver driver;

    public printNewsHeadlines(WebDriver driver){
        this.driver = driver;

    }

    public void printGoogleHeadlines(){
        driver.get("https://news.google.com/");

        try {
            WebElement clickIndiaTab = driver.findElement(By.xpath("(//div[@class='EctEBd']//a[@class='brSCsc'])[4]"));
            clickIndiaTab.click();

            List<WebElement> headline_desc = driver.findElements(By.xpath("//a[@class='gPFEn']"));

            int headline_desc_count = Math.min(headline_desc.size(), 5);

            for(int i=1; i<= headline_desc_count; i++){
                String headlines_desc = headline_desc.get(i).getText();

                System.out.println("Headline :"+i+ headlines_desc);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
