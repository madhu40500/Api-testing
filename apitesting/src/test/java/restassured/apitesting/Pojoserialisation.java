package restassured.apitesting;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import jsoncode.Addplace;
import jsoncode.Location;

public class Pojoserialisation {

	@Test
	public void serialisation() {

		Addplace add = new Addplace();
		add.setAccuracy(50);
		add.setName("Frontline house");
		add.setPhone_number("(+91) 983 893 3937");
		add.setWebsite("http://google.com");
		add.setLanguage("French-IN");
		add.setAddress("29, side layout, cohen 09");
		List<String> mylist = new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		add.setLocation(l);
		add.setType(mylist);
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key ", "qaclick123")
				.setContentType(ContentType.JSON).build();
		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		
		given().spec(req).body(add).when().post("/maps/api/place/add/json").then().log().all()
				.spec(res);

	}

}
