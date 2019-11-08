package OrdersTestcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;



public class CreateOrderwhenAddressnotmatching extends OrdersExecution1 {

	static OrdersLocators CreateOrder = PageFactory.initElements(driver, OrdersLocators.class);
	
	public static void Tax_not_calculating_if_Canadian_address_is_not_matching() throws IOException, InterruptedException, AWTException{
           try{
		// This is to Instantiate CreateOrders  class  
   	 	
	
   	 Thread.sleep(15000);

	//Press the Edit Button
	 CreateOrder.EditShippingAddressButton.click();
	 Click("Edit shipping Address button",  CreateOrder.EditShippingAddressButton);
	 Thread.sleep(5000);
	 

	 
	 //Update the shipping contact name
		Input("Please Enter Contact name no",  CreateOrder.ContactName, "Shipping Updated Name");

	 
	 
	
	 Thread.sleep(1000);
	 
//Enter New Address
	 
		Input("Please Enter new address",  CreateOrder.EditShippingAddressField, "AZ, USA");
		 Thread.sleep(4000);
		 CreateOrder.EditShippingAddressField.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(4000);
	 
	 CreateOrder.EditShippingAddressField.sendKeys(Keys.ENTER);
	 
	 Thread.sleep(5000);
	 
	
	
	 //Press the save Button
	 CreateOrder.EditShippingSaveButton.click();
	 
	 Thread.sleep(3000);
	 
	 CreateOrder.EditingConfirm.click();
	 waitForPageLoading();
	 Thread.sleep(10000);
	Click("Please click at use current rates", CreateOrder.Orderdetails_UseCurrentRates_Button);
	waitForPageLoading();
	 Thread.sleep(30000);

	 String SalesTax=CreateOrder.Orderdetails_SalesTax.getText();
	 System.out.println(SalesTax);
	 if(SalesTax.equals("$0.00")) {
		 resultPass("Tax is not calculating if Canadian address is not matching", "Tax is not calculating if Canadian address is not matching");
}
	 else {
		 

		 resultFail("Tax is  calculating if address is not matching", "Tax is  calculating if address is not matching");

	 }
	 
           }catch(NoSuchElementException e){
        	   e.getMessage();
           }
           
	} 
           
	 	
	////////////////////////// For Canadian Address //////////////////////////////////////////
	public static void  Tax_is_not_calculating_if_Canadian_addressis_notmatching() throws IOException, InterruptedException{
		try{
			
	 Click("Click at edit button", CreateOrder.EditShippingAddressButton);
	 
	 Thread.sleep(5000);
	 

	 
	 //Update the shipping contact name
		Input("Please Enter Contact name no",  CreateOrder.ContactName, "Shipping Updated Name");
	 
	 
	
	 Thread.sleep(1000);
	 
//Enter New Address
	 
		Input("Please Enter new address",  CreateOrder.EditShippingAddressField, "Address Signage Co ");
		 Thread.sleep(6000);
	 CreateOrder.EditShippingAddressField.sendKeys(Keys.ARROW_DOWN);
			 Thread.sleep(2000);

	 CreateOrder.EditShippingAddressField.sendKeys(Keys.ENTER);
	 
	 Thread.sleep(5000);
	 
	
	
	 //Press the save Button
	 CreateOrder.EditShippingSaveButton.click();
	// waitForPageLoading();
	 Thread.sleep(4000);
	 
	 CreateOrder.EditingConfirm.click();
	// waitForPageLoading();
	 Thread.sleep(5000);
	Click("Please click at use current rates", CreateOrder.Orderdetails_UseCurrentRates_Button);
	 waitForPageLoading(); 
Thread.sleep(20000);

	 String SalesTax1=CreateOrder.Orderdetails_SalesTax.getText();
	 if(SalesTax1.equals("$0.00")) {
		 resultPass("Tax is not calculating if Canadian address is not matching", "Tax is not calculating if Canadian address is not matching");
		 System.out.println("Tax is not calculating if Canadian address is not matching");
	 }
	 else {
		 resultFail("Tax is  calculating if Canadian address is not matching", "Tax is  calculating if Canadian address is not matching");
		 System.out.println("Tax is  calculating if Canadian address is not matching");
	 }
	 Thread.sleep(5000);

	
           }
	
	   catch(NoSuchElementException e){
	    	 System.err.println("NoSuchElementException: " + e.getMessage());
	   }
	}  
	



}