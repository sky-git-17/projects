package Academy.E2E;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import Resources.Base;
import Resources.dataDriven;
import pageObjects.Authentication;

public class HomePage extends Base {

	@Test
	public void BasePageNavigation() throws IOException {
		
		driver = InitilizeDriver();
		driver.get("https://thepromoapp.com/#!/login");
		dataDriven dd= new dataDriven();
		ArrayList data = dd.getdata("SIGNUP");
		Authentication Auth = new Authentication(driver);
		Auth.ClickOnSignUp();
		String val= "data.get(0)";
		Auth.enterfirstname(val);
	}
}
