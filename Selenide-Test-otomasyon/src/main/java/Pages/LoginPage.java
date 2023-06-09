package Pages;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.cssSelector;

public class LoginPage {
    public LoginPage register(){
        $(cssSelector("a[href*='register.htm']")).click();
        return this;
    }

    public LoginPage fillUserName(String username){
        $("#loginPanel > form > div:nth-child(2) > input").setValue(username);
        return this;
    }

    public LoginPage fillPassword(String pass){
        $("#loginPanel > form > div:nth-child(4) > input").setValue(pass);
        return this;
    }

    public LoginPage login(){
        $("#loginPanel > form > div:nth-child(5) > input").click();
        return this;
    }
}
