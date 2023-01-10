package com.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Purchase {
	public WebDriver dri;
	@Given("browser launch")
	public void browser_launch() {
	    WebDriverManager.edgedriver().setup();
	    dri = new EdgeDriver();
	    dri.get("https://www.amazon.in");
		
	}

	@Given("user click the mobile epic")
	public void user_click_the_mobile_epic() {
		dri.findElement(By.xpath("//a[text()='Mobiles']")).click();

	}

	@When("user click the smartphones and basic mobile module")
	public void user_click_the_smartphones_and_basic_mobile_module() {
		dri.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();

	}

	@When("user click the mobile")
	public void user_click_the_mobile() {
		dri.findElement(By.xpath("(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[1]")).click();

	}

	@Then("user click buynow button")
	public void user_click_buynow_button() {
		dri.findElement(By.cssSelector("#buy-now-button")).click();

	}




}
