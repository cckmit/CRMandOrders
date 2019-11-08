package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.CRMExecution;



//public class CrmLocatiors extends CRMExecution{
	public class CrmLocatiors{


	@FindBy(id="txtAsiNum") public WebElement ASINo;
	@FindBy(id="txtUserName") public WebElement AsiUserName;
	@FindBy(id="txtPassword") public WebElement Password;
	@FindBy(xpath="//input[contains(@onclick,'LoginUser()')]") public WebElement LoginButton;

	@FindBy(linkText="CRM") public WebElement CRM;

//Company Creation0
	@FindBy(xpath="//tfoot/tr[1]/td[3]/strong"+"[0]") public WebElement a;

	@FindBy(xpath="//a[contains(@class,'btn btn-primary')]") public WebElement AddComp;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.currentCompany.Name')]") public WebElement CompName;
	@FindBy(xpath="//input[contains(@ng-model, 'phone.Number')]") public WebElement PhoneNo;
	@FindBy(xpath="//input[contains(@ng-model, 'email.Address')]") public WebElement EmailAddress;
	@FindBy(xpath="//input[contains(@ng-model, 'website.Url')]") public WebElement Website;
	@FindBy(xpath="//input[contains(@value, 'Everyone')]") public WebElement DefaultVisi1;
	@FindBy(xpath="//input[contains(@value, 'Owner')]") public WebElement UpdateVisibility;
	@FindBy(xpath="//a[contains(text(), 'Billing Information')]") public WebElement BillingInformation;
	@FindBy(xpath="//div[contains(@ng-model, 'CreditTerm')]/div/span") public WebElement OpenTerms;
	@FindBy(xpath="//div[contains(text(), 'Net 15')]") public WebElement SelectTerms;
	@FindBy(xpath="//div[contains(@ng-model, 'PaymentMethod')]/div/span") public WebElement OpenPayWith;
	@FindBy(xpath="//div[contains(text(), 'MasterCard')]") public WebElement SelectPayWith;
	@FindBy(xpath="//div[contains(@ng-model, 'shippingAccount.Type')]/div/span") public WebElement OpenShipVia;

	@FindBy(xpath="//div[contains(text(), 'Ground')]") public WebElement SelectShipVia;
	@FindBy(xpath="//input[contains(@ng-model, 'shippingAccount.Number')]") public WebElement ShipAccountNo;

	@FindBy(xpath="//input[contains(@ng-model, 'searchParams.selectAll')]") public WebElement SelectCompanies;
	@FindBy(xpath="//button[contains(text(), 'Actions')]") public WebElement Actions;
	@FindBy(xpath="//ng-content[contains(text(), 'Change Record Owner')]") public WebElement ChangeRecordsOwner;
	@FindBy(xpath="//ng-content[contains(text(), 'Set Visibility')]") public WebElement SetVisibility;

	@FindBy(xpath="//span[contains(@ng-hide, '$select.isEmpty() && !showEmpty')]") public WebElement SelectedUser;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.save()')]") public WebElement SaveRecordOwner;

	@FindBy(xpath="//label[contains(@ng-repeat, 'role in vm.companyRoles')]") public WebElement CompanyRoles;
	@FindBy(xpath="//span[contains(text(), '") public WebElement CompanySupplierRoleFpart;
	@FindBy(xpath="')]//../input[contains(@type, 'checkbox')]") public WebElement CompanySupplierRoleLpart;

	@FindBy(xpath="//input[contains(@ng-model, 'searchParams.selectAll')]") public WebElement SelectAllCheckbox;
	
	@FindBy(xpath="//a[contains(@ui-sref, 'companies.company.view')][contains(text(), 'Orders')]") public WebElement CompanyOrder;
	@FindBy(xpath="//ng-content[contains(@translate, 'BUTTONS.CREATE_ORDER')]") public WebElement CreateCompanyOrder;

	
	@FindBy(xpath="//button[contains(@id,'close-order')]") public WebElement CloseOrder_Icon;
	
	

	@FindBy(xpath="//uib-tab-heading[contains(text(), 'All Companies')]") public WebElement AllCompanies;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'Customers')]") public WebElement Customer;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'Suppliers')]") public WebElement Supplier;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'Decorators')]") public WebElement Decorators;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'Prospects')]") public WebElement Prospects;







	


	
			@FindBy(xpath="//*[contains(@placeholder, 'Enter or Select')]/span/i") public WebElement OpenRecordDD;
