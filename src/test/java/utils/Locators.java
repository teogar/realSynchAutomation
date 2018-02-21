package utils;

import org.openqa.selenium.By;

public class Locators {

	public static final By SEARCH_BOX_ID = By.id("navbar-query");
	/**
	 * Constant for locator of IMDB search box 
	 */
	public static final By SEARCH_BUTTON_ID = By.id("navbar-submit-button");
	/**
	 * Constant for locator of IMDB search button
	 */
	public static final CharSequence ESO_MOVIE_INI = ("IT");

	/**
	 * Constant for send keys of IMDB IT movie
	 */

	public static final By MOVIE_RESULT_LIST =
			By.xpath("//h3[contains(text(),'Titles')]/following-sibling::table//tr");

	/**
	 * Constant for the xpath of result list of IT movie at IMDB
	 */

	public static final By MOVIE_LINK_XPATH = By.xpath(".//a");
	public static final String RICHARD_LOCATOR = ("//table[@class='cast_list']//span[text()='Richard Thomas']");
	public static final String TIM_LOCATOR = ("//table[@class='cast_list']//span[text()='Tim Reid']");
	public static final String ANNETTE_LOCATOR = ("//table[@class='cast_list']//span[text()='Annette O'Toole']");
	public static final String FULL_CAST = ("//a[contains(text(), 'full cast')]");
	public static final String ROYAL_LOGIN_BUTTON = ("//*[@data-testid='royal_login_button']");
	public static final String FB_EMAIL_BOX = ("//input[@type='email']");
	public static final String FB_PASSBOX = ("//*[@data-testid='royal_pass']");
	public static final String FACEBOOK_SEARCHBOX = ("//*[@placeholder='Busca en Facebook']");
	public static final String FACEBOOK_SEARCHBUTTON = ("//i[@class='_585_']");
	public static final String TEDDY_PROFILE = ("//div[@class='_1k67 _4q39']");
	public static final String IMG_PROFILE = ("//a[@id='u_0_u']");
	public static final String FACEBOOK_LOGO = ("//h1[@data-click='bluebar_logo']");
	public static final String LINKD_EMAILBOX = ("//input[@type='text']");
	public static final String LINKD_PASSBOX = ("//input[@type='password']");
	public static final String LD_LOGBUTTON = ("//input[@type='submit']");
	public static final String LINKD_HOMEBUTTON = ("bug-text-color");
	public static final String LINKD_PROFILENAV = ("//li[@id='profile-nav-item']");
	public static final String LINKD_SEARCHBOX = ("//input[@aria-autocomplete='list']");
	public static final String LINKD_SCOPE = ("//button[@class='nav-search-button']");
	public static final String TATA_LINK_XPATH = ("//h3[@class='search-result__title Sans-17px-black-85%-semibold-dense']");
	public static final String TATA_NAVBUTTON = ("//img[@class='lazy-image org-top-card-module__logo loaded']");
	public static final String LK_NAVBUTTON = ("//*[@class='bug-34dp']");
	public static final String LK_USER_IMG = ("//div[@id='nav-settings__dropdown']");
	public static final String LK_SINGO_BUTTON = ("//a[@data-control-name='nav.settings_signout']");
	public static final String TEN_EMAIL_FIELD = ("//input[@type='email']");
	public static final String TEN_PWD_FIELD = ("//input[@type='password']");
	public static final String TEN_SUBMIT_BUTTON = ("//button[@type='submit']");
	public static final String TEN_CANDIDATE_BUTTON = ("//div[@class='Home-middle']//a[@href='#/candidates']");
	public static final String TEN_ADD_BUTTON = ("//div[@class='Candidates-floating-button']");
	public static final String AMAZON_SCOPE = ("//div[@class='nav-search-scope nav-sprite']");
	public static final String AMA_SEARCH_BOX = ("//input[@type='text']");
	public static final String AMA_SINGIN_AREA = ("//a[@data-nav-ref='nav_ya_signin']");
	public static final String AMA_EMAILBOX = ("//input[@type='email']");
	public static final String AMA_PWDBOX = ("//input[@type='password']");
	public static final String AMA_SUBMIT_BUTTON = ("//input[@id='signInSubmit']");
	public static final String AMA_HOME_BUTTON = ("//span[@class='nav-logo-base nav-sprite']");
	public static final String NAVIGATION_BTN = ("//div[@id='nav-main']");
	public static final String AMA_CART = ("//span[@class='nav-cart-icon nav-sprite']");

