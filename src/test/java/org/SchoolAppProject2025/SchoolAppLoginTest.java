package org.SchoolAppProject2025;

import io.restassured.RestAssured;
import org.SchoolAppProject2025.Pages.AuthenticationPage;
import org.SchoolAppProject2025.Pages.RecordNamesPage;
import org.SchoolAppProject2025.Pages.TestBase;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;
import static java.lang.reflect.Array.get;
import static org.hamcrest.core.IsEqual.equalTo;

public class SchoolAppLoginTest extends TestBase {

    WebDriver driver;

    @Test
    public void testLogin() {
        driver = TestBase.setUp();

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.inputUserName("testuser");
        authenticationPage.inputPassword("testpassword");
        authenticationPage.clickSubmitButton();
//        driver.quit();

    }
//    RestAssured API Test

    @Test
    public void testGetSchoolApp() {
        RestAssured.baseURI = "https://qatest.qafit.at";
        given()
                .get("/api/v1")
                .then()
                .statusCode(200)
                .body("message", equalTo("Welcome to the School API."))
                .log().all();
    }

    @Test
    public void testRegisterUser() {

        RestAssured.baseURI = "https://qatest.qafit.at";
        given()
                .header("content-Type", "application/json")
//    {
//        "username" : "Ari",
//        "Password": "myPassword"
//
//        }
                .body("{\n" +
                      "  \"username\" :\"Aridee1\",\n" +
                       " \"password\" :\"myPassword\"\n" +
                                "}")



                .post("/api/v1/auth/register")  // post end point
                .then()
                .statusCode(201)
                .body("message", equalTo("You have successfully signed up"),
                        "token", Matchers.notNullValue())
                .log().all();
    }

}


