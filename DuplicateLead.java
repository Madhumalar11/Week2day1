package week2.Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhumalar");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("b");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Madhu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT to IT");
	driver.findElement(By.name("description")).sendKeys("Learning Automation Selenium");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bmadhumalar@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Study TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthi");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("Title: \n");
	driver.getTitle();
	
	}

}

