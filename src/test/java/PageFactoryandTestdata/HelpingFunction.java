package PageFactoryandTestdata;
import java.io.IOException;
import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Master.CRMExecution;
public class HelpingFunction{
	protected static WebDriver driver;
	protected static String dest;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	public static WebDriverWait wait;
	protected static String GetRecordsOwner;
	protected static String NotificationBefore;
	protected static String NotificationAfter;
	protected static boolean bol;
	public static String SelectedROwn;
	public static String browser="chrome";
	public static String TaskCurdat;
	
	protected static String envirnment=CrmTestData.prod;
				static String user=System.getProperty("user.name");
				public static String downloadPath = "C:\\Users\\"+user+"\\Downloads";
			public static void Input(String message, WebElement key,String value){
					try {
						key.clear();
						key.sendKeys(value);
					}	
		 
					/*catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
					}	*/
					catch (NoSuchElementException e) {
						System.err.println("NoSuchElementException: " + e.getMessage());
					}	
				}

			public static void RefreshPage() throws InterruptedException{
					Thread.sleep(2000);
					driver.navigate().refresh();
					Thread.sleep(6000);

			}
	
	
	
			public static void Click(String abc, WebElement key)
			{
					try {
			
						JavascriptExecutor js = (JavascriptExecutor)driver;
						js.executeScript("arguments[0].click();", key);
					}
					catch (IndexOutOfBoundsException e) {
						System.err.println("IndexOutOfBoundsException: " + e.getMessage());
					}	
					 
					catch (NoSuchElementException b) {
						System.err.println("NoSuchElementException: " + b.getMessage());
					}	
			}

			public static void ClickAt(String abc, WebElement key){
					try {
						key.click();
					}
						catch (IndexOutOfBoundsException e) {
							System.err.println("IndexOutOfBoundsException: " + e.getMessage());
						}	
			}
			
			


			
			public static void Verify(String expected, String actual, String mesage){
				try {
    			SoftAssert assertion =new SoftAssert();
    			assertion.assertEquals(expected, actual, mesage);
    			assertion.assertAll();
				}
				catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
				}	
			}
			
			public static void VerifySearch(String a, String b, String c){
				try {
    			SoftAssert assertion =new SoftAssert();
    			assertion.assertNotEquals(a, b, c);
    			assertion.assertAll();
				}
				catch (IndexOutOfBoundsException e) {
					System.err.println("IndexOutOfBoundsException: " + e.getMessage());
				}	
			}


			
			public static String capture(String SceenShotName)throws IOException, InterruptedException{
				
				try{
			//	 	 File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  			 dest = System.getProperty("user.dir")+"/Screenshot/"+SceenShotName+".jpg";
		  			 dest=dest.replace("\\", "/");
	  		//	     File destination = new File(dest);
	  		//	     FileUtils.copyFile(source, destination);
	  			    
				}
				 	 
				catch (Exception e)
				  {
		  			 System.out.println(e.getMessage());
			      } 
	  			     
				 return dest;    

			}

}
