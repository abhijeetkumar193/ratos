package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import mainUtilities.projectSpecific;


public class CreateJobsScreen extends projectSpecific{
	
	public CreateJobsScreen jobPriority()
	{
		WebElement findElement = driver.findElement(By.xpath("//*[text()='High']"));
		findElement.click();
		return this;
	}
	
	public CreateJobsScreen noOfOpenings() throws FileNotFoundException, IOException
	{
		driver.findElement(By.id("no_of_openings")).sendKeys(getPropertyValue("no_of_opening"));
		return this;
	}
	
	
	public CreateJobsScreen projectDuration() throws FileNotFoundException, IOException
	{
		driver.findElement(By.id("project_duration")).sendKeys(getPropertyValue("project_duration"));
		return this;
	}
	
	public CreateJobsScreen jobLocation()
	{
		driver.findElement(By.xpath("//*[text()='Boston, GA']")).click();
		return this;
	}
	
	public CreateJobsScreen jobTitle()
	{
		driver.findElement(By.id("job_title")).sendKeys("java developer");
		return this;
	}
	
	public CreateJobsScreen jobDescription()
	{
		
		driver.findElement(By.xpath("//*[@formcontrolname='job_description']")).sendKeys("java developer for chennai lcoations");
		return this;
	
	}
	
	public CreateJobsScreen recruiter()
	{
		driver.findElement(By.xpath("//*[@class='ng-option-label'][1]")).click();
		return this;
	}
	
	
	public JobScreen clickSubmit() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()=' Submit Job ']")).click();
		sleep(15000);
		
		
		return new JobScreen();
	}
	
	
	
	
}
