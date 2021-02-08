package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public static WebDriver driver;
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement tshirt;

	@FindBy(xpath = "//li[contains(@class,'ajax_block_product')]")
	private WebElement down;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement qview;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement qty;

	@FindBy(id = "group_1")
	private WebElement size;

	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement cart;

	@FindBy(xpath = "(//a[contains(@class,'btn')]) [2]")
	private WebElement chkout1;

	@FindBy(xpath = "(//a[contains(@class,'button ')])[3]")
	private WebElement chkout2;

	@FindBy(id = "uniform-id_address_delivery")
	private WebElement address;

	@FindBy(name = "processAddress")
	private WebElement paddress;

	@FindBy(id="cgv")
	private WebElement cgv;

	@FindBy(name="processCarrier")
	private WebElement pc;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankwire;

	@FindBy(xpath = "//button[contains(@class,'button btn btn-default')]")
	private WebElement click;

	public AddToCart(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getQview() {
		return qview;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getChkout1() {
		return chkout1;
	}

	public WebElement getChkout2() {
		return chkout2;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPaddress() {
		return paddress;
	}

	public WebElement getCgv() {
		return cgv;
	}

	public WebElement getPc() {
		return pc;
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getClick() {
		return click;
	}

}