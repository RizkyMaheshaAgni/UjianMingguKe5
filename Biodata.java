package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Biodata {
    private WebDriver driver;

    public Biodata(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = " //input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement btnContiniu;

    @FindBy(xpath = "//span[@class='title']")
    WebElement textBiodata;



    // Custom Method
    public void biodata(String namaDepan,String namaBelakang,String kodePost){
        firstName.sendKeys(namaDepan);
        lastName.sendKeys(namaBelakang);
        zipCode.sendKeys(kodePost);
        btnContiniu.click();
    }
    public String getTextBiodata (){
        return textBiodata.getText();
    }

}
