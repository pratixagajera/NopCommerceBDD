package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils
{
    /*Locators*/
    private By _continueButton = By.xpath("//a[@class = \"button-1 register-continue-button\"]");
    private By _confirmationMessage = By.className("result");
    public void getConfirmationForRegistration()
    {
        /*wait until continue button is clickable*/
        waitForClickAble(_continueButton, 10);

        /*to get message*/
        String message = getTextFromElement(_confirmationMessage);
        /*print message*/
        System.out.println(message);

        /*assert point added*/
        Assert.assertEquals(message, "Your registration completed", "Your registration is not completed");
    }
}
