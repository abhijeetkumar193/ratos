package pages;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class HomePage extends projectSpecific {
	public JobScreen getJobsXpath() throws InterruptedException
	{
		System.out.println("before clicking on the jobs screen");
		driver.findElement(By.xpath("//*[@href='#/jobs']")).click();
		System.out.println("After clicking on the jobs screen");
		sleep(10000);
		
		return new JobScreen();
	}

}
