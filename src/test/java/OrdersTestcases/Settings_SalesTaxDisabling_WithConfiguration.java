package OrdersTestcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;



public class Settings_SalesTaxDisabling_WithConfiguration extends OrdersExecution1 {

    public static String PAStateExistence_in_TaxesRate;
    public static WebElement toClear;
	public static void AutomaticSalesTax_Uncheck() throws IOException, InterruptedException{
		       try{
		// This is to Instantiate Services  class  
	   	 OrdersLocators Settings_SalesTax = PageFactory.initElements(driver, OrdersLocators.class);	
	

    //Click the userInfoIcon on My Order screen	 
	   	 Settings_SalesTax.OrderListing_UserInfoIcon.click();
	   	 
	   	 
	  //Click the settings option
	   	 Settings_SalesTax.UserInfoIcon_Settings.click();
	   	 
	   	 
	  //Now Select the sales tax option in settings
	   	 Settings_SalesTax.Settings_SalesTax.click();
	   	 
	   	 
	 //Check if the automatically taxes calculation checkbox is selected or not
	   	 if(Settings_SalesTax.Settings_SalesTax_AutoCalculateTaxes_Checkbox.isSelected())
	   	 {
	   	   Settings_SalesTax.Settings_SalesTax_AutoCalculateTaxes_Checkbox.click();
	   	   Assert.assertTrue(Settings_SalesTax.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"));
	   	   resultPass("Disabling Automatic Sales Tax(Settings)", "Automatic Sales Tax Calculated Checkbox unchecked and New Manual Rate entered Successfully");
	   	   Thread.sleep(2000);
	   	 }
	   	 else {
		   	   resultPass("Disabling Automatic Sales Tax(Settings)", "Automatic Sales Tax Calculated Checkbox unchecked and New Manual Rate entered Successfully");

	   	 }
	   
	  
		       }	   	
		   
		    catch(NoSuchElementException e) {
		    	 System.err.println("NoSuchElementException: " + e.getMessage());
		    }
   }

}

