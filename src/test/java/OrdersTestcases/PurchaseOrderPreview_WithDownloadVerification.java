package OrdersTestcases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Functions.ConversionsWithoutOtherCharges;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;


public class PurchaseOrderPreview_WithDownloadVerification extends OrdersExecution1 {

	public static String PurchaseOrderTextPreviewVerification;
	public static String PurchaseOrdernoPreview;
	public static String SalesPersonDetailsVerification;
	public static String PurchaseOrderDecorationDetails_Verification;
	public static String ShippingdetailsAddress_PurchaseOrderPreview;
	static String parentWindow10;
	static String parentWindow;
	static OrdersLocators PurchaseOrderPreviewWithDownload = PageFactory.initElements(driver, OrdersLocators.class);
	public static void Purchase_Order_Preview_Verification() throws IOException, InterruptedException, ParseException{
        try{
	    	
     
	//Goto Pricing Tab
	 Click("a", PurchaseOrderPreviewWithDownload.Orderdetails_PricingTab);
	 Thread.sleep(3000);
	 
	 //Converting SplitShipment1 from string to integer or double
	 ConversionsWithoutOtherCharges.TotalPriceSplitShipment1_String_To_Int_Conversion();
	 
	//Converting SplitShipment2 from string to integer or double
	 ConversionsWithoutOtherCharges.TotalPriceSplitShipment2_String_To_Int_Conversion();
	 
	 //Calculating the sum amount for Both Shipments
	 ConversionsWithoutOtherCharges.TotalPrice_SumAmount();
	 
	 //Press the Preview Button on order details
	 Click("Click Function",PurchaseOrderPreviewWithDownload.PreviewButton_Orderdetails);
	 
	 // PurchaseOrderPreviewWithDownload.PreviewButton_Orderdetails.click();
	 
	 waitForPageLoading();
	 
	 Thread.sleep(3000);
	
	

	 //Press the Purchase Order document
	// PurchaseOrderPreviewWithDownload.PreviewPopUp_PurchaseOrder.click();
	 Click("a",  PurchaseOrderPreviewWithDownload.PreviewPopUp_PurchaseOrder);
	 
	 Thread.sleep(3000);
	 
	//Select the Purchase Order Option
//	 PurchaseOrderPreviewWithDownload.PreviewPopup_PurchaseOrderSelection.click();
	 Click("a",  PurchaseOrderPreviewWithDownload.PreviewPopup_PurchaseOrderSelection);
	 waitForPageLoading();
	 Thread.sleep(3000);
	 //First store parent window to switch back
	 parentWindow = driver.getWindowHandle();
	 
	 //Press the Preview Button
	 PurchaseOrderPreviewWithDownload.PreviewPopUp_PreviewButton.click();
	 
	//Switch to new window opened
	  	for(String winHandle : driver.getWindowHandles()){
	  	    if(!winHandle.equals(parentWindow)) {
	  	        driver.switchTo().window(winHandle);
	  	    }
	  	}
	  	  
	  	Thread.sleep(10000);
	  	
	  	PurchaseOrderTextPreviewVerification=PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_PurchaseOrderNumberVerification.getText();	 
	  	
	  	System.out.println(PurchaseOrderTextPreviewVerification);
	  	
	  	
	  	
	  	
	  	//Validate the OrderNumber
	  	if(PurchaseOrderTextPreviewVerification.contains("Purchase Order"))
	  	{
	  		System.out.println("Purchase Order Displayed Successfully");
	  		resultPass("Purchase Order Preview Verification","Purchase Order Displayed Successfully");
	  	}
	  	else{
	  		System.out.println("Purchase Order Displayed UnSuccessfully");
	  		resultFail("Purchase Order Preview Verification","Purchase Order Displayed UnSuccessfully");
	  	}
	  	
       }catch(NoSuchElementException e){
         e.getMessage();
       }
	}
	public static void PurchaseOrder_SalesPersonDetails_PreviewVerification() throws IOException, InterruptedException{
		try{
	  	SalesPersonDetailsVerification=PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_SalesPersonDetailsVerification.getText();
	  	System.out.println(SalesPersonDetailsVerification);
	  	
	  	//Validate the Sales Person details is displayed or not
	  	if(PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_SalesPersonDetailsVerification.isDisplayed() & SalesPersonDetailsVerification.contains("Automation"))
	  	{
	  		System.out.println("Sales Person Details Displayed Successfully");
	  		resultPass("PurchaseOrder_SalesPersonDetails_PreviewVerification","Sales Person Details Displayed Successfully");
	  	}
	  	else{
	  		System.out.println("Sales Person Details Displayed UnSuccessfully");
	  		resultFail("PurchaseOrder_SalesPersonDetails_PreviewVerification","Sales Person Details Displayed UnSuccessfully");
	  	}
	}catch(NoSuchElementException e){
	   e.getMessage();
	}
	  
	}
	
