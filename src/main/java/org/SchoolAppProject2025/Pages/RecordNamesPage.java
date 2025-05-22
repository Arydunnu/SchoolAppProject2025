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
//
////        public void inputFirstName(String testuser){
////            inputFirstName.sendKeys(testuser);
////        }
////
////        public  void inputPassword(String testpassword){
////            password.sendKeys(testpassword);
////        }
        public void clickStudentMenuButton(){

            StudentMenu.click();
        }
    }