/*
	@FindBy(xpath="//span[contains(@aria-label, 'Choose a User activate')]/i") public WebElement OpenRecordDD;
	@FindBy(xpath="//span[contains(@aria-label, 'Select a Link activate')]") public WebElement SelectALink;
*/
	
	
	
	@FindBy(xpath="//*[contains(@id, 'ui-select-choices-row')]") public List<WebElement> GetNoOfRecords;
	@FindBy(xpath="//*[contains(@id, 'ui-select-choices-row')]") public WebElement Getid;
	@FindBy(xpath="//*[contains(@aria-label, 'Choose a User activate')]/span[2]") public WebElement GetSelectedROwn;

	
//	@FindBy(xpath="//span[contains(text(), 'Record Owner:')]") public WebElement ROwner;
//	@FindBy(xpath="//ng-content[contains(text(), 'Record Owner')]/following-sibling::text()[1]") public WebElement ROwner;
	@FindBy(xpath="//ng-content[contains(text(), 'Record Owner')]/parent::span | //span[contains(text(), 'Record Owner')]") public WebElement ROwner;


	
	String test ="ui-select-choices-row-3-3";
	
//	@FindBy(xpath="//button[contains(@ng-click, 'vm.confirmSaveCompany')]") public WebElement SaveComp;
// Add company Address
	@FindBy(xpath="//a[contains(@href, '/addressbook')]") public WebElement AddressBook;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.openAddressModal()')]") public WebElement AddAdress;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.address')]") public WebElement AddressName;
//	@FindBy(xpath="//input[contains(@ng-model, 'vm.address.Line1')]") public WebElement Address;
	@FindBy(xpath="//input[contains(@placeholder, 'Enter or Choose Address')]") public WebElement Address;

	@FindBy(xpath="//input[contains(@type, 'tel')]") public WebElement AddressPhone;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.address.IsPrimary')]") public WebElement MakePrimary;
	
	@FindBy(xpath="//*[contains(text(), 'Save')]") public WebElement SaveAddress;
	@FindBy(xpath="//a[contains(@ng-click, 'vm.save(')]") public WebElement SaveSettingsAddress;

//	@FindBy(xpath="//div[contains(@ng-show, 'address.Line')]") public WebElement GetPriAdd;
	@FindBy(xpath="//div[contains(@ng-show, '.Line')][@class='ng-binding']") public WebElement GetPriAdd;

	@FindBy(xpath="//*[contains(text(), 'Companies')]") public WebElement NavigatetoCompanies;
	@FindBy(xpath="//input[contains(@ng-model, 'searchTerm')]") public WebElement CompaniesSearchField;
	@FindBy(xpath="//div[contains(@class, 'item-title white-space-pre word-break ng-binding')]") public WebElement ClickCompanyName;
	@FindBy(xpath="//a[contains(text(), 'Billing Information')]") public WebElement BillingInfoLink;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.currentCompany.IsTaxExempt')]") public WebElement ExemptCheckbox;

	/*	@FindBy(xpath="//a[contains(@href, 'tel:')]") public WebElement GetCompanyPhone;
	
	@FindBy(xpath="//a[contains(@href, 'mailto:')]") public WebElement GetCompanyEmail;
	@FindBy(xpath="//a[contains(@target, '_website')]") public WebElement GetCompany;
*/
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-pencil')]") public WebElement EditComp;

