package POM310824.pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//6:10 pm
public class TestQA {
	public String AppPath = "file:///D:/SeleniumAutomation/05DemoApps/demo.html";
	public WebDriver driver = null;

	@BeforeClass
	public void tearUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(AppPath);
	}

	@Test
	public void f() {

		try {
			driver.manage().window().maximize();
			pomQA pqa = new pomQA(driver);
			pqa.enterFirst("jmp");
			pqa.enterLast("jmp2");
			pqa.clickQA();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
