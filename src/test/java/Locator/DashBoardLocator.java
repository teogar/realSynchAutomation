package Locator;

import test.BaseTest;

public class DashBoardLocator extends BaseTest {

    public static final String TITLE_PAGE = "//h2[contains(text(), \"Dashboard\")]";

    public static final String ADD_NEW_SYNC_BUTTON = "//*[contains(text(), 'Add New Synch')]";
    public static final String SYNCH_STATUS = "//div[@class='ui-g-2 col-status']/span";
    public static final String SOURCE_CREDENTIALSISSUE_BUTTON = "//div[@class='ui-g-3 source-row-cell']/span[@class='fa fa-exclamation-triangle no-credentials']";
    public static final String SOURCE_NAME = "//div[@class='ui-g-3 source-row-cell']/span[@class]";
    public static final String TARGET_CREDENTIALSISSUE_BUTTON = "//div[@class='ui-g-3 target-row-cell']/span[@class='fa fa-exclamation-triangle no-credentials']";
    public static final String TARGET_NAME = "//div[@class = 'ui-g-3 target-row-cell']/span[@class]";
    public static final String CALENDAR_ICON = "//i[@class = 'fa fa-calendar']";
    public static final String ELIPSIS_BUTTON = "//i[@class = 'fa fa-ellipsis-h']";
    public static final String ACTIVATE_SYNCH_BUTTON = "//button[contains(text(),'Activate')]";
    public static final String DEACTIVATE_SYNCH_LINK = "//button[contains(text(),'Deactivate')]";
    public static final String ACTIVATION_INSTRUCTIONS_SYNCH_BUTTON = "//button[contains(text(),'Activation Instructions')]";
    public static final String EDIT_SYNCH_BUTTON = "//button[contains(text(),'Edit')]";

}

