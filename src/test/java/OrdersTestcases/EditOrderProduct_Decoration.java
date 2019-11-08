package OrdersTestcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Functions.Conversions;
import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;



public class EditOrderProduct_Decoration extends OrdersExecution1 {

	static OrdersLocators EditOrderDecoration = PageFactory.initElements(driver, OrdersLocators.class);
	public static void Existing_Artwork_File_Upload_Verification() throws IOException, InterruptedException, ParseException, AWTException{
               try{
      Thread.sleep(4000);
      int count= EditOrderDecoration.ClosePopup.size();
      if(count>0) {
    	 	Click("Click on Edit button", EditOrderDecoration.ClosePopup.get(0));

      }

 	Click("Click on Edit button", EditOrderDecoration.OrdersDetails_EditButton);
	
 	 waitForElementNotVisible(120, driver,EditOrderDecoration.SpinnerLoader);
 	
    Thread.sleep(2000);
    
    //Go to Decoration Tab
    EditOrderDecoration.EditOrder_DecorationTab.click();
    
    Thread.sleep(1000);
    
    WebElement Location=EditOrderDecoration.EditOrder_Decoration_Location;
    Select dropdownValue= new Select(Location);
    
    dropdownValue.selectByIndex(1);
    
    Thread.sleep(5000);
    
    //Select the Imprint Method

    if( EditOrderDecoration.EditOrder_Decoration_ImprintMethod.isDisplayed()) {
        EditOrderDecoration.EditOrder_Decoration_ImprintMethod.click();

    }

    
    Thread.sleep(3000);
    //EditOrderDecoration.EditOrder_Decoration_ImprintMethod1.click();

   // Thread.sleep(3000);
    
    EditOrderDecoration.EditOrder_Decoration_Imprint_SelectValue.click();
    Thread.sleep(2000);
    //Now Add Vendor code

    EditOrderDecoration.EditOrder_Decoration_VendorNotes.sendKeys("VEN123");
    
    //Now Select the Proof Type
    WebElement ProofType=EditOrderDecoration.EditOrder_Decoration_ProofType;
    Select dropdownValue1= new Select(ProofType);
    
    dropdownValue1.selectByVisibleText("Email");
    
    Thread.sleep(1000);
    
    //Enter Logo Size
    EditOrderDecoration.EditOrder_Decoration_ImprintSize.sendKeys("150x200");
    
    
    
    //Enter Logo Color
    EditOrderDecoration.EditOrder_Decoration_ImprintColor.sendKeys("Brown");
    
    Thread.sleep(3000);
    
    //Insert Vendor Notes
    EditOrderDecoration.EditOrder_Decoration_VendorNotes.sendKeys("Test Vendor Notes");
   
    //Now Add the charges,Press the Add Charges
  //  EditOrderDecoration.EditOrder_Decoration_AddCharge_LinkText.click();
    
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", EditOrderDecoration.EditOrder_Decoration_AddCharge_LinkText);
    
    
    //Insert the Netcost
    EditOrderDecoration.EditOrder_Decoration_NetCostField.click();
    EditOrderDecoration.EditOrder_Decoration_NetCostField.sendKeys("50");
    
    Thread.sleep(2000);
    
    
    //Upload the Artwork image
    
    EditOrderDecoration.EditOrder_Decoration_ArtWorkImageUploadButton.click();
    Thread.sleep(2000);
  /*  EditOrderDecoration.UploadButton.click();
*/
 
    //Now Select the Existing Artwork and upload that at prologoduct level under decoration tab
    Click("Click the Existing Artwork", EditOrderDecoration.EditOrder_Decoration_Existing_Artwork_Selection);
    
    //Validate if the file existing file uploaded successfully or not
    if(EditOrderDecoration.EditOrder_Decoration_Artwork_Existence_Verification.isDisplayed())
    {
    	System.out.println("Existing Artwork file Uploaded Successfully");
    	
    	resultPass("Existing_Artwork_File_Upload_Verification", "Existing Artwork file Uploaded Successfully");
    }
    else{
        System.out.println("Existing Artwork file Uploaded Successfully");
    	
    	resultFail("Existing_Artwork_File_Upload_Verification", "Existing Artwork file Uploaded Successfully");
    }
    
       }catch(NoSuchElementException e){
    	   e.getMessage();
       }
	}          
    public static void Artwork_Download_UnderDecorationTab() throws IOException, InterruptedException{
    	try{
    		
	
	//Validating if the Artwork file Downloaded Successfully or not
    //Hover the element
    Hover(EditOrderDecoration.EditOrder_Decoration_ArtworkDownload);
    
    Thread.sleep(2000);
    
    //Click the Download button
    Click("Click the Artwork Download icon", EditOrderDecoration.EditOrder_Decoration_ArtworkDownload);
    
    Thread.sleep(5000);
    
    File Artwork = getLatestFilefromDir(downloadPath);
	String ArtworkDownload = Artwork.getName();
	 
	 if(ArtworkDownload.contains("foil")){
		 System.out.println("Artwork file downloaded Successfully");
		 resultPass("Artwork_Download_UnderDecorationTab", "Artwork file downloaded Successfully");
		 
	 }
	 else{
		 System.out.println("Artwork file downloaded unsucessfully");
		 resultFail("Artwork_Download_UnderDecorationTab", "Artwork file downloaded unsucessfully"); 
		
	 }
    
    	}catch(NoSuchElementException e)
    	{
    		e.getMessage();
    	}
    }
    public static void Artwork_File_Deletion() throws InterruptedException, IOException{
    	try{
    	
	 //Now delete the uploaded artwork and validate it
	//Hover the element
	    Hover(EditOrderDecoration.EditOrder_Decoration_ArtworkDelete_Icon);
	    
	    Thread.sleep(2000);
	    
	    //Click the Download button
	    Click("Click the Artwork Delete Icon", EditOrderDecoration.EditOrder_Decoration_ArtworkDelete_Icon);
	    
	    Thread.sleep(2000);
    
        //Now Click button to confirm the if the artwork deleted Successfully or not
	    Click("Click the Artwork Delete Ok Button", EditOrderDecoration.Artwork_Delete_Confirm);
    
        Thread.sleep(2000);
        
        //Validate if the Artwork deleted Successfully or not 
        List<WebElement> ArtworkDelete_Verification=EditOrderDecoration.EditOrder_Decoration_Artwork_Deletion_Verification;
        
        int count=ArtworkDelete_Verification.size();
	       
	    System.out.println(count);
	    
	    if(count==0)
	    {
	    	System.out.println("Artwork file Deleted Successfully");
	    	
	    	resultPass("Artwork_File_Deletion", "Artwork file Deleted Successfully");
	    }
    
	    else{
	    	System.out.println("Artwork file Deleted UnSuccessfully");
	    	
	    	resultFail("Artwork_File_Deletion", "Artwork file Deleted UnSuccessfully");
	    }
    
    	}catch(NoSuchElementException e)
    	{
    		e.getMessage();
    	}
    }
    public static void Decoration_Charge_With_Amount_calculation() throws IOException, InterruptedException, AWTException, ParseException{
    	try{
    
    EditOrderDecoration.EditOrder_Decoration_ArtWorkImageUploadButton.click();	
    
    Thread.sleep(2000);
    
    MoveToElement_Click(EditOrderDecoration.UploadButton);
    
    Thread.sleep(3000);
   
  
    OrderDeletion.Projectpath=System.getProperty("user.dir");
	System.out.println(OrderDeletion.Projectpath);
	 
	String Projectpath=System.getProperty("user.dir");
	ProcessBuilder pb = new ProcessBuilder(Projectpath+"/Img/upload.exe", Projectpath+"\\Img\\logo.jpg");
	Thread.sleep(5000);
	pb.start();
	Thread.sleep(15000);
	
	 waitForElementNotVisible(120, driver,EditOrderDecoration.SpinnerLoader);
	

	
	Thread.sleep(40000);
	
	EditOrderDecoration.EditOrder_Decoration_ArtWorkImageUploadButton.click();
    
	//EditOrderDecoration.EditOrder_Decoration_ArtWorkImageUploadButton.click();
	  
	Thread.sleep(2000);
	
	MoveToElement_Click(EditOrderDecoration.UploadButton);
	
	Thread.sleep(4000);
	
	
	 OrderDeletion.Projectpath=System.getProperty("user.dir");
		System.out.println(OrderDeletion.Projectpath);
		 
		Projectpath=System.getProperty("user.dir");
		pb = new ProcessBuilder(Projectpath+"/Img/upload.exe", Projectpath+"\\Img\\DocP.docx");
		Thread.sleep(5000);
		pb.start();
		Thread.sleep(15000);
	
		
		 waitForElementNotVisible(120, driver,EditOrderDecoration.SpinnerLoader);
		
		Thread.sleep(15000);
	
    
    //Press the Save Button
     Click("Click the Save Button",  EditOrderDecoration.ProductConfiguration_AddCharge_SaveButton);
    
     waitForElementNotVisible(120, driver,EditOrderDecoration.SpinnerLoader);
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
		 System.out.println("Decoration charges Added and calculated Successfully");
		 resultPass("Decoration Charge With Amount calculation", "Decoration charges Added and calculated Successfully");
	 }
	 else{
		 
		 System.out.println("Decoration charges Added and calculated UnSuccessfully");
		 resultFail("Decoration Charge With Amount calculation", "Decoration charges Added and calculated UnSuccessfully"); 
	 }
               }catch(NoSuchElementException e){
               e.getMessage();
               
               }
	}
               
     public static void Verificationof_Decoration_Display_Under_Decoration_Tab() throws InterruptedException, IOException{
    	 try{
               
     
//Validating in Decoration tab as if Decoration is displayed or not
 	 Click("Clik at deco tab", EditOrderDecoration.Orderdetails_DecorationTab);
 	 Thread.sleep(1000);
 	 
 	if(EditOrderDecoration.Orderdetails_DecorationTab_DecorationDisplayVerification.isDisplayed())
 	{
 		System.out.println("Decoration details Display Under Decoration Tab Successfully");
 		resultPass("Verification of Decoration Display Under Decoration Tab","Decoration details Display Under Decoration Tab Successfully" );
 	}
 	else{
 		System.out.println("Decoration details Display Under Decoration Tab UnSuccessfully");
 		resultFail("Verification of Decoration Display Under Decoration Tab","Decoration details Display Under Decoration Tab UnSuccessfully" );
 	}
	
               }
               catch (NoSuchElementException e) {
				// TODO: handle exception
              	 System.err.println("NoSuchElementException: " + e.getMessage());
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
