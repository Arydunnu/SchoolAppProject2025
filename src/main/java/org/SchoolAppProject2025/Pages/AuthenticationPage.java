package org.SchoolAppProject2025.Pages;

import org.SchoolAppProject2025.Mappings.AuthenticationMappings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AuthenticationPage extends AuthenticationMappings {
    AuthenticationPage mappings;
    WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void inputUserName(String testuser){
        username.sendKeys(testuser);
    }

    public  void inputPassword(String testpassword){
        password.sendKeys(testpassword);
    }
    public void clickSubmitButton(){
        submit.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickLogoutMenu(){

        LogoutMenu.click();
    }
}
