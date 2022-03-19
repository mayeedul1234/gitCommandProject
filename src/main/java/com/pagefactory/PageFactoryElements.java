package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PageFactoryElements extends BaseClass{
	
	public PageFactoryElements() {
		PageFactory.initElements(Driver, this);
	}
	@FindBy(xpath = "(//*[text()='Sign in'])[2]")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath ="//*[@id='input-email-address']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath ="//*[@id='input-password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "(//*[text()='Sign in'])[5]")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	
	

	
	
}
