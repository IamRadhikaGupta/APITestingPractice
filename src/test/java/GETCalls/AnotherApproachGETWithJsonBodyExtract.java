package GETCalls;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AnotherApproachGETWithJsonBodyExtract {

    @Test
    public void getUserAPI_With_Extract_Body_withJson() {

        RestAssured.baseURI = "https://gorest.co.in";

        Response response = given().log().all()
                .header("Authorization", "Bearer e4b8e1f593dc4a731a153c5ec8cc9b8bbb583ae964ce650a741113091b4e2ac6")
                .when().log().all()
                .get("/public/v2/users/7853470").then().log().all().
                extract().response();


        int userId = response.path("id");
        String email=response.path("email");


        System.out.println(userId);
        System.out.println(email);


    }
}