// Sales Tax Settings
	
	@FindBy(xpath="//img[contains(@src, 'https://www.gravatar.com')]") public WebElement aviator;
	@FindBy(xpath="//a[contains(@ui-sref, 'settings')]") public WebElement settings;
	@FindBy(xpath="//a[contains(@href, '/account/logoff')]") public WebElement logout;

	@FindBy(xpath="//a[contains(@href, '/settings/sales-tax')]") public WebElement salestax;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.autoCalculateRates')]") public WebElement autotax;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.chargeTaxesOnShipping')]") public WebElement shiptax;
	@FindBy(xpath="//div[contains(@class, 'row margin-top-10')]") public WebElement getalladdresses;
	
	
	
	@FindBy(xpath="//a[contains(@href, '/settings/relationships')]") public WebElement Relationships;
	@FindBy(xpath="//tr[contains(@ng-repeat, 'relationship in LinkRelationshipTypes')]") public List<WebElement> GetNoOfRshipRows;

	
	@FindBy(xpath="//button[contains(@title, 'Delete')]/i") public List<WebElement> GetNoOfAddress;
	@FindBy(xpath="//button[contains(@title, 'Delete')]/i") public WebElement DelIcon;
	@FindBy(xpath="//button[contains(@ng-class, 'vm.confirmButtonClass')]") public WebElement ConfirmDel;

	
	@FindBy(xpath="//a[contains(@ng-click, 'addRelationship()')]") public WebElement AddRelatonShip;
	@FindBy(xpath="//input[contains(@name, 'forward')]") public WebElement RShipFarward;
	@FindBy(xpath="//input[contains(@name, 'forwardTitle')]") public WebElement RShipFarwardTitle;
	@FindBy(xpath="//input[contains(@name, 'reverse')]") public WebElement RShipReverse;
	@FindBy(xpath="//input[contains(@name, 'reverseTitle')]") public WebElement RShipReverseTitle;
	@FindBy(xpath="//input[contains(@id, 'forPerson')]") public WebElement RShipForContact;
	@FindBy(xpath="//input[contains(@id, 'forCompany')]") public WebElement RShipForCompany;
	@FindBy(xpath="//button[contains(@ng-click, 'save(relationshipForm.$valid)')]") public WebElement SaveRship;
	
	@FindBy(xpath="//a[contains(@href, '/settings/teams')]") public WebElement Teams;
	@FindBy(xpath="//tr[contains(@ng-repeat, 'team in vm.resultList.items')]") public List<WebElement> GetNoOfTeamRows;
		

	@FindBy(xpath="//button[contains(@ng-click, 'vm.openTeamModal()')]") public WebElement AddteamButton;
	@FindBy(xpath="//input[contains(@placeholder, 'Team Name')]") public WebElement TeamName;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.save(memberForm.$valid)')]") public WebElement SaveTeam;


	@FindBy(xpath="//a[contains(text(), 'Default Tasks')]") public WebElement DefaultTasks;
	@FindBy(xpath="//*[contains(text(), 'Add Default Task')]") public WebElement AddDefaultTask;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.defaultTask.Name')]") public WebElement DefaultTaskName;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.defaultTask.DueInBusinessDays')]") public WebElement DefaultTaskDueDate;

	@FindBy(xpath="//input[contains(@ng-model, 'vm.defaultTask.SalesOrder')]") public WebElement DefaultTaskSalesOrderCheckbox;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-calendar-check-o')]") public WebElement OpenTaskInSidebar;

	
	

//Inactive Company
	
	@FindBy(xpath="//ng-content[contains(@class, 'ng-scope ng-binding')]") public WebElement ActiveDropDown;
	@FindBy(xpath="//ng-content[contains(@translate, 'STATUS_INACTIVE')][contains(@class, 'ng-scope ng-binding')]") public WebElement InactiveLink;

	
	@FindBy(xpath="//ng-content[contains(@class, 'ng-scope ng-binding')][text()='All']") public WebElement AllFilter;
	@FindBy(xpath="//ng-content[contains(text(), 'Active')]") public WebElement ActiveFilter;
	@FindBy(xpath="//ng-content[contains(text(), 'Inactive')]") public WebElement InactiveFilter;
	@FindBy(xpath="//ng-content[contains(text(), 'Status')]") public WebElement Status;

	@FindBy(xpath="//a[contains(@ng-click, 'changeStatusOfSelected(status)')]/ng-content[contains(text(), 'Inactive')]") public WebElement InactiveFromDB;

	@FindBy(xpath="//div[contains(@class, 'well well-sm text-center ng-scope')]") public WebElement ResultFound;
	
	@FindBy(xpath="//tfoot/tr/td[2]/p[3]") public WebElement CalculatedTax;

	@FindBy(xpath="//i[contains(@class, 'caret pull-right')]") public WebElement testing;


	// Add company Notes
	
