package OrdersTestcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;


public class BlindShip_WithConfirmations extends OrdersExecution1{

	public static JavascriptExecutor jse;
	public static JavascriptExecutor jse1;
	public static void BlindShipWithConfirmation() throws IOException, InterruptedException{
        try{
		// This is to Instantiate CreateOrders  class  
	 OrdersLocators BlindShip = PageFactory.initElements(driver, OrdersLocators.class);	
	//Scroll Up
     Thread.sleep(1000);

	 BlindShip.Orderdetails_ShippingTab.click();
     
     Thread.sleep(1000);
     
     //Check Blind Ship Checkbox
     BlindShip.Orderdetail_BlindShipCheckbox.click();
  
     Thread.sleep(4000);
     
     //Press the Yes button to confirm blind ship
     BlindShip.Order_BlindShipConfirm.click();
     waitForPageLoading();
     Thread.sleep(10000);
     Click("click save button", BlindShip.SampleRequestSaveButton);
     Thread.sleep(10000);
     //Now validating blind ship displayed on shipping details or not
     //if(BlindShip.ShippingDestination_WithNewDecoratorCompany_ShippingAddress_Verification.getText().contains("Blind Ship") & BlindShip.Orderdetails_shippingTab_SplitshipmentExistence_Verification.getText().contains("Blind Ship"))
     if(BlindShip.ShippingDestination_WithNewDecoratorCompany_ShippingAddress_Verification.getText().contains("Blind Ship"))

     {
	    	System.out.println("Blind Ship Successfully Displayed");
	    	resultPass("BlindShip_UnderShippingTab_Verification", "Blind Ship Successfully Displayed");
	    }
	    else{
	    	
	    	System.out.println("Blind Ship UnSuccessfully Displayed");
	    	resultFail("BlindShip_UnderShippingTab_Verification", "Blind Ship UnSuccessfully Displayed");
	 
	  
        }
            
        }
	   catch(NoSuchElementException e){
	    	 System.err.println("NoSuchElementException: " + e.getMessage());
	   }
	}  
	


}
