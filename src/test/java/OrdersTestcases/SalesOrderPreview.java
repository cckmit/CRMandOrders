package OrdersTestcases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import Functions.Conversions;
import Functions.ConversionsWithoutOtherCharges;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;


public class SalesOrderPreview extends OrdersExecution1 {
	
	public static String SalesPersonAddressdetails;
	public static String BillingandShippingAddressdetails;
	public static String SalesOrderDecorationDetails;
	public static String SalesOrderShippingfromdetails;
	public static String SalesOrderShippingAddressDetails;
	public static File SalesOrderDownloadPDF;
	public static String SalesOrderDownload;
	public static String parentWindow;
	static OrdersLocators SalesOrderPreview = PageFactory.initElements(driver, OrdersLocators.class);
	public static void SalesOrderPreview_SalesPersonDetails() throws IOException, InterruptedException, ParseException{
        try{
	 // This is to Instantiate EditInstruction  class  
	 

	 SalesOrderPreview.ClosePreviewPopup.click();
	//Close the Preview Popup
	 
	 Thread.sleep(2000);
	 
	//Converting subtotal from string to int
  	 Conversions.Subtotal_String_To_Int_Conversion();
  	 
  
  	 
 //Sales Tax Conversion from String to integer with $ removing done 
  	 
    Conversions.SalesTax_String_To_Int_Conversion();
  	
  //Adding  the SubTotal and tax amount for matching with sales order preview total amount
    Conversions.SumSubtotalandTax_MatchingwithSalesPreviewAmount();
  	 
  //Now Converting the Amountdue from string to Int
  	Conversions.AmountDue_String_To_Int_Conversion();
	 
	 //Press the Preview Button on order details
	 SalesOrderPreview.PreviewButton_Orderdetails.click();
	 
	// Thread.sleep(15000);
	 Thread.sleep(3000);
	 //Press the Purchase Order document
	 SalesOrderPreview.PreviewPopUp_SalesOrder.click();
	 
	 Thread.sleep(3000);
	 
	//First store parent window to switch back
	 parentWindow = driver.getWindowHandle();
	 
	 //Press the Preview Button
	 SalesOrderPreview.PreviewPopUp_PreviewButton.click();
	 
	//Switch to new window opened
	  	for(String winHandle : driver.getWindowHandles()){
	  	    if(!winHandle.equals(parentWindow)) {
	  	        driver.switchTo().window(winHandle);
	  	    }
	  	}
	  	  
	  	Thread.sleep(10000);
	  	
	  	SalesPersonAddressdetails=SalesOrderPreview.SalesOrderPreview_SalesPersonAddressDetails.getText();	 
	  	
	  	System.out.println(SalesPersonAddressdetails);
	  	
	  	
	  	
	  	
	  	//Validate the OrderNumber
	  	if(SalesPersonAddressdetails.contains("Feasterville-Trevose, PA 19053"))
	  	{
	  		System.out.println("SalesPerson Details Displayed Successfully");
	  		resultPass("Sales Order Preview_SalesPersonDetails","SalesPerson Details Displayed Successfully");
	  	}
	  	else{
	  		System.out.println("SalesPerson Details Displayed UnSuccessfully");
	  		resultFail("Sales Order Preview_SalesPersonDetails","SalesPerson Details Displayed UnSuccessfully");
	  	}
	  	
        }catch(NoSuchElementException e){
           e.getMessage();
        }
	}
	  public static void SalesOrder_BillingShippingDetails_Preview() throws IOException, InterruptedException{
	          try{
	  	BillingandShippingAddressdetails=SalesOrderPreview.SalesOrderPreview_BillingandShippingAddress.getText();
	  	System.out.println(BillingandShippingAddressdetails);
	  	
	  	//Validate the Sales Person details is displayed or not
	  	if(SalesOrderPreview.SalesOrderPreview_BillingandShippingAddress.isDisplayed() & BillingandShippingAddressdetails.contains("Feasterville-Trevose, PA "))
	  	{
	  		System.out.println("Billing and Shipping Address Displayed Successfully");
	  		resultPass("SalesOrder_Billing&ShippingDetails_Preview","Billing and Shipping Address Displayed Successfully");
	  	}
	  	else{
	  		System.out.println("Billing and Shipping Address Displayed UnSuccessfully");
	  		resultFail("SalesOrder_Billing&ShippingDetails_Preview","Billing and Shipping Address Displayed UnSuccessfully");
	  	}
	   }catch(NoSuchElementException e){
	      e.getMessage();
	   }
	  } 
	  
