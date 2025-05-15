package GETCalls;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class GETBDD1 {

    @Test
    public void moreGETTests() {
        given().log().all().
                when().
                get("https://fakestoreapi.com/products").
                then().log().all().
                header("Content-Type", equalTo(
                        "application/json; charset=utf-8")).and().
                header("Connection", equalTo(
                        "keep-alive")).and().
                assertThat().
                statusCode(200).and().assertThat().statusLine("HTTP/1.1 200 OK");
    }}





