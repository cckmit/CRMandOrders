package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Functions.Conversions;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class EditOrderProduct_Configuration extends OrdersExecution1 {
    
	static List<WebElement> rows;
	static int count;
	static OrdersLocators EditOrderConfiguration = PageFactory.initElements(driver, OrdersLocators.class);
	public static void OrderProductConfig_NewAddCharge_in_Configuration_With_Amount_Verification() throws IOException, InterruptedException, ParseException{
               try{
		  
	    Click("Press the Back Button",EditOrderConfiguration.Backbutton1);
            	   
        Thread.sleep(3000);
		
	    EditOrderConfiguration.ClosePreviewPopup.click();
	   	 
	   	Thread.sleep(2000);
	   //Converting subtotal from string to int
	   	 Conversions.Subtotal_String_To_Int_Conversion();
	   	 
	   //Calculating Tax	
	   	 
	     Conversions.Tax_Calculation_Automatic();
	   	 
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
	   		 System.out.println("Total Amount Due:"+""+Conversions.TotalAmountDueWithTaxInclude+""+"is correct");
	   	 }
	   	 else{
	   		System.out.println("Total Amount Due:"+""+Conversions.TotalAmountDueWithTaxInclude+""+"is not correct");
	   	 }
      
	    //Go to Edit Product 
	  //Hover the Edit button
	  /*  WebElement HoverEdit=EditOrderConfiguration.OrdersDetails_EditButton;
	 	Hover(HoverEdit);
	 	
	 	Thread.sleep(5000);
	 	
	 //Click the Edit button
	 	EditOrderConfiguration.OrdersDetails_EditButton.click();*/
	   Click("a", EditOrderConfiguration.OrdersDetails_EditButton);
	 	
	   waitForElementNotVisible(120, driver,EditOrderConfiguration.SpinnerLoader);
	 	 Thread.sleep(1000);
	 	
	//Press the Add Charge Button
	 	EditOrderConfiguration.ProductConfiguration_AddChargeLinkText.click();
	 	
	 	Thread.sleep(2000);
	 	
	 		 	
	//Add the Quantity
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_QTY.click();
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_QTY.sendKeys("1");
	 	
	//Add the Netcost
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_NetCost.click();
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_NetCost.sendKeys("50");
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_NetCost.click();
	 //Press the save button
	 	Click("Click Save button", EditOrderConfiguration.ProductConfiguration_AddCharge_SaveButton);
	 	
	 	 waitForElementNotVisible(120, driver,EditOrderConfiguration.SpinnerLoader);
	 	Thread.sleep(2000);
	 	//Converting subtotal from string to int
	   	 Conversions.Subtotal_String_To_Int_Conversion();
	   	 
	   //Calculating Tax	
	   	 
	     Conversions.Tax_Calculation_Automatic();
	   	 
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
		   System.out.println("New Add Charge With Amount Verification Successfull");
		   resultPass("New Add Charge in Configuration With Amount Verification", "New Add Charge With Amount Verification Successfull");
		   
	   }
	   else{
		   System.out.println("New Add Charge With Amount Verification UnSuccessfull");
		   resultFail("New Add Charge in Configuration With Amount Verification", "New Add Charge With Amount Verification UnSuccessfull");
	   }
           }catch(NoSuchElementException e){
           
             e.getMessage();
           }
	}       
	 
	public static void AddVendor_Charge_With_Amount_calculation() throws InterruptedException, IOException, ParseException{
		try{
	 	
	 //Click the Edit button
	 	//EditOrderConfiguration.OrdersDetails_EditButton.click();
	   Click("a", EditOrderConfiguration.OrdersDetails_EditButton);
	 	
	   waitForElementNotVisible(120, driver,EditOrderConfiguration.SpinnerLoader);
	 		
		 	Thread.sleep(2000);

         EditOrderConfiguration.EditProduct_ShowAllVendorChargesButton.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	
	 	EditOrderConfiguration.VendorCharges_LessThanMinimumAddButton.click();
	 	
	 	Thread.sleep(2000);
	 	
	//Add the Net Cost 50
	 	EditOrderConfiguration.ProductConfiguration_VendorChargeNetCost.click();
	 	EditOrderConfiguration.ProductConfiguration_VendorChargeNetCost.sendKeys("50");
	 	
	//Press the save Button
	 	EditOrderConfiguration.ProductConfiguration_AddCharge_SaveButton.click();
	 	
	 	 waitForElementNotVisible(120, driver,EditOrderConfiguration.SpinnerLoader);
	 	//Converting subtotal from string to int
	   	 Conversions.Subtotal_String_To_Int_Conversion();
	   	 
	   //Calculating Tax	
	   	 
	     Conversions.Tax_Calculation_Automatic();
	   	 
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
		 System.out.println("Available Vendor charges Added and calculated Successfully");
		 resultPass("Add Vendor Charge With Amount calculation", "Available Vendor charges Added and calculated Successfully");
	 }
	 else{
		 
		 System.out.println("Available Vendor charges Added and calculated UnSuccessfully");
		 resultFail("Add Vendor Charge With Amount calculation", "Available Vendor charges Added and calculated UnSuccessfully"); 
	 }
               }
           catch (NoSuchElementException e) {
			// TODO: handle exception
          	 System.err.println("NoSuchElementException: " + e.getMessage());
           }
	
	}




}



















