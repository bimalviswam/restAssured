

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    @BeforeClass(alwaysRun=true)
    public static void  setup(){
        System.out.println("before class");
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/";
    /*RestAssured.basePath = "api";*/


        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json").build();
        RestAssured.requestSpecification = requestSpecification;
}
}
