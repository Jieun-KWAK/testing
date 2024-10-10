package spring.test;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
class BackendApplicationTests {

//	@Test
//	void 전체_조회_회사명_일치() {
//		RestAssured.given()
//				.when()
//				.get("http://localhost:8080/api/schedule")
//				.then()
//				.statusCode(200)
//				.body("[2].company_name", equalTo("카카오"));
//	}

	@Test
	void 전체_조회_회사명_불일치() {
		RestAssured.given()
				.when()
				.get("http://localhost:8080/api/schedule")
				.then()
				.statusCode(200)
				.body("[3].company_name", equalTo("KT"));
	}
}
