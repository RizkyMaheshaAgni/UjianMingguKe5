package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login { // kelas halaman login
    private WebDriver driver;

    public Login(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy
    @FindBy(xpath = "//input[@id='user-name']")  // locator untuk username menggunakan elemnent HTML id
            WebElement username;

    @FindBy(xpath = "//input[@id='password']")  // locator untuk password menggunakan elemnent HTML id
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']") // locator untuk button login  menggunakan xpath
    WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']") // locator untuk mendapatkan text username
    WebElement txtDashboardProfil;

    @FindBy(xpath = " //h3[@data-test='error']") // negative test login
    WebElement messageNegative;


    // Custom Method
    public void login(String idUser, String kunciPass){
        username.sendKeys(idUser);
        password.sendKeys(kunciPass);
        btnLogin.click(); // memanggil perintah untuk melakukan aski tekan tombol login

    }

    public String getTxtDashboard (){
        return txtDashboardProfil.getText();
    }

public String negativeLogin(){
        return messageNegative.getText();
}


}
