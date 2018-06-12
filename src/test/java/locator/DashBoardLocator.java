package locator;

public class DashBoardLocator {
    public static final String TITLE_PAGE = "//*[contains(text(), \"Dashboard\")]";
    public static final String ADD_NEW_SYNC_BUTTON = "//*[contains(text(), 'Add New Synch')]";

    public static final String SYNCH_STATUS = "//div[@class='ui-g-2 col-status']/span";
    public static final String SOURCE_CREDENTIALSISSUE_BUTTON = "//div[@class='ui-g-3 source-row-cell']/span[@class='fa fa-exclamation-triangle no-credentials']";
    public static final String SOURCE_NAME = "//div[@class='ui-g-3 source-row-cell']/span[@class]";
    public static final String TARGET_CREDENTIALSISSUE_BUTTON = "//div[@class='ui-g-3 target-row-cell']/span[@class='fa fa-exclamation-triangle no-credentials']";
    public static final String TARGET_NAME = "//div[@class = 'ui-g-3 target-row-cell']/span[@class]";

    public static final String CALENDAR_ICON = "//i[@class = 'fa fa-calendar']";
    public static final String ELIPSIS_LINK = "//i[@class = 'fa fa-ellipsis-h']";
    public static final String ACTIVATE_SYNCH_LINK = "//button[contains(text(),'Activate')]";
    public static final String DEACTIVATE_SYNCH_LINK = "//button[contains(text(),'Deactivate')]";
    public static final String ACTIVATION_INSTRUCTIONS_SYNCH_LINK = "//button[contains(text(),'Activation Instructions')]";
    public static final String EDIT_SYNCH_LINK = "//button[contains(text(),'Edit')]";

    public static final String OK_BUTTON = "//button[contains(text(),'Ok')]";
    public static final String CLOSE_ACTIVATION_INSTRUCTIONS_BUTTON = "//span[@class='fa fa-fw fa-close']";
    public static final String BACK_ACTIVATION_INSTRUCTIONS_BUTTON = "//i[@class='fa fa-arrow-left']";
    public static final String NEXT_ACTIVATION_INSTRUCTIONS_BUTTON = "//i[@class='fa fa-arrow-right']";
    public static final String DONE_ACTIVATION_INSTRUCTIONS_BUTTON = "//i[@class='fa fa-check']";
    public static final String DEACTIVATE_POP_UP_CANCEL = "//button[contains(text(),'Cancel')]";
    public static final String DEACTIVATE_POP_UP_YES = "//button[contains(text(),'Yes')]";
    public static final String SYNCH_INFORMATION_LABEL = "//div[@class='ui-g synch_sumary']";

    public static final String STATUS_COLUMN = "ui-g-2 col-status";
    public static final String SOURCE_COLUMN = "Ui-g-3 source-row-cell";
    public static final String TARGET_COLUMN = "ui-g-3 target-row-cell";
}

