package main.java.com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Calendar {

    static WebDriver driver;

    public static void clickHtmlElement(WebDriver driver){
        By clicks = By.xpath("//a[@title='Next']");
        driver.findElement(clicks).click();


    }



    public static void main(String[] args) throws InterruptedException {



//        System.setProperty("webdriver.gecko.driver","C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement frameI = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameI);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("datepicker")).click();
        clickHtmlElement(driver);
        do {

            try {
                clickHtmlElement(driver);
            }catch (org.openqa.selenium.StaleElementReferenceException e){
                System.out.println(e);
                Thread.sleep(500);
                clickHtmlElement(driver);
                Thread.sleep(500);
                break;

            }

        }while(true);




    }
}
