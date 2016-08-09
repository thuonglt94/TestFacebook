package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import event.FacebookEvent;

public class ScriptBase {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	protected <T extends FacebookEvent> T given(T dsl) {
		return dsl;
	}

	protected <T extends FacebookEvent> T when(T dsl) {
		return dsl;
	}

	protected <T extends FacebookEvent> T and(T dsl) {
		return dsl;
	}

	protected <T extends FacebookEvent> T then(T dsl) {
		return dsl;
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
