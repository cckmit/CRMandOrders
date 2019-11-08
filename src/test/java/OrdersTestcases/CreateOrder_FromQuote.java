package OrdersTestcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class CreateOrder_FromQuote  extends OrdersExecution1{

	public static String NaviagtionFromInvoiceToOrderScreen;
	public static String NaviagtionFromOrderToQuoteScreen;
	static OrdersLocators CreateOrderFromQuote = PageFactory.initElements(driver, OrdersLocators.class);	
	public static void CreateOrders_FromQuote_LinkedTraction_VerificationInvoice() throws IOException, InterruptedException{
        try{
		
	 Thread.sleep(6000);
	//Press CreateOrderButton in Quote to move to Order screen from Quote screen
	 Click("Click at invoice button",  CreateOrderFromQuote.CreateOrderButton_Quote);
		 
	// waitForPageLoading();
	 
	 // waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
	    
	    Thread.sleep(30000);
	   
		 	 
	//Press the Create Invoice Button
		 Click("Click at invoice button", CreateOrderFromQuote.Order_CreateInvoice);
		// waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
		    
		 waitForPageLoading(); 
		 
		 Thread.sleep(30000);
		 
   //Validate the Linked transaction item status on Invoice screen
		 WebElement HoverLinkedTransaction=CreateOrderFromQuote.QuoteOrderLinkedtransaction;
		 Hover(HoverLinkedTransaction);
		 
		 Thread.sleep(2000);
		 
  //Validate as if the Linkedtrasaction link occur or not
		 if(CreateOrderFromQuote.LinkedTransactionDisplayedVerification.isDisplayed())
		 {
			 System.out.println("Linked Transaction Displayed on Invoice screen Successfully");
			 resultPass("Linked Transaction Invoice Screen Verification", "Linked Transaction Displayed on Invoice screen Successfully");
		 }
		 else{
			 System.out.println("Linked Transaction Displayed on Invoice screen UnSuccessfully");
			 resultFail("Linked Transaction Invoice Screen Verification", "Linked Transaction Displayed on Invoice screen UnSuccessfully");
		 }
		 
        }catch(NoSuchElementException e){
           e.getStackTrace();
        }
	}
	public static void ShipAccountNo_Visibility_InvoiceDocument_Verification() throws InterruptedException, IOException{
		try{
			Click("Click the Preview Button on quote detail Page for Account No Verification", CreateOrderFromQuote.Quote_Preview_Button);
			
			// waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
			
			 waitForPageLoading();
			
			Thread.sleep(2000);
			
			CreateQuote.windowhandles=driver.getWindowHandles();
			
			CreateQuote.It=CreateQuote.windowhandles.iterator();
			
			CreateQuote. ParentWindow=CreateQuote.It.next();
			
			System.out.println(CreateQuote.ParentWindow);
			
			CreateQuote.ChildWindow=CreateQuote.It.next();
			
			System.out.println(CreateQuote.ChildWindow);
			
			driver.switchTo().window(CreateQuote.ChildWindow);
			
			Thread.sleep(2000);
			
			if(CreateOrderFromQuote.ShipAccount_QuotePreview_Verification.isDisplayed() & CreateOrderFromQuote.ShipAccount_QuotePreview_Verification.getText().contains("Ship Account:"))
			{
				System.out.println("Ship Account # Visible Successfully on Invoice Preview");
				
				resultPass("ShipAccountNo_Visibility_InvoiceDocument_Verification", "Ship Account # Visible Successfully on Invoice Preview");
			}
			else{
	            System.out.println("Ship Account # Visible UnSuccessfully on Invoice Preview");
				
				resultFail("ShipAccountNo_Visibility_InvoiceDocument_Verification", "Ship Account # Visible UnSuccessfully on Invoice Preview");
			}
			
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	
		
	}
	
	public static void CPN_NumberVisibility_AtInvoiceDoc_Verification() throws IOException, InterruptedException
	{
		try{
			 if(CreateOrderFromQuote.CustomerFacingDoc_CPN_Visible_Verification.isDisplayed())
			   {
				   System.out.println("CPN Number Displayed on Invoice Doc after Enabling CPN Number Radio Button from Settings Successfully");
				   resultPass("CPN_Number_InvoiceDoc_Preview_Verification", "CPN Number Displayed on Invoice Doc after Enabling CPN Number Radio Button from Settings Successfully");
			   }
			   else{
				   System.out.println("CPN Number Displayed on Invoice Doc after Enabling CPN Number Radio Button from Settings UnSuccessfully");
				   resultFail("CPN_Number_InvoiceDoc_Preview_Verification", "CPN Number Displayed on Invoice Doc after Enabling CPN Number Radio Button from Settings UnSuccessfully");
			   }
		}catch(NoSuchElementException e){
			e.getMessage();
		}
	}
	
	
	public static void VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_InvoicePreview_Verification() throws InterruptedException, IOException{
		try{
			
			if(CreateOrderFromQuote.VendorNotes_DecoratorInstructions_QuotePreview_Verification.getText().contains("Notes: Test Vendor Notes") && CreateOrderFromQuote.DecoratorInstructions_QuotePreview_Verification.getText().contains("Instructions: Test Decorator Instructions") )
			{
				System.out.println("VendorNotes and Decorartor Instructions Displayed on Invoice Preview Successfully");
				
				resultPass("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_InvoicePreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Invoice Preview Successfully");
			}
			else{
	            System.out.println("VendorNotes and Decorartor Instructions Displayed on Invoice Preview UnSuccessfully");
				
				resultFail("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_InvoicePreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Invoice Preview UnSuccessfully");
			}
		
		
		}
		catch(NoSuchElementException e){
			e.getMessage();
		}
	
		finally {
			driver.close();
			
			Thread.sleep(3000);
			
			driver.switchTo().window(CreateQuote.ParentWindow);
		}
	
	
	}
	
	public static void LinkedTransaction_Navigation_ToOrderScreen() throws IOException, InterruptedException{
		try{
			
  //Now Validating the navigation process through linked as invoice to order and order to Quote and validate the process
		 
			 WebElement HoverLinkedTransaction=CreateOrderFromQuote.QuoteOrderLinkedtransaction;
			 Hover(HoverLinkedTransaction);
			 
			 Thread.sleep(2000);
			
		//Click the Order number on Transactionlink
		 CreateOrderFromQuote.LinkedTransactionOrderNumber_Linkedtext.click();
		 
		
		 NaviagtionFromInvoiceToOrderScreen=CreateOrderFromQuote.CreateOrder_OrderQuoteTextVerification.getText();
		 
		 System.out.println(NaviagtionFromInvoiceToOrderScreen);

		 if(NaviagtionFromInvoiceToOrderScreen.contains("Order"))
		 {
			 System.out.println("Navigation from invoice to order screen Successfully Through linked Transaction order link");
		     resultPass("LinkedTransaction_Navigation_ToOrderScreen", "Navigation from invoice to order screen Successfully Through linked Transaction order link");
		 }
		 else{
			 System.out.println("Navigation from invoice to order screen UnSuccessfully Through linked Transaction order link");
		     resultFail("LinkedTransaction_Navigation_ToOrderScreen", "Navigation from invoice to order screen UnSuccessfully Through linked Transaction order link");
		 }
    
		}catch(NoSuchElementException e){
			e.getStackTrace();
		
		}
		
	}
	public static void Delete_Order_with_Associated_Invoices() throws InterruptedException, IOException{
		try{
			
		 //Press the More Button on order details
		 CreateOrderFromQuote.Orderdetails_MoreButton.click();
		 
		 
		 //Press the delete order option
		 Thread.sleep(1000);
         CreateOrderFromQuote.Orderdetails_MoreButton_DeleteOrder.click();
		 
		 
		 //Press the Ok button for error message verification
		 CreateOrderFromQuote.DeleteOrder_Okbutton.click();
		// waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
		  waitForPageLoading();
		 
		 //Validating Order removal from invoices with Validation error verification
		 if(CreateOrderFromQuote.DeleteOrder_ErrorMessageVerification.getText().contains("Unable to delete"))
		 {
			 System.out.println("Unable to delete the order from invoices");
			 resultPass("Delete Order with Associated Invoices", "Unable to delete the order from invoices");
		 }
		 else{
			 System.out.println("able to delete the order from invoices");
			 resultFail("Delete Order with Associated Invoices", "able to delete the order from invoices");
		 }
		 
		}catch(NoSuchElementException e){
			e.getStackTrace();
		}
		
	}	
	
	public static void ShipAccountNo_AcknowledgementDocument_Verification() throws InterruptedException, IOException{
		try{
			
			Thread.sleep(20000);
			
			CreateOrderFromQuote.PreviewButton_Orderdetails.click();
			 
			
			 waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
			
			Thread.sleep(2000);
			 
			 //Press the Acknowlodgement Order document
			Click("Click Acknowledgement Popup",CreateOrderFromQuote.PreviewPopUp_Acknowledgement); 
			
			//CreateOrderFromQuote.PreviewPopUp_Acknowledgement.click();
			 
			 Thread.sleep(2000);
		
			 //Press the Preview Button
			 CreateOrderFromQuote.PreviewPopUp_PreviewButton.click();
			 waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);
			 
			 Thread.sleep(2000);
		
			 CreateQuote.windowhandles=driver.getWindowHandles();
				
				CreateQuote.It=CreateQuote.windowhandles.iterator();
				
				CreateQuote.ParentWindow=CreateQuote.It.next();
				
				System.out.println(CreateQuote.ParentWindow);
				
				CreateQuote.ChildWindow=CreateQuote.It.next();
				
				System.out.println(CreateQuote.ChildWindow);
				
				driver.switchTo().window(CreateQuote.ChildWindow);
				
				Thread.sleep(2000);
				
				if(CreateOrderFromQuote.ShipAccount_QuotePreview_Verification.isDisplayed() & CreateOrderFromQuote.ShipAccount_QuotePreview_Verification.getText().contains("Ship Account:"))
				{
					System.out.println("Ship Account # Visible Successfully on Acknowledgement Preview");
					
					resultPass("ShipAccountNo_Visibility_AcknowledgementDocument_Verification", "Ship Account # Visible Successfully on Acknowledgement Preview");
				}
				else{
		            System.out.println("Ship Account # Visible UnSuccessfully on Invoice Preview");
					
					resultFail("ShipAccountNo_Visibility_AcknowledgementDocument_Verification", "Ship Account # Visible UnSuccessfully on Acknowledgement Preview");
				}
		
		
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		
	}
	
	public static void VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_AcknowledgementPreview_Verification() throws InterruptedException, IOException{
		try{
			
			if(CreateOrderFromQuote.VendorNotes_DecoratorInstructions_QuotePreview_Verification.getText().contains("Notes: Test Vendor Notes") && CreateOrderFromQuote.DecoratorInstructions_QuotePreview_Verification.getText().contains("Instructions: Test Decorator Instructions") )
			{
				System.out.println("VendorNotes and Decorartor Instructions Displayed on Acknowledgement Preview Successfully");
				
				resultPass("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_AcknowledgementPreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Acknowledgement Preview Successfully");
			}
			else{
	            System.out.println("VendorNotes and Decorartor Instructions Displayed on Acknowledgement Preview UnSuccessfully");
				
				resultFail("VendorNotes_DecoratorNotes_Visible_checkbox_SelectedAtProductLevel_AcknowledgementPreview_Verification", "VendorNotes and Decorartor Instructions Displayed on Acknowledgement Preview UnSuccessfully");
			}
			
			
		}catch(NoSuchElementException e){
			e.getMessage();
		}
		finally {
			driver.close();
			
			Thread.sleep(2000);
			
			driver.switchTo().window(CreateQuote.ParentWindow);
			
			CreateOrderFromQuote.ClosePreviewPopup.click();
			 
			 Thread.sleep(2000);
		}
	
	
	
	}
	
    public static void LinkedTransaction_Navigation_ToQuoteScreen() throws IOException, InterruptedException{
		try{
		 WebElement HoverLinkedTransactionNav=CreateOrderFromQuote.QuoteOrderLinkedtransaction;
		 Hover(HoverLinkedTransactionNav);
		 
		 Thread.sleep(2000);
		
		 
		 CreateOrderFromQuote.LinkedTransactionOrderNumber_Linkedtext.click();
		 Thread.sleep(2000);
		 

		 waitForElementNotVisible(120, driver,CreateOrderFromQuote.SpinnerLoader);	 
		
		 NaviagtionFromOrderToQuoteScreen=CreateOrderFromQuote.CreateOrder_OrderQuoteTextVerification.getText();
		 
		 System.out.println(NaviagtionFromOrderToQuoteScreen);
		 
		 if(NaviagtionFromOrderToQuoteScreen.contains("Quote"))
		 {
			 System.out.println("Navigation from Order to Quote screen Successfully Through linked Transaction order link");
		     resultPass("LinkedTransaction_Navigation_ToQuoteScreen", "Navigation from Order to Quote screen Successfully Through linked Transaction order link");
		 }
		 else{
			 System.out.println("Navigation from Order to Quote screen UnSuccessfully Through linked Transaction order link");
		     resultFail("LinkedTransaction_Navigation_ToQuoteScreen", "Navigation from Order to Quote screen UnSuccessfully Through linked Transaction order link");
		 } 
		 
    

} catch(NoSuchElementException e){
	 System.err.println("NoSuchElementException: " + e.getMessage());
}

}

}
