package OrdersTestcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;


public class Requote_FromOrdersDetails_And_QuoteDetails extends OrdersExecution1{
	
	
	static OrdersLocators Requote = PageFactory.initElements(driver, OrdersLocators.class);
	static String ShippingAddress_OrderLevel;
	static String BillingAddress_OrderLevel;
	static String ShippingAddress_ProductLevel;
	static String AckAddress_OrderLevel;
	public static void SameAsBilling_ShippingAddress_Verification_Order_Level() throws IOException, InterruptedException{
		try{
			
			//Click the Same as billing checkbox for Shipping Address and Validate at product and Order level
			Click("Click the Same as billing checkbox for Shipping Address",Requote.Sameasbilling_Checkbox_ShippingAddress);
			
		    BillingAddress_OrderLevel=Requote.BillingAddress_Orderlevel.getText();
			System.out.println(BillingAddress_OrderLevel);
			
			
			Click("Confirm by Clicking yes Button", Requote.AccountNo_Visible_Confirm);
			
		    ShippingAddress_OrderLevel=Requote.ShippingAddress_Orderlevel.getText();
			System.out.println(ShippingAddress_OrderLevel);
			
			if(ShippingAddress_OrderLevel.equals(BillingAddress_OrderLevel))
			{	
			System.out.println("Same as billing Address at Order level Successfully");
			resultPass("SameAsBilling_ShippingAddress_Verification_Order_ProductLevel","Same as billing Address at Order level Successfully");
			}
			else{
				System.out.println("Same as billing Address at Order level Successfully");
				resultFail("SameAsBilling_ShippingAddress_Verification_Order_Level","Same as billing Address at Order level UnSuccessfully");
			}
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	public static void CPN_Number_EditProductConfig_Verification() throws InterruptedException, IOException{
		try{
            Click("a", Requote.OrdersDetails_EditButton);
		 	
		    waitForElementNotVisible(120, driver,Requote.SpinnerLoader);
			 	 
		    Thread.sleep(3000);
		    
		    WebElement CPNField=Requote.EditProduct_CPN_Field_Verification;
			 String CPNFieldValue=CPNField.getAttribute("value");
			 System.out.println(CPNFieldValue);
			 
			 if(Requote.EditProduct_CPN_Field_Verification.isDisplayed() & CPNFieldValue.contains("CPN-") & Requote.Customer_NumberEditProduct.isDisplayed())
			 {
				 System.out.println("CPN Field Displayed on Edit Config Product Successfully");
				 resultPass("CPN_Number_EditProductConfig_Verification", "CPN Field Displayed on Edit Config Product Successfully");
			 }
			 else{
				 System.out.println("CPN Field Displayed on Edit Config Product UnSuccessfully");
				 resultFail("CPN_Number_EditProductConfig_Verification", "CPN Field Displayed on Edit Config Product UnSuccessfully");
			 }
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
public static void SameAsBilling_ShippingAddress_Verification_Product_Level() throws InterruptedException, IOException{
		try{
			
			Requote.EditOrder_ShippingTab.click();
		    
		    Thread.sleep(1500);

		    ShippingAddress_ProductLevel=Requote.ShippingAddress_Verification_At_ProductLevel.getText();
		    System.out.println(ShippingAddress_ProductLevel);
		    
		    if(ShippingAddress_ProductLevel.contains("4800 Street Road Feasterville-Trevose")){
		    	System.out.println("Same as billing shipping address updated at product level Successfully");
		    	resultPass("SameAsBilling_ShippingAddress_Verification_Product_Level", "Same as billing shipping address updated at product level Successfully");
		    }
		    else{
		    	System.out.println("Same as billing shipping address updated at product level UnSuccessfully");
		    	resultFail("SameAsBilling_ShippingAddress_Verification_Product_Level", "Same as billing shipping address updated at product level UnSuccessfully");
		    }
		    
			
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		/*
		 * finally { Requote.CustomProduct_Popup_Cancel_Button.click();
		 * 
		 * Thread.sleep(1000); }
		 */
	
	}
	public static void SameAsBilling_AcknowledgementAddress_Verification_Order_Level() throws IOException, InterruptedException{
		try{
			
			//Click the Same as billing checkbox for Shipping Address and Validate at product and Order level
			Click("Click the Same as billing checkbox for Shipping Address",Requote.Sameasbilling_Checkbox_Acknowledgement);
			
			Thread.sleep(1000);
			AckAddress_OrderLevel=Requote.AcknowledgementAddress_OrderLevel.getText();
			System.out.println(AckAddress_OrderLevel);
			
			if(AckAddress_OrderLevel.equals(BillingAddress_OrderLevel))
			{	
			System.out.println("Same as billing Address for acknowledgement Address at Order level Successfully");
			resultPass("SameAsBilling_AcknowledgementAddress_Verification_Order_Level","Same as billing Address for acknowledgement Address at Order level Successfully");
			}
			else{
				System.out.println("Same as billing Address for acknowledgement Address at Order level UnSuccessfully");
				resultFail("SameAsBilling_AcknowledgementAddress_Verification_Order_Level","Same as billing Address for acknowledgement Address at Order level UnSuccessfully");
			}
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	
	
	
	public static void Requote_From_Orders_Details() throws IOException, InterruptedException, AWTException{
		try{
	 
			Click("Click the More Button", Requote.Orderdetails_MoreButton);
			
			Click("Click the Create Quote option", Requote.Orderdetails_MoreButton_CreateQuote);
			
			Thread.sleep(2000);
			
			if(!Requote.Copy_NoInstructions_To_NewQuote.isSelected())
			{
				Click("Instructions Checkbox is not selected", Requote.Copy_NoInstructions_To_NewQuote);
			}
			Click("Click the Continue Button To Complete Requote From Order Details", Requote.CreateQuote_CopyOptions_Continue_Button);
			
			waitForElementNotVisible(120, driver,Requote.SpinnerLoader);
			
			Thread.sleep(25000);
			
			if(Requote.CopyQuote_FromOrderDetails_Verification.getText().contains("Your Quote has been copied") & Requote.ViewInstructions.isDisplayed())
			{
				System.out.println("Quote Copy from Orders details Successfully");
				
				resultPass("Requote_From_Orders_Details", "Quote Copy from Orders details Successfully");
			}
    	
			else{
                System.out.println("Quote Copy from Orders details UnSuccessfully");
				
				resultFail("Requote_From_Orders_Details", "Quote Copy from Orders details UnSuccessfully");
			}
		
		
		}
     	catch (NoSuchElementException e) {
     	      e.getMessage();
         }
     	
	}
		
    public static void ProfitMaker_Send_Verification() throws InterruptedException, IOException{
    	try{
    		
    		if(Requote.ClosePopup.size() > 0) {
    			Requote.ClosePopup.get(0).click();
    		}
    		
    		Requote.SendProfitMaker_Button.click();
    		
    		Thread.sleep(3000);
    		Click("Profit Maker Send Button Click",Requote.SendProfitMakerSend_ConfirmButton);
    		
    		//Requote.SendProfitMakerSend_ConfirmButton.click();
    		
    		Thread.sleep(1000);
    		
    		if(Requote.ProfitMakerSend_SuccessMessage.getText().contains("This Order will appear in ProfitMaker"))
    		{
    			System.out.println("ProfitMaker Send Successfully");
    			resultPass("ProfitMaker_Send_Verification", "ProfitMaker Send Successfully");
    		}
    		else{
    			System.out.println("ProfitMaker Send UnSuccessfully");
    			resultFail("ProfitMaker_Send_Verification", "ProfitMaker Send UnSuccessfully");
    		}
    		
    	}catch(NoSuchElementException e){
    		e.getMessage();
    	}
    }
	
	
	
	
	
	
	
	public static void Requote_From_Quote_Details() throws InterruptedException, IOException{
	   try{
		   
		   Click("Click the More Button", Requote.Orderdetails_MoreButton);
		   
		   Click("Click the Create Quote option", Requote.Requote_Option_QuoteDetails);
			
		   Thread.sleep(1000);
			
		   
		   Click("Uncheck the Instruction Checkbox", Requote.Copy_NoInstructions_To_NewQuote);
		   
		   Thread.sleep(1000);
		   
		   Click("Click the Continue Button To Complete Requote From Order Details", Requote.CreateQuote_CopyOptions_Continue_Button);
		   
		   waitForElementNotVisible(120, driver,Requote.SpinnerLoader);
			
		   Thread.sleep(25000);
		   
		   List<WebElement> records = Requote.NoViewInstructions_Verification_AfterCopyingQuote;
		   int size=records.size();
		   System.out.println(size);
		   
		   
		   if(Requote.CopyQuote_FromOrderDetails_Verification.getText().contains("Your Quote has been copied"))
			{
				System.out.println("Quote Copy from Quote details Successfully");
				
				resultPass("Requote_From_Quote_Details", "Quote Copy from Quote details Successfully");
			}
   	
			else{
               System.out.println("Quote Copy from Quote details UnSuccessfully");
				
				resultFail("Requote_From_Quote_Details", "Quote Copy from Quote details UnSuccessfully");
			}
		
		
			
		   
		   
	   
	   
	   }catch(NoSuchElementException e){
		   e.getMessage();
	   }
   }



}