//	@FindBy(xpath="//a[contains(@href, 'notes')][@ng-bind-html='tab.title']") public WebElement Notes;
//	@FindBy(xpath="//a[contains(@href, 'notes')][@class='ng-binding']") public WebElement Notes;
	@FindBy(xpath="//a[contains(@class, 'ng-binding')][contains(@href, 'notes')]") public WebElement Notes;

//	@FindBy(xpath="//a[contains(text(), 'Orders')][@class='ng-binding']") public WebElement Orders;
	@FindBy(xpath="//a[contains(text(), 'Orders')]") public WebElement Orders;

	@FindBy(xpath="//div[contains(@class,'btn-group dropdown')]/a") public WebElement CreateOrder;

	

	@FindBy(xpath="//a[contains(@href, 'orders')][@class='ng-binding']") public WebElement Ordertab;
	@FindBy(xpath="//button[contains(text(), 'Create Order')]") public WebElement CreateOrderButton;


	@FindBy(xpath="//li[contains(@ui-sref-active, 'active')][4]/a") public WebElement MainNotes;

	@FindBy(xpath="//button[contains(@ng-click, 'vm.addNote()')]") public WebElement AddCompNoteButton;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.editNote(note)')]/i") public WebElement EditCompNoteButton;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.removeNote(note)')]/i") public WebElement RemoveCompNoteButton;

	
	@FindBy(xpath="//a[contains(@class, 'btn btn-primary')]") public WebElement AddNoteButtonFromMain;

	@FindBy(xpath="//textarea[contains(@name, 'content')]") public WebElement NoteContent;
	@FindBy(xpath="//button[contains(text(), 'Save')]") public WebElement SaveNote;
	@FindBy(xpath="//div[contains(@class, 'word-break item-title multiline-note-content ng-binding')]") public WebElement GetNoteCont;
	@FindBy(xpath="//div[contains(@class, 'word-break item-title cursor-pointer multiline-note-content ng-binding')]") public WebElement GetMainNoteContent;

	// Add Task
	@FindBy(xpath="//button[contains(@ng-click, 'vm.openTaskModal()')]") public WebElement AddTaskButton;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.openTaskModal(vm.task)')]/i") public WebElement EditTask;

	@FindBy(xpath="//li[contains(@ui-sref-active, 'active')][5]/a") public WebElement AddTaskFromMain;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.searchTerm')]") public WebElement TaskSearchField;
	@FindBy(xpath="//span[contains(@class, 'text-left cursor-pointer ng-binding')]") public WebElement GetMainTaskContent;

	
	@FindBy(xpath="//h5[contains(text(), 'Categories')]/parent::div/parent::div/div[2]/ul/li/div/div/label/input") public List<WebElement> GetCategoriesTypes;

	// Settings

	

	@FindBy(xpath="//input[contains(@ng-model, 'vm.model.Name')]") public WebElement TaskName;
