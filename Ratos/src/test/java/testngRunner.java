import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.standard.JobMediaSheetsCompleted;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainUtilities.projectSpecific;
import pages.CreateJobsScreen;
import pages.HomePage;
import pages.JobScreen;
import pages.LoginPage;

public class testngRunner extends projectSpecific{
	
	
	LoginPage login=new LoginPage();;
	HomePage homepage= new  HomePage();
	CreateJobsScreen createjobs= new CreateJobsScreen();
	JobScreen  jobscreen= new JobScreen();
	
	@BeforeMethod
	public void getUrl() throws InterruptedException, FileNotFoundException, IOException
	{

		System.out.println(getPropertyValue("email"));
		driver.get(prop.getProperty("login_url"));
		System.out.println("url is opened");
		sleep(3000);
		driver.manage().window().maximize();
		sleep(3000);
		System.out.println("window is maximimised");
	}
	

	@Test
	public void TC_001_login_and_create_jobs() throws InterruptedException, FileNotFoundException, IOException
	{
	
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.getJobsXpath();
		jobscreen.createJobButtonClick();
		createjobs.jobPriority();
		createjobs.jobLocation();
		createjobs.recruiter();
		createjobs.jobDescription();
		createjobs.jobTitle();
		createjobs.noOfOpenings();
		createjobs.clickSubmit();
		
		
		
	}
	
	
	@AfterMethod
	public void closeDriver() {
		driver.close();
		
		System.out.println("driver is closed");
		
	} 
}
