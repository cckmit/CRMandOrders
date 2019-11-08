
package CrmTestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.CrmTestData;
import PageFactoryandTestdata.HelpingFunction;


public class Filters extends HelpingFunction {
// static WebElement DefaultVisi1;
	
	// static WebElement DefaultVisi2;

	public static CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);

		
			  	
			  	public static void VerifyFilters(boolean b) throws InterruptedException, AWTException, IOException{
		  			 
					 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		    	   	 
		    	   	 if(b) {
		    	   		 Click("Please click at main link of companies",GetData.NavigatetoCompanies);
		    	   	 }
		    	   	 else {
			    	   	 Click("Please click at main link of companies",GetData.NavigatetoContacts);
		    	   	 }
					 Click("Please Click All Filter link",GetData.AllFilter);
					 Thread.sleep(2000);
		    		 String AllResult=GetData.ResultFound.getText();
		    		 
		    		 
					 Click("Please Click at Active Filter link",GetData.ActiveFilter);
					 Thread.sleep(2000);
					 String ActiveResult=GetData.ResultFound.getText();
					 
					 Click("Please Click at Active Filter link",GetData.InactiveFilter);
					 Thread.sleep(2000);
					 String InActiveResult=GetData.ResultFound.getText();
					 
					 if(AllResult!=ActiveResult && ActiveResult != InActiveResult) {
						 Verify(AllResult, AllResult, "Filters are not working correctly");

					 }
					 else {
						 Verify(AllResult, ActiveResult, "Filters are not working correctly");

					 }
					
					 
		  			} 
			  	
			    public static void Search(boolean b) throws InterruptedException, AWTException, IOException{
	    			
	    			test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	    			
	    			if(b) {
	    				Click("Please click at main link of companies",GetData.NavigatetoCompanies);
	    				Input("Please Enter in search field", GetData.CompaniesSearchField, CrmTestData.Company);
		    			Thread.sleep(5000);
		    			Verify(CrmTestData.Company, GetData.ClickCompanyName.getText(), "Search is not working for comp");
	    			}
	    			else {
	    				Click("Please click at main link of companies",GetData.NavigatetoContacts);
	    				Input("Please Enter in search field", GetData.CompaniesSearchField, CrmTestData.ContactFName);
		    			Thread.sleep(2000);
		    			Verify(CrmTestData.ContactFName+" Iftikhar", GetData.ClickCompanyName.getText(), "Search is not working");
	    			}
			    }
			  		
}
