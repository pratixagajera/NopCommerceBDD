package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage
{
    /*create method for timestamp*/
    public static String timeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }

    /*create method to click on element*/
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    /*method created for wait for clickable*/
    public static void waitForClickAble(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    /*method created to get text from element*/
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    /*method created for type text*/
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
}
