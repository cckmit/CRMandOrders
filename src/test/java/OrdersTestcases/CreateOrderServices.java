package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Functions.Conversions;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class CreateOrderServices extends OrdersExecution1 {
	static OrdersLocators Services = PageFactory.initElements(driver, OrdersLocators.class);
	//Developing new function for Services Functionality
	public static void Freight_Service_Popup_Display() throws IOException, InterruptedException, ParseException{
				try{
					// This is to Instantiate Services  class  
					//Services.CloseOrder_Icon.click();
				    
				    Thread.sleep(2000);	
				
				   	//Now click Services toggle
				   	 Click("Click at toggle button", Services.OrderDetails_Service_ToggleClick);
				   	 Thread.sleep(1000);
				   	 
				   //Click the Freight Option
				   	 Click("Click at OrderDetails_Service_Freight", Services.OrderDetails_Service_Freight);

				   	 
				   	 Thread.sleep(8000);
				   
				   	 
				   	 
				   //Now first validate that popup for add service is occur
				   	 if(Services.OrderDetails_Service_Freight_Popup_Heading.getText().equals("Add Service"))
				   	 {
				   		System.out.println("Add Freight Service Popup Successfully Open");
				   		resultPass("Freight Service Popup Display","Add Freight Service Popup Successfully Open");
				   	 }
				   	 else{
				   		System.out.println("Add Freight Service Popup UnSuccessfully Open");
				   		resultFail("Freight Service Popup Display","Add Freight Service Popup UnSuccessfully Open"); 
				   	 }
				
				}catch(NoSuchElementException e){
				   e.getMessage();
				}
	}		
		public static void Freight_Title_Field_Text_Validation() throws IOException, InterruptedException{
			try{
				WebElement FreightTitle=Services.OrderDetails_Service_Freight_Popup_TitleField;
				String value=FreightTitle.getAttribute("value");
				 
				System.out.println(value);
				   	 //Now validate as if there is 'freight'text display in title field
				   	 if(value.contains("Freight"))
				   	 {
				   		 System.out.println("Freight Text Successfully display in Title field");
				   		 resultPass("Freight Title Field Text Validation ", "Freight Text Successfully display in Title field");
				   		  
				   	 }
				   	 else
				   	 {	 
				   		System.out.println("Freight Text UnSuccessfully display in Title field");
				   		 resultFail("Freight Title Field Text Validation ", "Freight Text UnSuccessfully display in Title field"); 
				   	 }	 
			}catch(NoSuchElementException e){
				e.getMessage();
			}
			
		}	
			public static void Freight_Title_Update() throws IOException, InterruptedException{
				    try{ 
				
				    Input("Please enter freight name", Services.OrderDetails_Service_Freight_Popup_TitleField, "Freight1");
				
				    //Enter Description
				     Services.OrderDetails_Service_Freight_Popup_DescriptionField.sendKeys("Updated Freight Name");
				     
				    //Select the Vendor Company
				     Services.Vendor_CompanySelection_Field_Services.click();
				     
				     Thread.sleep(1000);
				     
				     Services.VendorCompany_Services.click();
				     
				     Thread.sleep(1000);
				     
				     
				     //Enter charges cost for freight
				     Services.OrderDetails_Service_Freight_Popup_Netcost.sendKeys("50");
				     
				//Press the save Button
				     Services.OrderDetails_Service_Freight_Popup_SaveButton.click();
				     waitForElementNotVisible(120, driver,Services.SpinnerLoader);
				     Thread.sleep(60000);
				     
			 //Validate as if the updated name display on div
				String UpdatedFreightName =Services.Orderdetails_FreightDivDisplay_validation.getText();
		         
				System.out.println(UpdatedFreightName);
			     if(UpdatedFreightName.contains("Freight1"))
			     {
			    	 System.out.println("Freight1 Updated name display");
			         resultPass("Freight Title Update","Freight Service Title Updated Successfully");
			     }
			     else{
			    	 System.out.println("Freight1 Updated name doesn't display");
			    	 resultFail("Freight Title Update", "Freight Service Title Updated Unsuccessfully");
			     }
				
			} catch(NoSuchElementException e){
				e.getMessage();
			}
	}	
		
		public static void Services_VendorCompany_Verification() throws InterruptedException, IOException{
			try{
				
			
			//GetText of services vendor added and compare with crm supplier vendor added
			String VendorcompanyText=Services.VendorCompany_FreightServices_OrdersDetails.getText();
			System.out.println(VendorcompanyText);
			
			Services.VendorCompany_FreightServices_OrdersDetails.click();
			
			AcknowlodgementPreview.parentWindow = driver.getWindowHandle();
			 Thread.sleep(60000);
			 //Press the Preview Button
			//AcknowlodgementPreview.AckowledgementPreview.PreviewPopUp_PreviewButton.click();
			 
			//Switch to new window opened
			  	for(String winHandle : driver.getWindowHandles()){
			  	    if(!winHandle.equals(AcknowlodgementPreview.parentWindow)) {
			  	        driver.switchTo().window(winHandle);
			  	    }
			  	}
			
			
			String VendorcompanyText_CRM=Services.ServicesCompany_Verification_AtCrmLevel.getText();
			System.out.println(VendorcompanyText_CRM);
			
			if(VendorcompanyText_CRM.equals(VendorcompanyText)){
				System.out.println("Services Vendor Company Added and Verified Successfully");
				resultPass("Services_VendorCompany_Verification", "Services Vendor Company Added and Verified Successfully");
			}
			else{
				System.out.println("Services Vendor Company Added and Verified UnSuccessfully");
				resultFail("Services_VendorCompany_Verification", "Services Vendor Company Added and Verified UnSuccessfully");
			}
			
			}catch(NoSuchElementException e){
				e.getMessage();
			}
		
		finally {
			Thread.sleep(5000);
			
   		 
  		    driver.close();
  	        
  	        Thread.sleep(2000);
  	        
  	      //Switch back to parent window 
  	        driver.switchTo().window(AcknowlodgementPreview.parentWindow);
  	        
  	        Thread.sleep(1000);
		}
		
		}
			
		public static void Freight_Service_Add_Tax_Calculation_Verification() throws InterruptedException, ParseException, IOException{
		      try{	
		
			     //Converting subtotal from string to int
			   	 Conversions.Subtotal_String_To_Int_Conversion();
			   	 
			   //Calculating Tax	
			   	 
			     Conversions.Tax_Calculation_Manual();
			   	 
			  //Sales Tax Conversion from String to integer with $ removing done 
			   	 
			     Conversions.SalesTax_String_To_Int_Conversion();
			   	
			   //Calculating the SubTotal
			   	 
			   	 Conversions.SubTotal_Calculation();
			   	 
			   //Rounding off the value SubTotal and Sum tax
			   	 Conversions.RoundingOffTotalAmount();
			   	
			   //Now Converting the Amountdue from string to Int
			   	Conversions.AmountDue_String_To_Int_Conversion();
			   	
			   	
			   	
			   //Now Validating the Total Amount due 
			   if(Conversions.bd.doubleValue()==Conversions.AmountDue)
			 {  
			    
				System.out.println("Freight Service Calculation Along with Tax Calculated Successfully");
				resultPass("Freight Service Add Tax Calculation Verification", "Freight Service Calculation Along with Tax Calculated Successfully");
			 }   
			   else{
				   
				   System.out.println("Freight Service Calculation Along with Tax Calculated UnSuccessfully");
				   resultFail("Freight Service Add Tax Calculation Verification", "Freight Service Calculation Along with Tax Calculated UnSuccessfully");
			   }
			     
			   //Now Applying Manual Tax Rate Scenario
				  
				
				
				}
			
				catch (NoSuchElementException e) {
					// TODO: handle exception
			    	 System.err.println("NoSuchElementException: " + e.getMessage());
				}
				
				
				}
		
	
		

}

