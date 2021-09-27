import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class body1 {
    @Test
    public void test() {
        RestAssured.baseURI = "https://basicapitest.herokuapp.com";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");


        JSONObject datas = new JSONObject();
        datas.put("deneme",1234);
        datas.put("isim", "Hamza");


        request.body(datas.toJSONString());

    }

}
