package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class SplitShipment extends OrdersExecution1 {

	static OrdersLocators EditOrderSplitShipment = PageFactory.initElements(driver, OrdersLocators.class);
	public static void Zero_Quantity_Validation_Message_Verification() throws IOException, InterruptedException, ParseException{
        try{
        	
	 Click("a", EditOrderSplitShipment.OrdersDetails_EditButton);

	   wait = new WebDriverWait(driver, 180);
	   wait.until(ExpectedConditions.elementToBeClickable(EditOrderSplitShipment.EditOrder_ShippingTab));
	   
	   Thread.sleep(2000);
	    
	  //Goto Shipping Tab
	    EditOrderSplitShipment.EditOrder_ShippingTab.click();
	    waitForPageLoading();
	    Thread.sleep(2000);
	 
	 //Press the Split shipment button
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton.click();
	    waitForPageLoading();
	    Thread.sleep(1000);
	    
	//Press the Ok button to proceed to split shipment popup screen
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton.click();
	    waitForPageLoading();
	    Thread.sleep(3000);
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_RemoveCrossIcon_CustomerAddressField1.click();
	    Thread.sleep(3000); 
	 //Select the first Company Address
	//    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField1.click();
	    
	    Thread.sleep(5000);
	    
	//Select the address
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField_AddressSelection.click();
	    
	    Thread.sleep(3000);
/*	    
   //Select the 2nd Company Address
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField2.click();
	    
	    Thread.sleep(2000);
	    
  //Now Select the Address for 2nd Address
	    EditOrderSplitShipment.EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField_AddressSelection.click();
	    
	    Thread.sleep(3000);*/
	    Thread.sleep(1000);
	 //Press the Next-Enter Quantity button
	    EditOrderSplitShipment.EditOrder_Splitshipment_EnterQuantityNextButton.click();
	    
	    Thread.sleep(3000);
	    
	    EditOrderSplitShipment.EditOrder_Splitshipment_SaveButton.click();
	    //waitForPageLoading();
	    Thread.sleep(2000);
	    
	    if(EditOrderSplitShipment.ErrorMessage_Verification_QuantityCheck.isDisplayed()){
	    
	    	System.out.println("Zero Quantity Validation Message Displayed Successfully");
	    	resultPass("Zero_Quantity_Validation_Message_Verification", "No Quantity Validation Message Displayed Successfully");
	    }
	    else{
	    	System.out.println("Zero Quantity Validation Message Displayed UnSuccessfully");
	    	resultFail("Zero_Quantity_Validation_Message_Verification", "No Quantity Validation Message Displayed UnSuccessfully");
	    
	    }
        }catch(NoSuchElementException e){
           e.getMessage();
        }
	}
	
	public static void SplitShipment_not_showing_in_shippingtab() throws InterruptedException, IOException{
		try{
	    EditOrderSplitShipment.EditOrder_Splitshipment_Shipment2_QTY.click();
	    EditOrderSplitShipment.EditOrder_Splitshipment_Shipment2_QTY.sendKeys("2");
	    
	    Thread.sleep(2000);
	    
	   //Press the save button to complete split shipment process
	    EditOrderSplitShipment.EditOrder_Splitshipment_SaveButton.click();
	    waitForPageLoading();
	    Thread.sleep(1000);
	    
	  //Now Validate if the split shipment process successfully done
	    if(EditOrderSplitShipment.Orderdetails_shippingTab_SplitshipmentExistence_Verification.isDisplayed())
	    {
	    	System.out.println("Split Shipment Showing in Shipping  tab");
	    	resultPass("Split Shipment Showing in Shipping tab", "Split Shipment done Successfully");
	    }
	    else{
	    	System.out.println("Split Shipment not Showing in Shipping tab");
	    	resultFail("Split Shipment not showing in shipping tab", "Split Shipment done UnSuccessfully");
	    }
	    
        }catch(NoSuchElementException e){
           e.getMessage();
        }
	} 
        public static void SplitShipment_Showing_in_Pricing_tab() throws IOException, InterruptedException{
        	try{
        
        	    Thread.sleep(3000);

	 //   EditOrderSplitShipment.Orderdetails_PricingTab.click();
	//    WebDriverWait wait = new WebDriverWait(driver, 100);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", EditOrderSplitShipment.Orderdetails_PricingTab);
	    
	    Thread.sleep(2000);

	    if(EditOrderSplitShipment.Orderdetails_shippingTab_SplitshipmentExistence_Verification.isDisplayed())
	    {
	    	System.out.println("Split Shipment Showing in Pricing  tab");
	    	resultPass("Split Shipment Showing in Pricing tab", "Split Shipment done Successfully");
	    }
	    else{
	    	System.out.println("Split Shipment not Showing in Pricing  tab");
	    	resultFail("Split Shipment not showing in Pricing tab", "Split Shipment done UnSuccessfully");
	    }
	    
        	}catch(NoSuchElementException e){
        		e.getMessage();
        	}
        }	
        	
        public static void SplitShipment_Showing_in_Decoration_tab() throws IOException, InterruptedException{
        	
             try{
           Thread.sleep(3000);

	    EditOrderSplitShipment.Orderdetails_DecorationTab.click();
	    Thread.sleep(3000);
	    
	    if(EditOrderSplitShipment.Orderdetails_shippingTab_SplitshipmentExistence_Verification.isDisplayed())
	    {
	    	System.out.println("Split Shipment Showing in Decoration  tab");
	    	resultPass("Split Shipment Showing in Decoration tab", "Split Shipment done Successfully");
	    }
	    else{
	    	System.out.println("Split Shipment not Showing in Purchase  tab");
	    	resultFail("Split Shipment not showing in Decoration tab", "Split Shipment done UnSuccessfully");
	    }
	   
             }catch(NoSuchElementException e){
            	 e.getMessage();
             }
             
        }
        
        public static void SplitShipment_Showing_in_PurchaseOrder_tab() throws IOException, InterruptedException{
        	try{
                Thread.sleep(3000);

	    EditOrderSplitShipment.Orderdetails_PurchaseOrderTab.click();
        Thread.sleep(3000);

	    if(EditOrderSplitShipment.Orderdetails_shippingTab_SplitshipmentExistence_Verification.isDisplayed())
	    {
	    	System.out.println("Split Shipment Showing in Purchase Order tab");
	    	resultPass("Split Shipment Showing in Purchase Order tab", "Split Shipment done Successfully");
	    }
	    else{
	    	System.out.println("Split Shipment not Showing in Purchase Order tab");
	    	resultFail("Split Shipment not showing in Purchase Order tab", "Split Shipment done UnSuccessfully");
	    }
        	 
	    
	    
      }
     catch (NoSuchElementException e) {
		// TODO: handle exception
    	 System.err.println("NoSuchElementException: " + e.getMessage());
     }


	}



}
