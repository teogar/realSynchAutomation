package utils;

public class Properties {
	/*
	 * This variable contains the property key necessary to open the chrome driver
	 */
	
	public static final String CHROME_DRIVER_PATH =
			"/Users/teodorogarcia/IdeaProjects/pipeline/src/chromedriver";
	public static final long TIMEOUT = 30;
	public static final String IMDB_URL = "http://www.imdb.com/";
	public static final int NUMBER_RESULTS_EXPECTED = 3;
	public static final CharSequence MOVIE_YEAR = "1990";

	
		
		
		/**
	     * Constant for the "Book title" value to be input.
	     */

		public static final String BOOK_TITLE = "Book Creator from Wikipedia";

		/**
	     * Constant for the "Book sub title" value to be input.
	     */

		public static final String BOOK_SUBTITLE = "Using Automation";

		/**
	     * Constant for the first header text that appears in the "Book creator" page.
	     */
		
		public static final String BOOK_CREATOR_HEADER = "Book creator";
		
		/**
	     * Constant for the first header that appears in the "Book Management" page.
	     */

		public static final Object BOOK_MGMT_HEADER = "Manage your book";
		
		/**
	     * Constant for the first header that appears in the "Render" page.
	     */

		public static final String RENDER_PAGE_HEADER1 = "Rendering";
		
		/**
	     * Constant for the first header that appears in the "Render" page once rendering is finished.
	     */
		
		public static final String RENDER_PAGE_HEADER2 = "Rendering finished";
		
		/**
	     * Constant for the timeout in milliseconds used throughout the project.
	     */
		
		
		/**
	     * Constant for the path to firefox driver.
	     */
		
		public static final String FIREFOX_DRIVER_PATH = "C:/Users/metz/Desktop/FaceBookTestCase/src/geckodriver.exe";
	
		/**
	     * Constant for the path to internet explorer driver.
	     */
		
		public static final String IE_DRIVER_PATH = "./drivers/IEDriverServer.exe";

		/**
	     * Constant for the system property set to run chrome driver.
	     */
		
		public static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

		/**
	     * Constant for the system property set to run firefox driver.
	     */
		
		public static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
		
		/**
	     * Constant for the system property set to run ie driver.
	     */
		
		public static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
		
		/**
	     * Constant for the filename of the exported book.
	     */
		
		public static final String PDF_FILENAME = "Exported Book";
		
		/**
	     * Constant for the filename separator.
	     */
		
		public static final String FILENAME_SEPARATOR = "_";
		
		/**
	     * Constant for the pdf file extension.
	     */
		
		public static final String PDF_FILE_EXTENSION = ".pdf";
		
		/**
	     * Constant for the path to save the exported pdf file.
	     */
		
		public static final String PDF_SAVE_PATH = "C:\\TAF\\workspace\\WikipediaBookCreator\\";
		
		/**
	     * Constant for the timestamp format used in the exported pdf filename.
	     */

		public static final String TIMESTAMP_FORMAT = "yyyy.MM.dd.HH.mm.ss";
		
		/**
	     * Constant for the chrome browser name.
	     */

		public static final String CHROME_BROWSER = "chrome";
		
		/**
	     * Constant for the ie browser name.
	     */
		
		public static final String IE_BROWSER = "ie";
		
		/**
	     * Constant for the firefox browser name.
	     */
		
		public static final String FIREFOX_BROWSER = "firefox";

		/**
	     * Constant for the escape character.
	     */
		
//		public static final char ESC_CHARACTER = 'â†�';

		/**
	     * Constant for the wait time in milliseconds when sending keystrokes.
	     */
		public static final long KEYSTROKE_WAIT = 100;
		
		/**
	     * Constant for the "Download the file" link text property from the "Render" page..
	     */

		public static final String DOWNLOAD_FILE_LINK_TEXT = "Download the file";

		/**
		 * Constant for the time waited in milliseconds when downloading a file
		 */
		public static final long FILE_DOWNLOAD_WAIT = 1000;
		/*
		 * 
		 */
		public static final String FACEBOOK_URL = ("https://www.facebook.com/");

		/**
		 * Constant for go to facebook page
		 */

		public static final String LIKEDIN_URL = ("https://www.linkedin.com/uas/login");
		public static final CharSequence LINKD_PASSWORD = ("teddy810316");
		public static final CharSequence TEN_EMAIL_PROPERTY = ("esolis+10by10@itexico.com");
		public static final CharSequence TEN_PWD_PROPERTY = ("abc123");

	   /**
	    *Open Weather Properties
	    */

		public static final String OW_EMAIL = "teogar123@gmail.com" ;
		public static final String OW_PWD = "teddy810316";
	    public static final String OPEN_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather";
    	public static final String GECKO_DRIVER_PROPERTY = "webdriver.gecko.driver" ;

	   /**
	    * Constant for time off 5 secs.
	    */

	    public static final long TIME_OFF_5 = 5000;

    /**
     * Constatnt for time off 8 secs.
     */

        public static final long TIME_OFF_8 = 8000;
		public static final String ABRAHAM_PWD = "abrahamtest123@mailinator.com" ;
        public static final String ABRAHAM_USER_NAME = "abrahamtest123@mailinator.com";
        public static final long TIME_OFF_3 = 3000;
        public static final long TIME_OFF_15 = 15000;
        public static final long TIME_OFF_6 = 6000;
        public static final long TIME_OFF_9 = 9000;
        public static final long TIME_OFF_10 = 10000;
        public static final long TIME_OFF_16 = 16000;
        public static final long TIME_OFF_1 = 1000;
    public static final long TIME_OFF_2 = 2000;
    public static final long TIME_OFF_7 = 7000;
    public static final long TIME_OFF_4 = 4000;
}
