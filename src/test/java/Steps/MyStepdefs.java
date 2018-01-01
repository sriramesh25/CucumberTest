package Steps;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

import Base.BaseUtil;
import Pages.LoginPage;
import Transformer.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;

import static java.lang.System.*;

public class MyStepdefs extends BaseUtil {

    private BaseUtil base;

    public MyStepdefs(BaseUtil base)
    {
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        base.Driver.findElement(By.id("Initial")).isDisplayed();



    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        out.println("Navigate To Login Page");
        base.Driver.navigate().to("http://executeautomation.com/demosite/Login.html");
    }

  //  @And("^I enter username as admin and password as admin$")
  //  public void iEnterUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    //    System.out.println("Third Step");

   // }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  base.Driver.findElement(By.name("Login")).submit();
        LoginPage page=new LoginPage(base.Driver);
        page.ClickLogin();

    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Write code here that turns the/' phrase above into concrete action

        //create array list
        List<User> users = new ArrayList<User>();
        users=table.asList(User.class);

         //calling method from Login Page
        LoginPage page=new LoginPage(base.Driver);
                for(User user:users)
                {
                 //  base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
                //   base.Driver.findElement(By.name("Password")).sendKeys((user.password));
                    page.Login(user.username,user.password);

    }
}

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUsernameAndPassword(String userName,String passWord) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
       out.println("This is UserName"+userName);
       out.println(("This is Password"+passWord));
    }

    @And("^I enter the following email:([^\"]*)$")
    //you have to call @Transform and the particular class which hold concat value which is EmailTransform class
    public void iEnterTheFollowingEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        out.println("the email Address is"+email);

    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            this.username = userName;
            this.password = passWord;
        }
    }


}
