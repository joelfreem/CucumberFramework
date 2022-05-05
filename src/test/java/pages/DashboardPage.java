package pages;

import io.cucumber.java.tlh.DaHghubejlu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods{

    @FindBy(xpath="//*[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    @FindBy(xpath="//*[@class='menu']/ul/li")
    public WebElement welcomeMessage;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
