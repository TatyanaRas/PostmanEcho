
package ru.netology.postman;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

//import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

           @Test
        void shouldPost() {
               // Given - When - Then
// Предусловия
               given()
                       .baseUri("https://postman-echo.com")
                       .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                       .when()
                       .post("/post")
// Проверки
                       .then()
                       .log().all()
                       .statusCode(200)
                       .body("data", (org.hamcrest.Matchers.equalTo("some volume")))
               ;
        }
    }

