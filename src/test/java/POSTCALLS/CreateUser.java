package POSTCALLS;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class CreateUser{

    @Test
    public void postTest(){
        RestAssured.baseURI = "https://gorest.co.in";
               try {
                     int userId= given().log().all()
                        .contentType(ContentType.JSON)
                        .body(new File("./src/test/resources/addUser.json"))
                                .header("Authorization", "Bearer e4b8e1f593dc4a731a153c5ec8cc9b8bbb583ae964ce650a741113091b4e2ac6")
                                .when().
                                    post("/public/v2/users/")
                                .then().log().all().assertThat().statusCode(201)
                             .and().extract().response().path("id");
                   System.out.println("user id -->" + userId);


        //2. get the same user and verify it: GET
        given()
                .header("Authorization", "Bearer e4b8e1f593dc4a731a153c5ec8cc9b8bbb583ae964ce650a741113091b4e2ac6")
                .when().log().all()
                .get("/public/v2/users/"+ userId)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("id", equalTo(userId));
    }
               catch (Exception e) {
        throw new RuntimeException(e);
               }

                }
}




