package org.testing.testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;

public class TC1 extends BaseClass {
	
	@Test
	public void test_case() throws InterruptedException
	{
		
		Login login = new Login(driver, pr);
		login.loggedin("jitenderahuja06@gmail.com", "@naukrijob");
		
		WebElement trending = driver.findElement(By.xpath("//span[text()='Trending']"));
		trending.click();
		Thread.sleep(3000);
		
	}
		
}