package org.SchoolAppProject2025.Pages;

import org.SchoolAppProject2025.Mappings.RecordNamesMappings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RecordNamesPage extends RecordNamesMappings {
    RecordNamesPage mappings;

    // Student Menu
        WebDriver driver;

        public  RecordNamesPage (WebDriver driver) {

            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }
        public void clickStudentMenuButton(){
            StudentMenu.click();
        }

    public void clickAddStudentButton(){

        AddStudentButton.click();
    }

    public void InputFirstName(String Aridunnu){
        firstNameTextField.sendKeys("Aridunnu");
    }
    public void InputLastName(String Ari){
        lastNameTextField.sendKeys(Ari);
    }

    public void inputEmailAddress(String ariaridunnu){
        emailTextField.sendKeys("ariaridunnu@gmail.com");
    }

    public void clickAddStudentModalButton(){
            AddStudentModalSubmitButton.click();
    }

    public void clickCloseButton(){
            CloseButton.click();
    }

    }

