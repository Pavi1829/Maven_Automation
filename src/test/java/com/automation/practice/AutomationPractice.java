package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.automation.pom.AddToCart;
import com.automation.pom.HomePage;
import com.automation.pom.SignInPage;

public class AutomationPractice extends com.automation.baseclass.BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HomePage hp = new HomePage(driver);
		clickOnWebElement(hp.getSignIn());

		SignInPage sp = new SignInPage(driver);
		inputToElement(sp.getEmail(), "paviraaje@gmail.com");
		inputToElement(sp.getPassword(), "Pavi_1@sweety");
		clickOnWebElement(sp.getSubmit());

		AddToCart ac = new AddToCart(driver);
		moveToElement(ac.getWomen());
		moveToElement(ac.getTshirt());
		waitforElement(ac.getTshirt());
	    clickOnWebElement(ac.getTshirt());
		moveToElement(ac.getDown());
		//waitforElement(ac.getDown());
		clickOnWebElement(ac.getQview());
		driver.switchTo().frame(0);
		clickOnWebElement(ac.getQty());
		clickOnWebElement(ac.getSize());
		SelectDropDown(ac.getSize(), "2", "index");
		clickOnWebElement(ac.getCart());
		driver.switchTo().defaultContent();
		clickOnWebElement(ac.getChkout1());
		clickOnWebElement(ac.getChkout2());
		//clickOnWebElement(ac.getAddress());
		clickOnWebElement(ac.getPaddress());
		clickOnWebElement(ac.getCgv());
		clickOnWebElement(ac.getPc());
		clickOnWebElement(ac.getBankwire());
		clickOnWebElement(ac.getClick());

	}
}