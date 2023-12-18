package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty"}
		)

public class ParallelRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
	  return super.scenarios();
  }
}
