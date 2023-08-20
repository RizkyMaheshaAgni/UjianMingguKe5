package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {

    private WebDriver driver;

    public CheckOut(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


     @FindBy(xpath = "//button[@id='checkout']")
    WebElement btnCheckOut;

    @FindBy(xpath = "//span[@class='title']")
    WebElement txtGetCheckOut;


    // Custom Method
    public void checkOut(){
        btnCheckOut.click();
    }
    public String getTxtCheckOut (){
        return txtGetCheckOut.getText();
    }



}
