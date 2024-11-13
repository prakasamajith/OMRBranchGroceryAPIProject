package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC004_AddressStep {

	@Given("User add header and bearer authorization for accessing address endpoints")
	public void userAddHeaderAndBearerAuthorizationForAccessingAddressEndpoints() {

	}

	@When("User add request body for add new address {string},{string},{string},{string},{string},{string},{string},{string},{string},and {string}")
	public void userAddRequestBodyForAddNewAddressAnd(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10) {

	}

	@When("User send {string} request for addUserAddress endpoint")
	public void userSendRequestForAddUserAddressEndpoint(String string) {

	}

	@Then("User should verify the addUserAddress response message matches {string} and get the address id saved")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatchesAndGetTheAddressIdSaved(String string) {

	}

	@When("User add request body to update new address {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyToUpdateNewAddressAnd(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10) {

	}

	@When("User send {string} request for update addUserAddress endpoint")
	public void userSendRequestForUpdateAddUserAddressEndpoint(String string) {

	}

	@Then("User verify the update address response message matches {string}")
	public void userVerifyTheUpdateAddressResponseMessageMatches(String string) {

	}

}
