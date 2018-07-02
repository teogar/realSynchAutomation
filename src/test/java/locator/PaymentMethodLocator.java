package locator;

public class PaymentMethodLocator {
    public static final String PAYMENT_METHOD_BUTTON = "//div[@id='payment']";
    public static final String DELETE_PAYMENT_BUTTON = "//i[@class='fa fa-times-circle-o']";

    public static final String EDIT_PAYMENT_BUTTON = "//span[contains(text(),'Edit')]";
    public static final String EDIT_CARD_HOLDERNAME_INPUT = "//input[@name='name']";
    public static final String EDIT_MONTHEXPIRES_INPUT = "//select[@name='exp_month']";
    public static final String EDIT_YEAREXPIRES_INPUT = "//select[@name='exp_year']";
    public static final String EDIT_CANCEL_BUTTON = "//button[contains(text(), 'Cancel')]";
    public static final String EDIT_SAVE_BUTTON = "//button[contains(text(),'Save')]";
    public static final String EDIT_CLOSE_BUTTON = "//span[@class='fa fa-fw fa-close']";

    public static final String ADD_NEW_PAYMENT_METHOD_BUTTON = "//input[@value='Add New Payment Method']";
    public static final String NEW_CARDHOLDER_NAME_INPUT = "//input[@name='cardHolder']";
    public static final String NEW_CARD_NUMBER_INPUT = "(//*[@id=\"root\"]/form/span[2]/label/input[@name='cardnumber'])[1]";
    public static final String NEW_EXPIRESAT_INPUT = "//input[@name='exp-date']";
    public static final String NEW_CVV_INPUT = "//input[@name='cvc']";
    public static final String NEW_ZIPCODE_INPUT = "//input[@name='postal']";
    public static final String NEW_CANCEL_BUTTON = "//button[contains(text(),'Cancel')]";
    public static final String NEW_SAVE_BUTTON = "//button[@type='submit']";
}
