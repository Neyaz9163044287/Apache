package Astor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptTest 
{
	@Test
	public void add() throws InterruptedException
	{
		System.out.println("************Hello************");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("**********"+title+"**********");
		Thread.sleep(1000);
		driver.quit();
	}
}
