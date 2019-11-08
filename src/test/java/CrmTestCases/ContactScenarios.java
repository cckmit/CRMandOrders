
package CrmTestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.CrmTestData;
import PageFactoryandTestdata.HelpingFunction;


public class ContactScenarios extends HelpingFunction {
	static String SelectedConROwn;
// static WebElement DefaultVisi1;
	 static boolean bol;
	// static WebElement DefaultVisi2;

	public static CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
			
			
			    public static void CreateContact(boolean b) throws InterruptedException, AWTException, IOException{
			    	  	 
					  	 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					 if(b) {
						 Click("Please click at Actionbutton",GetData.ClickAtAction);
						 Thread.sleep(2000);
						 Click("Please click at Create Contact Link",GetData.CreateContactLink);
						 
						 driver.findElement(By.xpath("//span[contains(text(), 'Billing')]/preceding-sibling::input")).click();
						 driver.findElement(By.xpath("//span[contains(text(), 'Shipping')]/preceding-sibling::input")).click();
						 driver.findElement(By.xpath("//span[contains(text(), 'Acknowledgement')]/preceding-sibling::input")).click();

					 }
					 else {
						 Thread.sleep(3000);
						 System.out.println("Else Past is executed");
						 Click("Please click at  Contact Link",GetData.NavigatetoContacts);
						 Click("Please click at add Contact button",GetData.AddContact);
						
				 	}
					 
						 Input("Please Enter First Name", GetData.ContactFName, CrmTestData.ContactFName);
						 Input("Please Enter Last Name", GetData.ContactLName, CrmTestData.ContactLName);
						 Select phone = new Select(driver.findElement(By.xpath("//select[contains(@ng-model, 'phone.Type')]")));
						 Thread.sleep(2000);					
					//	 driver.findElement(By.xpath("//select[contains(@ng-model, 'phone.Type')]")).click();
						 List<WebElement> list =driver.findElements(By.xpath("//select[contains(@ng-model, 'phone.Type')]/option"));	  
						 int size=list.size();
						 Random rand = new Random();
					    // Obtain a number between [0 - size].
					    int n = rand.nextInt(size);
					    phone.selectByIndex(n);
						 Input("Please Enter  Phone", GetData.ContactPhone, CrmTestData.CompPhone);
						 Select email = new Select(driver.findElement(By.xpath("//select[contains(@ng-model, 'email.Type')]")));
						 Thread.sleep(2000);					
					//	 driver.findElement(By.xpath("//select[contains(@ng-model, 'phone.Type')]")).click();
						 List<WebElement> list1 =driver.findElements(By.xpath("//select[contains(@ng-model, 'email.Type')]/option"));	  
						 int emailsize=list1.size();
						 Random rand1 = new Random();
					    // Obtain a number between [0 - size].
					    int n1 = rand1.nextInt(emailsize);
					    email.selectByIndex(n1);
						 Input("Please Enter Email", GetData.ContactEMail, CrmTestData.CompEmail);
						 Select website = new Select(driver.findElement(By.xpath("//select[contains(@ng-model, 'website.Type')]")));
						 Thread.sleep(2000);					
					//	 driver.findElement(By.xpath("//select[contains(@ng-model, 'phone.Type')]")).click();
						 List<WebElement> list2 =driver.findElements(By.xpath("//select[contains(@ng-model, 'website.Type')]/option"));	  
						 int websize=list2.size();
						 Random rand2 = new Random();
					    // Obtain a number between [0 - size].
					    int n2 = rand2.nextInt(websize);
					    website.selectByIndex(n2);
						 Input("Please Enter Website", GetData.ContactWebsite, CrmTestData.CompWebsite);
						
						 Thread.sleep(2000);
						 RecordOwnerAndVisi.SelectUser();
						 RecordOwnerAndVisi.RecordOwn();

				
						 
						 ClickAt("Please click at Save Contact Save button ",GetData.SaveButton);
						 Thread.sleep(6000);
						 Verify(CrmTestData.CompPhone, GetData.PhnVerify.getText(), "Phone content is not matching");
					/*	 Verify(CrmTestData.CompEmail, GetData.EmailVerify.getText(), "Email content is not matching");
						 Verify(CrmTestData.CompWebsite, GetData.WebVerify.getText(), "Web content is not matching");*/
						 		
			    		} 

				
			  		
}
