package real_time_selenium_java_automation_testing_tasks.Interview_Task_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class printProductsusingContains {

    WebDriver driver;

    public printProductsusingContains(WebDriver driver){
        this.driver = driver;
    }

    public void printAmazonProductsusingContains(){
        try {
            driver.get("https://www.amazon.in/");

            WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            amazonSearchBox.click();
            amazonSearchBox.clear();

            amazonSearchBox.sendKeys("iphone");
            amazonSearchBox.sendKeys(Keys.ENTER);

            List<WebElement> amazonSearchResults = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']//h2//span"));

            int count = 0;

            for(WebElement amazonProductList : amazonSearchResults){
                String amazonProduct = amazonProductList.getText();
                if(amazonProduct.contains("128 GB")){
                    System.out.println(amazonProduct);
                    count++;
                }
            }

            System.out.println("Total Count of the Products = "+count);

            driver.quit();
  
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }  
}