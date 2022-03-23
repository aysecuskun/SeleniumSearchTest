package Deneme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HepsiBuradaSearchTest {
public void SearchTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.hepsiburada.com/";
	driver.get(url);
	 driver.manage().window().maximize();
	 WebElement search=driver.findElement(By.className("desktopOldAutosuggestTheme-input"));
     search.sendKeys("iphone 13");
     search.click();//yazýlan ifadenin týklanmasý
     driver.findElement(By.className("SearchBoxOld-buttonContainer")).click();
     driver.findElement(By.xpath("//*[@id='ProductList']")).click();
     driver.findElement(By.xpath("//*[@id='i0']//div//a")).click();
}
}
