package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Functions.Conversions;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class EditOrderProduct_Instructions extends OrdersExecution1{

	static OrdersLocators EditOrderInstructions = PageFactory.initElements(driver, OrdersLocators.class);
	
	public static void Adding_Instructions() throws IOException, InterruptedException, ParseException{
              try{
		 
		 //Go To Pricing Tab in Product div
		 	Click("a",  EditOrderInstructions.Orderdetails_PricingTab);

		
		 	Click("a",  EditOrderInstructions.OrdersDetails_EditButton);
		 	waitForElementNotVisible(120, driver,EditOrderInstructions.SpinnerLoader);
		    Thread.sleep(1000);
		    
		   //Press the Instructions Tab Edit Product
		  
		    Click("Click the Instruction Tab", EditOrderInstructions.EditOrder_InstructionTab);
		    
		    Thread.sleep(1000);
		    
		    //Enter the Instruction in Text Area
		    EditOrderInstructions.EditOrder_InstructionTextArea.sendKeys("Test Automation Instructions");
		    
		    Thread.sleep(2000);
		    
		    //Press the save button
		 
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",  EditOrderInstructions.ProductConfiguration_AddCharge_SaveButton);
		    
		    if(EditOrderInstructions.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
		    {
		    System.out.println("Edit Product Instructions Added Successfully");
		    resultPass("Adding Instructions", "Edit Product Instructions Added Successfully");
		    
		    }
		    else{
		    	 System.out.println("Edit Product Instructions Added UnSuccessfully");
				 resultFail("Adding Instructions", "Edit Product Instructions Added UnSuccessfully");
		    }
		   
          }catch(NoSuchElementException e){
             e.getMessage();
          }
	}       
		   public static void Instructions_Viewing() throws IOException, InterruptedException{
			   try{
			waitForElementNotVisible(120, driver,EditOrderInstructions.SpinnerLoader);
		    
		    //Now Validating By viewing the instructions
		    Thread.sleep(2000);
		   //Now Select the view instructions
		    WebDriverWait wait = new WebDriverWait(driver,60);
		    		wait.until(ExpectedConditions.visibilityOf(EditOrderInstructions.ViewInstructions));
		  
		   Click("a", EditOrderInstructions.ViewInstructions);
		   Thread.sleep(10000);
		   
		   WebElement InstructionTextVerification=EditOrderInstructions.EditOrder_InstructionTextArea;
		   String value=InstructionTextVerification.getAttribute("value");
		  
		   System.out.println(value);
		   
		   if(value.contains("Test Automation Instructions"))
		   {
			   System.out.println("Instructions Displayed Successfully");
			   resultPass("Instructions Viewing","Instructions Viewed and Displayed Successfully" );
		   }
		   else{
			   System.out.println("Instructions Displayed UnSuccessfully");
			   resultFail("Instructions Viewing","Instructions Viewed and Displayed UnSuccessfully" ); 
		   }
		     //Press the save button
		   EditOrderInstructions.ProductConfiguration_AddCharge_SaveButton.click();
			    
		    
			    
		   	Thread.sleep(60000);
		
		       
		 Conversions.OrdernumberRegularExpressionStringConversion();
			   
		

	    //Now Applying Manual Tax Rate Scenario
		 EditOrderInstructions.CloseOrder_Icon.click();
			   
		 
		Thread.sleep(10000);
		 
			 }catch(NoSuchElementException e){
				 e.getMessage();
			 }
		   
	
	}
	
	

	
	}
