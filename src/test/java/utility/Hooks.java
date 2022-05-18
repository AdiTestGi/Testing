package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
    public void beforeScenariotest(){
        System.out.println("This will run first before  Scenario");
    }	
	
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run second before Scenario");
    }	
	
	@After
    public void afterScenario1(){
        System.out.println("This will run the Scenario");
    }
	
	@After
    public void afterScenario(){
        System.out.println("This will end the after Scenario");
    }
}
