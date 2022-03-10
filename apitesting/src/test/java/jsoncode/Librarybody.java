package jsoncode;

public class Librarybody {

	
	public static String addBook(String data)
	{
		return "{\r\n"
				+ " \r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+data+"\",\r\n"
				+ "\"aisle\":\"2278\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}";
	}
	
	
	public static String deleteBook(String data)
	{
		return "{\r\n"
				+ "     \r\n"
				+ "\"ID\" : \""+data+"2278\"\r\n"
				+ "\r\n"
				+ "}";
	}
}
