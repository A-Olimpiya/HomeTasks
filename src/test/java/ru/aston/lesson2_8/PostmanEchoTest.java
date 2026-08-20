package ru.aston.lesson2_8;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

public class PostmanEchoTest extends BaseForTest {

    @Test
    @DisplayName("Тестирование GET")
    public void testGet() {
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .spec(response200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    @DisplayName("Тестирование POST RAW")
    public void testPostRaw() {
        given()
                .spec(requestSpec)
                .when()
                .post("/post")
                .then()
                .spec(response200)
                .body("data", equalTo(EXPECTED_BODY));
    }

    @Test
    @DisplayName("Тестирование POST FORM DATA")
    public void testPostFormData() {
        given()
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .spec(response200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"));
    }

    @Test
    @DisplayName("Тестирование PUT")
    public void testPut() {
        given()
                .spec(requestSpec)
                .when()
                .put("/put")
                .then()
                .spec(response200)
                .body("data", equalTo(EXPECTED_BODY))
                .body("json", nullValue());
    }

    @Test
    @DisplayName("Тестирование PATCH")
    public void testPatch() {
        given()
                .spec(requestSpec)
                .when()
                .patch("/patch")
                .then()
                .spec(response200)
                .body("data", equalTo(EXPECTED_BODY))
                .body("json", nullValue());
    }

    @Test
    @DisplayName("Тестирование DELETE")
    public void testDelete() {
        given()
                .spec(requestSpec)
                .when()
                .delete("/delete")
                .then()
                .spec(response200)
                .body("data", equalTo(EXPECTED_BODY))
                .body("json", nullValue());
    }
}