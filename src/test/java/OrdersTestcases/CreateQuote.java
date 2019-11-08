package OrdersTestcases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;



public class CreateQuote extends OrdersExecution1 {

	 static File QuoteDownloadPDF;
	 static String DownloadQuotePDF;
	static Set<String>windowhandles;
	static Iterator<String>It;
	static String ParentWindow;
	static String ChildWindow;
	static WebElement DocumentSelection_Dropdown;
	static Select DocumentDropdownValue_Selection;
	 static OrdersLocators CreateQuote = PageFactory.initElements(driver, OrdersLocators.class);
	
	 
	 public static void CustomerFacingDoc_CPN_Visible_Enable_FromSettings() throws InterruptedException{
		 try{
		
		//Go to settings
			 
			 Thread.sleep(10000);
			 
			 CreateQuote.OrderListing_UserInfoIcon.click();
			 
			 Thread.sleep(1000);
			 
			 CreateQuote.UserInfoIcon_Settings.click();
			 
			 Thread.sleep(2000);
			 
	   //Press the Document Design option in settings
			 CreateQuote.Settings_DocumentDesign_Option.click();
			 
			 Thread.sleep(1000);
			 
		 DocumentSelection_Dropdown=CreateQuote.Settings_DocumentDesign_DocumentSelectionDropdown;	 
			 
		 DocumentDropdownValue_Selection=new Select(DocumentSelection_Dropdown);
		 
		 DocumentDropdownValue_Selection.selectByVisibleText("Acknowledgment");
		 
		 if(!CreateQuote.CustomerFacingDoc_CPNNumber_Selection.isSelected()){
			 CreateQuote.CustomerFacingDoc_CPNNumber_Selection.click();
		 }
	     //Press the Save Button
		Click("Click the Saving Doc",CreateQuote.SavingDocSettings);
		 
		 //CreateQuote.SavingDocSettings.click();
		 
		 Thread.sleep(5000);
		 
		 DocumentSelection_Dropdown=CreateQuote.Settings_DocumentDesign_DocumentSelectionDropdown;	 
		 
		 DocumentDropdownValue_Selection=new Select(DocumentSelection_Dropdown);
		 
		 DocumentDropdownValue_Selection.selectByVisibleText("Invoice");
		 
		 if(!CreateQuote.CustomerFacingDoc_CPNNumber_Selection.isSelected()){
			 CreateQuote.CustomerFacingDoc_CPNNumber_Selection.click();
		 }
	     //Press the Save Button
		 CreateQuote.SavingDocSettings.click();
		 
		 Thread.sleep(5000);
		 
		 DocumentSelection_Dropdown=CreateQuote.Settings_DocumentDesign_DocumentSelectionDropdown;	 
		 
		 DocumentDropdownValue_Selection=new Select(DocumentSelection_Dropdown);
		 
		 DocumentDropdownValue_Selection.selectByVisibleText("Quote");
		 
		 if(!CreateQuote.CustomerFacingDoc_CPNNumber_Selection.isSelected()){
			 CreateQuote.CustomerFacingDoc_CPNNumber_Selection.click();
		 }
	     //Press the Save Button
		 CreateQuote.SavingDocSettings.click();
		 
		 Thread.sleep(5000);
			 
		 
		 }catch(NoSuchElementException e){
			 e.getMessage();
		 }
	 }
	 
	 
	 
public static void QuoteCreation_BillingAddressVerification() throws IOException, InterruptedException, ParseException{
        try{
		Thread.sleep(5000);
	 Click("Click order home page", CreateQuote.ESPWebHomePage_OrdersTab);
	 
	 Click("Click order button", CreateQuote.OrdersScreen_OrderButton);
	 Click("Click create quote button", CreateQuote.CreateOrder_QuoteOption);

	 waitForPageLoading();
			
	 //waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
	//Select the Sales Order option from toggle dropdown
	   Thread.sleep(2000);

	 //Select the company first on create order screen
	 Click("Select a company from list",  CreateQuote.CreateOrderScreen_CompanySearch_Textfield);
	   Thread.sleep(2000);
	 
	  CreateQuote.CreateOrderScreen_CompanyField_SendData.sendKeys("Auto-");
	 
	  
	 Thread.sleep(10000);
	  CreateQuote.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ARROW_DOWN);

	//Select company from company dropdown
	 CreateQuote.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ENTER);
	 
