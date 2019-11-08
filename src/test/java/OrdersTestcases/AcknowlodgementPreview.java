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


public class AcknowlodgementPreview extends OrdersExecution1 {

	public static String AckowledgementAddressdetails;
	public static String AckowledgementDecorationdetails;
	public static String AcknowledgementShippingDetails;
	static String parentWindow;
	static OrdersLocators AckowledgementPreview = PageFactory.initElements(driver, OrdersLocators.class);
	public static void AcknowledgementOrder_Preview_SalesPersonDetails() throws IOException, InterruptedException, ParseException{
        try{
	 
	//Close the Preview Popup
	 AckowledgementPreview.ClosePreviewPopup.click();
	 
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
  	AckowledgementPreview.PreviewButton_Orderdetails.click();
	 
	 Thread.sleep(15000);
	 
	 //Press the Acknowlodgement Order document
	 AckowledgementPreview.PreviewPopUp_Acknowledgement.click();
	 
	 Thread.sleep(3000);
	 
	//First store parent window to switch back
	 parentWindow = driver.getWindowHandle();
	 
	 //Press the Preview Button
	 AckowledgementPreview.PreviewPopUp_PreviewButton.click();
	 
	//Switch to new window opened
	  	for(String winHandle : driver.getWindowHandles()){
	  	    if(!winHandle.equals(parentWindow)) {
	  	        driver.switchTo().window(winHandle);
	  	    }
	  	}
	  	  
	  	Thread.sleep(10000);
	  	
	  	AckowledgementAddressdetails=AckowledgementPreview.SalesOrderPreview_SalesPersonAddressDetails.getText();	 
	  	
	  	System.out.println(AckowledgementAddressdetails);
	  	
	  	
	  	
	  	
	  	//Validate the OrderNumber
	  	if(AckowledgementAddressdetails.contains("Feasterville-Trevose, PA 19053"))
	  	{
	  		System.out.println("SalesPerson Details Displayed Successfully");
	  		resultPass("AcknowledgementOrder_Preview_SalesPersonDetails","SalesPerson Details Displayed Successfully");
	  	}
	  	else{
	  		System.out.println("SalesPerson Details Displayed UnSuccessfully");
	  		resultFail("AcknowledgementOrder_Preview_SalesPersonDetails","SalesPerson Details Displayed UnSuccessfully");
	  	}
	  	
        }catch(NoSuchElementException e)
        {
        	e.getMessage();
        }
	} 
	
