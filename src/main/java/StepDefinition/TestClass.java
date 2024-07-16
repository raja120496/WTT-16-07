package StepDefinition;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import base.CommonPaths;
import base.Commonmethods;
import base.DriverInitialisation;

public class TestClass extends DriverInitialisation{

	Commonmethods commonmethod=new Commonmethods(driver,wait);
	private static final Logger LOG = LogManager.getLogger(TestClass.class);
	@Before
	public void testStart(Scenario scenario) throws Exception{

		initialization();

		commonmethod.startRecording();

		LOG.info("*****************************************************************************************");
		LOG.info("	Scenario: "+scenario.getName());
		LOG.info("*****************************************************************************************");
	}

/*
	@AfterClass
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"); 
				LocalDateTime now = LocalDateTime.now();  
				File f1 = new File(CommonPaths.Screenshot_failure_path+dtf.format(now).toString()); 
				if (!f1.exists()){
					f1.mkdirs();
				} 
				File DestFile=new File(CommonPaths.Screenshot_failure_path+dtf.format(now).toString()+"/"+result.getName()+".png");
				FileUtils.copyFile(src, DestFile);

				//FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
				System.out.println("Failure method name="+result.getName());
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
		}
	}

*/

	@After
	public void destroyDriver() throws Exception{
		commonmethod.stopRecording();
		driver.quit();



	}
}