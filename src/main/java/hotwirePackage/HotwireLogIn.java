package hotwirePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotwireLogIn {
	
	public void getLogIn() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hotwire.com/");
		driver.findElement(By.xpath("//*[@class='btn btn-default sign-in btn-xs']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mahnhiyan@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("mahnhiyan123");
		//driver.findElement(By.xpath("//*[@class='CRB__label text-muted CRB__label--right']")).click();
		//driver.findElement(By.xpath("//*[@class='label-text']")).click();
		driver.findElement(By.xpath("(//*[@class='btn__label btn__label--truncate'])[2]")).click();
		
	}
	
	public static void main(String[] args) {
		HotwireLogIn obj = new HotwireLogIn();
		obj.getLogIn();
	}

}
