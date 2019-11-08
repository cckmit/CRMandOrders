
package CrmTestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class Email extends HelpingFunction {
	public static CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
							

				public static void MoveEmailToSpam() throws InterruptedException, AWTException, IOException{
					
						 
						 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
						 Click("Please click at Email button",GetData.NavigateToEmails);
						 Thread.sleep(2000);
						 Click("Please click at All Email button",GetData.MoveToAllEmails);
						 Thread.sleep(2000);
						 Click("Please click at checkbox button",GetData.SelectEmailCheckbox);
					//	 List<WebElement> email=GetData.GetEmailCount;
					//	 email.get(1).click();
						 Click("Please click at checkbox button",GetData.EmailSpamButton);
						 Thread.sleep(2000);
						 Click("Please click at checkbox button",GetData.EmailConfirmButton);
						 Thread.sleep(2000);
						 Assert.assertTrue(GetData.Success.getText().contains("Success"));

					} 
							
				public static void DeleteEmailFromAllEmail() throws InterruptedException, AWTException, IOException{
					
					 Thread.sleep(15000);
					 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					 Click("Please click at checkbox button",GetData.SelectEmailCheckbox);
					 Click("Please click at checkbox button",GetData.EmailDeleteButton);
					 Click("Please click at checkbox button",GetData.EmailConfirmButton);
					 Assert.assertTrue(GetData.Success.getText().contains("Success"));

				}
				
				public static void MoveEmailToSpamFromDetailPage() throws InterruptedException, AWTException, IOException{
					
					 
					 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					 Thread.sleep(2000);
					 Click("Please click at Email button",GetData.EmailDetail);
					 Thread.sleep(2000);
					 Click("Please click at checkbox button",GetData.EmailSpamButton1);
					 Assert.assertTrue(GetData.Success.getText().contains("Success"));

				} 
				
				public static void DeleteEmailFromEmailDetailPage() throws InterruptedException, AWTException, IOException{
					
					 Thread.sleep(10000);
					 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					 Thread.sleep(2000);
					 Click("Please click at Email button",GetData.EmailDetail);
					 Thread.sleep(2000);
					 Click("Please click at checkbox button",GetData.EmailDeleteButton);
					 Assert.assertTrue(GetData.Success.getText().contains("Success"));

					
					

				}

				public static void MoveEmailToNotSpam() throws InterruptedException, AWTException, IOException{
					
						 
						 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
						
						 Thread.sleep(5000);
						 Click("Please click at All Email button",GetData.MoveToSpamEmails);
						 Thread.sleep(2000);
						 Click("Please click at checkbox button",GetData.SelectEmailCheckbox);
						 Click("Please click at checkbox button",GetData.EmailNotSpamButton);
						 Click("Please click at checkbox button",GetData.EmailConfirmButton);
						 Assert.assertTrue(GetData.Success.getText().contains("Success"));



					} 
							
				public static void DeleteEmailFromSpam() throws InterruptedException, AWTException, IOException{
					
					 Thread.sleep(5000);
					 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					 Click("Please click at checkbox button",GetData.SelectEmailCheckbox);
					 Click("Please click at checkbox button",GetData.EmailDeleteButton);
					 Click("Please click at checkbox button",GetData.EmailConfirmButton);
					 Assert.assertTrue(GetData.Success.getText().contains("Success"));

					

				}
					  		
}
