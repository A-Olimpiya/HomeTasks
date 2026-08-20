package ru.aston.lesson2_8;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import io.restassured.specification.RequestSpecification;

import org.junit.jupiter.api.BeforeEach;

public class BaseForTest {
    protected ResponseSpecification response200;
    protected RequestSpecification requestSpec;

    public static final String BASE_URL = "https://postman-echo.com";
    public static final String EXPECTED_BODY = "This is expected to be sent back as part of response body.";

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        response200 = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.TEXT)
                .setBody(EXPECTED_BODY)
                .build();
    }
}