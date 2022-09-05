package test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_PostRequest {


    @Test
    public void post01(){

        String url = "https://jsonplaceholder.typicode.com/posts";

        JSONObject reqBody = new JSONObject();

        reqBody.put("title", "API");
        reqBody.put("body", "API IS PERFECT");
        reqBody.put("userId", 10);

        //Expected Data

        JSONObject expectedBody = new JSONObject();

        reqBody.put("title", "API");
        reqBody.put("body", "API IS PERFECT");
        reqBody.put("userId", 10);

        //response Kaydet

        Response response = given().
                contentType(ContentType.JSON).
                when().
                body(reqBody.toString()).
                post(url);

        JsonPath actualBody = response.jsonPath();

        //4 - Assertion

        Assert.assertEquals(expectedBody.get("title"), actualBody.get("title"));
        Assert.assertEquals(expectedBody.get("body"), actualBody.get("body"));
        Assert.assertEquals(expectedBody.get("userId"), actualBody.get("userId"));

    }
}
