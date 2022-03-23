package Deneme1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolLoginTest {
	public void TestLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F";
		driver.get(url);
		driver.manage().window().maximize();
	
		//driver.findElement(By.xpath("//*[@id='account-navigation-container']//div//div[1]//div[2]//div//div[1]")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement mail = driver.findElement(By.id("login-email"));
		mail.click();
		mail.sendKeys("aysecuskunn@gmail.com");

		WebElement password = driver.findElement(By.id("login-password-input"));
		password.click();
		password.sendKeys("ayse1410");
		// declare and initialize the variable to store the expected title of the webpage.
       String expectedTitle = "En Trend Ürünler Türkiye'nin Online Alýþveriþ Sitesi Trendyol'da";
        
        //fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();

		driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button/span")).click();
		if (expectedTitle!=actualTitle) {
			
			System.out.println("test baþarýlý");
			
		} else {
			System.out.println("test baþarýlý deðil.");
		}
	}
}
