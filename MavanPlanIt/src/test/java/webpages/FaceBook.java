package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import genericfunctions.FaceBooklibraries;

public class FaceBook extends FaceBooklibraries {

	public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "u_0_l")
	private WebElement firstname;

	public WebElement getFirstName() {
		return firstname;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	private WebElement surname;

	public WebElement getSurName() {
		return surname;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_email_confirmation__']")
	private WebElement confirmemail;

	public WebElement getConfirmEmail() {
		return confirmemail;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='day']")
	private WebElement day;

	public WebElement getDay() {
		return day;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='month']")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='year']")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_passwd__']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='sex']")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}

	@FindBy(how = How.XPATH, using = "//button[@name='websubmit']")
	private WebElement signup;

	public WebElement getSignUp() {
		return signup;
	}
}
