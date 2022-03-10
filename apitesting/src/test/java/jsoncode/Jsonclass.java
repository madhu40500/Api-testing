package jsoncode;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Jsonclass {

	@Test
	public void jsonClass()
	{
		
		JsonPath js = new JsonPath(Jsonpathcode.courses());
	int size=	js.getInt("courses.size()");
	int purchaseAmount =js.getInt("dashboard.purchaseAmount");
	int result=0;
	System.out.println(js.getInt("courses.size()"));
		for(int i=0;i<size;i++)
		{
			int price= js.get("courses["+i+"].price");
			int copies= js.getInt("courses["+i+"].copies");
			result=  result+ (price*copies);
		}
		if(purchaseAmount==result)
		{
			System.out.println(true);
		}

	}
}
