package page;

import Locator.DashBoardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class DashBoardPage extends BaseTest {

    public DashBoardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = DashBoardLocator.TITLE_PAGE)
    WebElement title;
/*
    @FindBy(how = How.XPATH, using = DashBoardLocator.ADD_NEW_SYNCH_BUTTON)
    WebElement addNewSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_PENCIL)
    WebElement sourceEditPencil;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_PENCIL)
    WebElement targetEditPencil;

    @FindBy(how = How.XPATH, using = DashBoardLocator.CALENDAR_ICON)
    WebElement calendarInfo;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ELIPSIS_BUTTON)
    WebElement elipsisButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATE_SYNCH_LINK)
    WebElement activateLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_SYNCH_LINK)
    WebElement addNewLink;
    */
}
