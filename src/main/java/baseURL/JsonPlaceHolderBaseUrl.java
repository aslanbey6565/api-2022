package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected  RequestSpecification spec;

    @Before
    public void setUp(){

    spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/posts").build();


    }



}
