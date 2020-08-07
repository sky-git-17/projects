package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authentication {
 WebDriver driver;
	
	@FindBy(xpath = "//button[contains(text(),'  Sign Up')]")	WebElement SignUpButton;
	@FindBy(xpath = "(//label[contains(text(),'First Name ')]/..//input)[1]")	WebElement firstname;

	public Authentication(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void ClickOnSignUp() {
		SignUpButton.click();

	}
	public void enterfirstname(String fname) {
		firstname.sendKeys(fname);
	}
}
