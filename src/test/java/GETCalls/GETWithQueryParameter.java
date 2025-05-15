package GETCalls;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GETWithQueryParameter {


    @Test
    public void getProductDataAPIWithQueryParamTest() {
        RestAssured.baseURI = "https://fakestoreapi.com";

        given().log().all()
                .queryParam("limit",5)//(limits,5)
                .when().log().all()
                .get("/products")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);

    }}
