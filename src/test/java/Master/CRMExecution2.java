package Master;

import static CrmTestCases.StartBrowser.StartupBrowser;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import CrmTestCases.CompanyScenarios;
import CrmTestCases.ContactScenarios;
import CrmTestCases.Email;
import CrmTestCases.ExportScenarios;
import CrmTestCases.Filters;
import CrmTestCases.Login;
import CrmTestCases.Notes;
import CrmTestCases.RecordOwnerAndVisi;
import CrmTestCases.SettingsScenarios;
import CrmTestCases.Systemroperties;
import CrmTestCases.Tasks;
import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class CRMExecution2 extends HelpingFunction{

	static String Suite="CRMReport.html";

	
	
	
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{

		Systemroperties.Property(Suite);
		//Iftikhar
		}

	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 
	

	@Test(priority=0)
	 		public   void LoginIdaho() throws InterruptedException, AWTException, IOException{
				 	Login.login();
				 	
			 	}

		 @AfterMethod

			public void getResult(ITestResult result ) throws IOException, InterruptedException{
			/*
				 System.out.println("Get Status "+ result.getStatus());
				 System.out.println("Get Method with className "+ result.getMethod());
				 System.out.println("Get TC Name "+ result.getName());
				 System.out.println("Get test calsss Name "+ result.getTestClass());
				 System.out.println("Get Test Name"+ result.getTestName());
				 System.out.println("Get Method Name"+ result.isSuccess());
			*/
		//		 test = extent.createTest(result.getName());
			
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, result.getMethod().getDescription());
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
	 				test.log(Status.PASS, " Please see attached screenshot");
	 				String screenshotPath = HelpingFunction.capture(result.getName());
	 				test.addScreenCaptureFromPath(screenshotPath);
			 
		 			extent.flush();
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){

				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
			/*
			 * String screenshotPath = HelpingFunction.capture(result.getName());
			 * test.addScreenCaptureFromPath(screenshotPath);
			 */
			 		test.fail(result.getThrowable());
			 		extent.flush();
			 		}
					 			
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print("Test cases is skipped");
					 test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					 test.skip(result.getThrowable());
				    }				 		
	 			
			 }
			 
			@AfterTest
			public void endReport(){
		 		extent.flush();

			//driver.get(System.getProperty("user.dir")+"/Reports/"+Suite);
			}
			
		
		

}

