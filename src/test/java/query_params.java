import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class query_params {
    @Test
    public void test() {
        RestAssured.baseURI = "https://basicapitest.herokuapp.com";
        RequestSpecification request = RestAssured.given();


        request.param("isim","Hamza");
        request.param("deneme","1234");
    }
}