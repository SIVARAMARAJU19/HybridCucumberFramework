package Hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

WebDriver driver;
	
	@Before
	public void setup() {
		
		 DriverFactory.intializebrowser("chrome");
		 driver = DriverFactory.getdriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://magento.softwaretestingboard.com/");
		
	}	

	@After
	public void testcloser(Scenario scenario) {
		String scenarioname = scenario.getName().replaceAll(" ", " ");
		if (scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot,"image/png",scenarioname);
		}
		driver.quit();
		
	}

}
