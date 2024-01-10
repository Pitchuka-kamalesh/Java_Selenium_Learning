package main.java.com.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class BrokenImages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		System.out.println("Checcking the Wheathers the images are working or not");
		System.out.println(driver.getTitle());
//		WebElement d = driver.findElement(By.className("drive"));
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement image : images) {
			
			
//			System.out.println(image.getAttribute("naturalWidth"));
			if (image.getAttribute("naturalWidth").equals("0")) {
		        JavascriptExecutor js = (JavascriptExecutor)driver;
		        js.executeScript(
		            "arguments[0].style.border = '3px solid red'",
		            image);
				
				File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(SrcFile,new File("C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\Screeenshot\\test1.png"));
				System.out.println("Screen shot was successfully taken");
				
				System.out.println("The image is broken"+ ": " + image.getAttribute("src"));
				
			}else {
				System.out.println("The image is fine"+ ": " + image.getAttribute("src"));
			}
			
		}
		
		System.out.println("we have checked every images");
		
		driver.quit();
		

	}

}
