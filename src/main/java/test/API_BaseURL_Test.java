package test;

import baseURL.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import testDataDepo.JsonPlaceHolderTestData;

import static io.restassured.RestAssured.*;

public class API_BaseURL_Test extends JsonPlaceHolderBaseUrl {

    /*
        https://jsonplaceholder.typicode.com/posts/22 url'sine bir GET
       request yolladigimizda donen responin status kodu 200 ve response body asagida verilen ile ayni oldugunu test ediniz

Response body:
{
    "userId": 3,
    "id": 22,
    "title": "dolor sint quo a velit explicabo quia nam",
    "body": "eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse"
}
     */

@Test
    public void test01(){

    //1 URL VE REQUEST BODY OLUSTUR
    spec.pathParam("first", 22);

  //Expected Data Olustur

    JsonPlaceHolderTestData jsonPlaceHolder = new JsonPlaceHolderTestData();

    JSONObject expectedData = jsonPlaceHolder.expectedDataOlustur();
    System.out.println(expectedData);


}

}
