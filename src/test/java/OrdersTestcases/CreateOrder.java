package OrdersTestcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;
import PageFactoryandTestdata.OrdersTestdata;



public class CreateOrder extends OrdersExecution1 {

	static OrdersLocators CreateOrder = PageFactory.initElements(driver, OrdersLocators.class);	
	
	public static void CreateOrder_BillingAddress_Verification() throws IOException, InterruptedException, AWTException{
           try{
		 
    //waitForPageLoading();
    
  
   Thread.sleep(10000);
  
	   CreateOrder.CreateOrder_SalesOrderOption.click();
	   
	   
	   //Select the company first on create order screen
   	 CreateOrder.CreateOrderScreen_CompanySearch_Textfield.click();
   	 
   	 Thread.sleep(2000);
   	 
   	 CreateOrder.CreateOrderScreen_CompanyField_SendData.sendKeys("Auto-");
   	 
   	 Thread.sleep(6000);
    	CreateOrder.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ARROW_DOWN);
    	Thread.sleep(1000);
   	//Select company from company dropdown
   	CreateOrder.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ENTER);
   	 
   	//CreateOrder.CreateOrderScreen_CompanySearch_Selection.click();
  
    waitForPageLoading();
   	// waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
    
    Thread.sleep(2000);

   //Rest	
   	String BillingAddress=CreateOrder.CreateOrderScreen_BillingCompanyAddress.getText();
   	
