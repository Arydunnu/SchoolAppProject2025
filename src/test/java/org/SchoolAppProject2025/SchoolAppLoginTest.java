package org.SchoolAppProject2025;

import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.testng.annotations.Test;

public class SchoolAppLoginTest extends TestBase {

    @Test
    public void testLogin(){

        AuthenticationPage authenticationPage =new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();

    }

}