	//CreateOrder.CreateOrderScreen_CompanySearch_Selection.click();
	 waitForPageLoading();
	 
	 //waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
	 
	 Thread.sleep(2000);
//Rest	
	 
	 String QuoteBillingAddress=driver.findElement(By.cssSelector("order-contact[ng-model='vm.order.BillingContact']")).getText();
	 boolean testQuoteBillingAddress=driver.getPageSource().contains("Feasterville-Trevose, PA 19053");
	 System.out.println(testQuoteBillingAddress);
	 //String QuoteBillingAddress=driver.findElement(By.cssSelector("div[class*='div.col-xs-12 col-sm-6 border-right']")).getText();
	//String QuoteBillingAddress=CreateQuote.CreateQuote_BillingContactAddress.getText();
	
	if(!QuoteBillingAddress.isEmpty())
	{
	resultPass("CreateQuote_BillingAddress Verification",QuoteBillingAddress+"Billing Address displayed Successfully");
	System.out.println(QuoteBillingAddress+""+"Displayed Successfully");
	}
	else{
		resultFail("CreateQuote_BillingAddress Verification",QuoteBillingAddress+"Billing Address displayed UnSuccessfully");
	   	System.out.println(QuoteBillingAddress+""+"Displayed UnSuccessfully");
	}
        }catch(NoSuchElementException e)
        {
        	e.getMessage();
        }
	}
	
	public static void QuoteCreation_ShippingAddressVerification() throws IOException, InterruptedException{
		try{
	
	String QuoteShippingAddress=driver.findElement(By.cssSelector("address[ng-show='$ctrl.ngModel.Address']")).getText();
	boolean testQuoteShippingAddress=driver.getPageSource().contains("Feasterville-Trevose, PA 19053");
	 System.out.println(testQuoteShippingAddress);

	//String QuoteShippingAddress=CreateQuote.CreateQuote_ShippingContactAddress.getText();
	if(!QuoteShippingAddress.isEmpty())
	{
		System.out.println(QuoteShippingAddress+""+"Displayed Successfully");
		resultPass("CreateQuote_ShippingAddress Verification", QuoteShippingAddress+"displayed Successfully");
	   		
	}
	else{
		System.out.println(QuoteShippingAddress+""+"Displayed UnSuccessfully");
		resultFail("CreateQuote_ShippingAddress Verification", QuoteShippingAddress+"displayed UnSuccessfully");
	   	
	}
		}
		catch(NoSuchElementException e){
		  e.getStackTrace();
		}
	}
	public static void ProductAddedToQuote() throws IOException, InterruptedException{
		try{
			
		
//Press Add Product Button
	CreateQuote. CreateOrder_AddProductButton.click();
	
	waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
	
	Thread.sleep(2000);

//Go To Product Search Tab in popup
    CreateQuote.AddProduct_Clipboard_US_Product.click();
    //Thread.sleep(5000);

  //Press the Add Products Button to complete the process
   CreateQuote.CreateOrder_AddProductPopup_AddProductsButton.click();
   
   waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
   
   Thread.sleep(2000);

	
String ProductAddedToOrderSuccess=CreateQuote.CreateOrder_ProductAddedToOrder_Successfull.getText();

if(ProductAddedToOrderSuccess.contains("Success"))
{
	   System.out.println("Product Added To Quote Successfully");
	   resultPass("Product Added To Quote", "Product Added To Quote Successfully");
}
else{
	   System.out.println("Product Added To Quote UnSuccessfully");
	   resultFail("Product Added To Quote", "Product Added To Quote UnSuccessfully");
}

		}catch(NoSuchElementException e){
			e.getStackTrace();
		}
	}
	
	public static void QuoteCreation_Verification() throws IOException, InterruptedException{
		try{
			
		
Thread.sleep(5000);
Click("Confiure Product", CreateQuote.CreateOrders_ConfigureButton);


List<WebElement> records = CreateQuote.Price_Grid;
int record=records.size();
//Enter The Quantity on Quatity screen
if(record>=1) {
	
	
	  Click("Click at Select button of price grid", CreateQuote.ClickAtSelect);
	Thread.sleep(2000);
	
	
		CreateQuote.CreateOrder_Configure_Continue_Button.click();
		Thread.sleep(2000);
	CreateQuote.CreateOrder_Configure_QTY_TextField.sendKeys("5");
}
else {
	
	CreateQuote.CreateOrder_Configure_Continue_Button.click();
	Thread.sleep(2000);
	CreateQuote.CreateOrder_Configure_QTY_TextField.sendKeys("5");
}

	//Enter The Quantity on Quatity screen
	
	Thread.sleep(5000);
	
	//Press the continue Button
	CreateQuote.CreateOrder_Configure_Continue_Button.click();
	Thread.sleep(5000);
	//Decoration Optional Screen Appear Press the save button now to create a Order
	CreateQuote.CreateOrder_DecoratorScreen_Save_Button.click();
	Thread.sleep(5000);
	if(CreateQuote.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
	{
	 System.out.println("Quote Created Successfully");
	 resultPass("Create Quote", "Quote Created Successfully");
	}
	else{
	
		System.out.println("Quote Created UnSuccessfully");
		resultFail("Create Quote", "Quote Created UnSuccessfully");
	}	
	waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
    
 }
	
	   catch(NoSuchElementException e){
	    	 System.err.println("NoSuchElementException: " + e.getMessage());
	   }
	}  
	
	public static void ShipAccountNo_Checkbox_Uncheck_ByDefault_Verification() throws IOException, InterruptedException{
		try{
			
		if(!CreateQuote.AccountNo_Visible_Checkbox.isSelected())
		{
			System.out.println("Quote Visible shipping Account # Checkbox Unchecked By Default Successfully");
			
			resultPass("ShipAccountNo_Checkbox_Uncheck_ByDefault_Verification", "Quote Visible shipping Account # Checkbox Unchecked By Default Successfully");
		}
		else{
            System.out.println("Quote Visible shipping Account # Checkbox Unchecked By Default UnSuccessfully");
			
			resultFail("ShipAccountNo_Checkbox_Uncheck_ByDefault_Verification", "Quote Visible shipping Account # Checkbox Unchecked By Default UnSuccessfully");
		}
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	
		
	public static void ShipAccountNotVisible_Visible_Checkbox_UncheckFor_AccountNo() throws InterruptedException, IOException{
		try{
			Click("Click the Preview Button on quote detail Page for Account No Verification", CreateQuote.Quote_Preview_Button);
			
			waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
			
			Thread.sleep(35000);
			
			windowhandles=driver.getWindowHandles();
			
			It=windowhandles.iterator();
			
		    ParentWindow=It.next();
			
			System.out.println(ParentWindow);
			
		    ChildWindow=It.next();
			
			System.out.println(ChildWindow);
			
			driver.switchTo().window(ChildWindow);
			
			Thread.sleep(15000);
			
			List<WebElement>ShipAccountNo=CreateQuote.ShipAccount_QuotePreview_Verification_ListCount;
			
			int count=ShipAccountNo.size();
			
			System.out.println(count);
			
			if(count==0)
			{
				System.out.println("Ship Account # Not Displayed on Quote Preview");
				
				resultPass("ShipAccountNotVisible_Visible_Checkbox_UncheckFor_AccountNo_QuotePreview", "Ship Account # Not Displayed on Quote Preview");
			}
			else{
	            System.out.println("Ship Account # Visible UnSuccessfully on Quote Preview");
				
				resultFail("ShipAccountNotVisible_Visible_Checkbox_UncheckFor_AccountNo_QuotePreview", "Ship Account #  Displayed on Quote Preview");
			}
			
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	
		
	
	}
	
	public static void CPN_Number_QuoteDoc_Preview_Verification() throws IOException, InterruptedException{
		try{
			
		   if(CreateQuote.CustomerFacingDoc_CPN_Visible_Verification.isDisplayed())
		   {
			   System.out.println("CPN Number Displayed on Quote Doc after Enabling CPN Number Radio Button from Settings Successfully");
			   resultPass("CPN_Number_QuoteDoc_Preview_Verification", "CPN Number Displayed on Quote Doc after Enabling CPN Number Radio Button from Settings Successfully");
		   }
		   else{
			   System.out.println("CPN Number Displayed on Quote Doc after Enabling CPN Number Radio Button from Settings UnSuccessfully");
			   resultFail("CPN_Number_QuoteDoc_Preview_Verification", "CPN Number Displayed on Quote Doc after Enabling CPN Number Radio Button from Settings UnSuccessfully");
		   }
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		finally {
			driver.close();
			
			Thread.sleep(2000);
			
			driver.switchTo().window(ParentWindow);
		}
	
	
	
	}

public static void VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_QuotePreview_Verification() throws InterruptedException, IOException{
	 try{
		 
		 Click("Click the Edit Button",  CreateQuote.OrdersDetails_EditButton);

 		wait = new WebDriverWait(driver, 180);
 		wait.until(ExpectedConditions.elementToBeClickable(CreateQuote.EditOrder_DecorationTab));
 		   
 		Thread.sleep(2000);
 		    
 		//Goto Shipping Tab
 		CreateQuote.EditOrder_DecorationTab.click();
 		
 		//Enter the Vendor Notes in vendor notes Textarea
 		CreateQuote.EditOrder_Decoration_VendorNotes.sendKeys("Test Vendor Notes");
 		
 		//Select the Visible Checkbox for Vendor Notes
 		Click("Select the Visible checkbox for Vendor Notes In Decoration tab", CreateQuote.VendorNotes_Visible_Checkbox);
 		

 		//Enter the Decoration Instructions
 		CreateQuote.DecorationInstructions_Textarea.sendKeys("Test Decorator Instructions");
 		
 		Click("Select the Visible checkbox for Decorator Instructions In Decoration tab", CreateQuote.DecorationInstructions_Visible_Checkbox);
 		
 		Click("Click the Save Button", CreateQuote.ProductConfiguration_AddCharge_SaveButton);
	    
 		
 		//waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
 		Thread.sleep(8000);
	    
	    Click("Click the Preview Button on quote detail Page for Account No Verification", CreateQuote.Quote_Preview_Button);
		
	//    waitForPageLoadSave();
	    
	    // waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
		
		Thread.sleep(40000);
		
		windowhandles=driver.getWindowHandles();
		
		It=windowhandles.iterator();
		
	    ParentWindow=It.next();
		
		System.out.println(ParentWindow);
		
	    ChildWindow=It.next();
		
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);

		Thread.sleep(1000);
		
		if(CreateQuote.VendorNotes_DecoratorInstructions_QuotePreview_Verification.getText().contains("Notes: Test Vendor Notes") && CreateQuote.DecoratorInstructions_QuotePreview_Verification.getText().contains("Instructions: Test Decorator Instructions") )
		{
			System.out.println("VendorNotes and Decorartor Instructions Displayed on Quote Preview Successfully");
			
			resultPass("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_QuotePreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Quote Preview Successfully");
		}
		else{
            System.out.println("VendorNotes and Decorartor Instructions Displayed on Quote Preview UnSuccessfully");
			
			resultFail("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_QuotePreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Quote Preview UnSuccessfully");
		}
		
	 }catch(NoSuchElementException e){
		 e.getMessage();
	 }

	 finally {
			driver.close();
			
			Thread.sleep(2000);
			
			driver.switchTo().window(ParentWindow);
		}
 
 
 }
	
	public static void ShipAccountNo_Visibility_QuoteDocument_Verification() throws InterruptedException, IOException{
		try{
			
		Click("Click the Account No Visibilty Checkbox",CreateQuote.AccountNo_Visible_Checkbox );
		
		Thread.sleep(2000);
		
		Click("Click the Ok button to confirm Account Number Visibilty", CreateQuote.AccountNo_Visible_Confirm);
		
		Thread.sleep(2000);
		
		Click("Click the Preview Button on quote detail Page for Account No Verification", CreateQuote.Quote_Preview_Button);
		
		waitForPageLoadSave();
		
		//waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
		
		Thread.sleep(6000);
		
		windowhandles=driver.getWindowHandles();
		
		It=windowhandles.iterator();
		
	    ParentWindow=It.next();
		
		System.out.println(ParentWindow);
		
	    ChildWindow=It.next();
		
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		
		Thread.sleep(2000);
		
		if(CreateQuote.ShipAccount_QuotePreview_Verification.isDisplayed() & CreateQuote.ShipAccount_QuotePreview_Verification.getText().contains("Ship Account:"))
		{
			System.out.println("Ship Account # Visible Successfully on Quote Preview");
			
			resultPass("ShipAccountNo_Visibility_QuoteDocument_Verification", "Ship Account # Visible Successfully on Quote Preview");
		}
		else{
            System.out.println("Ship Account # Visible UnSuccessfully on Quote Preview");
			
			resultFail("ShipAccountNo_Visibility_QuoteDocument_Verification", "Ship Account # Visible UnSuccessfully on Quote Preview");
		}
		
		
		}catch(NoSuchElementException e)
		{
			e.getMessage();
		}
	finally {
		driver.close();
		
		Thread.sleep(8000);
		
		driver.switchTo().window(ParentWindow);
	}
		
	}
		
    public static void AccountNo_Visible_Checkbox_Selected_Verification_At_ProductLevel() throws InterruptedException, IOException{
    	try{
    		
    		Click("Click the Edit Button",  CreateQuote.OrdersDetails_EditButton);

    		wait = new WebDriverWait(driver, 180);
    		wait.until(ExpectedConditions.elementToBeClickable(CreateQuote.EditOrder_ShippingTab));
    		   
    		Thread.sleep(2000);
    		    
    		//Goto Shipping Tab
    		CreateQuote.EditOrder_ShippingTab.click();
    		    
    		Thread.sleep(2000);
    		
    		//Validate if the Account No Visible box shuld be selected
    		if(CreateQuote.AccountNo_Visible_Checkbox.isSelected())
    		{
    			System.out.println("Account# Visible Checkbox Selected at product Level Successfully");
    			
    			resultPass("AccountNo_Visible_Checkbox_Selected_Verification_At_ProductLevel","Account# Visible Checkbox Selected at product Level Successfully");
    		}
    	
    		else{
                System.out.println("Account# Visible Checkbox Selected at product Level UnSuccessfully");
    			
    			resultFail("AccountNo_Visible_Checkbox_Selected_Verification_At_ProductLevel","Account# Visible Checkbox Selected at product Level UnSuccessfully");
    		}
    	
    	
    	}catch(NoSuchElementException e)
    	{
    		e.getMessage();
    	}
    
        finally {
        	CreateQuote.ProductConfiguration_AddCharge_SaveButton.click();
    	    
        	waitForElementNotVisible(120, driver,CreateQuote.SpinnerLoader);
    	    
    	    Thread.sleep(2000);
		}
    }
    
    public static void QuoteDownload() throws InterruptedException, IOException{
    	try{
    		
    	//Click the download button to download the Quote Document
    		Click("Click the Quote Download Button", CreateQuote.QuoteDownload_Button);
    		
    		Thread.sleep(20000);
    		
    		 File QuoteDoc = getLatestFilefromDir(downloadPath);
    			String QuoteDocDownload = QuoteDoc.getName();
    			 
    			 if(QuoteDocDownload.contains("Quote #")){
    				 System.out.println("Quote Document downloaded Successfully");
    				 resultPass("QuoteDownload", "Quote Document downloaded Successfully");
    				 
    			 }
    			 else{
    				 System.out.println("Quote Document downloaded unsucessfully");
    				 resultFail("QuoteDownload", "Quote Document downloaded unsucessfully"); 
    				
    			 }
    	
    	
    	
    	}catch(NoSuchElementException e){
    		e.getMessage();
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
