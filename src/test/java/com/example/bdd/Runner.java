package com.example.bdd;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(org.junit.runner.Runner.class)
@CucumberOptions(features = "Features", glue = {"StepDefinition"})
public class Runner {
}
