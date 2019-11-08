package PageFactoryandTestdata;

import java.awt.Robot;
import java.util.Date;
import java.util.Random;


public class CrmTestData {

	public static String Banme="Chrome"; 
	public static String CompVerify;

// SITA Credencials
	public static String ASI="125748"; 
	public static String USER="CRMRegression1"; 
	public static String PASS="Pakistan786";
	
	
	//Company Creation Info
	
	static Date date = new Date();
	public static String Company="Auto "+date.toString();
	public static String SupplierCompany="Auto Customer"+date.toString();
	
	public static String Delcomp="Del "+date.toString();

	public  String CompanyB="Auto "+date.toString();

	public static String CompPhone="51551515";
	public static String CompEmail="test@gmail.com";
	public static String CompWebsite="www.test.com";

	// RelationShip
	public static String RShipFarward="Is Employer of"+date.toString();
	public static String RShipFarwardTitle="Is Employee of";
	public static String RShipReverse="Is Employer of";
	public static String RShipReverseTitle="Is Employee of";

	
	// Team
		public static String TeamName="Auto "+date.toString();
		
	
	// Address
	 
	public static String AddressName="My Primary Address";
	public static String Address="4800 E Street Rd Feasterville-Trevose, PA 19053 US";
	public static String AddressLine1="4800 E Street Rd";



// Note Content
	public static String NoteCont="I am Creating Note";
	public static String EditNoteCont="I am Editing Note";

	public static String MainNoteContent="I am Creating Note From Main";

	
	// Task Name
		public static String Task="Creating Assignment Tasks"+date.toString();
		
		public static String EditTask="Editing Assignment Tasks";

		public static String MainTask="Main autoTasks "+date.toString();

		public static String DefaultTask="Default Tasks "+date.toString();

		static Random rand = new Random(); 
		static int value   = rand.nextInt(500000); 
		public static String ContactFromOrder="CC"+value;

	// Contact Info
		public static String ContactFName="Auto "+date.toString();
		public static String ContactLName="Iftikhar";
		
		
	//public static String stage ="https://espweb.stage-asicentral.com";
		public static String stage ="https://esp.stage-asicentral.com";
		public static String uat ="https://esp.uat-asicentral.com";
		public static String prod ="https://esp.asicentral.com";
		public static String window1;
		public static String window2;

	


	
	public static String items[] = {"Mug","Basket", "Pen", "Golf", "bags", "USB"};//, "Basket"
	// backward slash
	
	
	public static String color[] = { "red", "green", "blue", "pink", "white", "black" };


// Browsers
	public static String sChromePath = "Installation/chromedriver.exe";
	public static String Firefoxpath = "Installation/geckodriver.exe";
	public static String IEPath = "Installation/IEDriverServer.exe";
	public static String EdgePath = "Installation/MicrosoftWebDriver.exe";
	



	Robot rb;
	


	

}








