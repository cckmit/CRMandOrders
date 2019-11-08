package Master;

import static CrmTestCases.StartBrowser.StartupBrowser;
import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import CrmTestCases.CompanyScenarios;
import CrmTestCases.ContactScenarios;
import CrmTestCases.Login;
import CrmTestCases.Notes;
import CrmTestCases.Systemroperties;
import OrdersTestcases.OctRelease;
import PageFactoryandTestdata.CrmTestData;
import PageFactoryandTestdata.HelpingFunction;

//@Listeners(Master.TestNGListener.class)
public class SepRelease extends HelpingFunction{
	//public static CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);

	static String Suite="SepReport.html";

	protected static String envirnment=CrmTestData.uat; // stage, uat, prod
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{

		Systemroperties.Property(Suite);
		
		}

	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 
	

	@Test(priority=1)
	 		public   void LoginIdaho() throws InterruptedException, AWTException, IOException{
				 	Login.login();
					 Assert.assertNotEquals(null, "Test Purchase Order");

			 	}
		@Test  (priority=2)
	  public static void CreateCustomerCompany() throws InterruptedException, AWTException, IOException{
		 	  CompanyScenarios.CreateCompany("Customer");	  
	 	}
	@Test  (priority=3)
	 public static void AddCompanyNoteTD_963218() throws InterruptedException, AWTException, IOException{
		Thread.sleep(15000);
		

		 Notes.AddCompanyNote963218(true);				 
	 	}
	@Test  (priority=4)
	 public static void EditCompanyNote() throws InterruptedException, AWTException, IOException{
		 Notes.EditNote();				 
	 	}
	@Test  (priority=6)
	 public static void CreateContactFromMain() throws InterruptedException, AWTException, IOException{
		 
		ContactScenarios.CreateContact(false);
	 	}
	
	@Test  (priority=7)
	 public static void AddingNoteUnderContactTD_() throws InterruptedException, AWTException, IOException{
		 
		 Notes.AddCompanyNote963218(false);	
	 	}
	
	@Test  (priority=8)
	 public static void EditContactNote() throws InterruptedException, AWTException, IOException{
		 Notes.EditNote();				 
	 	}
	
	@Test  (priority=10)
	 public static void CreateNoteFromMain() throws InterruptedException, AWTException, IOException{
		 
		 Notes.AddNoteFromMain();
	 	}
	 	
	@Test  (priority=10)
	 public static void PORefISNULL_93843() throws InterruptedException, AWTException, IOException, ParseException{
			 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());

			 OctRelease.PORefISNULL();
	 	}
	@Test  (priority=11)
	 public static void PORefISNOTNULL_93844() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());

			OctRelease.PORefISNOTNULL();
	 	}
	 	

	
	@Test  (priority=13)
	 public static void CreateQuoteFromOrder_93845() throws InterruptedException, AWTException, IOException, ParseException{
		 
		OctRelease.CreateQuoteFromOrder();
	 	}
	/*	
	@Test  (priority=14)
	 public static void CreateReorderFromOrder_93846() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateReorderFromOrder();
	 	}
	 	
 	
	@Test  (priority=15)
	 public static void CreateInvoicerFromOrder_93847() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateInvoicerFromOrder();
	 	}
	
	@Test  (priority=16)
	 public static void CreateRequoteFromQuote_93848() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
		//OctRelease.CreateRequoteFromQuote();
	 	}
	
	@Test  (priority=17)
	 public static void CreateOrderFromQuote_93849() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateOrderFromQuote();
	 	}
	
	@Test  (priority=18)
	 public static void CreateOrderFromSampleRequest_93850() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateOrderFromSampleRequest();
	 	}
	@Test  (priority=19)
	 public static void CreateReOrderFromSampleRequest_93851() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateReOrderFromSampleRequest();
	 	}
	
	
	@Test  (priority=20)
	 public static void CreateQuoteFromSampleRequest_93852() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateQuoteFromSampleRequest();
	 	}
	@Test  (priority=21)
	 public static void CreateInvoiceFromSampleRequest_93853() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateInvoiceFromSampleRequest();
	 	}
	
	@Test  (priority=22)
	 public static void CreateQuoteFromOrderCBUnchecked_93886() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateQuoteFromOrderCBUnchecked();
	 	}
	@Test  (priority=23)
	 public static void CreateReorderFromOrderCBUnchecked_93887() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateReorderFromOrderCBUnchecked();
	 	}
	
	
	
	@Test  (priority=25)
	 public static void CreateInvoicerFromOrderCBUnchecked_93888() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateInvoicerFromOrderCBUnchecked();
	 	}
	
	@Test  (priority=26)
	 public static void CreateRequoteFromQuoteCBUnchecked_93889() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateRequoteFromQuoteCBUnchecked();
	 	}
	@Test  (priority=27)
	 public static void CreateOrderFromQuoteCBUnchecked_93890() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateOrderFromQuoteCBUnchecked();
	 	}
	
	@Test  (priority=28)
	 public static void CreateOrderFromSampleRequestCBUnchecked_93891() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateOrderFromSampleRequestCBUnchecked();
	 	}
	
	@Test  (priority=29)
	 public static void CreateReOrderFromSampleRequestCBUnchecked_93892() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateReOrderFromSampleRequestCBUnchecked();
	 	}
	@Test  (priority=30)
	 public static void CreateQuoteFromSampleRequestCBUnchecked_93893() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateQuoteFromSampleRequestCBUnchecked();
	 	}
	@Test  (priority=31)
	 public static void CreateInvoiceFromSampleRequestCBUnchecked_93894() throws InterruptedException, AWTException, IOException, ParseException{
		 test = extent.createTest(new Exception().getStackTrace()[0].getMethodName());
		 
			//OctRelease.CreateInvoiceFromSampleRequestCBUnchecked();
	 	}
	*/
		 @AfterMethod
		 
			public void getResult(ITestResult result ) throws IOException, InterruptedException{
		
			 
			 }
			 
			@AfterTest
			public void endReport(){
				//driver.quit();
			//driver.get(System.getProperty("user.dir")+"/Reports/"+Suite);
			}
			
		
		

}