//	@FindBy(xpath="//button[contains(@ng-click, 'vm.save')]") public WebElement SaveTask;
	
	@FindBy(xpath="//button[contains(@ng-mousedown, 'vm.save')]") public WebElement SaveTask;
	@FindBy(xpath="//i[contains(@class, 'fa fa-calendar')]") public WebElement OpenCalender;
	@FindBy(xpath="//button[contains(text(), 'More Details')]") public WebElement MoreDetail;
	@FindBy(xpath="//ng-content[contains(text(), 'Additional Information')]") public WebElement AdditionalInformation;
	@FindBy(xpath="//select[contains(ng-model, 'vm.model.Priority')]") public WebElement Priority;
	@FindBy(xpath="//select[contains(@ng-model, 'vm.model.Status')]") public WebElement TaskStatus;

	
	@FindBy(xpath="//button[contains(text(), 'Save')]") public WebElement Save;
	@FindBy(xpath="//button[contains(text(), 'Save')]") public List<WebElement> SaveOrders;

	

	//	@FindBy(xpath="//span[contains(@class, 'task-date-black')]") public WebElement VerifyTask;
	@FindBy(xpath="//span[contains(@class, 'color-black')]/strong") public WebElement VerifyTask;
	
	@FindBy(xpath="//a[contains(text(), 'Appointments')]") public WebElement Appointment;
	
	@FindBy(xpath="//button[contains(text(), 'Month')]") public WebElement MonthView;
	@FindBy(xpath="//button[contains(text(), 'Week')]") public WebElement WeekView;
	@FindBy(xpath="//button[contains(text(), 'Day')]") public WebElement DayView;

	@FindBy(xpath="//button[contains(@class, 'btn btn-primary dropdown-toggle')]") public WebElement ToggleButton;
	@FindBy(xpath="//a[contains(text(), 'New Task')]") public WebElement NewTask;


	
	
	
	@FindBy(xpath="//ng-content[contains(text(), 'Completed Date')]") public WebElement CompletedDate;
	@FindBy(xpath="//i[contains(@class, 'fa fa-user text-med')]") public WebElement CompletedBy;
	

	@FindBy(xpath="//i[contains(@class, 'fa fa-check-circle-o text-baseline font-20')]") public WebElement CompleteTask;
	@FindBy(xpath="//i[contains(@class, 'fa fa-trash-o')]") public WebElement DeleteTask;
	

	@FindBy(xpath="//div[contains(@class, 'toast-title')]") public WebElement Success;


	@FindBy(xpath="//a[contains(text(), 'Open')]") public WebElement OpenTaskFilter;
	@FindBy(xpath="//ng-content[contains(@translate, 'LABELS.OPEN')]") public WebElement OpenFilterlist;

	
	@FindBy(xpath="//a[contains(text(), 'Completed')]") public WebElement CompletedTaskFilter;


	 
	// Add company Contact
	@FindBy(xpath="//li[contains(@ui-sref-active, 'active')][2]/a") public WebElement NavigatetoContacts;
	@FindBy(xpath="//a[contains(@class, 'btn btn-primary')]") public WebElement AddContact;

	
	@FindBy(xpath="//button[contains(@class, 'btn btn-default dropdown-toggle')]") public WebElement ClickAtAction;
	@FindBy(xpath="//a[contains(@ui-sref, 'contacts.add')]") public WebElement CreateContactLink;
	@FindBy(xpath="//a[contains(@ng-click, 'vm.delete()')]") public WebElement DeleteComp;

	@FindBy(xpath="//input[contains(@name, 'firstName')]") public WebElement ContactFName;
	@FindBy(xpath="//input[contains(@ng-model, 'vm.currentContact.FamilyName')]") public WebElement ContactLName;
	@FindBy(xpath="//input[contains(@type, 'tel')]") public WebElement ContactPhone;
	@FindBy(xpath="//input[contains(@ng-model, 'email.Address')]") public WebElement ContactEMail;
	@FindBy(xpath="//input[contains(@name, 'website')]") public WebElement ContactWebsite;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.confirmSave')]") public WebElement SaveButton;

	@FindBy(xpath="//a[contains(@ng-if, 'relationship.To.IsVisible')]") public WebElement RshipVericationbetContandComp;

	
	

