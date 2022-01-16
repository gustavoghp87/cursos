package com.google.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest 
{

    WebDriver driver;

    @BeforeMethod
    void Setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\g\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void Exercise1()
    {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.click();
        searchBar.sendKeys("Selenium");
        //searchBar.submit();
        searchBar.sendKeys(Keys.ENTER);

        WebElement firstResult = driver.findElement(By.xpath("//h3[contains(text(), 'Selenium')][1]"));
        firstResult.click();
        Assert.assertEquals(driver.getTitle(), "Selenium");
    }

    @Test
    void Exercise2()
    {
        driver.get("https://testappautomation.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(), "Homme Page");

        WebElement loginButton = driver.findElement(By.id("loginBTN"));
        Assert.assertNotNull(loginButton);

        // WebElement navbarLink1 = driver.findElement(By.xpath("//*[text()[contains(.,'Lorem Ipsum')]][1]"));
        // navbarLink1.click();
        // Assert.assertEquals(driver.getTitle(), "Lorem Ipsum Page");

        WebElement footerText = driver.findElement(By.xpath("//footer/p/small"));
        Assert.assertEquals(footerText.getText(), "Disclaimer: This project is a personal site meant to be used as a help test site to be able to perform some automation test on demand.");

        loginButton.click();
        Assert.assertEquals(driver.getTitle(), "Log in to automationDemo");
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.name("action"));
        usernameInput.click();
        usernameInput.sendKeys("user");
        passwordInput.sendKeys("password");
        submitButton.click();
    }
    
    @AfterMethod
    void TearDown()
    {
        //driver.quit();
    }
}
