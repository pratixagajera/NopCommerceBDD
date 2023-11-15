package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils
{
    /*locators*/
    private By _registerButton = By.xpath("//a[@class = \"ico-register\"]");
    private By _computerButton = By.xpath("//ul[@class = \"top-menu notmobile\"]/li[1]/a[1]");

    /*create method to click on register button*/
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton);
    }

    /*create method to hover over on element*/
    public void hoverOnComputerButton()
    {
        WebElement element = driver.findElement(_computerButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    /*create method to check css value of element*/
    public void textColor()
    {
        WebElement element = driver.findElement(_computerButton);
        String color = element.getCssValue("color");
        Assert.assertEquals(color, "rgba(74, 178, 241, 1)", "color dose not match");
        System.out.println(color);
    }
}
