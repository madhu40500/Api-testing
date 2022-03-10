package restassured.apitesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Authorization {

	@Test
	public void author() throws InterruptedException {

//		String acsessTokenResponse = given()
//				.queryParams("code", "4%2F0AX4XfWjdBV1oyY45QKfEztH9obcmmf1LSYOHKXftSZeL127uoCJTVI72xKgteyGkGiWNew")
//				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
//				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
//				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
//				.queryParams("grant_type", "authorization_code").when().log().all()
//				.post("https://www.googleapis.com/oauth2/v4/token").asString();
//		JsonPath js = new JsonPath(acsessTokenResponse);
//
//		String accessToken = js.get("access_token");
//		System.out.println(accessToken);
		given().urlEncodingEnabled(false).queryParams("access_token",
				"ya29.A0ARrdaM-eFZTzdSyLPr8nd0NJau9EHLu0SmI9eQKNXnzZRvAsZ27byprUJYkBPeE_Ybl261LkgYzw2S6VeNxfH_EndJb5IxQLLXjB5ewXgtRFwdmFCKoJedVd49XMG1JN1fVSu0je_4hw5_m2FmlV_fhPN5JYZA")
				.when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
	}

}