	public static void AckowlodgementPreview_SplitShipment1_Details_Verification() throws IOException, InterruptedException{
		try{
			
	  	//Validating Split Shipment 1 Details on preview screen on Purchase Order Preview
	  	
	  	if(AckowledgementPreview.SalesOrderPreview_ProductSplit1Details.isDisplayed())
	  	{
	  		System.out.println("Split Shipment 1 Details Displayed Successfully in Acknowlodgement");
	  		resultPass("AckowlodgementPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed Successfully in Acknowlodgement Preview Screen");	
	  	}
	  	else{
	  		System.out.println("Split Shipment 1 Details Displayed UnSuccessfully in Acknowlodgement");
	  		resultFail("AckowlodgementPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed UnSuccessfully on Acknowledgement Preview Screen");
	  	}
       
		}catch(NoSuchElementException e)
		{
			e.getMessage();
		}
		
	}
	public static void AcknowlodgementPreview_SplitShipment1_DecorationDetails_Verification() throws IOException, InterruptedException{
		try{
			
	  	AckowledgementDecorationdetails=AckowledgementPreview.SalesOrderPreview_DecorationdetailsSplit1details.getText();
	  	System.out.println(AckowledgementDecorationdetails);
	  	
	    //Validate the Decoration details on purchase Order preview
	//  	if(AckowledgementDecorationdetails.contains("Location:") &  AckowledgementDecorationdetails.contains("Size: 150x200") & AckowledgementDecorationdetails.contains("Color: Brown") & AckowledgementDecorationdetails.contains("Proof Required: Email") & !AckowledgementDecorationdetails.contains("Test Vendor Notes"))

	  	if(AckowledgementDecorationdetails.contains("Location:")  & !AckowledgementDecorationdetails.contains("Test Vendor Notes"))
	  	{
	  		System.out.println(" Acknowlodgement preview Decoration details for Splitshipment 1 displayed Successfully");
	  		resultPass("AcknowlodgementPreview_SplitShipment1_DecorationDetails_Verification","Acknowlodgement preview Decoration details for Splitshipment 1 displayed Successfully");	
	  	}
	  	else{
	  		System.out.println("Acknowlodgement preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  		resultFail("AcknowlodgementPreview_SplitShipment1_DecorationDetails_Verification","Acknowlodgement preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  	}
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	}	
	  	public static void Ackowledgement_PreviewShippingFromDetails_Verification() throws IOException, InterruptedException{
	  		try{
	  			
		//Now validating the shipping details address on Sales Order Preview
	  	AcknowledgementShippingDetails=AckowledgementPreview.SalesOrderPreview_ShippingDetails_ShipFrom.getText();
	   System.out.println(AcknowledgementShippingDetails);
	   
	   if(AckowledgementPreview.SalesOrderPreview_ShippingDetails_ShipFrom.isDisplayed() )
	   {
		   System.out.println("Ackowledgement Preview Shipping From details displayed Successfully");
		   resultPass("Ackowledgement_PreviewShippingFromDetails_Verification", "Ackowledgement Preview Shipping From details displayed Successfully");   
	   }
	   else{
		   
		   System.out.println("Ackowledgement Preview Shipping From details displayed unsucessfully");
		   resultFail("Ackowledgement_PreviewShippingFromDetails_Verification", "Ackowledgement Preview Shipping From details displayed unsucessfully"); 
	   
	   }
	   
	  		}catch(NoSuchElementException e)
	  		{
	  			e.getMessage();
	  		}
	  	}	
	  	public static void AckowledgementPreview_Instructions() throws IOException, InterruptedException{
	  		try{
	    
	 //Validating the instructions displayed corectly or not sales Order Preview
	   if(AckowledgementPreview.Acknowledgement_Instructions.getText().contains("Test Automation Instructions"))
	   {
		   System.out.println("Instructions Displayed Successfully on Ackowledgement  Preview");
		   resultPass("AckowledgementPreview_Instructions", "Instructions Displayed Successfully on Ackowledgement Preview");
	   }
	   else{
		   System.out.println("Instructions Displayed UnSuccessfully on Ackowledgement Preview");
		   resultFail("AckowledgementPreview_Instructions", "Instructions Displayed UnSuccessfully on Ackowledgement Preview");
	   }
	  		
	  		}catch(NoSuchElementException e)
	  		{
	  		e.getMessage();
	  		}
	  	}
	  	
	  	public static void AcknowledgementPreview_ServicesDetails_Verification() throws IOException, InterruptedException{
	  		try{
	   
	   //Validating the services displayed on sales order or not
	   if(AckowledgementPreview.SalesOrderPreview_Freight1Display.isDisplayed() & AckowledgementPreview.SalesOrderPreview_Freight2Display.isDisplayed())
	   {
		   System.out.println("Services Details Displayed Successfully on Acknowledgement Preview");
		   resultPass("AcknowledgementPreview_ServicesDetails_Verification", "Services Details Displayed Successfully on Acknowledgement Preview");
	   }
	   else{
		   System.out.println("Services Details Displayed UnSuccessfully on Acknowledgement Preview");
		   resultFail("AcknowledgementPreview_ServicesDetails_Verification", "Services Details Displayed UnSuccessfully on Acknowledgement Preview"); 
	   }
	   
	  		}catch(NoSuchElementException e){
	  		   e.getMessage();
	  		}
	  	}
	  	public static void Ackowledgement_PersonalizationDecoration_DocDownload() throws InterruptedException, IOException{
	  		try{
	  	
	  	
	 //Download the Persolaimzation doc for PO in Preview
	   AckowledgementPreview.PurchaseOrder_Preview_Decoration_DownloadFile.click();
	  	
	  	Thread.sleep(35000);
	  	
	  	//Now Validating as if the Personalization file is downloaded successfully or not
	  	File PersonalizationFile = getLatestFilefromDir(downloadPath);
		String PersonalizationDownload = PersonalizationFile.getName();
		 
		 if(PersonalizationDownload.contains("DocP")){
			 System.out.println("Ackowledgement Preview Decoration Personalization document downloaded Successfully");
			 resultPass("Ackowledgement_PersonalizationDecoration_DocDownload", "Ackowledgement Order Preview Decoration Personalization document downloaded Successfully");
			 
		 }
		 else{
			 System.out.println("Ackowledgement Order Preview Decoration Personalization document downloaded downloaded unsucessfully");
			 resultFail("Ackowledgement_PersonalizationDecoration_DocDownload", "Ackowledgement Order Preview Decoration Personalization document downloaded downloaded unsucessfully"); 
			
		 }
	   
	  		}catch(NoSuchElementException e){
	  			e.getMessage();
	  		}
	  	}
	  	
	  	public static void Ackowledgement_PDF_DocDownload() throws IOException, InterruptedException{
	  		try{
		//Download the Persolaimzation doc for PO in Preview
		   AckowledgementPreview.SalesOrderPreview_DownloadPDFButton.click();
		  	
		  	Thread.sleep(27000);
		  	
		  	//Now Validating as if the Personalization file is downloaded successfully or not
		  	File AckFile = getLatestFilefromDir(downloadPath);
			String AckDownload = AckFile.getName();
			 
			 if(AckDownload.contains("Acknowledgement #")){
				 System.out.println("Ackowledgement Preview PDF document downloaded Successfully");
				 resultPass("Ackowledgement_PDF_DocDownload", "Ackowledgement Preview PDF document downloaded Successfully");
				 
			 }
			 else{
				 System.out.println("Ackowledgement Preview PDF document downloaded unsucessfully");
				 resultFail("Ackowledgement_PDF_DocDownload", "Ackowledgement Preview PDF document downloaded unsucessfully"); 
				
			 }
	  		}catch(NoSuchElementException e){
	  			e.getMessage();
	  		}
	  	}
	  	
	  	public static void Calculating_TotalPrice_On_AckowledgementPreview() throws ParseException, IOException, InterruptedException{
	  		try{
	   //Converting preview TotalPrice From String to integer
			 ConversionsWithoutOtherCharges.TotalPriceSalesPreview_String_To_Int_Conversion();
			 
	//Validating the TotalPrice on preview screen
			 if(Conversions.SumSubtotalandTax_WithSalesPreviewAmountMatch==ConversionsWithoutOtherCharges.TotalPriceSalesPreview)
			 {
				 resultPass("Calculating TotalPrice On AckowledgementPreview", "The Total Price Calculated Successfully on Ackowledgement Order Preview");
				 System.out.println("The Total Price Calculated Successfully on Ackowledgement Preview");
			 }
			 else{
				 resultFail("Calculating TotalPrice On AckowledgementPreview","The Total Price Calculated UnSuccessfully on Ackowledgement Preview");
				 System.out.println("The Total Price Calculated UnSuccessfully on Ackowledgement Preview");
			 }
			 
	  		}catch(NoSuchElementException e)
	  		{
	  			e.getMessage();
	  		}
	  	}	
	  		public static void Acknowledgement_Preview_AckSend() throws IOException, InterruptedException{
	  			try{
			//Validating the Sales Order Sending Mail Process to check if the mail sending successfully or not
			 AckowledgementPreview.PO_SendButton.click();
			 waitForPageLoading();
				Thread.sleep(12000);
				
			    AckowledgementPreview.Send_PO_ToandCCRemoveIcon.click();
			    
			    Thread.sleep(1000);
			  /*  
			    AckowledgementPreview.Send_PO_ToandCCRemoveIcon.click();
			    
			    Thread.sleep(1000);
			    
                AckowledgementPreview.Send_PO_ToandCCRemoveIcon.click();*/
			    
			    Thread.sleep(4000);
			    
			    //Insert a new Email address in To Field
			    AckowledgementPreview.SendAck_To_Field.sendKeys("iftikhar@asicentral.com");
			    
			    Thread.sleep(2000);
			    
			    AckowledgementPreview.SendAck_To_Field.sendKeys(Keys.ENTER);
			    
			    Thread.sleep(2000);
			    
			    //Press the send button and validate as if the Success message displayed or not
			    AckowledgementPreview.PO_SendButton.click();
			    waitForPageLoading();
			    Thread.sleep(1000);
			    
			    if(AckowledgementPreview.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
			    {
			    	System.out.println("Acknowledgement Order Send Successfully");
			    	resultPass("Acknowledgement_Preview_AckSend", "Acknowledgement Order Send Successfully");
			    }
			    else{
			    	System.out.println("Acknowledgement Order Send UnSuccessfully");
			    	resultFail("Acknowledgement_Preview_AckSend", "Acknowledgement Order Send UnSuccessfully");
			    }
				
	  			}catch(NoSuchElementException e)
	  			{
	  				e.getMessage();
	  			}
	  		
	  		finally {
	  			 Thread.sleep(5000);
					
        		 
	  		    driver.close();
	  	        
	  	        Thread.sleep(2000);
	  	        
	  	      //Switch back to parent window 
	  	        driver.switchTo().window(parentWindow);
	  	        Thread.sleep(2000);
	  	        AckowledgementPreview.ClosePreviewPopup.click();
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


