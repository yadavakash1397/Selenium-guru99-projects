package telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelecomFull 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91976\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//open website and maximize
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//click on telecom project
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click(); //xpath by text
		Thread.sleep(1000);
		
		
		//------------------------1--Add Customer---------------------------------------------
		
		String id="270020";	
		/*
		//add customer
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click(); //xpath by text
		Thread.sleep(1000);		
		
		
		//driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		//click on done
		driver.findElement(By.xpath("//label[@for='done']")).click();  //xpath by Attribute
		Thread.sleep(1000);
		
		//first name
		driver.findElement(By.xpath("//input[@placeholder='FirstName']")).sendKeys("akash"); //xpath by Attribute
		Thread.sleep(500);
		
		//last name 
		driver.findElement(By.xpath("//input[@placeholder='LastName']")).sendKeys("yadav"); //xpath by Attribute
		Thread.sleep(500);
		
		//email
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("akashyadav@gmail.com"); //xpath by Attribute
		Thread.sleep(500);
		
		//address
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("hadapsar pune"); //xpath by Attribute
		Thread.sleep(500);
		
		//number
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9999888899"); //xpath by Attribute
		Thread.sleep(1000);
		
		//submit
		driver.findElement(By.xpath("//input[@name='submit']")).click(); //xpath by Attribute
		Thread.sleep(2000);
		
		//copy customer id
		String id=driver.findElement(By.xpath("//h3[contains(text(),'')]")).getText(); //xpath by contains text
		System.out.println(id);
			
		//come to home
		driver.findElement(By.xpath("//a[text()='Home']")).click();  //xpath by text
		
		*/
		//----------------------------------------2-Add Tariff Plan to Customer----------------------------------
		
		/*
		//add tariff plan to customer
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer']")).click(); //xpath by text
		
		//enter customer id
		driver.findElement(By.xpath("//input[@id='customer_id']")).sendKeys(id); //xpath by Attribute
		Thread.sleep(2000);
		
		//submit
		driver.findElement(By.xpath("//input[@value='submit']")).click(); //xpath by Attribute
		Thread.sleep(2000);
		
		//select tarriff plan
		driver.findElement(By.xpath("//td[contains(@style,'15px')]")).click();//xpath by contains Attribute
		Thread.sleep(500);
	
		//add tarriff plan
		driver.findElement(By.xpath("//input[@value='Add Tariff Plan to Customer']")).click(); //xpath by Attribute
		Thread.sleep(500);
		
		//go to home
		driver.findElement(By.xpath("//a[text()='Home']")).click();  //xpath by text
		*/
		
		
		//---------------------------------3-Add Tariff Plan------------------------------------------------
		
		/*
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click(); //xpath by text
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@name='rental']")).sendKeys("500"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Free Local Minutes']")).sendKeys("1200"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Free International Minutes']")).sendKeys("200"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Free SMS Pack']")).sendKeys("300"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Local Per Minutes Charges']")).sendKeys("2"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Inter. Per Minutes Charges']")).sendKeys("5"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='SMS Per Charges']")).sendKeys("7"); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click(); //xpath by Attribute
		Thread.sleep(500);
		
		//go home
		driver.findElement(By.xpath("//a[text()='Home']")).click(); //xpath by text
		*/
		
		//-----------------------------4--Pay Billing--------------------------------
		
		//driver.get("http://demo.guru99.com/telecom/index.html");
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Pay Billing']")).click(); //xpath by text
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Customer ID']")).sendKeys(id); //xpath by Attribute
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click(); //xpath by Attribute
		Thread.sleep(500);
		
		driver.navigate().to("http://demo.guru99.com/telecom/index.html");
		

	}

}
