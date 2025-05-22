package org.SchoolAppProject2025.Mappings;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RecordNamesMappings{
    WebDriver driver;
public RecordNamesMappings (WebDriver driver) {

    PageFactory.initElements(driver, this);
    this.driver = driver;
}

    @FindBy(id = "menu-students")
    public WebElement StudentMenu;

    @FindBy(css = "#students-card > div.card-content.table-responsive > button")
    public WebElement AddStudentButton;

}
