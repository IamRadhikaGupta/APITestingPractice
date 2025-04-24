import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VerifyArraySizeInResposneArray {
    @Test
    public void getUserAPITest() {
        RestAssured.baseURI = "https://gorest.co.in";

        given()
                .header("Authorization", "Bearer e4b8e1f593dc4a731a153c5ec8cc9b8bbb583ae964ce650a741113091b4e2ac6")
                .when().log().all()
                .get("/public/v2/users/")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("$.size()", equalTo(10));
    }
}
