import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GETFakeStoreTest {
    @Test
    public void test(){
    Response response = given().log().all()
            .when().log().all()
            .get("https://fakestoreapi.com/products").then().log().all().extract().response();
    JsonPath js=response.jsonPath();
   List<Float> priceList= js.getList("price");
   System.out.println(priceList);
   Assert.assertTrue(priceList.contains(109.95f));

        List<Float> titleList= js.getList("title");
        System.out.println(titleList);
        Assert.assertTrue(titleList.contains("Mens Casual Premium Slim Fit T-Shirts "));
  /*  JsonPath js = response.jsonPath();
    List<Float> priceList = js.getList("price", Float.class);
		System.out.println(priceList);
		Assert.assertTrue(priceList.contains(12.99f));*/
}}
