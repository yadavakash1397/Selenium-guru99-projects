package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterListBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91976\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get("http://demo.guru99.com/insurance/v1/register.php");		
		Thread.sleep(1000);
		
		WebElement title=driver.findElement(By.xpath("//select[@name='title']"));
		Select selecttitle=new Select(title);
		selecttitle.selectByIndex(7);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akash");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9988776655");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='year']"));
		Select selectyear=new Select(year);
		selectyear.selectByValue("1994");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		Select selectmonth=new Select(month);
		selectmonth.selectByValue("8");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='date']"));
		Select selectdate=new Select(date);
		selectdate.selectByValue("15");
		
		driver.findElement(By.xpath("(//input[@name='licencetype'])[1]")).click();
		
		WebElement lincenceperiod = driver.findElement(By.xpath("//select[@name='licenceperiod']"));
		Select selectlincenceperiod=new Select(lincenceperiod);
		selectlincenceperiod.selectByVisibleText("10");
		
		WebElement occupation = driver.findElement(By.xpath("//select[@name='occupation']"));
		Select selectoccupation=new Select(occupation);
		selectoccupation.selectByVisibleText("Student");
		
		driver.findElement(By.xpath("//input[@name='street']")).sendKeys("kute mala");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[@name='county']")).sendKeys("india");
		
		driver.findElement(By.xpath("//input[@name='post_code']")).sendKeys("415539");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akashyadav@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("akak1234");
		
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("akak1234");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
