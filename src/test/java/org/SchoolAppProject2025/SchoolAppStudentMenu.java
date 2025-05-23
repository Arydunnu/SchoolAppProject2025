package org.SchoolAppProject2025;

import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.RecordNamesPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class SchoolAppStudentMenu extends TestBase{
    WebDriver driver;
    @Test
    public void studentMenu() {
        driver = TestBase.setUp();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();

        RecordNamesPage recordNamesPage = new RecordNamesPage(driver);
        recordNamesPage.clickStudentMenuButton();
        recordNamesPage.clickAddStudentButton();
        recordNamesPage.InputFirstName("Aridunnu");
        recordNamesPage.InputLastName("Ari");
        recordNamesPage.inputEmailAddress("ariaridunnu@gmail.com");
        recordNamesPage.clickAddStudentModalButton();
        recordNamesPage.clickStudentMenuButton();
        recordNamesPage.clickCloseButton();

//        recordNamesPage.clickEditButton();


    }
}

