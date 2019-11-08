package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersLocators{

	//======================================================Login Locators======================================================//

	@FindBy(xpath="//input[contains(@id,'txtAsiNum')]")
	public WebElement ASINo;
	
	@FindBy(id="txtUserName")
	public WebElement UserName;
	
	@FindBy(id="txtPassword")
	public WebElement Password;
	
	@FindBy(xpath="//input[contains(@value,'Login')]")
	public WebElement LoginButton;
	
	//=================================================Landing Page Locators==================================================//
	
	@FindBy(xpath="//div[contains(text(),'ESP Orders')]")
	public WebElement Successfull_ESPOrdersLogin;
	
	@FindBy(linkText="CRM") public WebElement CRM; 
	@FindBy(xpath="//a[contains(text(),'ESP Web Home Page')]")
	public WebElement ESPWebHomePageLinkText;

	@FindBy(xpath="//a[contains(text(),'Orders')]")
	public WebElement ESPWebHomePage_OrdersTab;
	
	@FindBy(xpath="//ng-content[contains(text(),'Orders')]")
	public WebElement ESPWebHomePage_OrdersTab1;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search by product, supplier, etc.')]")
	public WebElement OrdersTab_SearchOrder_Field_Placeholder;
	
	//==============================================Dashboard Locators=========================================//
	@FindBy(xpath="//a[contains(@translate,'NAVIGATION.DASHBOARD')]")
	public WebElement Dasboard_Tab;
	
	@FindBy(xpath="//i[contains(@ng-class,'percentChange ')]")
	public WebElement Percentage_Dashboard;
	
	@FindBy(xpath="//i[contains(@ng-class,'percentChange ')]")
	public String Percentage_Dashboard_Icon;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-caret-up')]")
	public WebElement Ordersummary_Dashboard_Percentage;
	
	@FindBy(xpath="//div[contains(@content,'Difference in sales revenue year to date compared to the same time prior year.')]")
	public WebElement YearlySummary_Percentage_ToolTipText_Verification;
	
	@FindBy(xpath="//div[contains(@uib-tooltip,'Difference in sales revenue between the selected period and the prior period.')]")
	public WebElement OrderSummary_ToolTip_Text_Verification;
	
	@FindBy(xpath="//a[contains(@translate,'ORDERS.TABS.TAB_TITLE_ORDERS')]")
	public WebElement Orders_Title_Tab;
	
	//==============================================Create Order Locators====================================================//
	@FindBy(xpath="//td[contains(@ng-click,'vm.goToDetail($event, order.Id)')]")
	public WebElement OrderListing_Orderselection;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary dropdown-toggle')]")
	public WebElement OrdersScreen_OrderButton;
	
	@FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.CREATE_ORDER')]")
	public WebElement OrdersScreen_CreateOrderButton;
	
	
	@FindBy(xpath="//span[contains(@class,'close ui-select-match-close')]")
	public WebElement SalesPerson_Remove_FromOrder_Icon;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter or Select User')]")
	public WebElement SalesPersonField_CreateOrder;
	
	@FindBy(xpath="//div[@class='ng-binding ng-scope']")
	public WebElement SalesPerson_dropdown_Selection_CreateOrder;
	
	@FindBy(xpath="//p[contains(text(),'Please include a sales person on your Sales Order.')]")
	public WebElement OrderSaving_WithoutSalesPerson_Validation_Verification;
	
	@FindBy(xpath="//button[contains(@translate,'BUTTONS.OK')]")
	public WebElement SalesPerson_Validation_Check_OK_Button;
	
	@FindBy(xpath="//div[contains(@class,'btn-group dropdown')]/a")
	public WebElement CreateOrder_SalesOrderOption;
	
	@FindBy(xpath="//span[contains(@class,'caret')]/parent::button/parent::div//button[2]")
	public WebElement CreateCustomProduct_CaretIcon;
	
	@FindBy(xpath="//i[@class='fa fa-cog']")
	public List<WebElement> CogWheelIcon_CustomProducts;
	
	@FindBy(xpath="//a[contains(@translate,'BUTTONS.NEW_PRODUCT')]")
	public WebElement NewProduct_Link_CustomPro;
	
	@FindBy(xpath="//span[contains(@aria-label,'Select a Vendor activate')]")
	public WebElement CustomProduct_SupplierDropdown_Verification;
	
	@FindBy(xpath="//button[contains(@translate,'BUTTONS.CANCEL')]")
	public WebElement CustomProduct_Popup_Cancel_Button;
	
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-picture-o')]")
	public WebElement PushMenu;
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-edit')]")
	public WebElement UploadFile;
	
	
	
	@FindBy(xpath="//*[contains(@class, 'toast-title')]")
	public WebElement TitleMesg;
	
	
	@FindBy(xpath="//img[contains(@title, 'foil.DST')]")
	public WebElement DSTFileVerification;
	
	@FindBy(xpath="//Strong[contains(text(),'Sample.ai')]")
	public WebElement AIFileVerification;
	
	@FindBy(xpath="//Strong[contains(text(),'SVG.svg')]")
	public WebElement SVGFileVerification;
	
	@FindBy(xpath="//ng-content[contains(text(),'Create Quote')]")
	public WebElement CreateOrder_QuoteOption;
	
	@FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.CREATE_SAMPLE_REQUEST')]")
	public WebElement CreateSampleRequest;
	
/*	@FindBy(xpath="//li[contains(@ng-if,'currentUser.canCreateInvoice')]/a")
	public WebElement CreateOrder_InvoiceOption;*/

	@FindBy(xpath="//ng-content[contains(text(),'Create Invoice')]")
	public WebElement CreateOrder_InvoiceOption;
	
	@FindBy(xpath="//button[contains(@options,'vm.getConfirmCopyExtras')]")
	public WebElement CreateOrderButton_Quote;
	
	
	
	@FindBy(xpath="//span[contains(@ng-show, 'vm.model.Number')]")

	public WebElement OrderNumber;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.configs.search')]")
	public WebElement OrderlistingSearch;
	
	@FindBy(xpath="//tr[contains(@class, 'media cursor-pointer pull-up ng-scope')]") 
	public List<WebElement> GetNoOfRecords;


	@FindBy(xpath="//span[contains(text(),'Enter or')]")
	public WebElement CreateOrderScreen_CompanySearch_Textfield;
	
	@FindBy(xpath="//div[contains(@name,'Customer')]/input[contains(@ng-model,'select.search')]")
	public WebElement CreateOrderScreen_CompanyField_SendData;
	
	
	@FindBy(css="#ui-select-choices-row-0-1 > span > div > div.ellipsis.text-light.ng-scope")
	public WebElement CreateOrderScreen_CompanySearch_Selection;
	
	@FindBy(xpath="//div[contains(@class, 'well well-sm clearfix address-body no-margin')]")
	public WebElement CreateOrderScreen_BillingCompanyAddress;
	
	@FindBy(css="#pad-wrapper > div:nth-child(7) > div > div > div:nth-child(2) > div > order-contact > div > div.margin-left-20 > div > address")
	public WebElement CreateOrderScreen_ShippingCompanyAddress;
	
	@FindBy(css="#pad-wrapper > div:nth-child(7) > div > div > div:nth-child(3) > div > order-contact > div > div.margin-left-20 > div > address")
	public WebElement CreateOrderScreen_AckCompanyAddress;
	
	@FindBy(xpath="//div[contains(@ng-model,'CreditTerm')]/div/span")
	public WebElement Terms_Dropdown;
	
	@FindBy(xpath="//div[contains(@ng-model,'vm.order.ShippingDetail.Carrier')]/div/span")
	public WebElement ShipVia_Dropdown;
	
	@FindBy(xpath="//ul[contains(@repeat,'term.Code')]//li")
    public List<WebElement> TermsDropdownValues;
	
	@FindBy(xpath="//ul[contains(@repeat,'carrierType.Code')]//li")
	public List<WebElement> ShipViaDropdown_Values;
	
	@FindBy(xpath="//button[contains(text(),'Add Product')]")
	public WebElement CreateOrder_AddProductButton;
	
	@FindBy(xpath="//a[contains(text(),'Product Search')]")
	public WebElement CreateOrder_AddProductPopup_ProductSearchTab;
	
	@FindBy(name="keywords")
	public WebElement CreateOrder_AddProductPopup_SearchKeywordField;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-search')]")
	public WebElement CreateOrder_AddProductPopup_SearchButton;
	
	@FindBy(css="body > div.modal.modal-xl.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.modal-body-scroll.ng-scope > div > div > div.tab-pane.ng-scope.active > div.product-container.ng-scope > div > div > div > div:nth-child(1) > div")
	public WebElement CreateOrder_AddProductPopup_ProductSelection;
	
	@FindBy(xpath="//button[contains(text(),'Add Products')]")
	public WebElement CreateOrder_AddProductPopup_AddProductsButton;
	
	@FindBy(css="#toast-container")
	public WebElement CreateOrder_ProductAddedToOrder_Successfull;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.configureProduct')]")
	public WebElement CreateOrders_ConfigureButton;
	
	@FindBy(xpath="//a[contains(text(),'Projects')]")
	public WebElement AddProduct_ProjectsTab;
	
	@FindBy(css="body > div.modal.modal-xl.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.modal-body-scroll.ng-scope > div > div > div.tab-pane.ng-scope.active > div > div.col-sm-9 > div > div > div > div > div > div > div")
	public WebElement ProjectsProductSelection;
	//button[contains(text(),'Ok')] | //button[contains(text(),'Yes')]
	@FindBy(xpath="//input[contains(@placeholder,'QTY')] | //input[contains(@placeholder,'Qty')]")
	public WebElement CreateOrder_Configure_QTY_TextField;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	public WebElement CreateOrder_Configure_Continue_Button;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement CreateOrder_DecoratorScreen_Save_Button;
	
	@FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > thead > tr > th.item-actions > div:nth-child(2) > button.btn.btn-default.btn-sm.dropdown-toggle")
	public WebElement OrderDetails_Service_ToggleClick;
	
	@FindBy(xpath="//ng-content[contains(text(),'Show All Charges')]")
	public WebElement EditProduct_ShowAllVendorChargesButton;
	
	@FindBy(xpath="//strong[contains(text(),'Less than Minimum Charge')]/parent::td//button[contains(@title,'Add Charge')]")
	public WebElement VendorCharges_LessThanMinimumAddButton;
	
	@FindBy(xpath="//button[contains(text(),'Use Current Rates')]")
	public WebElement Orderdetails_UseCurrentRates_Button;
	
	@FindBy(xpath="//*[contains(@translate,'ORDERS.LABELS.PRODUCT.CPN')]")
	public WebElement Customer_NumberEditProduct;
	
	@FindBy(xpath="//input[contains(@id,'cpn')]")
	public WebElement EditProduct_CPN_Field_Verification;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.order.ShippingSameAsBilling')]")
	public WebElement Sameasbilling_Checkbox_ShippingAddress;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.order.AcknowledgementSameAsBilling')]")
	public WebElement Sameasbilling_Checkbox_Acknowledgement;
	
	@FindBy(xpath="//*[@id='pad-wrapper']/div[7]/div/div/div[1]/div/order-contact/div/div[3]/div/address")
	public WebElement BillingAddress_Orderlevel;
	
	@FindBy(xpath="//*[@id='pad-wrapper']/div[7]/div/div/div[2]/div/order-contact/div/div[3]/div/address")
	public WebElement ShippingAddress_Orderlevel;
	
	@FindBy(xpath="//*[@id='pad-wrapper']/div[7]/div/div/div[3]/div/order-contact/div/div[3]/div/address")
	public WebElement AcknowledgementAddress_OrderLevel;
	//================================================Add Services Locators====================================================
	@FindBy(xpath="//a[contains(text(),'Freight')]")
	public WebElement OrderDetails_Service_Freight;
	
	@FindBy(xpath="//h4[contains(text(),'Add Service')]")
	public WebElement OrderDetails_Service_Freight_Popup_Heading;
	
	@FindBy(xpath="//input[contains(@name, 'serviceName')]")
	public WebElement OrderDetails_Service_Freight_Popup_TitleField;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.service.Description')]")
	public WebElement OrderDetails_Service_Freight_Popup_DescriptionField;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.service.Cost')]")
	public WebElement OrderDetails_Service_Freight_Popup_Netcost;
	
	@FindBy(xpath="//select[contains(@ng-model,'vm.service.ServiceType')]")
	public WebElement OrderDetails_Service_Freight_Popup_ServiceType;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement OrderDetails_Service_Freight_Popup_SaveButton;
	
	@FindBy(xpath="//div[contains(text(),'Freight1')]")
	public WebElement Orderdetails_FreightDivDisplay_validation;
	
	@FindBy(css="#pad-wrapper > div:nth-child(10) > div > div > div > div.ng-scope > div > table > tbody > tr.ng-scope.service-row > td.item-actions.hover-btn-container.ng-scope > button.btn.btn-danger.btn-sm.btn-block.ng-scope.ng-isolate-scope")
	public WebElement Orderdetails_FreightDelete_Button;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	public WebElement Orderdetails_FreightDeletePopup_OKButton;
	
	//====================================================Edit Order Locators====================================================
	@FindBy(xpath="//button[contains(@ng-click,'vm.openProductModal')]")
	public WebElement OrdersDetails_EditButton;
	
    @FindBy(xpath="//tfoot//tr[contains(@class,'subtotals')]/td[3]/strong")
    public WebElement Orderdetails_SubTotal;
    
    @FindBy(xpath="//tfoot/tr/td[2]/p[3]")
    public WebElement Orderdetails_SalesTax;
	
	@FindBy(xpath="//tfoot/tr[3]/td[2]/strong")
	public WebElement Orderdetails_AmountDue;
	
	/*@FindBy(css="#pad-wrapper > div:nth-child(10) > div > div > div > div.ng-scope > div > table > tbody > tr.ng-scope.product-row > td.nested.item-details.ng-scope > table > tfoot > tr > td.item-price.text-right > strong")
	public WebElement Orderdetails_TotalPrice;
	*/
	@FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > tfoot > tr.subtotals > td:nth-child(3) > strong")
	public WebElement Orderdetails_TotalPrice;
	
	@FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > tbody:nth-child(4) > tr > td.nested.item-details.ng-scope > table > tfoot > tr > td.item-price.text-right > strong")
	public WebElement Orderdetails_FreightwithcreditTypePrice;
	
	@FindBy(xpath="//button[contains(@ng-click,'addServiceCharge')]")
	public WebElement ProductConfiguration_AddChargeLinkText;
	
	@FindBy(css="body > div:nth-child(1) > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > div > fieldset > service-charges > div > table > tbody > tr > td.item-qty > input")
	public WebElement ProductConfiguration_AddCharge_QTY;
	
	@FindBy(css="body > div:nth-child(1) > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > div > fieldset > service-charges > div > table > tbody > tr > td.item-cost > input")
	public WebElement ProductConfiguration_AddCharge_NetCost;
	
/*	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement ProductConfiguration_AddCharge_SaveButton;
	*/
	@FindBy(xpath="//button[contains(@ng-click,'vm.done(editProductForm)')]")
	public WebElement ProductConfiguration_AddCharge_SaveButton;
	
	@FindBy(css="body > div.modal.product-edit-modal-window.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > div > service-charges > div > ng-transclude > table > tbody:nth-child(2) > tr > td:nth-child(1) > button")
	public WebElement ProductConfiguration_AddVendorCharge_LinkText;
	
	@FindBy(css="body > div.modal.product-edit-modal-window.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > div > fieldset > service-charges > div > table > tbody:nth-child(3) > tr > td.item-cost > input")
	public WebElement ProductConfiguration_VendorChargeNetCost;
	
	@FindBy(xpath="//a[contains(text(),'Decoration')]")
	public WebElement EditOrder_DecorationTab;
	
	@FindBy(xpath="//select[contains(@ng-model,'decoration.getSetLocation')]")
	public WebElement EditOrder_Decoration_Location;
	
	@FindBy(xpath="//span[contains(text(), 'Enter or Select')]")
	public WebElement EditOrder_Decoration_ImprintMethod;
	
	@FindBy(xpath="//input[contains(@placeholder,'Enter or Choose Imprint Method')]")
	public WebElement EditOrder_Decoration_ImprintMethod1;
	
	@FindBy(xpath="//span[contains(text(), 'Laser Engraved')]")
	public WebElement EditOrder_Decoration_Imprint_SelectValue;
	
	@FindBy(xpath="//ng-content[contains(text(),'Attach Files')]")
	public WebElement EditOrder_Decoration_ArtWorkImageUploadButton;
	
	@FindBy(xpath="//p[contains(@class, 'artwork-upload-right col-sm-4 col-md-3')]/asi-file-upload/div/div/div/button")
	public WebElement UploadButton;
	
	@FindBy(xpath="//i[contains(@class,'artwork-container-sm')]")
	public WebElement EditOrder_Decoration_Existing_Artwork_Selection;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-download')]")
	public WebElement EditOrder_Decoration_ArtworkDownload;
	
	@FindBy(xpath="//button[contains(@ng-if,'delete')]")
	public WebElement EditOrder_Decoration_ArtworkDelete_Icon;
	
	@FindBy(xpath="//button[contains(@translate,'BUTTONS.OK')]")
	public WebElement Artwork_Delete_Confirm;
	
	@FindBy(xpath="//div[contains(@class,'artwork-name ellipsis ng-binding')]")
	public WebElement EditOrder_Decoration_Artwork_Existence_Verification;
	
	@FindBy(xpath="//div[contains(@class,'artwork-name ellipsis ng-binding')]")
	public List<WebElement> EditOrder_Decoration_Artwork_Deletion_Verification;
	
	

	@FindBy(xpath="//input[contains(@ng-model,'decoration.Location.VendorCode')]")
	public WebElement EditOrder_Decoration_VendorCode;
	
	@FindBy(xpath="//input[contains(@ng-model,'detail.LogoSize.Value')]")
	public WebElement EditOrder_Decoration_ImprintSize;
	
	@FindBy(xpath="//input[contains(@ng-model,'detail.LogoColors[0].Value')]")
	public WebElement EditOrder_Decoration_ImprintColor;
	
	@FindBy(xpath="//select[contains(@ng-model,'decoration.ProofType')]")
	public WebElement EditOrder_Decoration_ProofType;
	/*
	@FindBy(xpath="//textarea[contains(@ng-model,'decoration.Comments')]")
	public WebElement EditOrder_Decoration_VendorNotes;
	*/
	@FindBy(xpath="//*[contains(@ng-model,'decoration.Comments')][@name]")
	public WebElement EditOrder_Decoration_VendorNotes;
	
	@FindBy(xpath="//ng-content[contains(text(), 'Add Charge')]")
	public WebElement EditOrder_Decoration_AddCharge_LinkText;
	
	@FindBy(xpath="//input[contains(@ng-model, 'charge.Cost')]")
	public WebElement EditOrder_Decoration_NetCostField;
	

	
	//@FindBy(xpath="//div[contains(@class,'form-group _40 pull-right no-margin')]/div[1]/div/span")
	
	
	@FindBy(xpath="//span[contains(@aria-label,'Select a Decorator activate')]")

	public WebElement DecoratorCompanySelection;
	
	
	@FindBy(xpath="//input[contains(@aria-label, 'Select a Decorator')]")
	public WebElement TypeDecorator;
	@FindBy(xpath="//div[contains(@class,'pull-left')]/i/parent::div")
	public WebElement DecoratorCompanySearch;
	
	@FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > tbody:nth-child(2) > tr:nth-child(1) > td.nested.item-details")
	public WebElement Orderdetails_DecorationTab_DecorationDisplayVerification;
	
	@FindBy(xpath="//input[contains(@ng-model,'decoration.CommentsVisible')]")
	public WebElement VendorNotes_Visible_Checkbox;
	
	@FindBy(xpath="//input[contains(@ng-model,'detail.InstructionsVisible')]")
	public WebElement DecorationInstructions_Visible_Checkbox;
	
	@FindBy(xpath="//*[contains(@ng-model,'detail.Instructions')][@name='comments'] | //*[contains(@ng-model,'detail.Instructions')][@name]")
	public WebElement DecorationInstructions_Textarea;
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Instructions')]")
	public WebElement EditOrder_InstructionTab;
	
	@FindBy(xpath="//textarea[contains(@ng-model,'instruction.Content')]")
	public WebElement EditOrder_InstructionTextArea;
	
	@FindBy(xpath="//a[contains(@ng-click, 'vm.openProductModal(lineItem')]")
	public WebElement ViewInstructions;
	
	@FindBy(xpath="//a[contains(@ng-click, 'vm.openProductModal(lineItem')]")
	public List<WebElement> NoViewInstructions_Verification_AfterCopyingQuote;
	
	@FindBy(xpath="//li[contains(@class,'uib-tab nav-item ng-scope ng-isolate-scope')]/a//uib-tab-heading/ng-content[contains(text(),'Shipping')]")
	public WebElement EditOrder_ShippingTab;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div/div[1]/div/div/div[4]/ng-content/product-shipping/div/div[3]/div/div/div[1]/div[2]/div[2]/div[2]/order-contact/div[2]/div/div/div")
	public WebElement ShippingAddress_Verification_At_ProductLevel;

	
	@FindBy(xpath="//button[contains(@ng-click,'vm.addNewDestination()')]")
	public WebElement EditOrder_ShippingTab_AddShippingDestinationButton;
	

/*	@FindBy(xpath="//div[contains(@class,'clearfix margin-bottom-5')]/ul/li[1]/a")
	public WebElement Orderdetails_PricingTab;
	
	@FindBy(xpath="//div[contains(@class,'clearfix margin-bottom-5')]/ul/li[2]/a")
	public WebElement Orderdetails_DecorationTab;
	
	@FindBy(xpath="//div[contains(@class,'clearfix margin-bottom-5')]/ul/li[3]/a")
	public WebElement Orderdetails_ShippingTab;
		
	@FindBy(xpath="//div[contains(@class,'clearfix margin-bottom-5')]/ul/li[4]/a")
	*/
	
	@FindBy(xpath="//ng-content[contains(text(),'Pricing')]/parent::a")
	public WebElement Orderdetails_PricingTab;
	
	@FindBy(xpath="//ng-content[contains(text(),'Decoration')]/parent::a")
	public WebElement Orderdetails_DecorationTab;
	
	@FindBy(xpath="//ng-content[contains(text(),'Shipping')] | //ng-content[contains(text(),'Shipping')]")
	public WebElement Orderdetails_ShippingTab;
		
	@FindBy(xpath="//ng-content[contains(text(),'Purchase Orders')] | //ng-content[contains(text(),'Purchase Orders')]")
	
	public WebElement Orderdetails_PurchaseOrderTab;
	
	@FindBy(xpath="//tbody[contains(@ng-if, 'vendor.Products.length')]") 
	public List<WebElement> GetPOSFromPOTab;
	
	@FindBy(xpath="//tbody[contains(@ng-repeat, 'shippingDetail in lineItem.ShippingDetails track by $index')]") 
	public List<WebElement> GetAddressFromShippingTab;
	
	@FindBy(css="body > div.modal.product-edit-modal-window.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > product-shipping > div > div:nth-child(4) > div > div > div:nth-child(2) > div.row.destination-from > div.col-xs-11 > div > div.ui-select-container.ui-select-bootstrap.dropdown.ng-not-empty.ng-valid.ng-touched > div.ui-select-match > span > span.ui-select-match-text.pull-left")
	public WebElement ShippingDestination_WithNewDecoratorCompany_CompanySelection;
	
	@FindBy(xpath="//strong[contains(@translate, 'ORDERS.LABELS.SHIP_FROM')]/following-sibling::small")
	public WebElement ShippingDestination_WithNewDecoratorCompany_ShippingAddress_Verification;
	
	//@FindBy(xpath="//div[contains(@placeholder, 'Enter or Choose Contact')]/span")
	//public WebElement ShippingTab_NewDestinationAddressCompany_Field;
	
	@FindBy(xpath="//span[contains(@aria-label, 'Ship From activate')]")
	public List<WebElement> ShippingTab_NewDestinationAddressCompany_Field;
	
	//@FindBy(xpath="//span[contains(@aria-label, 'Ship From activate')]/span")
	//public WebElement ShippingTab_NewDestinationAddressCompany_Field;
	
	
	
	@FindBy(xpath="//div[contains(@class,'ui-select-choices-row ng-scope')][2]")
	public WebElement ShippingTab_NewDestinationAddress_Selection;
	
/*	@FindBy(css="body > div.modal.product-edit-modal-window.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > product-shipping > div > div:nth-child(2) > div > div > div:nth-child(3) > div > div.col-sm-12.text-right > button")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton;
	*/
	

	@FindBy(xpath="//button[contains(@ng-click, 'vm.openSplitShipmentModal')]/i")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.okay()')]")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton;
	

	
	@FindBy(xpath="//span[contains(text(),'Enter or Choose Contact')]")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField1;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div[1]/product-shipping/div/div/div/div/div[1]/div[2]/div[2]/div[2]/order-contact/div[1]/div/div[1]/span/span[2]")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton_RemoveCrossIcon_CustomerAddressField1;
	
	@FindBy(css="body > div.modal.split-shipment.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div > product-shipping > div > div:nth-child(2) > div > div > div:nth-child(2) > div.row.destination-to > div.col-xs-11 > div:nth-child(2) > order-contact > div.form-group.ng-scope > div > div.ui-select-match.ng-scope > span > span.ui-select-match-text.pull-left.ui-select-allow-clear")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField2;
	
	@FindBy(xpath="//span[contains(text(),'Feasterville-Trevose, ')]")
	public WebElement EditOrder_ShippingTab_SplitShipmentButton_OKProceedButton_CustomerAddressField_AddressSelection;
	
	@FindBy(xpath="//button[contains(text(),'Next - Enter Quantity')]")
	public WebElement EditOrder_Splitshipment_EnterQuantityNextButton;
	
	@FindBy(css="body > div.modal.split-shipment.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr.ng-scope > td > div > div > input")
	public WebElement EditOrder_Splitshipment_Shipment1_QTY;
	
	@FindBy(xpath="//input[contains(@name, 'qty')]")
	public WebElement EditOrder_Splitshipment_Shipment2_QTY;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.save')]")
	public WebElement EditOrder_Splitshipment_SaveButton;
	
	@FindBy(xpath="//p[contains(@translate,'ORDERS.MESSAGES.SPLIT_SHIPMENT_MSG1')]")
	public WebElement ErrorMessage_Verification_QuantityCheck;
	
	@FindBy(xpath="//div[contains(@ng-if, 'lineItem.isSplitShipment')][contains(text(), 'Shipment 1 of')]")
	public WebElement Orderdetails_shippingTab_SplitshipmentExistence_Verification;
	
	@FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > tbody > tr > td.nested > table > tbody:nth-child(2)")
	public WebElement Orderdetails_ShippingTab_AddNewDestinationAddressVerification;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.order.POReference')]")
	public WebElement Order_POReferenceField;
	
	@FindBy(xpath="//a[contains(@popover-class,'tooltip-references')][contains(@class,'ng-binding ng-isolate-scope')]")
	public WebElement PartialPaymentLink;
	
	@FindBy(xpath="//button[contains(@id,'close-order')]")
	public WebElement CloseOrder_Icon;
	
	@FindBy(xpath="//button[contains(@ng-click,'closeAndExit()')]")
	public WebElement CloseOrderAfterEditing_Button;
	
	@FindBy(xpath="//a[contains(@id, 'userInfo')]")
	public WebElement OrderListing_UserInfoIcon;
	//===================================================Settings Locators==================================================//
	@FindBy(xpath="//a[contains(@href,'/settings/import')]")
	public WebElement UserInfoIcon_Settings;
	
	@FindBy(xpath="//a[contains(text(),'Sales Tax')]")
	public WebElement Settings_SalesTax;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.autoCalculateRates')]")
	public WebElement Settings_SalesTax_AutoCalculateTaxes_Checkbox;
	
	@FindBy(xpath="//td[contains(text(),'PA')]/parent::tr//span[contains(@ng-show,'!vm.autoCalculateRates')]")
	public WebElement Settings_SalesTax_EditTaxButton;
	
	@FindBy(xpath="//td[contains(text(),'PA')]/parent::tr/td[3]/div//input[contains(@ng-model,'tax.Components[0].TaxRate')]")
	public WebElement Settings_SalesTax_EditTaxField;
	
	@FindBy(xpath="//td[contains(text(),'PA')]/parent::tr/td[4]/div//input[contains(@ng-model,'tax.ChargeTaxOnShipping')]")
	public WebElement ChargeTaxOnShipping_Checkbox;
	
	@FindBy(xpath="//td[contains(text(),'PA')]/parent::tr//button[contains(@title,'Save')]")
	public WebElement Settings_SalesTax_EditTaxField_SaveButton;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.chargeTaxesOnShipping')]")
	public WebElement Settings_ShippingSalesTaxCheckbox;
	
	@FindBy(css="#pad-wrapper > div > div.col-xs-9.col-xl-10 > div > div > div.panel-body > div:nth-child(1) > div > div > div.row.margin-top-10")
	public WebElement Settings_AddressExistenceVerification;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.openAddressModal()')]")
	public WebElement Settings_AddAddressButton;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.address.Line1')]")
	public WebElement Settings_AddAddress_AddressNameField;
	
	@FindBy(xpath="//a[contains(@ng-click,'vm.save()')]")
	public WebElement Settings_AddAddress_SaveButton;
	
	@FindBy(css="#pad-wrapper > div > div.col-xs-9.col-xl-10 > div > div > div.panel-body > div:nth-child(3) > table > tbody")
	public WebElement Settings_TaxesListing_With_PA_State_ExistenceVerification;
	
	@FindBy(xpath="//a[contains(text(),'Document Design')]")
	public WebElement Settings_DocumentDesign_Option;
	
	@FindBy(xpath="//select[contains(@ng-model,'vm.selectedDocument')]")
	public WebElement Settings_DocumentDesign_DocumentSelectionDropdown;
	
	@FindBy(xpath="//ng-content[contains(text(),'CPN Number')]/parent::label/input")
	public WebElement CustomerFacingDoc_CPNNumber_Selection;
	
	@FindBy(xpath="//ng-content[contains(text(),'Product Number')]/parent::label/input")
	public WebElement CustomerFacingDoc_ProductNumber_Selection;
	
	@FindBy(id="saveDocSettings")
	public WebElement SavingDocSettings;
	
	@FindBy(xpath="//*[contains(text(),'CPN-')]")
	public WebElement CustomerFacingDoc_CPN_Visible_Verification;
	
	//=============================================DownLoad & Preview===========================================================================//
	@FindBy(xpath="//i[contains(@class,'fa fa-download')]")
	public WebElement OrderLevel_Order_Download;
	
	@FindBy(xpath="//strong[contains(text(),'Download')]")
	public WebElement Orderlevel_DownloadPopup_DownloadButton;
	
	@FindBy(xpath="//ng-content[contains(text(),'Preview')]")
	public WebElement PreviewButton_Orderdetails;
	
	@FindBy(xpath="//h4[contains(text(),'Purchase Order')]")
	public WebElement PreviewPopUp_PurchaseOrder;
	
	@FindBy(css="body > div.modal.modal-wide.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.choose-order-action-modal.margin-bottom-20.ng-scope > div > div:nth-child(2) > div > div > div.list-group.in.collapse > div:nth-child(1) > div > i")
	public WebElement PreviewPopup_PurchaseOrderSelection;
	
	@FindBy(xpath="//h4[contains(text(),'Acknowledgment')]")
	public WebElement PreviewPopUp_Acknowledgement;
	
	@FindBy(xpath="//h4[contains(text(),'Sales Order')]")
	public WebElement PreviewPopUp_SalesOrder;
	
	@FindBy(xpath="//div[contains(@class,'col-xs-6 col-md-6')]/div/div[3]/p")
	public WebElement InHand_At_SalesOrder_Verification_Preview;
	
	@FindBy(xpath="//h4[contains(text(),'Packing List')]")
	public WebElement PreviewPopUp_PackingListMyCompany;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-lg col-xs-2 fa-dot-circle-o')]")
	public WebElement PreviewPopup_PackingWithProductName;
	
	@FindBy(xpath="//a[contains(@class,'btn btn-primary margin-top-20 margin-bot-20 padding-left-30 padding-right-30')]")
	public WebElement PreviewPopUp_PreviewButton;
	
	@FindBy(xpath="//span[contains(@class,'doc-title')]")
	public WebElement PurchaseOrder_Preview_PurchaseOrderNumberVerification;
	
	@FindBy(css="span[class='text-light']")
	public WebElement OrdernoPreviewVerification;
	
	@FindBy(xpath="//table[contains(@class,'table table-bordered table-col-5 table-cost')]/tbody")
	public WebElement PurchaseOrder_Preview_SplitShipment1Area;
	
	@FindBy(xpath="//div[contains(@class,'decorations')]")
	public WebElement PurchaseOrder_Preview_DecorationDetails_SplitShipment1Area;
	
	@FindBy(xpath="//tbody[contains(@class,'line-item')][3]")
	public WebElement PurchaseOrder_Preview_ShippingDetailsHeadingVerification;
	
	@FindBy(xpath="//tbody[contains(@class,'line-item')][4]")
	public WebElement PurchaseOrder_Preview_SplitShipment2Area;
	
	@FindBy(css="body > div.container-fluid > div > div.row.break-word > div:nth-child(2) > div > div:nth-child(2)")
	public WebElement PurchaseOrder_Preview_DecorationDetails_SplitShipment2Area;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[4]/td/div/table/tbody/tr[6]/td[1]/div/table/tbody/tr/td[1]/div/div")
	public WebElement PurchaseOrder_Preview_ShippingToDetails;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[4]/td/div/table/tbody/tr[6]/td[1]/div/table/tbody/tr/td[1]/div/div")
	public WebElement PurchaseOrder_Preview_SalesPersonDetailsVerification;
	
	@FindBy(xpath="//ol[contains(@class,'decoration-artwork list-inline')]/li[2]/a")
	public WebElement PurchaseOrder_Preview_Decoration_DownloadFile;
	
	@FindBy(xpath="//ol[contains(@class,'decoration-artwork list-inline')]/li[1]/a")
	public WebElement PurchaseOrder_Preview_Decoration_Atwork_DownloadFile;
	
	@FindBy(xpath="//ul[contains(@class,'nav navbar-nav')]/li[1]/a/button")
	public WebElement PurchaseOrder_Preview_POAtworkDownload;
	
/*	@FindBy(xpath="//a[contains(@class,'btn btn-link')][3]")
	public WebElement PurchaseOrder_Preview_PODocDownload;*/
	
	@FindBy(xpath="//ul[contains(@class,'nav navbar-nav')]/li[3]/a/button")
	public WebElement PurchaseOrder_Preview_PODocDownload;
	

/*	@FindBy(xpath="//a[contains(@class,'btn btn-link ')]/i")
	public WebElement SalesOrderPreview_DownloadPDFButton;
*/	
	
	
	@FindBy(xpath="//ul[contains(@class,'nav navbar-nav')]/li[1]/a/button")
	public WebElement SalesOrderPreview_DownloadPDFButton;
	
	@FindBy(xpath="//ul[contains(@class,'nav navbar-nav')]/li[2]/a/button")
	public WebElement PurchaseOrder_Preview_ViewPackagingList;
	
	@FindBy(xpath="//body[contains(@class,'html ng-scope block-ui block-ui-anim-fade')]")
	public WebElement PackingList_DisplayView;
	
	
	@FindBy(xpath="//i[contains(@class,'fa fa-send')]")
	public WebElement PO_SendButton;
	
	
	
	@FindBy(xpath="//i[contains(@class, 'fa fa-paper-plane')]")
	public WebElement SendButton;
	
	@FindBy(xpath="//strong[contains(text(), 'Continue')]")
	public WebElement Continuebutton;
	
	@FindBy(xpath="//button[contains(@ng-click, 'vm.back(vm.fromLocation)')]")
	public WebElement Backbutton1;
	


	
	@FindBy(xpath="//span[contains(@class,'close ui-select-match-close')]")
	public WebElement Send_PO_ToandCCRemoveIcon;
	
	@FindBy(xpath="//input[contains(@ng-model,'$select.search')]")
	public WebElement SendPO_To_Field;
	
	@FindBy(css="body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > form > div.modal-body > div > div > div > div > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(1) > input")
	public WebElement SendSales_To_Field;
	
	@FindBy(xpath="//input[contains(@id, 'includeDocument')]")
	public WebElement VerifyDocumentCheckbox;
	
	@FindBy(xpath="//input[contains(@ng-model,'$select.search')]")
	public WebElement SendAck_To_Field;
	
	
	//==================================Create Quote=====================================================//
	@FindBy(xpath="//button[contains(text(),'Create Quote')]")
	public WebElement OrderPage_CreateQuoteButton;
	
	@FindBy(css="div.col-xs-12 col-sm-6 border-right")
	public WebElement CreateQuote_BillingContactAddress;
	
	@FindBy(css="#pad-wrapper > div:nth-child(4) > div > div > div:nth-child(2) > order-contact > div.well.well-sm.clearfix.address-body.no-margin")
	public WebElement CreateQuote_ShippingContactAddress;
	
	@FindBy(css="#pad-wrapper > div:nth-child(3) > div > div > div.col-md-6.col-lg-6.col-xl-6.border-right > order-contact > div.well.well-sm.clearfix.address-body.no-margin")
	public WebElement CreateInvoice_BillingContactAddress;
	
	@FindBy(css="#pad-wrapper > div:nth-child(3) > div > div > div:nth-child(2) > order-contact > div.well.well-sm.clearfix.address-body.no-margin")
	public WebElement CreateInvoice_ShippingContactAddress;
	
	@FindBy(xpath="//*[@id='clipboardProducts']/div/div/div[1]/div")
	public WebElement AddProduct_Clipboard_US_Product;
	
	@FindBy(xpath="//input[contains(@ng-model,'ShippingAccountVisible')]")
	public WebElement AccountNo_Visible_Checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	public WebElement AccountNo_Visible_Confirm;
	
	@FindBy(xpath="//button[contains(text(),'Preview')]")
	public WebElement Quote_Preview_Button;
	
	@FindBy(xpath="//*[@id='order-contact']/div/div[2]/div[4]/p")
	public WebElement ShipAccount_QuotePreview_Verification;
	
	@FindBy(xpath="//*[@id='order-contact']/div/div[2]/div[4]/p")
	public List<WebElement> ShipAccount_QuotePreview_Verification_ListCount;
	
	@FindBy(xpath="//b[contains(text(), 'Notes')]/parent::*")
	public WebElement VendorNotes_DecoratorInstructions_QuotePreview_Verification;
	
	@FindBy(xpath="//b[contains(text(), 'Instructions:')]/parent::td")
	public WebElement DecoratorInstructions_QuotePreview_Verification;
	
	@FindBy(xpath="//ng-content[contains(text(),'Download')]")
	public WebElement QuoteDownload_Button;
	
	@FindBy(xpath="//ng-content[contains(@translate,'ORDERS.MESSAGES.QUOTE.RE')]")
	public WebElement Requote_Option_QuoteDetails;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.options.IncludeInstructions')]")
	public WebElement Copy_NoInstructions_To_NewQuote;
	
	//==================================Create Order From Quote===============================================//
	@FindBy(xpath="//button[contains(text(),'Create Order')]")
	public WebElement Quote_CreateOrderbutton;
	
	@FindBy(xpath="//a[contains(@ng-if,'vm.model.length')]")
	public WebElement QuoteOrderLinkedtransaction;
	
	@FindBy(xpath="//ng-content[contains(text(),'Create Invoice')]")
	public WebElement Order_CreateInvoice;
	
	@FindBy(xpath="//div[contains(@class, 'popover-content')]")
	public WebElement LinkedTransactionDisplayedVerification;
	
	@FindBy(xpath="//a[contains(@ui-sref, 'orders.detail')]")
	public WebElement LinkedTransactionOrderNumber_Linkedtext;
	
	@FindBy(xpath="//a[contains(@external-app-link, 'ProductDetails&referrerPage')]")
	public WebElement ProductName;
	
	@FindBy(xpath="//a[contains(@class,'ng-binding')][contains(text(),'Invoice')]")
	public WebElement LinkedTransactionInvoice;
	
	@FindBy(xpath="//h4[contains(@ng-if,'!vm.canEditOrderNumber(vm.model)')]")
	public WebElement CreateOrder_OrderQuoteTextVerification;
	//@FindBy(xpath="//ng-content[contains(text(),'More')]")
	@FindBy(xpath="//ng-content[@translate='LABELS.MORE']")
	public WebElement Orderdetails_MoreButton;
	
	@FindBy(xpath="//ng-content[contains(@translate,'BUTTONS.CREATE_QUOTE')]")
	public WebElement Orderdetails_MoreButton_CreateQuote;
	
	@FindBy(xpath="//button[contains(@ng-class,'vm.confirmButtonClass')]")
	public WebElement CreateQuote_CopyOptions_Continue_Button;
	
	@FindBy(xpath="//ng-content[contains(@translate,'ORDERS.ALERTS.QUOTE.COPY')]")
	public WebElement CopyQuote_FromOrderDetails_Verification;
	
	@FindBy(xpath="//ng-content[contains(text(),'Delete Order')]")
	public WebElement Orderdetails_MoreButton_DeleteOrder;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.okay()')]")
	public WebElement DeleteOrder_Okbutton;
	
	@FindBy(xpath="//button[contains(@ng-click, 'saveAndClose()')]")
	public WebElement CloseAndExit;
	
	@FindBy(xpath="//ng-content[contains(text(),'Reorder')]")
	public WebElement MoreButton_Reorder;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.options.IncludePoReference')]")
	public WebElement VerifyPopUpCheckBox;
	
	@FindBy(xpath="//button[contains(@ng-class, 'vm.confirmButtonClass')]")
	public WebElement ContinueReorder;
	
	@FindBy(xpath="//span[contains(@class, 'ng-scope')]/strong")
	public String Reorder_Verification_Wait;
	
	@FindBy(xpath="//span[contains(@class, 'ng-scope')]/strong")
	public WebElement Reorder_Verifications;
	
	@FindBy(xpath="//div[contains(@class,'toast-message')]")
	public WebElement DeleteOrder_ErrorMessageVerification;
	
    @FindBy(xpath="//input[contains(@ng-model,'vm.contact.Address.Line1')]")
	public WebElement EditShippingAddressField;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.contact.Address.PostalCode')]")
	public WebElement EditShippingPostalCodeField;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement EditShippingSaveButton;
	
	@FindBy(xpath="//button[contains(text(),'Ok')] | //button[contains(text(),'Yes')]")
	public WebElement EditingConfirm;
	
/*	@FindBy(xpath="//button[contains(text(),'Yes')] | //button[contains(text(),'Ok')]")
	public WebElement EditingConfirm1;*/
	
	@FindBy(xpath="//button[contains(text(),'Ok')] | //button[contains(text(),'Yes')]")
	public WebElement DateConfirm;
	
/*	@FindBy(xpath="//button[contains(text(),'Yes')]")
	public WebElement DateConfirm1;*/

	//=====================================================Invoice Screen====================================//
	@FindBy(xpath="//button[contains(@ng-click,'vm.openPaymentModal()')]")
	public WebElement Invoice_EnterPaymentButton;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.payment.IsFullPayment')]")
	public WebElement Invoice_EnterPaymentPopup_PayinFullCheckbox;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.payment.Amount')]")
	public WebElement Invoice_EnterPaymentPopup_PayinFullTextField;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement Invoice_EnterPaymentPopup_SaveButton;
	
	@FindBy(xpath="//ng-content[contains(text(),'Delete Invoice')]")
	public WebElement Invoice_DeleteInvoice;
	
	//====================================================Conversions for invoice Screen For Payment Calculation================//
	
	@FindBy(css="#pad-wrapper > div.row > div > div > div:nth-child(2) > div > table > tfoot > tr.subtotals > td:nth-child(2) > strong")
	public WebElement SubtotalWithoutServicecharges_InvoiceScreen;
	
	@FindBy(css="#pad-wrapper > div.row > div > div > div:nth-child(2) > div > table > tfoot > tr:nth-child(2) > td:nth-child(2) > p:nth-child(4)")
	public WebElement SalesTaxWithoutServiceCharges_InvoiceScreen;
	
	@FindBy(css="#pad-wrapper > div.row > div > div > div:nth-child(2) > div > table > tfoot > tr.totals > td:nth-child(2) > strong")
	public WebElement AmountDueWithoutServiceCharges_InvoiceScreen;
	
	
	//==========================================================Total Cost Locators Product Details(Order)========================//
	@FindBy(xpath="//tr[contains(@ng-repeat, 'lineItem in group')]/td[3]/table/tfoot/tr/td[4]/strong")

	public WebElement TotalPrice_SplitShipment1;
	
	@FindBy(xpath="//tr[contains(@ng-repeat, 'lineItem in group')][2]/td[3]/table/tfoot/tr/td[4]/strong")

	public WebElement TotalPrice_SplitShipment2;
	
	@FindBy(xpath="//tr[contains(@class,'total-row')]/td[@class='text-right']")
	public WebElement TotalPricePreview;
	
	//===========================================================Sales Order Preview Locators=====================================//
	@FindBy(xpath="//button[contains(@ng-click,'vm.cancel()')]")
	public WebElement ClosePreviewPopup;
	
	@FindBy(xpath="//button[contains(@ng-click,'vm.cancel()')]")
	public List<WebElement> ClosePopup;
	
	@FindBy(xpath="//table[contains(@class,'order-contact-box-row')]/tbody/tr/td[1]/div/div")
	public WebElement SalesOrderPreview_SalesPersonAddressDetails;
	
	@FindBy(xpath="//table[contains(@class,'order-contact-box-row')]/tbody/tr/td[2]/div/div")
	public WebElement SalesOrderPreview_BillingandShippingAddress;
	
	@FindBy(xpath="//table[contains(@class,'table table-bordered table-col-5 ')]/tbody[1]")
	public WebElement SalesOrderPreview_ProductSplit1Details;
	
	@FindBy(xpath="//div[contains(@class,'decorations')]")
	public WebElement SalesOrderPreview_DecorationdetailsSplit1details;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[4]/td/div/table/tbody/tr[6]/td[1]/div")
	public WebElement SalesOrderPreview_ShippingDetails_ShipFrom;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[3]/td/div/table/tbody/tr[12]/td[1]/div/table/tbody/tr/td[3]/div/div/div[2]")
	public WebElement SalesOrderPreview_CompleteShippingDetails;
	
	@FindBy(xpath="//tr[contains(@class,'instructions')]")
	public WebElement SalesOrderPreview_InstructionsVerification;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[5]/td/section/div/table/tbody/tr[1]")
	public WebElement SalesOrderPreview_Freight1Display;
	
	@FindBy(xpath="//*[@id='order-container-table-el']/tbody/tr[5]/td/section/div/table/tbody/tr[2]")
	public WebElement SalesOrderPreview_Freight2Display;
	
	@FindBy(xpath="//section[contains(@id,'total')]/div/table/tbody/tr[2]/td[2]")
	public WebElement SalesOrderPreview_TotalAmount;
	

	@FindBy(xpath="//address[contains(@class,'no-margin')]/parent::div/following::address[1]")
	public WebElement SalesOrderPreview_BillingToAddress;
	
	@FindBy(xpath="//address[contains(@class,'no-margin')]/parent::div/following::address[2]")
	public WebElement SalesOrderPreview_ShippingToAddress;
	
	
	//=================================================Blind Ship Locators======================================================//
	@FindBy(xpath="//input[contains(@ng-model,'vm.order.IsBlindShip')]")
	public WebElement Orderdetail_BlindShipCheckbox;
	
	@FindBy(xpath="//button[contains(@ng-class,'vm.confirmButtonClass')]")
	public WebElement Order_BlindShipConfirm;
	
	@FindBy(xpath="//span[contains(text(),'Blind Ship')]")
	public WebElement BlindShipText_ShippingDetails_PurchaseOrder;
	
	//===================================================Acknowlodgement Doc Locators==========================================//
	@FindBy(xpath="//tr[contains(@class,'instructions')]")
	public WebElement Acknowledgement_Instructions;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[1]/address")
	public WebElement AcknowledgementPreviewAddress;
	
	//==================================================WESP Locators========================================================//
    @FindBy(xpath="//a[contains(text(),'ESP Web')]")
    public WebElement ESPWeb_Tab;
    
    @FindBy(xpath="//input[contains(@id,'searchKeyword')]")
    public WebElement ProductSearch_TextField;
    
    @FindBy(xpath="//button[contains(@id,'btnQuickSearch')]")
    public WebElement ProductQuickSearchButton;
    
    @FindBy(xpath="//label[contains(@ng-click,'methods.toggleClientSafe(clientSafeEnabled)')]")
    public WebElement Settings_SafeMode_ToggleStatusButton;
    
    @FindBy(xpath="//input[contains(@id,'client-safe-checkbox')]")
    public WebElement Settings_SafeMode_ToggleGetStatusButton;
    
    
    @FindBy(xpath="//input[contains(@ng-model,'searchWithinTerms')]")
    public WebElement SearchWithinTerms_SearchField;
    
    @FindBy(xpath="//button[contains(@id,'btnSearchWithin')]")
    public WebElement SearchWithinTerms_GoButton;
   @FindBy(xpath="//span[contains(@title,'E-Comm Order')]")
    
    public WebElement Product_OrderButton;
    
    @FindBy(xpath="//span[contains(@ng-if,'product.CanEcommOrder')]")
    public WebElement ProductHover_OrderButton;
    
    
	@FindBy(xpath="//table[contains(@class, 'table table-striped table-bordered')]") 
	public List<WebElement> Price_Grid;

  
  
    
    @FindBy(xpath=" //input[contains(@placeholder, 'QTY')]")
    public WebElement QTY_Grid;
 
    
    @FindBy(xpath="//*[@id='configurator-view-table-view']/div[1]/div/div[2]/button")
    public WebElement ClickAtSelect;
    //======= @FindBy(xpath="//button[contains(@ng-click,'::vm.next(variant)')]")
    @FindBy(xpath="//ng-content[contains(@translate, 'SELECT')]")
     public WebElement ShoppingCartProduct_SelectButton;
    
    @FindBy(xpath="//button[contains(@class,'btn btn-xs btn-primary ng-isolate-scope')]")
    public WebElement Order_SavetoclipboardButton;
    
    @FindBy(xpath="//button[contains(@class, 'btn btn-sm btn-default btn-block ng-isolate-scope')]/span")
    public WebElement ProductOrderButton_QuickInfo;
    
    @FindBy(xpath="//a[contains(@ng-click,'methods.closeInPageQuickview($event)')]")
    public WebElement ProductQuickInfo_Close;
    
    @FindBy(xpath="//span/ng-content[contains(@translate, 'BUTTONS.ORDER')]")
    public WebElement CanadianProduct_OrderButton;
    
    @FindBy(xpath="//span[contains(text(),'Enter or Select Company')]")
    public WebElement ChooseCustomer_TextField;
    
    @FindBy(xpath="//span[contains(text(),'Enter or Select Company')]")
    public WebElement ChooseCustomer_TextField1;
    
 //   @FindBy(xpath="//input[contains(@ng-model,'$select.search')]")
 //   public WebElement ChooseCustomer_SearchInsertion;
    
    @FindBy(xpath="//input[contains(@placeholder,'Enter or Select Company')]")
    public WebElement ChooseCustomer_SearchInsertion;
    
  
    @FindBy(xpath="//button[contains(text(),'Create Order')]")
    public WebElement ChooseCustomer_CreateOrderButton;
    
    @FindBy(xpath="//button[contains(@page-name,'ProductDetailsQuickView')]")
    public WebElement Product_CompareDefaultButton;
    
    @FindBy(xpath="//button[contains(@translate,'ESP_WEB.LABELS.COMPARE_COUNT')]")
    public WebElement ProductCompare_CountButton;
    
    @FindBy(xpath="//button[contains(@type,'button')]/ng-content[contains(@translate, 'BUTTONS.ORDER')]")
    public WebElement ProductCompare_OrderButton;
    
    @FindBy(xpath="//div[contains(@class,'overlay-container o-wrapper ng-scope ng-isolate-scope')]")
    public WebElement OrderCreation_FromWESP_Verification;
    
    @FindBy(xpath="//button[contains(@class,'btn btn-default btn-xs btn-block')]")
    public WebElement RemoveProductButton_FromCompare;
    
    @FindBy(xpath="//input[contains(@ng-change,'::methods.markProduct(product)')]")
    public WebElement ProductMark_Checkbox;
    
    @FindBy(xpath="//li[contains(@id,'125117')]")
    public WebElement CopyTo_Toggledropdown;
    
    @FindBy(xpath="//*[@id='125117']/ul/li[2]/a")
    public WebElement CopyTo_Toggledropdown_Project;
    
    @FindBy(xpath="//a[contains(text(),'My Projects')]")
    public WebElement CopyTo_Toggledropdown_Project_MyProjects;
    
 
    @FindBy(xpath="//input[contains(@ng-change,'methods.markProduct(product)')]")
    public WebElement Projects_ProductCheckBox;
    
    @FindBy(xpath="//a[contains(@confirm-method,'vm.methods.product.deleteMarkedProducts')]")
    public WebElement Projects_ProductDelete;
    
    @FindBy(xpath="//button[contains(@ng-click,'okay()')]")
    public WebElement Projects_ProductDeleteConfirm;
    
    @FindBy(xpath="//a[contains(@id,'Clipboard')]")
    public WebElement Clipboard_Icon;
    
    @FindBy(xpath="//*[@id='ngClipboard']/ul/li/div/div[3]/ul/li[1]/div/div[1]/div/div[1]/input")
    public WebElement ClipboardProduct_CheckboxSelection;
    
    @FindBy(xpath="//*[@id='ngClipboard']/ul/li/div/div[3]/ul/li[2]/div/div[1]/div/div[1]/input")
    public WebElement ClipboardProduct_CheckboxSelectionSecondProduct;
    
  
    
    @FindBy(xpath="//ng-content[@translate='ESP_WEB.LABELS.CREATE_PRESENTATION']")
    public WebElement Clipboard_CreatePresentation;
  
    @FindBy(xpath="//input[contains(@ng-model,'vm.presentation.Name')]")
    public WebElement CreatePresentation_NameField;
    
    @FindBy(xpath="//span[contains(@ng-click,'$select.activate()')]")
    public WebElement CreatePresentation_CompanyField;
    
    @FindBy(xpath="//input[contains(@ng-model,'$select.search')]")
    public WebElement CreatePresentation_CompanyFieldSearch;
    
    @FindBy(xpath="//button[contains(text(),'Create')]")
    public WebElement CreatePresentation_CreateButton;
    
    @FindBy(xpath="//ng-content[@translate='ESP_WEB.PRESENTATIONS.LABELS.ORDER']")
    public WebElement Presentation_OrderButton;
    
    @FindBy(xpath="//button[contains(@ng-click,'::vm.save()')]")
    public WebElement SaveToCardButton;
    
    @FindBy(xpath="//a[contains(text(),'Shopping Cart')]")
    public WebElement ProductSearch_ShoppingCart_Idaho_Tab;
    
    @FindBy(css="#shoppingCartProducts > div > div > div:nth-child(1) > div")
    public WebElement ProductSearch_ShoppingCart_Idaho_Selection;
    
    @FindBy(xpath="//i[contains(@class,'icon esp-icon icon-cart')]")
    public WebElement ShoppingCart_Icon;
    
    @FindBy(xpath="//*[@id='ngShoppingCart']/ul/li/div/div[3]/ul/li/table/tbody/tr/td[1]/div/input")
    public WebElement ShoppingCart_ProductSelection_Checkbox;
    
    @FindBy(xpath="//button//ng-content[contains(text(),'Order')]")
    public WebElement ShoppingCart_OrderButton;
    
    @FindBy(xpath="//*[@id='ngClipboard']/ul/li/div/div[4]/div/div/ul/li/a")
    public WebElement CreateQuote_FromClipboard_ThroughOrderButton;
    
    @FindBy(xpath="//ng-content[@translate='ESP_WEB.NAVIGATIONS.PROJECTS']")
    public WebElement WESP_ProjectTab;
    
    @FindBy(xpath="//uib-tab-heading[@translate='ESP_WEB.PROJECTS.LABELS.NUMBER_OF_SAVED_PRODUCTS']")
    public WebElement Projects_SavedProductsTab;
    
    @FindBy(css="#productsTabPane > div > slide-panel > div > div > div > div.product-wrapper.media.prod.tile > div.media-left.quickview-click.ng-isolate-scope > div > div > img")
    public WebElement ProductImageHover;
    
    @FindBy(xpath="//button[contains(text(),'Quick Info')]")
    public WebElement QuickInfoView;
    
    @FindBy(xpath="//span[contains(@class,'caret')]")
    public WebElement CreateQuote_Toggle;
    
    @FindBy(xpath="//*[@id='appMenu']/li[6]/a")
    public WebElement Delete_ClipboardProduct;
    
    @FindBy(xpath="//button[contains(text(),'Ok')]")
    public WebElement ClipboardDeleteConfirm;
    

    
    //=====================================================Sample Request From WESP Locators============================================
    @FindBy(xpath="//a[contains(@title,'Budget Barrel Duffel')]")
    public WebElement BudgetBarrelProduct_Details_link;
    
    @FindBy(xpath="//button[contains(@class,'btn btn-default btn-block dropdown-toggle')]")
    public WebElement ProductDetial_Requestbutton;
    
    @FindBy(xpath="//a[contains(text(),'Request Sample')]")
    public WebElement RequestSample_Option;
    
    @FindBy(xpath="//span[contains(@class,'ng-binding text-info')]")
    public WebElement DateNeeded_RequestSample;
    
    @FindBy(css="#datepicker-1025-7299-33 > button > span")
    public WebElement DateSelection;
    
    
    @FindBy(xpath="//select[contains(@ng-model,'vm.order.ShippingDetail.Carrier')]")
    public WebElement ShipVia_SampleRequest;
    
    @FindBy(xpath="//input[contains(@ng-model,'$select.search')]")
    public WebElement SampleRequest_SendTo_Field;
    
    @FindBy(xpath="//button[contains(@ng-click,'::vm.next()')]")
    public WebElement SampleRequest_SendButton;
    
    @FindBy(xpath="//a[contains(text(),'Sample Requests')]")
    public WebElement Orders_SampleRequestTab;
    
    @FindBy(css="#pad-wrapper > div.row > div > div.col-xs-12.col-sm-8.col-sm-pull-4.col-md-9.col-md-pull-3 > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td.text-left.order-number > span")
    public WebElement RequestDetails;
    
    @FindBy(xpath="//button[contains(@ng-click,'vm.save(false')]")
    public WebElement SampleRequestSaveButton;
    
    @FindBy(xpath="//textarea[contains(@ng-model,'vm.order.Instructions[0].Content')]")
    public WebElement SampleRequest_InstructionsArea;
    
    @FindBy(xpath="//input[contains(@ng-model,'vm.order.inHandsDay')]")
    public WebElement SamplerRequest_Inhand_Date;
    
    @FindBy(xpath="//input[contains(@ng-model,'vm.order.shipDay')]")
    public WebElement ShipdateField;
    
    

    
    

	
    //===============================================Canadian Product Idaho Calculation Locators===========================//
    @FindBy(css="#pad-wrapper > div:nth-child(11) > div > div > div > div.ng-scope > div > table > tfoot > tr.subtotals > td:nth-child(3) > strong")
    public WebElement CanadianProductOrder_Subtotal;
  
    @FindBy(xpath="//tfoot[contains(@class,'app-tour-hide-on-active')]/tr[2]/td[2]/p[1]")
    public WebElement CanadianProductOrder_Discount;
    
   @FindBy(xpath="//tfoot[contains(@class,'app-tour-hide-on-active')]/tr[2]/td[2]/p[2]")
   public WebElement CanadianProductOrder_BookedMargin;
   
   @FindBy(xpath="//input[contains(@name,'cost')]")
   public WebElement Netcost_Field_BookedMargin;
   
   @FindBy(xpath="//input[contains(@ng-model,'lineItem.Margin')]")
   public WebElement Margin_Field_BookedMargin;
   
   @FindBy(xpath="//input[contains(@ng-model,'lineItem.Price')]")
   public WebElement Price_Field_BookedMargin;
    
    @FindBy(xpath="//tfoot/tr/td[2]/p[3]")
    public WebElement CanadianProductOrder_Tax;
    
    @FindBy(xpath="//tfoot/tr[3]/td[2]/strong")
    public WebElement CanadianProductOrder_AmountDue;
    
    @FindBy(xpath="//tfoot/tr/td[3]/strong")
    public WebElement TotalCost_CanProduct;
    
    @FindBy(xpath="//tfoot/tr/td[4]/strong")
    public WebElement TotalPrice_CanProduct;
    
    
    @FindBy(xpath="//*[@id='pad-wrapper']/div[9]/div/div/div/div[2]/div/table/tbody[2]/tr/td[3]/table/tfoot/tr/td[4]/strong")
    public WebElement TotalPrice_Product2_BookedMargin;
    
    @FindBy(xpath="//*[@id='pad-wrapper']/div[9]/div/div/div/div[2]/div/table/tbody[2]/tr/td[3]/table/tfoot/tr/td[3]/strong")
    public WebElement TotalCost_Product2_BookedMargin;
    
	@FindBy(xpath="//strong[contains(text(), 'Amount Due:')]/parent::td/parent::tr/td[2]/strong")
	public WebElement CanadianProduct_SalesOrderPreview_AmountDue;
	
	@FindBy(xpath="//tfoot/tr/td[3]")
	public WebElement CanadianProductOrder_Total;
	
	@FindBy(xpath="//table/tbody/tr[7]/td[2]")
	public WebElement CanadianProductOrder_PurchaseOrderPreview_Amountdue;
	
	
	
	//==================================================Quote Total Calculation Locators & Other Locators=================================//
	@FindBy(xpath="//tfoot//tr[contains(@class,'subtotals')]/td[3]/strong")
	
	public WebElement QuoteSubtotal;
	
	@FindBy(xpath="//tfoot/tr/td[2]/p[3]")
	public WebElement QuoteSalesTax;
	
	@FindBy(xpath="//tr[contains(@class,'totals')]/td[2]/strong")
	public WebElement QuoteTotal;
	
	@FindBy(xpath="//tr[contains(@class,'totals')]/td[3]/strong")
	public WebElement QuotePreviewTotal;
	
	@FindBy(xpath="//button[contains(text(),'Preview')]")
	public WebElement QuotePreviewButton;
	
	@FindBy(xpath="//span[contains(text(),'4')][contains(@class,'badge ng-binding')]")
	public WebElement QuoteDetail_QuoteRequestTab;
	
	
	//===============================================Order Additional Locators=============================================//
	@FindBy(xpath="//input[contains(@clear-input,'vm.order.inHandsDay')]/parent::div/span/i")
	public WebElement Inhand_Orderdate_CalenderIcon;
	
	@FindBy(xpath="//i[contains(@class,'glyphicon glyphicon-chevron-right')]")
	public WebElement CalenderMoveNextMonthIcon;
	
	@FindBy(xpath="//span[contains(text(),'15')][contains(@class,'ng-binding')]")
	public WebElement InhandDate_Selection;
	
    @FindBy(xpath="//button[contains(@translate,'BUTTONS.APPLY')]")
    public WebElement InHandDate_Apply_Button;
	
	@FindBy(xpath="//input[contains(@clear-input,'vm.order.shipDay')]/parent::div/span/i")
	public WebElement Shipdate_CalenderIcon;
	
	@FindBy(xpath="//span[contains(text(),'14')][contains(@class,'ng-binding')]")
	public WebElement Shipdate_Selection;
	
	//@FindBy(xpath="//*[@id='pad-wrapper']/div[7]/div/div[2]/div/div[1]/div/div/div[1]/span/span[2]")
	
	@FindBy(xpath="//div[contains(@ng-model , 'vm.order.ShippingDetail.Carrier')]//div/span/i")

	public WebElement OrderShipVia;
	
	@FindBy(xpath="//div[contains(text(),'UPS Ground')]")
	public WebElement ShipviaSelection;
	
	@FindBy(xpath="//label[contains(text(),'Ship Via')]")
	public WebElement ShipViaLabel;
	
	
	//===========================================================Settings(Document Design Locators)===============================//
	@FindBy(xpath="//a[contains(text(),'Document Design')]")
	public WebElement Settings_DocumentDesign;
	
	@FindBy(xpath="//button[contains(@name,'ngFileUpload')]")
	public WebElement Documents_LogoUpload_Button;
	
	@FindBy(xpath="//img[contains(@class,'artwork-preview')]")
	public WebElement Documents_LogoDisplay_Verification;
	
	@FindBy(xpath="//button[contains(@ng-click,'removeFile(file)')]")
	public WebElement Documents_Logo_RemoveButton;
	
	@FindBy(css="#toast-container")
	public WebElement Document_LogofileNotSupported_Error;
	
	@FindBy(xpath="//a[contains(@ng-click,'vm.saveDocSettings()')]")
	public WebElement Documents_Settings_SaveButton;
	
	
	
	
	
	//=============================================Edit Contact Details Locators==================================================//
	@FindBy(xpath="//order-contact[contains(@ng-model, 'vm.order.ShippingContact')]/div/div[*]/div/div/button")
	public WebElement EditShippingAddressButton;
	
	@FindBy(xpath="//order-contact[contains(@ng-model, 'vm.order.BillingContact')]/div/div[*]/div/div/button")
	public WebElement BillingAddress_EditButton;
	
	@FindBy(xpath="//order-contact[contains(@ng-model, 'vm.order.AcknowledgementContact')]/div/div[*]/div/div/button")
	public WebElement AcknowledgementAddress_EditButton;
	
	
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.contact.Name')]")
	public WebElement ContactName;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.contact.Address.Phone.Number')]")
	public WebElement ContactPhoneNo;
	
	@FindBy(xpath="//input[contains(@ng-model,'vm.contact.EmailAddress')]")
	public WebElement ContactEmail;
	
	
	//========================================================Order Number Edit Locators==========================================//
	@FindBy(xpath="//button[contains(@class,'btn edit-order-btn')]")
	public WebElement OrderNo_EditButton;
	
	@FindBy(xpath="//div[contains(text(),'Loading')] | //div[contains(text(),'Saving')]")
	public String SpinnerLoader;
	
	//@FindBy(xpath="//div[contains(text(),'Loading')] | //div[contains(text(),'Saving')]")
	//public WebElement SpinnerLoader;
	
	//==============================================================Profit Maker Locators=========================================//
	@FindBy(xpath="//*[contains(text(),'Send to ProfitMaker')]")
	public WebElement SendProfitMaker_Button;
	
	@FindBy(xpath="//*[contains(@translate,'BUTTONS.OK')]")
	public WebElement SendProfitMakerSend_ConfirmButton;
	
	@FindBy(xpath="//div[contains(@class,'toast-message')]")
	public WebElement ProfitMakerSend_SuccessMessage;
	
	//==========================================Services Vendor Add Locators=====================================================//
	@FindBy(xpath="//span[contains(@aria-label,'Select a Vendor activate')]")
	public WebElement Vendor_CompanySelection_Field_Services;
	
	@FindBy(xpath="//input[contains(@aria-label,'Select a Vendor')]")
	public WebElement VendorField_TextInsertion_Services;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-building')]")
	public WebElement VendorCompany_Services;
	
	@FindBy(xpath="//*[@id='pad-wrapper']/div[9]/div/div/div/div[2]/div/table/tbody[2]/tr/td[2]/div[2]/a")
	public WebElement VendorCompany_FreightServices_OrdersDetails;
	
	@FindBy(xpath="//span[@class='ng-binding']")
	public WebElement ServicesCompany_Verification_AtCrmLevel;
	
	
	
	
	
	public WebDriver driver;
public OrdersLocators(WebDriver driver) {
	this.driver = driver;

}
}
