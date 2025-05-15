package GETCalls;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class GETAPIWithPathParam {
    @Test
    public void getCircuitDataAPIWith_YearTest() {
        RestAssured.baseURI = "http://ergast.com";

        given().log().all()
                .pathParam("year", "2017")
                .when().log().all()
                .get("/api/f1/{year}/circuits.json")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .and()
                .body("MRData.CircuitTable.season", equalTo("2017"))
                .and()
                .body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));

    }
}
