package org.SchoolAppProject2025;

import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.RecordNamesPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SchoolAppTeacherMenu extends TestBase {
    WebDriver driver;
    @Test
    public void TeachersMenu() {
        driver = TestBase.setUp();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();

        RecordNamesPage recordNamesPage = new RecordNamesPage(driver);
        recordNamesPage.clickTeachersMenuButton();
        recordNamesPage.clickAddTeacherButton();
        recordNamesPage.inputFirstName("Dorcas");
        recordNamesPage.inputLastName("Ari");
        recordNamesPage.inputEmailTextTeachersField("");
        recordNamesPage.clickAddTeacherModalSubmitButton();
        recordNamesPage.clickTeachersMenuButton();

//        recordNamesPage.clickAddTeachersButton();
//        recordNamesPage.clickAddTeachersButton();

    }


}
