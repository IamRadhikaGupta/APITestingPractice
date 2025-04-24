import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetProductsTest {
    @Test
    public void getProductsTest() {

        given().log().all()
                .when()
                .get("https://fakestoreapi.com/products")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .header("Connection", "keep-alive")
                .and()
                .body("$.size()", equalTo(20))
                .and()
                .body("id", is(notNullValue()))
                .and()
                .body("title", hasItem("Mens Cotton Jacket"));


    }
}
