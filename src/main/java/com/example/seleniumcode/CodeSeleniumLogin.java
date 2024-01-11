package main.java.com.example.seleniumcode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CodeSeleniumLogin {

   static WebDriver driver;
   public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


   static void login(WebDriver driver){
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[@type='submit']")).click();


   }
   static void dropDownList(WebDriver driver,String valueToSelect){
       List<WebElement> dropDown = driver.findElements(By.xpath("//div[@role='option']//span"));
       for (WebElement drop : dropDown) {
           System.out.println(drop.getText());
           if (drop.getText().contains(valueToSelect)){
               System.out.println("Checking what to after");
               drop.click();
               break;
           }
       }


   }


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        if (driver.getCurrentUrl().equals(url)) {
            System.out.println(" we are in the login page");
        } else System.out.println("We are not in the login page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        login(driver);
//        driver.findElement(By.xpath("//button[@role='none']")).click();
        driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='orangehrm-header-container']/button")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
        dropDownList(driver,"Admin");

        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Te");
        dropDownList(driver,"Test");
        driver.findElement(By.xpath("//input[not(@type='password') and @autocomplete = 'off']")).sendKeys("Helloworld");
        driver.findElement(By.xpath("")).sendKeys();


    }
}
