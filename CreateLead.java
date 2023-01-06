package week2.Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get ("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhumalar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj = new Select(source);
		obj.selectByVisibleText("Employee");
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select obj1 = new Select(Marketing);
		obj1.selectByValue("9001");
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj3 = new Select(owner);
		obj3.selectByIndex(5);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select obj4 = new Select(country);
		obj4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title: \n");
		driver.getTitle();
		
	}

}
