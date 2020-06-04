
package CrmTestCases;


import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.CrmTestData;
import PageFactoryandTestdata.HelpingFunction;


public class Login extends HelpingFunction  {


				public static  void login() throws InterruptedException, AWTException, IOException{

					CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
					SoftAssert assertion =new SoftAssert();
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

					Input("Please Enter ASI no", GetData.ASINo, CrmTestData.ASI);
					Input("Please Enter UserName", GetData.AsiUserName, CrmTestData.USER);
					Input("Please Enter Password", GetData.Password, CrmTestData.PASS);
					Click("Please click login button",GetData.LoginButton);
					Input("Please Enter ASI no", GetData.ASINo, CrmTestData.ASI);
/*
					 	assertion.assertTrue(true);
						assertion.assertAll();
					 	Thread.sleep(2000);
					 	SelectedROwn="abc";
											
	*/				
				
					}
				
				//Returns webelement
				public static WebElement expandRootElement(WebElement element) {
					WebElement ele = (WebElement) ((JavascriptExecutor) driver)
					.executeScript("return arguments[0].shadowRoot",element);
					return ele;
				}


				public static  void Shadow() throws InterruptedException, AWTException, IOException{

					CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
					SoftAssert assertion =new SoftAssert();
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get("https://lwc-recipes-oss.herokuapp.com/#child");
					
					
					WebElement root1 = driver.findElement(By.tagName("my-app"));

	                //Get shadow root element
					WebElement shadowRoot1 = expandRootElement(root1);

					WebElement root2 = shadowRoot1.findElement(By.cssSelector("section > article > div > recipe-event-simple"));
					WebElement shadowRoot2 = expandRootElement(root2);
/*
			WebElement root3 = shadowRoot2.findElement(By.cssSelector("ui-card"));
			WebElement shadowRoot3 = expandRootElement(root3);
					

			String actualHeading = shadowRoot3.findElement(By.cssSelector("div > div.card-header > div")).getText();
			// Verify header title
			Assert.assertEquals("EventSimple", actualHeading);
*/
					WebElement root4 = shadowRoot2.findElement(By.cssSelector("ui-card > div > recipe-paginator"));
					WebElement shadowRoot4 = expandRootElement(root4);
			
					WebElement root5 = shadowRoot4.findElement(By.cssSelector("div > ui-button.button-right"));
					WebElement shadowRoot5 = expandRootElement(root5);
					shadowRoot5.findElement(By.cssSelector("button")).click();
				}
				public static void VerifyExistingDomain() throws InterruptedException, AWTException, IOException{
				

					
					//	  CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
						  test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
						  SoftAssert assertion =new SoftAssert();
						  String url= driver.getCurrentUrl();
						  url = url.replace("esp", "orders");
						  System.out.print(url);
						
							
								HttpURLConnection connection = (HttpURLConnection) new URL (url).openConnection();
								connection.connect();
								if(connection.getResponseCode()==200)
							       {
									System.out.println("Passed");
								 	assertion.assertTrue(true);
									assertion.assertAll();
								 	Thread.sleep(2000);
								 	

						 }
							       else 
							       {
										System.out.println("Failed");
										assertion.assertTrue(false);
										assertion.assertAll();
									 	Thread.sleep(2000);

							       }
								String response=connection.getResponseMessage();
								connection.disconnect();
								System.out.println(url+" ----> "+ response);
					
					
				
					}
				
					
				}


