package pages;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class JobScreen extends projectSpecific{
	
	public CreateJobsScreen createJobButtonClick() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Create Job']")).click();
		sleep(7000);
		return new CreateJobsScreen();
	}
	
	

}
