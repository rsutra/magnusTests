package com.magnus.uit.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
//
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		//This is your project path => E:\\Jala\\projects\\repos\\magnusTests
		String projectPath = "E:\\Jala\\projects\\repos\\magnusTests";
    	System.setProperty("webdriver.gecko.driver", projectPath+"\\magnusTests\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
//		System.setProperty("webdriver.chrome.driver",projectPath+"\\magnusTests\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
        String baseUrl = "http://magnus.jalaacademy.com/";//"http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Login";//"Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}

}
