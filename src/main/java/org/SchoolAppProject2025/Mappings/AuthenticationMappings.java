package org.SchoolAppProject2025.Mappings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationMappings {
    WebDriver driver;
    public AuthenticationMappings(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(name ="username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "body > section > div > div > div.col-md-4.login-sec > form > button")
    public WebElement submit;

//    @FindBy(css = "#menu-logout > a > p")
//    public WebElement LogoutButton;



    @FindBy(id="menu-teachers")
    public WebElement TeachersMenu;

    @FindBy(id="menu-subjects")
    public WebElement SubjectsMenu;

    @FindBy(id = "menu-logout")
    public WebElement LogoutMenu;
}