	/**
	 * Open Weather Locators
	 */

	public static final String NEWS_OPEN_WEATHER =("//div[@class=\"navbar navbar-dark navbar-static-top\"]//li/a[@href=\"https://openweathermap.org/news\"]");
	public static final String OW_WEB_TOKEN = "78d47af55a880d5de2cb0ffb35e15a5c";
	public static final String GDL_CITY_ID = "4005539";
	public static final String WEATHER_DESC_JASON_PATH = "weather[0].description";
	public static final String OP_SING_BTN = "//a[@onclick=\"_gaq.push(['_trackEvent', 'Navbar', 'Main', 'signin']);\"]";
	public static final String OP_EMAIL_BOX = "//*[@class=\'string email optional form-control\']";


	/**
	 * Real Synch Locators
	 */

	public static final String TEST_CHROME_PATH ="/Users/teodorogarcia/IdeaProjects/IdmTest/src/chromedriver";
	public static final String RS_NAME_BOX = "//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/form/div[1]/div[1]/div/input";
	public static final String RS_PSW_BOX = "//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/form/div[1]/div[2]/div/input";
	public static final String RE_SINGIN_BTN = "//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/form/div[2]/div[2]/input";
	public static final String DRIVER_FIREFOX_PATH = "/Users/teodorogarcia/IdeaProjects/IdmTest/src/geckodriver";
	public static final String NEW_SYNCH_BTN = "//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[3]/a/button" ;
	public static final String VOICE_PAD_PATH = "//div[@class=\"ui-g-12\"]//*[@src=\"/images/applications/voicepad.JPG\"]";
	public static final String SALES_FORCE_APP = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[7]/div/div[2]/div[1]/div/div/div/img";
	public static final String RS_NEXT_BUTTON = "//*[@id=\"root\"]/div/div[3]/div[2]/div/div[4]/div[3]/button[2]";
	public static final String VC_CLIENT_FIELD = "//input[@type=\"number\"]";
	public static final String VC_USERNAME_FIELD = "//input[@name=\"username\"]";
	public static final String VC_PASSWORD_FIELD = "//input[@type=\"password\"]";
	public static final String SF_USERNAME_FIELD = "//input[@name=\"sfUsername\"]";
	public static final String SF_PASSWORD_FIELD = "//input[@name=\"sfPassword\"]";
	public static final String SF_SECURITY_TOKEN_FIELD = "//input[@name=\"sfSecurityToken\"]";
	public static final String FINISH_BTN = "//*[@id=\"root\"]/div/div[3]/div[2]/div/div[4]/div[3]/button[2]";
	public static final String RS_ALL_TRANSACTIONS = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[2]/a/button";
	public static final String REALS_REGISTRATION_LINK = "//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/form/div[2]/div[1]/a[2]/span";
	public static final String FORGOT_PSW_LINK = "//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/form/div[2]/div[1]/a[1]/span";
	public static final String RS_FORGOT_PSW_BOX = "//input[@type=\"text\"]";
	public static final String RS_FORGOT_SUBMIT_BTN = "//input[@type=\"submit\"]";
    public static final String PROPERTY_BASE_APP = "//*[@id=\"root\"]/div/div[3]/div[2]/div/div[7]/div/div[2]/div[7]/div/div/div/img";
}
