package POSTCALLS;

import io.restassured.RestAssured;
import org.apache.juneau.json.Json5Serializer;
import org.apache.juneau.json.JsonSerializer;

import static io.restassured.RestAssured.*;

public class CreateNewQuestion {
    public static void main(String[] args) {
     /*   RestAssured.basePath="https://private-a1c194-complexjson1.apiary-mock.com";
        RestAssured.baseURI="/questions";*/

        Question questionBody=new Question("rad898@mail89.com","cs","kaushik","ashwin");

        //now you need to serialize it to convert to json object
        //add dependency of juneau marshall in pom.xml file
        //in constructor add annotation to show it is constructor beanc
        //in that constructor you can give properties that will define what is the name of the
        //variables in json file

        //Convert Pojo to json

        JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;
        String json=jsonSerializer.serialize(questionBody);

        given().log().all()
                .header("Content-Type","application/json")
        .body(json).
        when().log().all()
                .post("https://private-a1c194-complexjson1.apiary-mock.com/questions").
                then().log().all().
                assertThat().statusCode(201);

    }

}