   	if(!BillingAddress.isEmpty())
   	{
   	resultPass("CreateOrder_BillingAddress Verification",BillingAddress+"Billing Address displayed Successfully");
   	System.out.println(BillingAddress+""+"Displayed Successfully");
   	}
   	else{
   		resultFail("CreateOrder_BillingAddress Verification",BillingAddress+"Billing Address displayed UnSuccessfully");
   	   	System.out.println(BillingAddress+""+"Displayed UnSuccessfully");
   	}
   	
           }catch(NoSuchElementException e)
           {
           e.getMessage();
           }
	}
	public static void CreateOrder_ShippingAddress_Verification() throws IOException, InterruptedException{
		try{
   //boolean ShippingAddress=driver.getPageSource().contains("4800 street road");
   	String ShippingAddress=CreateOrder.CreateOrderScreen_ShippingCompanyAddress.getText();
   	if(!ShippingAddress.isEmpty())
   	{
   		System.out.println(ShippingAddress+""+"Displayed Successfully");
   		resultPass("CreateOrder_ShippingAddress Verification", ShippingAddress+"displayed Successfully");
   	   		
   	}
   	else{
   		System.out.println(ShippingAddress+""+"Displayed UnSuccessfully");
   		resultFail("CreateOrder_ShippingAddress Verification", ShippingAddress+"displayed UnSuccessfully");
   	   	
   	}
		}catch(NoSuchElementException e){
		
		  e.getMessage();
		}
	}
   	public static void CreateOrder_AcknowlodgementAddress_Verification() throws IOException, InterruptedException{
   		try{
   			
   	
   	String AckAddress=driver.findElement(By.cssSelector("address[ng-show='$ctrl.ngModel.Address']")).getText();
   //String AckAddress=CreateOrder.CreateOrderScreen_AckCompanyAddress.getText();
  
   
   if(!AckAddress.isEmpty())
   {
	   System.out.println(AckAddress+""+"Displayed Successfully");
  	   resultPass("CreateOrder_AcknowlodgementAddress Verification", AckAddress+"displayed UnSuccessfully"); 
   }
   else{
	   System.out.println(AckAddress+""+"Displayed Successfully");
  	   resultFail("CreateOrder_AcknowlodgementAddress Verication", AckAddress+"displayed UnSuccessfully"); 
   }
   		}catch(NoSuchElementException e){
   		  e.getMessage();
   		}
   	}
   	
   	public static void Net25_Net45_Net90_50PercentAdvance_50PercentUponCompletion_Net75_Terms_DropdownValues_Verification() throws IOException, InterruptedException{
   		try{
   			
   		   //Click the Terms Dropdown
   			CreateOrder.Terms_Dropdown.click();
   			
   			
   			List<WebElement> list =CreateOrder.TermsDropdownValues;
  		  
   	      // List<WebElement>list=driver.findElements(By.xpath("//div[contains(@ng-bind-html,'select.search')]"));
   			int size=list.size();
   	       
   	       System.out.println("size of list is:"+size);
   	       
   	       for(int i=0;i<size;i++){
   	    	   System.out.println(list.get(i).getText());
   	    	   if(list.get(i).getText().contains("Net 25") & list.get(i).getText().contains("Net 45") & list.get(i).getText().contains("Net 90") & list.get(i).getText().contains("50% Advance / 50% Upon Completion") & list.get(i).getText().contains("Net 75"))
   	    	   {
   	    		   System.out.println("Net 25,Net 45,Net 90 ,Net 75 & 50% Advance / 50% Upon Completion Values in Terms Displayed Successfully");
   	    		   resultPass("Net25_Net45_Net90_50PercentAdvance_50PercentUponCompletion_Net75_Terms_DropdownValues_Verification", "Net 25,Net 45,Net 90 ,Net 75 & 50% Advance / 50% Upon Completion Values in Terms Displayed Successfully");
   	    	   }
   	    	   else{
   	    		   System.out.println("Net 25,Net 45,Net 90 ,Net 75 & 50% Advance / 50% Upon Completion Values in Terms Displayed UnSuccessfully");
   	    		   resultFail("Net25_Net45_Net90_50PercentAdvance_50PercentUponCompletion_Net75_Terms_DropdownValues_Verification", "Net 25,Net 45,Net 90 ,Net 75 & 50% Advance / 50% Upon Completion Values in Terms Displayed UnSuccessfully");
   	    	   
   	    		   
   	    	   }
   	       }
   		}catch(NoSuchElementException e){
   			e.getStackTrace();
   		}
   	}
   	
	public static void FedExOvernight_FedExFLEXExpress_ShipVia_DropdownValues_Verification() throws IOException, InterruptedException{
   		try{
   			
   		   //Click the Terms Dropdown
   			CreateOrder.ShipVia_Dropdown.click();
   			
   			
   			List<WebElement> list =CreateOrder.ShipViaDropdown_Values;
  		  
   	       int size=list.size();
   	       
   	       System.out.println("size of list is:"+size);
   	       
   	       for(int i=0;i<size;i++){
   	    	   System.out.println(list.get(i).getText());
   	    	   if(list.get(i).getText().contains("FedEx Overnight") & list.get(i).getText().contains("FedEx FLEX Express (Alphaborder Only)") & list.get(i).getText().contains("3 Day Select") & list.get(i).getText().contains("2nd Day Air AM") & list.get(i).getText().contains("2nd Day Air")& list.get(i).getText().contains("Next Day Air")& list.get(i).getText().contains("Next Day Air Saver") & list.get(i).getText().contains("Next Day Early AM") & list.get(i).getText().contains("Express Critical") & list.get(i).getText().contains("Routing Guide"))
   	    	   {
   	    		   System.out.println("FedEx Overnight ,FedEx FLEX Express (Alphaborder Only),3 Day Select, 2nd Day Air AM, 2nd Day Air, Next Day Air, Next Day Air Saver, Next Day Early AM, Express Critical, Routing Guide Values in Ship Via Displayed Successfully");
   	    		   resultPass("FedExOvernight_FedExFLEXExpress_ShipVia_DropdownValues_Verification", "FedEx Overnight & FedEx FLEX Express (Alphaborder Only) Values in Ship Via Displayed Successfully");
   	    		   break;
   	    	   }
   	    	   else{
   	    		   System.out.println("FedEx Overnight & FedEx FLEX Express (Alphaborder Only),3 Day Select, 2nd Day Air AM, 2nd Day Air, Next Day Air, Next Day Air Saver, Next Day Early AM, Express Critical, Routing Guide Values in Ship Via Displayed UnSuccessfully");
   	    		   resultFail("FedExOvernight_FedExFLEXExpress_ShipVia_DropdownValues_Verification", "FedEx Overnight & FedEx FLEX Express (Alphaborder Only) Values in Ship Via Displayed UnSuccessfully");
   	    	   
   	    		   
   	    	   }
   	       }
   		}catch(NoSuchElementException e){
   			e.getStackTrace();
   		}
   	}
   	
   	
   	
   	public static void Product_Added_To_Order() throws InterruptedException, IOException{
   		try{
   			
   		 

   		Thread.sleep(3000);
   //Press Add Product Button
   Click("a", CreateOrder. CreateOrder_AddProductButton);

  // CreateOrder. CreateOrder_AddProductButton.click();
   
   waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
   
   //Go To Product Search Tab in popup
   CreateOrder.CreateOrder_AddProductPopup_ProductSearchTab.click();
   waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
   //Search the Product which want to associate with order
   CreateOrder.CreateOrder_AddProductPopup_SearchKeywordField.sendKeys(OrdersTestdata.OrderProduct);
   
   waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
   
   //Now press Search Button
   CreateOrder.CreateOrder_AddProductPopup_SearchButton.click();
	
   wait = new WebDriverWait(driver, 180);
   wait.until(ExpectedConditions.elementToBeClickable(CreateOrder.CreateOrder_AddProductPopup_ProductSelection));
   
   
   //Now Select the Product
   CreateOrder.CreateOrder_AddProductPopup_ProductSelection.click();
   
   Thread.sleep(2000);
   
   //Press the Add Products Button to complete the process
   CreateOrder.CreateOrder_AddProductPopup_AddProductsButton.click();
   
   waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
	
   String ProductAddedToOrderSuccess=CreateOrder.CreateOrder_ProductAddedToOrder_Successfull.getText();
   
   if(ProductAddedToOrderSuccess.contains("Success"))
   {
	   System.out.println("Product Added To Order Successfully");
	   resultPass("Product Added To Order", "Product Added To Order Successfully");
   }
   else{
	   System.out.println("Product Added To Order UnSuccessfully");
	   resultFail("Product Added To Order", "Product Added To Order UnSuccessfully");
   }
   		
   	}catch(NoSuchElementException e){
   	   e.getMessage();
   	}
   		
   	}
   	
   	public static void Send_ASI_SmartBooks_link_Verification() throws IOException, InterruptedException{
   		try{
  
   if(!driver.findElement(By.xpath("//nav[contains(@class, 'navbar navbar-default navbar-bottom navbar-fixed-bottom navbar-fixed-bottom-buttons ng-scope')]")).getText().contains("Send to ASI SmartBooks")) {
	   
	   System.out.println("Send ASI SmartBooks link is not displayed when no products are configured\"");
		resultPass("Send ASI SmartBooks link is not displayed when no products are configured", "Send ASI SmartBooks link is not displayed when no products are configured");
			}
			else{
			
				resultFail("Send ASI SmartBooks link is  displayed when no products are configured", "Send ASI SmartBooks link is  displayed when no products are configured");
			}	
   		}catch(NoSuchElementException e){
   		  e.getMessage();
   		}
   	}
   	public static void Create_Order() throws InterruptedException, IOException{
   		try{
   			

   Click("a", CreateOrder.CreateOrders_ConfigureButton);
   waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
	 List<WebElement> records = CreateOrder.Price_Grid;
	 int record=records.size();
	//Enter The Quantity on Quatity screen
	 if(record>=1) {
			
			Thread.sleep(2000);
			  Click("Click at Select button of price grid", CreateOrder.ClickAtSelect);
			Thread.sleep(2000);
			CreateOrder.CreateOrder_Configure_QTY_TextField.sendKeys("5");
		}
		else {
			Thread.sleep(2000);
			CreateOrder.CreateOrder_Configure_QTY_TextField.sendKeys("5");
		}
   		
   		
	
	Thread.sleep(5000);
	
	//Press the continue Button
	CreateOrder.CreateOrder_Configure_Continue_Button.click();
	Thread.sleep(2000);
	//Decoration Optional Screen Appear Press the save button now to create a Order
	CreateOrder.CreateOrder_DecoratorScreen_Save_Button.click();
	
	if(CreateOrder.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
	{
	 System.out.println("Order Created Successfully");
	 resultPass("Create Order", "Order Created Successfully");
	}
	else{
	
		System.out.println("Order Created UnSuccessfully");
		resultFail("Create Order", "Order Created UnSuccessfully");
	}	
	
   		}catch(NoSuchElementException e){
    		   e.getMessage();
    		}
	
	
   	 waitForElementNotVisible(120, driver,CreateOrder.SpinnerLoader);
	
	
	
	}  
	



}