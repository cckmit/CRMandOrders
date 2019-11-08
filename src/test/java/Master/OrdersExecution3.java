package Master;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import OrderTestCases2.BrowserInitiation;
import OrderTestCases2.Login;
import OrderTestCases2.SearchProductsWithinIDAHO_Order;

public class OrdersExecution3 {
	protected static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriverWait wait;

@BeforeTest
 public void Startup() throws InterruptedException, AWTException, IOException{

	 BrowserInitiation.StartBrowser();
	
	 }

@Test(priority=0)
public void LoginApp() throws IOException, InterruptedException, AWTException{
 Login.login();

}

/*@Test(priority=1)
public void Settings_DocumentDesign_LogoUploadandRemove() throws IOException, InterruptedException, AWTException, ParseException{
	DocumentDesign_LogoUploadAndRemove.LogoUploadAndRemove_DocumentDesign();

}


@Test(priority=2)
public void OrderCreate_WithCustomerSearch_IDAHO() throws IOException, InterruptedException, AWTException, ParseException{
	OrderWithCustomerSearch_IDAHO1.OrderCreation_WithCustomerSearchIDAHO();

}
*/
@Test(priority=3)
public void OrderCreate_WithProductSearch_WithInIDAHO() throws IOException, InterruptedException, AWTException, ParseException{
	SearchProductsWithinIDAHO_Order.OrderCreation_WithProductSearchIDAHO();

}


@AfterMethod
public void getResult(ITestResult result){
	
	if(result.getStatus()==ITestResult.FAILURE){
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
		test.fail(result.getThrowable());
		extent.flush();
		}
	
	
}

@AfterTest
public void teardown(){
	extent.flush();
	
	
	
}
protected static void Click(String string, WebElement key) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", key);
	
}



}
