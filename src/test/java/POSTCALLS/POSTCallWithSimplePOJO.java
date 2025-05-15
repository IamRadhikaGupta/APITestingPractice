package POSTCALLS;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class POSTCallWithSimplePOJO {

    @Test
    public void createQuestion(){
       User user=new User("rad","rad111@mail1.com","Female","Active");
       //now you need to serialize it to convert to json object
        //add dependency of janaeu in pom.xml file

        RestAssured.baseURI="https://private-a1c194-complexjson1.apiary-mock.com";
        RestAssured.basePath="/questions";



        given().log().all().log()
                .body()
                .when().log().all().log();
    }
}
