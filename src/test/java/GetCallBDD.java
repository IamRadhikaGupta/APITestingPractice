import static io.restassured.RestAssured.*;
import static org.apache.commons.lang3.BooleanUtils.and;
import static org.apache.hc.core5.http.message.MessageSupport.header;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.testng.annotations.*;
/* 1.Logging request and response
2.Verifying the status code,value of a header and size of an arraay element in response body
3.Verifying that content type is json
 */
public class GetCallBDD {

    @Test
    public void test_numberOfCircuits(){
        given().log().all().
                when().
                   get("http://ergast.com/api/f1/2017/circuits.json").
                then().log().all().
                   assertThat().statusCode(200).
                and().
                   body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
                and().
                   header("Content-Length",equalTo("4552")).
                and().
                   contentType(ContentType.JSON).
                and().
                    header("Connection","keep-alive");

    }
}
