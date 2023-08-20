package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chart {
    private WebDriver driver;

    public Chart(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindByd
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
            WebElement btnChart;

    @FindBy(xpath = "//span[@class='title']")
    WebElement txtGetChart;



    public void chartPage(){
        btnChart.click();
    }

    public String getTextChart (){
        return txtGetChart.getText();
    }


}
