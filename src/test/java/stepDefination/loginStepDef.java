package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class loginStepDef {

    @Given("Navigate to homepage")
    public void userNavigateToHomepage ()
    {
        Hooks.driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("^user enter (.*) and (.*)$")
    public void userEnterUsername(String username, String password)
    {
        Hooks.driver.findElement(By.id("user-name")).sendKeys(username);
        Hooks.driver.findElement(By.name("password")).sendKeys(password);
    }


    @And("user click on login button")
    public void userClickLogin()
    {
        Hooks.driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("Verify that I am logged")
    public void step6 ()
    {

        SoftAssert softAssert = new SoftAssert();

        String title = Hooks.driver.findElement(By.className("title")).getText();
        softAssert.assertEquals(title, "Products");

        String url = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(url, "https://www.saucedemo.com/inventory.html");

        boolean logo = Hooks.driver.findElement(By.className("app_logo")).isDisplayed();
        softAssert.assertTrue(logo);

        softAssert.assertAll();
    }
}
