/*
 * This source file was generated by the Gradle 'init' task
 */
package real_time_selenium_java_automation_testing_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_1.printFoundersListAtWikipedia;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_2.printProductsusingContains;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_3.printNewsHeadlines;
import real_time_selenium_java_automation_testing_tasks.Interview_Task_4.netBanking;

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

    public static void Task_3_printNewsHeadlines(WebDriver driver){
        printNewsHeadlines task_3 = new printNewsHeadlines(driver);

        task_3.printGoogleHeadlines();
    }

    public static void Task_4_NetBanking(WebDriver driver){

        netBanking task_4 = new netBanking(driver);

        task_4.printKnowMorePoints();

    }


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Task_1_printFoundersList(driver);     
        
        //Task_2_printAmazonProductsUsingContains(driver);

        //Task_3_printNewsHeadlines(driver);

        Task_4_NetBanking(driver);
    }
}
