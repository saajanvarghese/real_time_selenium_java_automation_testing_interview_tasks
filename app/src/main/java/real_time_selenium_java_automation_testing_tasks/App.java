/*
 * This source file was generated by the Gradle 'init' task
 */
package real_time_selenium_java_automation_testing_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_1.printFoundersListAtWikipedia;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_2.printProductsusingContains;

public class App {

    WebDriver driver;

    public static void Task_1_printFoundersList(WebDriver driver){

        printFoundersListAtWikipedia task_1 = new printFoundersListAtWikipedia(driver);

        task_1.printFoundersList();       
    }

    public static void Task_2_printAmazonProductsUsingContains(WebDriver driver){

        printProductsusingContains task_2 = new printProductsusingContains(driver);

        task_2.printAmazonProductsusingContains();
    }


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Task_1_printFoundersList(driver);     
        
        Task_2_printAmazonProductsUsingContains(driver);
    }
}
