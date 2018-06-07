package Locator;

public class CredentialsLocator {
    public static final String TITLE_PAGE = "//h2[contains(text(), \"New Synch\")]";
    public static final String WIZARD_STEP_NAVIGATOR3 = "(//div[@class='rs-wizard-step-innercircle'])[3]";
    public static final String SOURCE_IMAGE = "(//img[contains(@src,'/images/applications/')])[1]";
    public static final String SOURCE_INSTRUCTIONS_LINK = "(//a[contains(text(),'Verification Instructions')])[1]";
    public static final String SOURCE_INPUT_BUTTON = "//button[@id='source-box-btn']";
    public static final String TARGET_IMAGE = "(//img[contains(@src,'/images/applications/')])[2]";
    public static final String TARGET_INSTRUCTIONS_LINK = "(//a[contains(text(),'Verification Instructions')])[1]";
    public static final String TARGET_INPUT_BUTTON = "//button[@id='target-box-btn']";
    public static final String CANCEL_BUTTON = "//button[contains(text(),'Cancel')]";
    public static final String BACK_BUTTON = "//button[contains(text(),'Back')]";
    public static final String NEXT_BUTTON = "//button[contains(text(),'Next')]";
    public static final String NO_BUTON = "//button[contains(text(),'No')]";
    public static final String YES_BUTTON = "//button[contains(text(),'Yes')]";
    public static final String OK_BUTTON = "//button[contains(text(),'OK')]";

}
