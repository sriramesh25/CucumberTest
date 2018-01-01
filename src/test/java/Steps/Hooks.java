package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks extends BaseUtil{



    private BaseUtil base;

    public Hooks(BaseUtil base)
    {
        this.base = base;
    }

    @Before

    public void InitializeTest()
    {
        System.out.println("Opening the Browser:Chrome");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
        base.Driver= new ChromeDriver();

    }

    @After
    public void TearDownTest()
    {
        System.out.println("close Down the Browser:Chrome");
    }

}
