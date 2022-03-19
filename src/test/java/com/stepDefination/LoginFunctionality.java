package com.stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.pagefactory.PageFactoryElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality extends BaseClass {

	PageFactoryElements pf;

	@Given("User can open any browser")
	public void user_can_open_any_browser() {
		setUp();
		pf= PageFactory.initElements(Driver, PageFactoryElements.class);

	}

	@Given("User is able to enter the {string} url")
	public void user_is_able_to_enter_the_url(String url) {
		Driver.get(url);


	}
	@When("User Clicks on the Sign in button")
	public void user_clicks_on_the_sign_in_button() {
		pf.getLogin().click();

	}

	@When("User enter email {string}")
	public void user_enter_email(String email) {
		pf.getEmail().sendKeys(email);


	}

	@When("User enter password {string}")
	public void user_enter_password(String password) {
		pf.getPassword().sendKeys(password);


	}

	@When("User Click on the Sign in botton")
	public void user_click_on_the_sign_in_botton() {
		pf.getSignin().click();


	}

	@Then("User successfully login zoopla account")
	public void user_successfully_login_zoopla_account() {


	}





}