	  public static void SalesOrder_Blindship_Verification() throws IOException, InterruptedException{
		  try{
	  	//Validating BlindShipment in Sales Order Doc
	  	if(SalesOrderPreview.BlindShipText_ShippingDetails_PurchaseOrder.getText().contains("Blind Ship"))
	  	{
	  		System.out.println("Blind Ship Displayed on Sales Order Doc Shipping to Address Successfully");
	  		resultPass("SalesOrder_Blindship_Verification", "Blind Ship Displayed on Sales Order Doc Shipping to Address Successfully");
	  	}
	  	else{
	  		System.out.println("Blind Ship Displayed on Sales Order Doc Shipping to Address UnSuccessfully");
	  		resultFail("SalesOrder_Blindship_Verification", "Blind Ship Displayed on Sales Order Doc Shipping to Address UnSuccessfully");
	  	}
	  	
		  }catch(NoSuchElementException e){
		    e.getMessage();
		  }
		  
	  } 
	   public static void SalesOrderPreview_SplitShipment1_Details_Verification() throws IOException, InterruptedException{
		   try{
	  
	  //Validating Split Shipment 1 Details on preview screen on Purchase Order Preview
	  	
	  	if(SalesOrderPreview.SalesOrderPreview_ProductSplit1Details.isDisplayed())
	  	{
	  		System.out.println("Split Shipment 1 Details Displayed Successfully");
	  		resultPass("SalesOrderPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed Successfully on Sales Order Preview Screen");	
	  	}
	  	else{
	  		System.out.println("Split Shipment 1 Details Displayed UnSuccessfully");
	  		resultFail("SalesOrderPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed UnSuccessfully on Sales Order Preview Screen");
	  	}
		   }catch(NoSuchElementException e){
		      e.getMessage();
		   }
		
	   }  
       public static void SalesOrderPreview_SplitShipment1_DecorationDetails_Verification() throws IOException, InterruptedException{
    	   try{
	  	SalesOrderDecorationDetails=SalesOrderPreview.PurchaseOrder_Preview_DecorationDetails_SplitShipment1Area.getText();
	  	System.out.println(SalesOrderDecorationDetails);
	  	
	  	//Validate the Decoration details on purchase Order preview
	  	if(SalesOrderDecorationDetails.contains("Location:") &&  SalesOrderDecorationDetails.contains("Proof Required: Email"))
	  	{
	  		System.out.println("Sales Order preview Decoration details for Splitshipment 1 displayed Successfully");
	  		resultPass("SalesOrderPreview_SplitShipment1_DecorationDetails_Verification","Sales Order preview Decoration details for Splitshipment 1 displayed Successfully");	
	  	}
	  	else{
	  		System.out.println("Sales Order preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  		resultFail("SalesOrderPreview_SplitShipment1_DecorationDetails_Verification","Sales Order preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  	}
        
    }catch(NoSuchElementException e)
    	   {
    	e.getMessage();
    	  }
       }
       
       public static void SalesOrder_PreviewShippingFromDetails_Verification() throws IOException, InterruptedException{
    	   try{
		//Now validating the shipping details address on Sales Order Preview
	  	SalesOrderShippingfromdetails=SalesOrderPreview.SalesOrderPreview_ShippingDetails_ShipFrom.getText();
	   System.out.println(SalesOrderShippingfromdetails);
	   
	   if(SalesOrderShippingfromdetails.contains("Shipping Details") &SalesOrderShippingfromdetails.contains("From") & SalesOrderPreview.SalesOrderPreview_ShippingDetails_ShipFrom.isDisplayed() )
	   {
		   System.out.println("Sales Order Preview Shipping From details displayed Successfully");
		   resultPass("SalesOrder_PreviewShippingFromDetails_Verification", "Sales Order Preview Shipping From details displayed Successfully");   
	   }
	   else{
		   
		   System.out.println("Sales Order Preview Shipping From details displayed unsucessfully");
		   resultFail("SalesOrder_PreviewShippingFromDetails_Verification", "Sales Order Preview Shipping From details displayed unsucessfully"); 
	   
	   }
    }catch(NoSuchElementException e)
    	   {
    	e.getMessage();
    	   }
       }
       public static void SalesOrder_ShippingFrom_BlindShip_Verification() throws IOException, InterruptedException{
    	   try{
	   //Now Validating Blind ship on Sales Order Shipping details
	   if(SalesOrderPreview.BlindShipText_ShippingDetails_PurchaseOrder.getText().contains("Blind Ship"))
	   {
		   System.out.println("Blind Ship Displayed Successfully on Sales Order Shipping from details Successfully");
	       resultPass("SalesOrder_ShippingFrom_BlindShip_Verification", "Blind Ship Displayed Successfully on Sales Order Shipping from details Successfully");
	   }
	   else{
		   System.out.println("Blind Ship Displayed Successfully on Sales Order Shipping from details UnSuccessfully");
	       resultFail("SalesOrder_ShippingFrom_BlindShip_Verification", "Blind Ship Displayed Successfully on Sales Order Shipping from details UnSuccessfully");
	   }
	   
     }catch(NoSuchElementException e)
    	   {
    	 e.getMessage();
    	   }
       }
       public static void SalesOrderPreview_ShippingToDetails_Verification() throws IOException, InterruptedException{
    	   try{
    		   
       
      //Now Validating the shipping Address details displayed or not
	   
	   SalesOrderShippingAddressDetails=SalesOrderPreview.SalesOrderPreview_CompleteShippingDetails.getText();
	   System.out.println(SalesOrderShippingAddressDetails);
	   
	   if(SalesOrderShippingAddressDetails.contains("Feasterville-Trevose, PA 19053") & SalesOrderShippingAddressDetails.contains("Ship Via") & SalesOrderShippingAddressDetails.contains("Best Way") & SalesOrderShippingAddressDetails.contains("Account #") & SalesOrderShippingAddressDetails.contains("ABCDE12345") & SalesOrderPreview.SalesOrderPreview_CompleteShippingDetails.isDisplayed())
	   {
		   System.out.println("Sales Order Preview ShipTo Address details displayed Successfully");
		   resultPass("SalesOrderPreview_ShippingToDetails_Verification", "Sales Order Preview ShipTo Address details displayed Successfully");
	   }
	   else{
		   System.out.println("Sales Order Preview ShipTo Address details displayed UnSuccessfully");
		   resultFail("SalesOrderPreview_ShippingToDetails_Verification", "Sales Order Preview ShipTo Address details displayed UnSuccessfully"); 
	   }
   }catch(NoSuchElementException e)
    	   {
	      e.getMessage();
    	   }
       }
       public static void SalesOrderPreview_Instructions() throws IOException, InterruptedException{
    	   try{
    		   
        //Validating the instructions displayed corectly or not sales Order Preview
	   if(SalesOrderPreview.SalesOrderPreview_InstructionsVerification.getText().contains("Instructions:") & SalesOrderPreview.SalesOrderPreview_InstructionsVerification.getText().contains("Test Automation Instructions"))
	   {
		   System.out.println("Instructions Displayed Successfully on Sales Order Preview");
		   resultPass("SalesOrderPreview_Instructions", "Instructions Displayed Successfully on Sales Order Preview");
	   }
	   else{
		   System.out.println("Instructions Displayed UnSuccessfully on Sales Order Preview");
		   resultFail("SalesOrderPreview_Instructions", "Instructions Displayed UnSuccessfully on Sales Order Preview");
	   }
    }catch(NoSuchElementException e)
    	   {
           e.getMessage();
    	   }
       }  
    	
      public static void SalesOrderPreview_ServicesDetails_Verification() throws IOException, InterruptedException{
    	  try{
    		  
	   
	   //Validating the services displayed on sales order or not
	   if(SalesOrderPreview.SalesOrderPreview_Freight1Display.isDisplayed() & SalesOrderPreview.SalesOrderPreview_Freight2Display.isDisplayed())
	   {
		   System.out.println("Services Details Displayed Successfully on Sales Order Preview");
		   resultPass("SalesOrderPreview_ServicesDetails_Verification", "Services Details Displayed Successfully on Sales Order Preview");
	   }
	   else{
		   System.out.println("Services Details Displayed UnSuccessfully on Sales Order Preview");
		   resultFail("SalesOrderPreview_ServicesDetails_Verification", "Services Details Displayed UnSuccessfully on Sales Order Preview"); 
	   }
	   
   }catch(NoSuchElementException e)
    	  {
	   e.getMessage();
    	  }
      }
      public static void Calculating_TotalPrice_On_SalesPreview() throws IOException, InterruptedException, ParseException{
    	  try{
    		  
      
	   //Converting preview TotalPrice From String to integer
			 ConversionsWithoutOtherCharges.TotalPriceSalesPreview_String_To_Int_Conversion();
			 
	//Validating the TotalPrice on preview screen
			 if(Conversions.SumSubtotalandTax_WithSalesPreviewAmountMatch==ConversionsWithoutOtherCharges.TotalPriceSalesPreview)
			 {
				 resultPass("Calculating TotalPrice On SalesPreview", "The Total Price Calculated Successfully on Sales Order Preview");
				 System.out.println("The Total Price Calculated Successfully on Sales Order Preview");
			 }
			 else{
				 resultFail("Calculating TotalPrice On SalesPreview","The Total Price Calculated UnSuccessfully on Sales Order Preview");
				 System.out.println("The Total Price Calculated UnSuccessfully on Sales Order Preview");
			 }
    	  }catch(NoSuchElementException e)
    	  {
    		  e.getMessage();
    	  }
      }
      
      public static void SalesOrder_PDF_DocDownload() throws IOException, InterruptedException{
    	  try{
        //Validating the as Sales order downloaded Successfully or not
			SalesOrderPreview.SalesOrderPreview_DownloadPDFButton.click();
			
			Thread.sleep(35000);
			 
			 SalesOrderDownloadPDF = getLatestFilefromDir(downloadPath);
			 SalesOrderDownload= SalesOrderDownloadPDF.getName();
				 
				 if(SalesOrderDownload.contains("Order #")){
					 System.out.println("Sales Order Preview PDF file downloaded Successfully");
					 resultPass("SalesOrder_PDF_DocDownload", "Sales Order Preview PDF file downloaded Successfully");
					 
				 }
				 else{
					 System.out.println("Sales Order Preview PDF file downloaded unsucessfully");
					 resultFail("SalesOrder_PDF_DocDownload", "Sales Order Preview PDF file downloaded unsucessfully"); 
					
				 } 
    	  }catch(NoSuchElementException e){
    		  e.getMessage();
    	  }
      } 
    	  public static void PDFAttach_Checkbox_ischecked_by_default() throws InterruptedException, IOException{
    		  try{
    			  
				//Validating the Sales Order Sending Mail Process to check if the mail sending successfully or not
				    SalesOrderPreview.PO_SendButton.click();
				    waitForPageLoading();
					Thread.sleep(12000);
				    
				    //Insert a new Email address in To Field
				    SalesOrderPreview.SendSales_To_Field.sendKeys("miftikhar@asicentral.com");
				     Thread.sleep(3000);
				    //driver.findElement(By.cssSelector("div[ng-if='email.isTag']")).click();
				    SalesOrderPreview.SendSales_To_Field.sendKeys(Keys.ENTER);
				    
				    
				    Thread.sleep(2000);
				    
				    if(SalesOrderPreview.VerifyDocumentCheckbox.isSelected()) {
				    	System.out.println("Checkbox is checked by default");
				    	resultPass("PDF Attach Checkbox is checked by default", "Checkbox is checked by default");
				    	
				    }
				    else {
				    	System.out.println("Checkbox is checked by default");
				    	resultFail("PDF Attach Checkbox is not checked by default", "Checkbox is checked by default");
				    	
				    }
				    
    		  }catch(NoSuchElementException e)
    		  {
    			  e.getMessage();
    		  }
    	  } 
    	  
    	  public static void SalesOrder_Preview_SalesOrder_Send() throws InterruptedException, IOException{
    		  try{
    			  
				    //Press the send button and validate as if the Success message displayed or not
				    SalesOrderPreview.PO_SendButton.click();
				    waitForPageLoading();
				    Thread.sleep(1000);
				    
				    if(SalesOrderPreview.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
				    {
				    	System.out.println("Sales Order Send Successfully");
				    	resultPass("SalesOrder_Preview_SalesOrder_Send", "Sales Order Send Successfully");
				    }
				    else{
				    	System.out.println("Sales Order Send UnSuccessfully");
				    	resultFail("SalesOrder_Preview_SalesOrder_Send", "Sales Order Send UnSuccessfully");
				    }
					
        
        }
     catch (NoSuchElementException e) {
		// TODO: handle exception
    	 System.err.println("NoSuchElementException: " + e.getMessage());
     }
	
    finally{
    	Thread.sleep(5000);
		
        driver.close();

       Thread.sleep(2000);

    //Switch back to parent window 
     driver.switchTo().window(parentWindow);
    }

	}



public static File getLatestFilefromDir(String dirPath){
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files == null || files.length == 0) {
        return null;
    }

    File lastModifiedFile = files[0];
    for (int i = 1; i < files.length; i++) {
       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
           lastModifiedFile = files[i];
       }
    }
    return lastModifiedFile;
}
}