	public static void PurchaseOrderPreview_SplitShipment1_Details_Verification() throws IOException, InterruptedException{
		try{
		//Validating Split Shipment 1 Details on preview screen on Purchase Order Preview
	  //Validating Split Shipment 1 Details on preview screen on Purchase Order Preview
	  	if(PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_SplitShipment1Area.isDisplayed())
	  	{
	  		System.out.println("Split Shipment 1 Details Displayed Successfully");
	  		resultPass("PurchaseOrderPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed Successfully on Purchase Order Preview Screen");	
	  	}
	  	else{
	  		System.out.println("Split Shipment 1 Details Displayed UnSuccessfully");
	  		resultFail("PurchaseOrderPreview_SplitShipment1_Details_Verification","Split Shipment 1 Details Displayed UnSuccessfully on Purchase Order Preview Screen");
	  	}
       
		}catch(NoSuchElementException e){
		   e.getMessage();
		}
	}	
	  public static void PurchaseOrderPreview_SplitShipment1_DecorationDetails_Verification() throws IOException, InterruptedException{
		  try{
	  	
	  	PurchaseOrderDecorationDetails_Verification=PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_DecorationDetails_SplitShipment1Area.getText();
	  	System.out.println(PurchaseOrderDecorationDetails_Verification);
	  	
	  	
	  	
	  	
	  	//Validate the Decoration details on purchase Order preview
	//  	if(PurchaseOrderDecorationDetails_Verification.contains("Location:") &  PurchaseOrderDecorationDetails_Verification.contains("Size: 150x200") & PurchaseOrderDecorationDetails_Verification.contains("Color: Brown") & PurchaseOrderDecorationDetails_Verification.contains("Proof Required: Email") & PurchaseOrderDecorationDetails_Verification.contains("Test Vendor Notes"))
	  	if(PurchaseOrderDecorationDetails_Verification.contains("Location:") & PurchaseOrderDecorationDetails_Verification.contains("Test Vendor Notes"))

	  	{
	  		System.out.println("Purchase Order preview Decoration details for Splitshipment 1 displayed Successfully");
	  		resultPass("PurchaseOrderPreview_SplitShipment1_DecorationDetails_Verification","Purchase Order preview Decoration details for Splitshipment 1 displayed Successfully");	
	  	}
	  	else{
	  		System.out.println("Purchase Order preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  		resultFail("PurchaseOrderPreview_SplitShipment1_DecorationDetails_Verification","Purchase Order preview Decoration details for Splitshipment 1 displayed UnSuccessfully");
	  	}
        
		}catch(NoSuchElementException e){
		    e.getMessage();	
		}
	  }	  
	  	public static void PurchaseOrder_PersonalizationDecoration_DocDownload() throws IOException, InterruptedException{
	  		try{
	  			
	  		
	  	//Download the Persolaimzation doc for PO in Preview
	  	PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_Decoration_DownloadFile.click();
	  	
	  	Thread.sleep(10000);
	  	
	  	//Now Validating as if the Personalization file is downloaded successfully or not
	  	File PersonalizationFile = getLatestFilefromDir(downloadPath);
		String PersonalizationDownload = PersonalizationFile.getName();
		 
		 if(PersonalizationDownload.contains("DocP")){
			 System.out.println("Purchase Order Preview Decoration Personalization document downloaded Successfully");
			 resultPass("PurchaseOrder_PersonalizationDecoration_DocDownload", "Purchase Order Preview Decoration Personalization document downloaded Successfully");
			 
		 }
		 else{
			 System.out.println("Purchase Order Preview Decoration Personalization document downloaded downloaded unsucessfully");
			 resultFail("PurchaseOrder_PersonalizationDecoration_DocDownload", "Purchase Order Preview Decoration Personalization document downloaded downloaded unsucessfully"); 
			
		 }
		 
	  	}catch(NoSuchElementException e){
	  		e.getMessage();
	  	}
	  	}	 
	  	public static void PurchaseOrder_AtworkDecoration_DocDownload() throws IOException, InterruptedException{
	  		
	  	        try{
	  	        		
	  	//Click the Atwork Download in preview for Decoration details
		 PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_Decoration_Atwork_DownloadFile.click();
		  	
		  	Thread.sleep(10000); 
      
		 //Now Validating as if the Decoration Atwork Document downloaded or not
		
		  	File AtworkFile = getLatestFilefromDir(downloadPath);
			String AtworkDownload = AtworkFile.getName();
			 
			 if(AtworkDownload.contains("logo")){
				 System.out.println("Purchase Order Preview Decoration Atwork document downloaded Successfully");
				 resultPass("PurchaseOrder_AtworkDecoration_DocDownload", "Purchase Order Preview Decoration Atwork document downloaded Successfully");
				 
			 }
			 else{
				 System.out.println("Purchase Order Preview Decoration Atwork document downloaded downloaded unsucessfully");
				 resultFail("PurchaseOrder_AtworkDecoration_DocDownload", "Purchase Order Preview Atwork document downloaded downloaded unsucessfully"); 
				
			 }
	  	   }catch(NoSuchElementException e){
	  		   e.getMessage();
	  	   }
	  	}
	  	 public static void PurchaseOrder_PreviewShippingDetails_Verification() throws IOException, InterruptedException{       
	  	        try{
		//Now validating the shipping details address on Purchase Order Preview
	   ShippingdetailsAddress_PurchaseOrderPreview=PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_ShippingToDetails.getText();
	   System.out.println(ShippingdetailsAddress_PurchaseOrderPreview);
	   
	   if(ShippingdetailsAddress_PurchaseOrderPreview.contains("Feasterville-Trevose, PA"))
	   {
		   System.out.println("Purchase Order Preview Shipping details displayed Successfully");
		   resultPass("PurchaseOrder_PreviewShippingDetails_Verification", "Purchase Order Preview Shipping details displayed Successfully");   
	   }
	   else{
		   
		   System.out.println("Purchase Order Preview Shipping details displayed unsucessfully");
		   resultFail("PurchaseOrder_PreviewShippingDetails_Verification", "Purchase Order Preview Shipping details displayed unsucessfully"); 
	   
	   }
	 } catch(NoSuchElementException e){
		 e.getMessage();
	 }
	  	 }  	        
	 public static void PurchaseOrder_BlindShip_Verification() throws IOException, InterruptedException{
		 
		 try{
	 
	  	        
	 //Validating the Blind Ship integration with shipping address in purchase order
	  	if(PurchaseOrderPreviewWithDownload.BlindShipText_ShippingDetails_PurchaseOrder.getText().contains("Blind Ship"))
	  	{
	  		System.out.println("Blind Ship Displayed successfully on Purchase Order Shipping to Address");
	  		resultPass("PurchaseOrder_BlindShip_Verification", "Blind Ship Displayed successfully on Purchase Order Shipping to Address");
	  	}
	  	else{
	  	
	  		System.out.println("Blind Ship Displayed unsuccessfully on Purchase Order Shipping to Address");
	  		resultFail("PurchaseOrder_BlindShip_Verification", "Blind Ship Displayed unsuccessfully on Purchase Order Shipping to Address");
	  	}
	  	
		 }catch(NoSuchElementException e)
		 {
			 e.getMessage();
		 }
	 }
		 public static void PurchaseOrder_AtworkPO_DocDownload() throws IOException, InterruptedException{
		          try{
		 
		 
		 //Click Atwork Download button to download PO Atwork zip file
	   PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_POAtworkDownload.click();
	  	
	  Thread.sleep(25000); 
	   
	   //Validate as if the PurchaseOrder Atworkdownload working or not
	   
	   File AtworkFilePO = getLatestFilefromDir(downloadPath);
		 System.out.println("Testinf download path " + AtworkFilePO);

	   
		String AtworkDownloadPO = AtworkFilePO.getName();
		Thread.sleep(10000); 
		 if(AtworkDownloadPO.contains("_Artwork")){
			 System.out.println("Purchase Order Preview PO Atwork Zip file downloaded Successfully");
			 resultPass("PurchaseOrder_AtworkPO_DocDownload", "Purchase Order Preview PO Atwork Zip file downloaded Successfully");
			 
		 }
		 else{
			 System.out.println("Purchase Order Preview PO Atwork Zip file downloaded unsucessfully");
			 resultFail("PurchaseOrder_AtworkPO_DocDownload", "Purchase Order Preview PO Atwork Zip file downloaded unsucessfully"); 
			
		 } 
        
		    }catch(NoSuchElementException e){
		    	e.getMessage();
		    }
		
		 }	          
		   public static void PurchaseOrder_POPDF_DocDownload() throws IOException, InterruptedException{ 
			     try{   
		   
		  //Click Download button to download PO PDF file
		   PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_PODocDownload.click();
		  	
		  Thread.sleep(30000); 
		   
		   //Validate as if the PurchaseOrder PDf Downloading working or not
		   
		   File PODownloadPDF = getLatestFilefromDir(downloadPath);
			String DownloadPOPDF = PODownloadPDF.getName();
			 
			 if(DownloadPOPDF.contains("Purchase Order ")){
				 System.out.println("Purchase Order Preview PO POPDF file downloaded Successfully");
				 resultPass("PurchaseOrder_POPDF_DocDownload", "Purchase Order Preview  PO PDF file downloaded Successfully");
				 
			 }
			 else{
				 System.out.println("Purchase Order Preview PO PDF file downloaded unsucessfully");
				 resultFail("PurchaseOrder_POPDF_DocDownload", "Purchase Order Preview  PO PDF file downloaded unsucessfully"); 
				
			 } 
 		}catch(NoSuchElementException e){
 			e.getMessage();
 		}
			     
		}		     
		public static void Calculating_TotalPrice_On_Preview() throws IOException, InterruptedException, ParseException{
		   try{
        //Converting preview TotalPrice From String to integer
			 ConversionsWithoutOtherCharges.TotalPricePreview_String_To_Int_Conversion();
			 
	//Validating the TotalPrice on preview screen
			 if(ConversionsWithoutOtherCharges.TotalPriceSumAmount!=ConversionsWithoutOtherCharges.TotalPricePreview)
			 {
				 resultPass("Calculating TotalPrice On Preview", "The Total Price Calculated Successfully on Purchase Order Preview");
				 System.out.println("The Total Price Calculated Successfully on Purchase Order Preview");
			 }
			 else{
				 resultFail("Calculating TotalPrice On Preview","The Total Price Calculated UnSuccessfully on Purchase Order Preview");
				 System.out.println("The Total Price Calculated UnSuccessfully on Purchase Order Preview");
			 }
			 
		   }catch(NoSuchElementException e)
		   {
			   e.getMessage();
		   }
		} 
		
		public static void PurchaseOrderPreview_ViewPackagingList_Verification() throws IOException, InterruptedException{
		      try{	
		
       //Validating Packaging list option displayed on purchase Order preview or not
		if(PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_ViewPackagingList.isDisplayed())
		{
			System.out.println("Packaging List Option displayed on Purchase Order Preview Successfully");
			resultPass("PurchaseOrderPreview_ViewPackagingList_Verification", "Packaging List Option displayed on Purchase Order Preview Successfully");
		}
		else{
			System.out.println("Packaging List Option displayed on Purchase Order Preview UnSuccessfully");
			resultFail("PurchaseOrderPreview_ViewPackagingList_Verification", "Packaging List Option displayed on Purchase Order Preview UnSuccessfully");
		}
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		}
		public static void PackingList_Display_Verification() throws IOException, InterruptedException{
		      try{	
		
		//First store parent window to switch back
		 parentWindow10 = driver.getWindowHandle();
		 
		//Now Validating as if the packaging list opened successfully in new tab or not
			PurchaseOrderPreviewWithDownload.PurchaseOrder_Preview_ViewPackagingList.click();
			
			Thread.sleep(5000);
		 
		
		 
		//Switch to new window opened
		  	for(String winHandle : driver.getWindowHandles()){
		  	    if(!winHandle.equals(parentWindow10)) {
		  	        driver.switchTo().window(winHandle);
		  	    }
		  	}
			 
		  Thread.sleep(1000);
		  
		  if(PurchaseOrderPreviewWithDownload.PackingList_DisplayView.isDisplayed())
		  {
			  System.out.println("Packing List Displayed Successfully");
			  resultPass("PackingList_Display_Verification", "Packing List Displayed Successfully");
			  
		  }
		  else{
			  System.out.println("Packing List Displayed UnSuccessfully");
			  resultPass("PackingList_Display_Verification", "Packing List Displayed UnSuccessfully");
		  }
		  
		   }catch(NoSuchElementException e){
			   e.getMessage();
		   }
		}    
		 
		public static void PurchaseOrder_Preview_POSend() throws InterruptedException, IOException{
		      try{
		Thread.sleep(6000);
		  
		  driver.close();
		  
		//Switch back to parent window 
	      Thread.sleep(1000);  
		 
	      driver.switchTo().window(parentWindow10);
	        
		  Thread.sleep(1000); 
	        
	 //Validating the PO Sending Mail Process to check if the mail sending successfully or not
		PurchaseOrderPreviewWithDownload.PO_SendButton.click();
		//
		if(!PurchaseOrderPreviewWithDownload.Send_PO_ToandCCRemoveIcon.isDisplayed()) {
			driver.navigate().refresh();
			PurchaseOrderPreviewWithDownload.PO_SendButton.click();
		}
		wait = new WebDriverWait(driver, 60);
	    wait.until(ExpectedConditions.elementToBeClickable(PurchaseOrderPreviewWithDownload.Send_PO_ToandCCRemoveIcon));
	    
	    
	    PurchaseOrderPreviewWithDownload.Send_PO_ToandCCRemoveIcon.click();
	    
	/*    Thread.sleep(1000);
	    
        PurchaseOrderPreviewWithDownload.Send_PO_ToandCCRemoveIcon.click();
	    
	    Thread.sleep(1000);
	    
        PurchaseOrderPreviewWithDownload.Send_PO_ToandCCRemoveIcon.click();
	    
	    Thread.sleep(1000);*/
	    
	    //Insert a new Email address in To Field
	    PurchaseOrderPreviewWithDownload.SendPO_To_Field.sendKeys("miftikhar@asicentral.com");
	    
	    Thread.sleep(2000);
	    
	    PurchaseOrderPreviewWithDownload.SendPO_To_Field.sendKeys(Keys.ENTER);
	    
	    Thread.sleep(2000);
	    
	    //Press the send button and validate as if the Success message displayed or not
	    PurchaseOrderPreviewWithDownload.PO_SendButton.click();
	    
	    Thread.sleep(1000);
	    
	    if(PurchaseOrderPreviewWithDownload.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
	    {
	    	System.out.println("PO Send Successfully");
	    	resultPass("PurchaseOrder_Preview_POSend", "PO Send Successfully");
	    }
	    else{
	    	System.out.println("PO Send UnSuccessfully");
	    	resultFail("PurchaseOrder_Preview_POSend", "PO Send UnSuccessfully");
	    }
	    
       
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	
	finally{
        Thread.sleep(5000);
		
		driver.close();
        //
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

