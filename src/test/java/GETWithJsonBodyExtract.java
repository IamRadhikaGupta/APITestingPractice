import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GETWithJsonBodyExtract {

    @Test
    public void getUserAPI_With_Extract_Body_withJson() {

        RestAssured.baseURI = "https://gorest.co.in";

        Response response = given().log().all()
                .header("Authorization", "Bearer e4b8e1f593dc4a731a153c5ec8cc9b8bbb583ae964ce650a741113091b4e2ac6")
                .when().log().all()
                .get("/public/v2/users/7853470").then().log().all().
                extract().response();


        JsonPath js = response.jsonPath();


        System.out.println(js.getInt("id"));
        System.out.println(js.getString("email"));


    }
}
