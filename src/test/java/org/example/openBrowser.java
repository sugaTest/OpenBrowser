package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class openBrowser {
    static WebDriver driver;

    @Test
    public void openBrowser() {
        System.out.println("Hello and welcome!");
        WebDriverManager.firefoxdriver().setup();

        // Headless mode
        FirefoxOptions options = new FirefoxOptions();
        //options.addArguments("--headless=new");
        /*above headless is for chrome*/

        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        System.out.println("Headless Browser is Initialized");

        driver.manage().window().maximize();
        System.out.println("Browser is maximized");

        driver.get("https://www.google.com");

        System.out.println("Google is opened");

        driver.quit();
        System.out.println("Browser is closed");
    }

    public static void waitTime(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


