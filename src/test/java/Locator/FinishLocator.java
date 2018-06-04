package Locator;

public class FinishLocator {
    public static final String TITLE_PAGE = "Real Synch";
    public static final String WIZARD_STEP_NAVIGATOR3 = " ";
    public static final String SOURCE_LOGO = "/images/applications/voicepad.JPG";
    public static final String SOURCE_ACTIVATION_LINK = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div/div[9]/div[1" +
            "]/div[2]/div[1]/div[1]/div[2]/a";
    public static final String TARGET_LOGO = "/images/applications/salesforce.JPG";
    public static final String TARGET_ACTIVATION_LINK = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div/div[9]/div[1" +
            "]/div[2]/div[2]/div[1]/div[2]/a";
    public static final String ADD_SYNCH_ICON = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div/div[9]/div[1]/div[3" +
            "]/div[2]/div/div[1]/div[2]/button";
    public static final String SOURCE_CLIENT_ID = "\"(//*[@class='primary-field width-250'])[1]\"";
    public static final String TARGET_USER = "\"(//*[@class='primary-field width-250'])[2]\"";
    public static final String TARGET_PASSWORD = "\"(//*[@class='primary-field width-250'])[3]\"";
    public static final String TARGET_TOKEN = "\"(//*[@class='primary-field width-250'])[4]\"";
    public static final String CANCEL_BUTTON = "//*[contains(text(), 'Cancel')]";
    public static final String BACK_BUTTON = "//*[contains(text(), 'Back')]";
    public static final String ACTIVATE_BUTTON = "//*[contains(text(), 'Activate')]";
}
