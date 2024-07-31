package pageobjects;

import org.openqa.selenium.WebDriver;
import framework.automation.FW_Page;
import framework.utilities.FW_ConfigMgr;
import framework.utilities.FW_StringUtils;

public class PO_Home extends FW_Page {

private static final String LO_LNK_NAVIGATION_HOME_VALIDATE_PAGE = "//img[@class='cmp-nav__logo-icon ']";
private static final String LO_LNK_NAVIGATION_CLICK_TERMS = "//div[@id='truste-button-container']";
private static final String LO_LNK_NAVIGATION_VALIDATE_SEARCH = "//img[@aria-label='Search across ServiceNow']";
private static final String LO_LNK_NAVIGATION_VALIDATE_REGION = "//div[@class='cmp-nav__language-selector-icon']//img[@alt='Select your country']";
private static final String LO_LNK_NAVIGATION_VALIDATE_SIGNIN= "//span[@id='wc-account-icon']";
private static final String LO_LNK_NAVIGATION_VALIDATE_PRODUCTS_DROPDOWM = "//li[@id='cmp-nav__tab--productsNav']";
private static final String LO_LNK_NAVIGATION_VALIDATE_PLATFORM_DROPDOWN = "//li[@id='cmp-nav__tab--platformNav']";
private static final String LO_LNK_NAVIGATION_VALIDATE_PARTNERS_DROPDOWN = "//li[@id='cmp-nav__tab--partnerNav']";
private static final String LO_LNK_NAVIGATION_VALIDATE_RESOURCES_DROPDOWN = "//li[@id='cmp-nav__tab--resourcesNav']";
private static final String LO_LNK_NAVIGATION_VALIDATE_COMPANY_DROPDOWN = "//li[@id='cmp-nav__tab--companyNav']";
private static final String LO_BUT_NAVIGATION_VALIDATE_GETSTARTED = "//div[@class='get-started']//a[contains(text(),'Get Started')]";



    public PO_Home(WebDriver driver) {
        super(driver);
    }

    public String validateOnPage(){
        String result = validateLocatorExists(LO_LNK_NAVIGATION_HOME_VALIDATE_PAGE, FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }


    public String clickAcceptTerms() {
        String result = clickLocator(LO_LNK_NAVIGATION_CLICK_TERMS, 1);
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateSearch() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_SEARCH,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateRegion() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_REGION,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateSignIn() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_SIGNIN,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateProductsDropDown() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_PRODUCTS_DROPDOWM,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validatePlatformDropDown() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_PLATFORM_DROPDOWN,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validatePartnersDropDown() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_PARTNERS_DROPDOWN,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateCompanyDropDown() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_COMPANY_DROPDOWN,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateResourcesDropDown() {
        String result = validateLocatorExists(LO_LNK_NAVIGATION_VALIDATE_RESOURCES_DROPDOWN,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

    public String validateGetStartedDropDown() {
        String result = validateLocatorExists(LO_BUT_NAVIGATION_VALIDATE_GETSTARTED,  FW_ConfigMgr.getDefaultTimeout(), FW_ConfigMgr.getDefaultInterval());
        result = FW_StringUtils.metaInsert(result, getClass().getSimpleName()); // Insert PO name into results
        return result;
    }

  



    

}