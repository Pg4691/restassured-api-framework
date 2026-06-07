package tests;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTests {

    @BeforeClass
    public void init() {
        BaseTest.setup();
    }

    @Test
    public void getUserTest() {

        given()

                .when()
                .get("/users/1")

                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("Leanne Graham"))
                .body("username", equalTo("Bret"));
    }
}