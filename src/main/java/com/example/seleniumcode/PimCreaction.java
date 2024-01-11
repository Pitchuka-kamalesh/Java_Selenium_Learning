package main.java.com.example.seleniumcode;

import org.openqa.selenium.WebDriver;

import static main.java.com.example.seleniumcode.CodeSeleniumLogin.*;

public class PimCreaction {

    static CodeSeleniumLogin orange;


    public static void main(String[] args) {

        orange = new CodeSeleniumLogin();

        orange.setup();
        orange.login(driver);

    }







}
