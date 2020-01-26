import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ExtraGet extends BaseClass {

     public static final  String counter = System.getProperty("counter");
    @Test(groups = {"regression"})
    public void getExtrausers() {

        given()
               .log().all().
        when()
                .pathParam("count", "4")
                .get("/users/{count}").

        then()
                .log().all()
                .statusCode(200);
    }

    @Test(groups={"regression"})

    public void createUser() {

        JSONObject obj = new JSONObject();

        obj.put("name","dinkan");
        obj.put("job", "leader");

        String body = obj.toJSONString();
        given().log().all()
                .body(obj.toJSONString())
        .when()

                .post("/users")
        .then()
                . statusCode(201)
                .log().all();



    }


}
