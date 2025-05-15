package POSTCALLS;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class PostNewQuestion1 {
    public static void main(String[] args) {
        given()
        .contentType("application.json")
           .body("{'email':'abc81@gmail.com','programme':'cs','lastname':'kaushik','firstname':'goyal'}")
                   . post("https://private-a1c194-complexjson1.apiary-mock.com/questions")
        .then().statusCode(201);

    }
}