//Company Verification
	@FindBy(css="#pad-wrapper > div.page-header.clearfix > div.profile-title > h2 > span") public WebElement CompVerify;

	@FindBy(xpath="//a[contains(@href, 'tel')]") public WebElement PhnVerify;
	@FindBy(xpath="//a[contains(@href, 'mailto:')]") public WebElement EmailVerify;
	@FindBy(xpath="//a[contains(@target, '_website')]") public WebElement WebVerify;
	@FindBy(xpath="//*[contains(@class, 'item-title white-space-pre word-break ng-binding')]") public WebElement CompDetails;
	
	
	@FindBy(xpath="//*[contains(text(), 'Enter or Select Link')]") public WebElement AddNewLink;
	@FindBy(xpath="//*[contains(@class, 'fa text-med fa-building')]") public WebElement AddNewLinkSelect;
	@FindBy(xpath="//*[contains(@class, 'form-control ng-pristine ng-valid ng-empty ng-touched')]") public WebElement RshipDD;

	

	
	
	

	@FindBy(className="form-control ng-pristine ng-valid ng-valid-maxlength ng-touched") public WebElement searchfield;

	///////////// Export////////////////////////
	
	@FindBy(xpath="//div[contains(@class, 'badge pull-right ng-binding ng-scope')]") public WebElement exportnoti;

	@FindBy(xpath="//ng-content[contains(text(), 'Export')]") public WebElement ExportButton;
	@FindBy(xpath="//*[@id='pad-wrapper']/div[4]/div[2]/div[1]/div/span/div[2]/div/ul/li[1]/a") public WebElement CSV;
	
	@FindBy(xpath="//i[contains(@class, 'icon esp-icon icon-alert')]") public WebElement ClickNotification;
	@FindBy(xpath="//div[contains(@ng-bind-html, '::notification.Message')]/a") public WebElement DownloadCSV;
	@FindBy(xpath="//ng-content[contains(text(), 'QuickBooks')]") public WebElement QB;
	@FindBy(xpath="//button[contains(text(), 'Export to CSV')]") public WebElement ExportContactCSV;
	@FindBy(xpath="//i[contains(@class, 'fa fa-ellipsis-v')]") public WebElement VcardIcon;

	@FindBy(xpath="//a[contains(text(), 'Export to vCard')]") public WebElement ExportVcard;
	
	@FindBy(xpath="//a[contains(text(), 'Emails')]") public WebElement NavigateToEmails;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'All Emails')]") public WebElement MoveToAllEmails;
	@FindBy(xpath="//uib-tab-heading[contains(text(), 'Spam')]") public WebElement MoveToSpamEmails;
	@FindBy(xpath="//input[contains(@ng-checked, 'vm.isSelected(email.Id)')]") public WebElement SelectEmailCheckbox;
	@FindBy(xpath="//input[contains(@ng-checked, 'vm.isSelected(email.Id)')]") public List<WebElement> GetEmailCount;

	@FindBy(xpath="//ng-content[contains(text(), 'Spam')]") public WebElement EmailSpamButton;
	@FindBy(xpath="//button[contains(text(), 'Spam')]") public WebElement EmailSpamButton1;

	@FindBy(xpath="//ng-content[contains(text(), 'Not Spam')]") public WebElement EmailNotSpamButton;

//	@FindBy(xpath="//*[contains(text(), 'Delete Email')]") public WebElement EmailDeleteButton;
	@FindBy(xpath="//ng-content[contains(text(), 'Delete')] | //button[contains(text(), 'Delete Email')]") public WebElement EmailDeleteButton;
	@FindBy(xpath="//button[contains(@ng-click, 'vm.okay()')]") public WebElement EmailConfirmButton;
	@FindBy(xpath="//div[contains(@class, 'media cursor-pointer pull-up')]") public WebElement EmailDetail;

	
	@FindBy(xpath="//input[contains(@ng-model,'vm.orderNumber.Prefix')]") public WebElement Prefix;
	@FindBy(xpath="//input[contains(@ng-model,'vm.orderNumber.Suffix')]") public WebElement PostFix;
	@FindBy(xpath="//i[contains(@class, 'fa fa-pencil')]") public List<WebElement> EditOrderNo;

	
	
	

	
	
	
	
	
	
	
	//public WebDriver driver;
/*	
	public CrmLocatiors(WebDriver driver){ 


	 //   this.driver = driver; 
	    } 
*/
	
}


// Dynamic Xpath
//$($x("//strong[contains(text(),'Less than Minimum Charge')]/parent::td//button[contains(@title,'Add Charge')]")).click();





