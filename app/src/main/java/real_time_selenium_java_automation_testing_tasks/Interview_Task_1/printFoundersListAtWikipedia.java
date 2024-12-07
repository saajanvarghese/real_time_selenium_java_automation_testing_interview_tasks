package real_time_selenium_java_automation_testing_tasks.Interview_Task_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printFoundersListAtWikipedia {

    public void printFoundersList(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        try {            
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.click();

        searchBox.clear();

        searchBox.sendKeys("Apple Inc.");

        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> foundersList = driver.findElements(By.xpath("(//div[@class='plainlist'])[4]//ul//li//a"));

        System.out.println("Founders List:");
        for(WebElement printList : foundersList){
            String printFoundersList = printList.getText();

            System.out.println(printFoundersList);
       }     
       
       driver.quit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
