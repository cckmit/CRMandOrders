package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import Functions.Conversions;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class ShippingTaxCalculations_Verification_WithoutTaxes extends OrdersExecution1 {

	public static void ShippingTax_Calculation_Order_WithDisablingTax() throws IOException, InterruptedException, ParseException{
		try{
		// This is to Instantiate CreateOrders  class  
	   	 OrdersLocators ManualSalesTax = PageFactory.initElements(driver, OrdersLocators.class);
	
	   	 Thread.sleep(1000);
		 
	   	 //Click the Orders tab
	     ManualSalesTax.ESPWebHomePage_OrdersTab.click();
	     
	    // waitForPageLoading();
	     
	     Thread.sleep(8000);

		 //Click the Order tab
	   	 ManualSalesTax.ESPWebHomePage_OrdersTab.click();
	   	 
	  //Search the OrderNo 	 
  	 ManualSalesTax.OrderlistingSearch.sendKeys(Conversions.Orderno);
		 Thread.sleep(7000);
	   	 //Select existing created order from Top of the list
	   	 ManualSalesTax.OrderListing_Orderselection.click();
	   	 waitForPageLoading();
	   	 Thread.sleep(8000);
	   	 
	   //click the current rates button
	   	 ManualSalesTax.Orderdetails_UseCurrentRates_Button.click();
	   	 waitForPageLoading();
	   	 Thread.sleep(22000);
	
	   
	   	 
	   	 //Converting subtotal from string to int
	   	 Conversions.Subtotal_String_To_Int_Conversion();
	   	 
	    //Converting TotalPrice from string to int
	   	 Conversions.TotalPrice_String_To_Int_Conversion();
	   	 
	   	 //Calculating Tax	
	   	 
	     Conversions.ServicesCalculation_WithTaxes();
	   	 
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
	  System.out.print("After Unchecking Automatic Shipping Tax Button on Settings,the total amount along with Tax Calculate Successfully");
	  resultPass("Uncheck Automatic Shipping Tax On Settings With Verification Shipping Tax and Amount due", "After Unchecking Automatic Shipping Tax Button on Settings,the total amount along with Tax Calculate Successfully");
	}
	   else{
		   
	    System.out.print("After Unchecking Automatic Sales Tax Button on Settings,the total amount along with Tax Calculate unSuccessfully");
		resultFail("Uncheck Automatic Shipping Tax On Settings With Verification Sales Tax and Amount due", "After Unchecking Automatic Shipping Tax Button on Settings,the total amount along with Tax Calculate unSuccessfully");  
	   }
	
		}
		catch(NoSuchElementException e){
	    	 System.err.println("NoSuchElementException: " + e.getMessage());
		}
	}
	}
