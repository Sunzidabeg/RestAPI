package restAPITests;

import io.restassured.*;

public class Get_or_Read_All_Products {
	
	

	public void read_All_Products() {
		
		RestAssured.baseURI=("https://techfios.com");
		Response response=
		given().baseURI("https:")
		.header("Content-Type", "application/json")
		
		.when()
		.log().all()//system.out.print.
		.get("/api-prod/api/api/product/read.php")
		.then()
		 .statusCode(200);
		.extract().response()
		.header(Content-type","application/jason")
	}
	
}
