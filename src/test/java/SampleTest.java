import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SampleTest {

    @Test(groups = {"smoke"})
    public void getusers (){

        given().
        when()
                .baseUri("/users/")
                .pathParam("count", "3")
                .get("/{count}").
        then()
                .log().all()
                .statusCode(200);

    }

    @Test
    public void createUser (){

    }
}
