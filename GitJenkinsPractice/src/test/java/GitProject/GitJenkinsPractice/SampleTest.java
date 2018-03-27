package GitProject.GitJenkinsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

	public static WebDriver driver;

	@Test
	public void sample() {
		System.setProperty(
				"webdriver.firefox.marionette",
				"F:\\Project\\OnePart\\Automation_Framework_2017x\\drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		// Create a new Firefox browser instance
		driver = new FirefoxDriver();
		driver.get("http://www.guru99.com/");
	}
}
