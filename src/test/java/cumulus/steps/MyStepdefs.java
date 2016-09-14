package cumulus.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cumulus.pageobjects.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class MyStepdefs
{

    LoginPage loginPage = page(LoginPage.class);

    @Given("^open 10.21.53.12/login$")
    public void openCumulus()
    {
        open("http://10.21.53.12/login");
    }


    @And("^check that element with name \"([^\"]*)\" is displayed$")
    public void checkThatElementWithNameIsDisplayed(String elementName)
    {
        loginPage.get(elementName).shouldBe(Condition.appears);
    }

    @And("^type to input with name \"([^\"]*)\" text: \"([^\"]*)\"$")
     public void typeToInputWithName(String arg1, String arg2)
    {
        loginPage.get(arg1).sendKeys(arg2);
    }

    @And("^press button \"([^\"]*)\"$")
    public void clickOnTheButton(String arg1)
    {
        loginPage.get(arg1).click();
    }

    @Then("^Check that user \"([^\"]*)\" is \"([^\"]*)\"$")
     public void checkUserState(String userName, String status)
    {

        sleep(2000);
        //if (status == "logged in")


    };



}
