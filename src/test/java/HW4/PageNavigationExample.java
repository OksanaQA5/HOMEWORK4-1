package HW4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class PageNavigationExample {
    public static void main(String[] args) {
        String[] url = {
        "https://uhomki.com.ua/ru/koshki/1074/",
        "https://zoo.kiev.ua/",
        "https://www.w3schools.com/",
        "https://taxi838.ua/ru/dnepr/",
        "https://klopotenko.com/"
        };

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url[0]);
        for (int i = 0; i<5; i++){
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println("");
            if (i+1 == 5){
                break;
            }
            Set<String>set1 = driver.getWindowHandles();
            ((JavascriptExecutor)driver).executeScript("window.open()");
            Set<String>set2 = driver.getWindowHandles();
            set2.removeAll(set1);
            String descriptorOfNewPage = set2.iterator().next();
            if (driver.getTitle().contains("зоопарк")) {
                driver.close();
        }
            driver.switchTo().window(descriptorOfNewPage);
            driver.get(url[i+1]);
        }
    }
}
