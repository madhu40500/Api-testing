package restassured.apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import jsoncode.Postbodycode;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
public class Pracitcepost {
	public static String  place_id;
	
	@Test
	public  void postdata()
	{
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
	given().log().all(). queryParams("key", "qaclick123").header("Content-Type","application/json")
		.body(Postbodycode.post()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().asString();
//	JsonPath js= new JsonPath(extract);
//	place_id= js.get("place_id");
//	System.out.println(place_id);
	//System.out.println(extract);
//	
//	given().queryParams("key", "qaclick123").header("Content-Type","application/json").body(Postbodycode.put())
//	.when().put("/maps/api/place/update/json")
//	.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"))
//	.header("Server", "Apache/2.4.18 (Ubuntu)");
//	
//	given().queryParams("key", "qaclick123","place_id", place_id )
//	.when().get("maps/api/place/get/json")
//	.then().log().all();
	
	
	}
	
}
