package test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_GetRequest {


    /*
            https://jsonplaceholder.typicode.com/posts/44"
            Gert request yolladigimizda donen Responsun:
                Status code 200
                Content type Json
                Response Body user id 5
                Response Body title "optio dolor molestias sit"
                         oldugunu test edin
     */
    @Test
    public void get01(){
    //1 - Request URL ve Body Olustur

    String url = "https://jsonplaceholder.typicode.com/posts/44";


    //2 - Expected Data olustur

        Map<String, Object > expectedData = new HashMap<>();
        expectedData.put("userId", 5);
        expectedData.put("title", "optio dolor molestias sit");

    //3 Responsu Kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

    //4 - Assertion

        response.
                then().
                 assertThat().
                statusCode(200).
                contentType(ContentType.JSON);

        JsonPath actBody = response.jsonPath();

        Assert.assertEquals(expectedData.get("userId"), actBody.get("userId"));
        Assert.assertEquals(expectedData.get("title"), actBody.get("title"));

}}
