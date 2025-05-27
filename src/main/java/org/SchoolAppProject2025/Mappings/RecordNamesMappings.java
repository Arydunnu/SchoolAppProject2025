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

    @FindBy(css = "#menu-students > a > p")
    public WebElement StudentMenu;

    @FindBy(css = "#students-card > div.card-content.table-responsive > button")
    public WebElement AddStudentButton;

    @FindBy(css = "#add-student-modal > div > div > div.modal-body > form > div:nth-child(1) > div:nth-child(1) > div > input")
    public WebElement firstNameTextField;

    @FindBy(css = "#add-student-modal > div > div > div.modal-body > form > div:nth-child(1) > div:nth-child(2) > div > input")
    public WebElement lastNameTextField;
    @FindBy(css = "#add-student-modal > div > div > div.modal-body > form > div:nth-child(1) > div.col-md-6 > div > input")
    public WebElement emailTextField;

    @FindBy (css = "#add-student-modal > div > div > div.modal-body > form > button")
    public WebElement AddStudentModalSubmitButton;

    @FindBy (css = "body > div.wrapper > div.main-panel > div > div.alert.alert-success.alert-with-icon > span > b")
    public WebElement StudentSuccessMessage;


    @FindBy(css = "body > div.wrapper > div.main-panel > div > div.alert.alert-success.alert-with-icon > button")
    public WebElement CloseButton;



    @FindBy (xpath = "//*[@id=\"students-card\"]/div[2]/table/tbody/tr[1]/td[7]/button/i")
    public WebElement EditButton;


    @FindBy(css = "#menu-teachers > a > p")
    public WebElement TeachersMenuButton;

    @FindBy(css = "#teachers-card > div.card-content.table-responsive > button")
    public WebElement addTeacherButton;


    @FindBy(css = "#add-teacher-modal > div > div > div.modal-body > form > div:nth-child(1) > div:nth-child(1) > div > input")
    public WebElement firstNameField;


    @FindBy(css = "#add-teacher-modal > div > div > div.modal-body > form > div:nth-child(1) > div:nth-child(2) > div > input")
    public WebElement lastNameField;
    @FindBy(css = "#add-teacher-modal > div > div > div.modal-body > form > div:nth-child(2) > div:nth-child(1) > div > input")
    public WebElement emailTextTeachersField;
    @FindBy (css = "#add-teacher-modal > div > div > div.modal-body > form > button")
    public WebElement AddTeacherModalSubmitButton;





    @FindBy(id = "menu-subjects")
    public WebElement subjectsMenu;



}
