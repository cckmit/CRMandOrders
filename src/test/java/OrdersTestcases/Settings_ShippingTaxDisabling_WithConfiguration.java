package OrdersTestcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class Settings_ShippingTaxDisabling_WithConfiguration extends OrdersExecution1 {

	public static void AutomaticShippingTax_Uncheck() throws IOException, InterruptedException{
	       try{
	// This is to Instantiate Services  class  
	 OrdersLocators Settings_ShippingTax = PageFactory.initElements(driver, OrdersLocators.class);	

	 //Now Applying Manual Tax Rate Scenario
	 Settings_ShippingTax.CloseOrder_Icon.click();
		   
	 
	Thread.sleep(10000);
	 
	 
	 //Click the userInfoIcon on My Order screen	 
	 Settings_ShippingTax.OrderListing_UserInfoIcon.click();
	 
	 
//Click the settings option
	 Settings_ShippingTax.UserInfoIcon_Settings.click();
	 
	 
//Now Select the sales tax option in settings
	 Settings_ShippingTax.Settings_SalesTax.click();
	 
	 //waitForPageLoading();
	 
	 Thread.sleep(5000);
	 if(Settings_ShippingTax.Settings_SalesTax_AutoCalculateTaxes_Checkbox.isSelected())
   	 {
   		Settings_ShippingTax.Settings_SalesTax_AutoCalculateTaxes_Checkbox.click();
   			if(Settings_ShippingTax.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
   				{
   					System.out.println("Automatic Shipping Tax Calculated Checkbox and New Manual Rate entered unchecked Successfully");
   					resultPass("Disabling Automatic Shipping Tax(Settings)", "Automatic Shipping Tax Calculated Checkbox unchecked Successfully");
   				}
   			else{
   					System.out.println("Automatic Shipping Tax Calculated Checkbox and New Manual Rate entered unchecked UnSuccessfully");
   					resultFail("Disabling Automatic Shipping Tax(Settings)", "Automatic Shipping Tax Calculated Checkbox  unchecked UnSuccessfully");
   				}

   	   
   	 }
 	  

	       } 
	       catch (NoSuchElementException e) {
	    	   
			// TODO: handle exception
	              e.getStackTrace();	
	       }
	
	    }   

}
	
