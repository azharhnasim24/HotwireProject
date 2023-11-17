package hotwirePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotwireSignUp {
	
	public void getAccount() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hotwire.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='btn btn-primary sign-up btn-xs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='form-control'])[1]")).sendKeys("M");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("Haque");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mahmasim24@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("MuhammadHaque!123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='btn__label btn__label--truncate'])[2]")).click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		HotwireSignUp obj = new HotwireSignUp();
		obj.getAccount();
	}

}
