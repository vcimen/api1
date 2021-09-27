import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Deneme2 {
    @Test
    public void test() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
        RequestSpecification request = RestAssured.given();
        Response response = request.
                when().
                get("posts").
                then().
                extract().
                response();
        int statusCode = response.getStatusCode();

        String  responseBody =response.getBody().asString();

        // boolean varMi = response.jsonPath().getBoolean("userId");

        List<Integer> userIDList =response.jsonPath().getList("userId");

        // System.out.println(statusCode);
        // System.out.println(responseBody);

        System.out.println(userIDList);
        Assert.assertTrue(userIDList.contains(10) );

    }

}
