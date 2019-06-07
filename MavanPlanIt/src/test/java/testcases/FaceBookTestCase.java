package testcases;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericfunctions.Constants;
import genericfunctions.FaceBooklibraries;
import testdata.FaceBookTestData;

public class FaceBookTestCase extends FaceBooklibraries {

	String str = null;

	static Object[][] data = null;

	final String randomEmail = randomEmail();
	final String randomConfirmEmail = randomEmail();
	public String dummyRandomUserName = "TA" + new Random().nextInt(5) + "name";

	private static String randomEmail() {
		return "random-" + UUID.randomUUID().toString() + "@example.com";
	}

	@DataProvider(name = "Signin")
	public Object[][] logindata() {
		Object[][] data = FaceBookTestData.getInputdata(Constants.exceldata, "Sheet1");
		return data;
	}
   // Passing Parameter values to test methods using @DataProvider and Xlsx
	@Test(dataProvider = "Signin")
	public void SignIn(String FirstName, String SurName, String Email, String ConfirmEmail, String Password, String Day,
			String Month, String Year) {

		input(facebook.getFirstName(), dummyRandomUserName + FirstName, "Firstname");
		input(facebook.getSurName(), SurName, "Lastname");

		String abc = driver.findElement(By.xpath("//input[@name='lastname']")).getAttribute("value");
		System.out.println(abc);
		if (abc.equals(null)) {

			Assert.assertTrue(false, "not blank");
		}

		else {

			Assert.assertTrue(true, "Sharma");
		}
		//Code to generate and pass random email 
		input(facebook.getEmail(), randomEmail, "Email");
		input(facebook.getConfirmEmail(), randomEmail, "Email");
		input(facebook.getPassword(), Password, "Password");
		selectByValue(facebook.getDay(), Day, "Day Entered");
		selectByValue(facebook.getMonth(), Month, "month Entered");
		selectByValue(facebook.getYear(), Year, "Year entered");
		delay(4000);
		click(facebook.getGender(), "Clicked on Female radio button");
		click(facebook.getSignUp(), "Clicked on Sign Up button");
		delay(2000);
		
        //To Check error generation upon supplying incorrect email 
		
		String Actual_Result = "You have entered an invalid email address. Please check your email address and try again.";

		String Expected_Result = driver.findElement(By.xpath("//div[@id='reg_error']/div")).getText();
				
		Assert.assertEquals(Actual_Result, Expected_Result);

		System.out.println(Expected_Result);

	}

}
