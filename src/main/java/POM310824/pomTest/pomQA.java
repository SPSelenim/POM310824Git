package POM310824.pomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomQA {
	public WebDriver driver = null;
	public String FName = "fname";
	public String LName = "lname";
	public String mQA = "//a[@name='QA']";

	public pomQA(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirst() {
		WebElement fname = null;
		fname = driver.findElement(By.id(FName));
		return fname;
	}

	public WebElement getLast() {
		WebElement lname = null;
		lname = driver.findElement(By.id(LName));
		return lname;
	}

	public WebElement getQA() {
		WebElement pqa = null;
		pqa = driver.findElement(By.xpath(mQA));
		return pqa;
	}

	public void enterFirst(String myF) {
		try {
			getFirst().sendKeys(myF);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Entered First Name");
		}
	}

	public void enterLast(String myL) {
		getLast().sendKeys(myL);
	}

	public void clickQA() {
		try {
			getQA().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Clicked on QA");
		}

	}

}
