package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	

	static WebDriver driver;

	public static void intializebrowser(String browsername) {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {

			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {

			driver = new EdgeDriver();
		}

	}
	public static WebDriver getdriver() {

		return driver;

	}

}
