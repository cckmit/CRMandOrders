package OrdersTestcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;



public class BackButton extends OrdersExecution1 {

	
	
	public static void BackButtonVerification() throws IOException, InterruptedException{
           try{
		// This is to Instantiate CreateOrders  class  
   	 OrdersLocators BackButton = PageFactory.initElements(driver, OrdersLocators.class);	
	
   	BackButton.SendButton.click();
	 Thread.sleep(10000);

    Click("a",  BackButton.PreviewPopUp_PurchaseOrder);
	 
	 Thread.sleep(3000);
	 
	//Select the Purchase Order Option
//	 PurchaseOrderPreviewWithDownload.PreviewPopup_PurchaseOrderSelection.click();
	 Click("a",  BackButton.PreviewPopup_PurchaseOrderSelection);
   	
	 Click("a",  BackButton.Continuebutton);
	 Thread.sleep(3000);
//	 Click("a",  BackButton.Backbutton1);
		
	if(BackButton.Backbutton1.isDisplayed())
	{
	 System.out.println("Back button is displaying Send Order modal window");
	 resultPass("Back button is displaying Send Order modal window", "Back button is displaying Send Order modal window");
	}
	else{
		 System.out.println("Back button is not displaying Send Order modal window");

		resultFail("Back button is not displaying Send Order modal window", "Back button is not displaying Send Order modal window");
	}	
   
           }
	
	   catch(NoSuchElementException e){
		   e.getStackTrace();
	   }
	}  
	



}