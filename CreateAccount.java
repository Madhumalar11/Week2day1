package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{

	public static void main(String[] args)
	{
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Credit Account");
	driver.findElement(By.name("description")).sendKeys("Automation Testing Selenium");
	driver.findElement(By.id("groupNameLocal")).sendKeys("Madhumalar");
	driver.findElement(By.name("officeSiteName")).sendKeys("TestLeaf");
	driver.findElement(By.id("annualRevenue")).sendKeys("1000000");
	WebElement tool=driver.findElement(By.name("industryEnumId"));
	Select drop=new Select(tool);
	drop.selectByValue("IND_SOFTWARE");
	WebElement tool1=driver.findElement(By.name("ownershipEnumId"));
	Select drop1 = new Select(tool1);
	drop1.selectByVisibleText("S-Corporation");
	WebElement tool2=driver.findElement(By.id("dataSourceId"));
	Select drop2 =new Select(tool2);
	drop2.selectByValue("LEAD_EMPLOYEE");
	WebElement tool3=driver.findElement(By.id("marketingCampaignId"));
	Select drop3=new Select(tool3);
	drop3.selectByIndex(6);
	WebElement tool4=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select drop4=new Select(tool4);
	drop4.selectByValue("TX");
	driver.findElement(By.className("smallSubject"));
	
	
}

}

	

}
