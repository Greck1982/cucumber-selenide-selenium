package cumulus.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage
{

    @NameOfElement("LoginName")
    @FindBy(xpath = ".//*[@id='name']")
    public SelenideElement login;

//    @NameOfElement("Пароль")
//    @FindBy(css = "input[name='password']")
//    public SelenideElement password;

    @NameOfElement("LoginButton")
    @FindBy(xpath = ".//*[@ng-click=\"login(roche_id)\"]")
    public SelenideElement enter;

    @NameOfElement("UserNameLabel")
    @FindBy(xpath = ".//*[@ng-if='isloggedin || loggedin'][@data-toggle='dropdown']")
    public SelenideElement userNameLabel;


}
