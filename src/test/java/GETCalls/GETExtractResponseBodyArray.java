package GETCalls;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GETExtractResponseBodyArray {
    @Test
    public void getProductDataAPI_With_Extract_Body_withJSONArray() {

        RestAssured.baseURI = "https://fakestoreapi.com";

        Response response =  given().log().all()
                .queryParam("limit", 10)
                .when().log().all()
                .get("/products").then().log().all().extract().response();

        JsonPath js = response.jsonPath(); //Json Array [{}]

        List<Integer> idList = js.getList("id", Integer.class);//0-4==>5
        List<String> titleList = js.getList("title");
        //List<Object> rateList = js.getList("rating.rate");
        List<Float> rateList = js.getList("rating.rate", Float.class);
        List<Integer> countList = js.getList("rating.count");

        for(int i=0; i<idList.size(); i++) {
            int id = idList.get(i);
            String title = titleList.get(i);
            Object rate = rateList.get(i);
            int count = countList.get(i);

            System.out.println("ID: " + id + " " + "Title: " + title + " " + "Rate: " + rate + " " + "Count: "+ count);
        }
        Assert.assertTrue(rateList.contains(4.9));
    }

}
