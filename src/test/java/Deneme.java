import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Deneme {
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


        System.out.println(statusCode);
    }

}
