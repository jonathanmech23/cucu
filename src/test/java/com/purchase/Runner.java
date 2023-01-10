package com.purchase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\purchase.feature",
				glue = "com.purchase",
				plugin = {"html:report/mobilepurchase","json:report/mob.json"}
			, tags = {"@Mani"}
				
					)
public class Runner {

	
}
