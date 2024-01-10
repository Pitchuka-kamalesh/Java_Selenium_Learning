package main.java.com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        By clicks = By.xpath("//a[@title='Next']");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

//
        WebElement frameI = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameI);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("datepicker")).click();
        WebElement nextButton = driver.findElement(clicks);
        do {

            try {
                nextButton.click();
            }catch (org.openqa.selenium.StaleElementReferenceException e){
                System.out.println(e);
                Thread.sleep(500);
                driver.findElement(clicks).click();
                Thread.sleep(500);

            }

        }while(driver.findElement(clicks).isEnabled());




    }
}
