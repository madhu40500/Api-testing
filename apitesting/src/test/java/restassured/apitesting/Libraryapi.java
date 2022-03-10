package restassured.apitesting;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import jsoncode.Librarybody;
public class Libraryapi {

	@Test(dataProvider = "getdata")
	public void addBook(String data)
	{
		
		RestAssured.baseURI="http://216.10.245.166";
		given().header("Content-Type","application/json").body(Librarybody.deleteBook(data))
		.when().delete("/Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200);

		given().header("Content-Type","application/json").body(Librarybody.addBook(data))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200);
	
		
	
	}
	
	@DataProvider(name="getdata")
	public Object[] data()
	{
		return new Object[] {"aasadf","astdfgt","aqwdwrd","kefhdju"};
	
	
}
}
