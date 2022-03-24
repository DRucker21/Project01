import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ERSTest {
	String browserName = "chrome";

	WebDriver driver;

	@BeforeEach
	public void setUp() {
		System.out.println("#Step - browser is open");
		if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	@Test
	@DisplayName("Testing Login Function")
	public void testERSLogin() {
		driver.get("");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("")).sendKeys("Devyn");
		driver.findElement(By.xpath("")).sendKeys("LifeIsCrazy");

		driver.findElement(By.id("")).click();
	}

}
