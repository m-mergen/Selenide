import Base.BaseLib;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.RegisterPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.By.cssSelector;

public class RegisterTest extends BaseLib {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Selenide.open("https://parabank.parasoft.com/");
        getWebDriver().manage().window().maximize();
    }

    @Test
    public void TC001() {
        String username = "TestQa" + randomNumber() ;
        loginPage
                .register();


        registerPage
                .fillFirstName()
                .fillLastName()
                .fillAddress()
                .fillCity()
                .fillState()
                .fillZipCode()
                .fillPhoneNumber()
                .fillSSN()
                .fillUserName(username)
                .fillPassword()
                .fillConfirm()
                .Register();


        String welcomeText = mainPage.getWelcomeUserName();
        Assert.assertEquals(welcomeText, "Welcome " + username);

        mainPage
                .userNameController("Test QA")
                .leftMenuSelect("Open New Account")
                .leftMenuSelect("Accounts Overview")
                .leftMenuSelect("Log Out");

        loginPage
                .fillUserName(username)
                .fillPassword("test123")
                .login();

        mainPage
                .userNameController("Test QA");
    }



    @Test
    public void TC002() {
        String username = "TestQa" +randomNumber() ;



        registerPage
                .fillFirstName()
                .fillLastName()
                .fillAddress()
                .fillCity()
                .fillState()
                .fillZipCode()
                .fillPhoneNumber()
                .fillSSN()
                .fillUserName(username)
                .fillPassword()
                .fillConfirm()
                .Register();



        String welcomeText = mainPage.getWelcomeUserName();
        Assert.assertEquals(welcomeText, "Welcome " + username);

        mainPage
                .userNameController("Test QA")
                .leftMenuSelect("Open New Account")
                .leftMenuSelect("Accounts Overview")
                .leftMenuSelect("Log Out");

        loginPage
                .fillUserName(username)
                .fillPassword("test123")
                .login();

        mainPage
                .userNameController("Test QA");
    }

}

