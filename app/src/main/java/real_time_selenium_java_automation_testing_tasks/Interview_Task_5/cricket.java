package real_time_selenium_java_automation_testing_tasks.Interview_Task_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cricket {

    WebDriver driver;

     public cricket(WebDriver driver){
        this.driver = driver;
    }

    public void cricbuzz_task(){
        try {
            driver.get("https://www.cricbuzz.com/");

            WebElement live_score_click = driver.findElement(By.xpath("//nav[@id='cb-main-menu']//a[@title='Live Cricket Score']"));
            live_score_click.click();

            WebElement scorecard_click = driver.findElement(By.xpath("(//a[@title='Scorecard'])[1]"));
            scorecard_click.click();

            WebElement match_info = driver.findElement(By.xpath("//h1[@class='cb-nav-hdr cb-font-18 line-ht24']"));

            String match_info_text = match_info.getText();

            System.out.println(match_info_text);

            List<WebElement> batter_list = driver.findElements(By.xpath("//div[@class='cb-col cb-col-25 ']//a[@class='cb-text-link']"));

            List<WebElement> sixer_list = driver.findElements(By.xpath("//div[@class='cb-col cb-col-8\ttext-right']"));

            for(int i=0; i<batter_list.size(); i++){

                    WebElement batter = batter_list.get(i);
                    String batter_text = batter.getText();

                    WebElement sixer_info = sixer_list.get(i);
                    String sixer_info_text = sixer_info.getText();

                    System.out.println("Batter "+ batter_text + "     6s "+sixer_info_text);
                }   
                
                driver.quit();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }    
}
