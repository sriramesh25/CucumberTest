package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.security.util.Password;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // Demo site User name txt box name "UserName" value assigned to variable txtusername
    @FindBy(how = How.NAME,using="UserName")
    public WebElement txtusername;

    //Demo site Password txt box  name "Password value assigned to variable txtpassword
    @FindBy(how=How.NAME,using= "Password")
    public WebElement txtpassword;






    //Demo site Login Id Name "Login"
    @FindBy(how = How.NAME,using ="Login")
    public WebElement btnLogin;

    public void Login(String userName,String passWord)
    {
        txtusername.sendKeys(userName);
        txtpassword.sendKeys(passWord);
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }

}
