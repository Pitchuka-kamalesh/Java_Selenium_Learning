package main.java.com.example;

/**
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * 
 */
public class ScreenShotError {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(By.xpath("//a[text() = 'Broken Images']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
            "arguments[0].style.border = '3px solid red'",
            Element);
		
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(SrcFile,new File("C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\Screeenshot\\test1.png"));
		System.out.println("Screen shot was scussfully taken");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
		
		

	}

}
