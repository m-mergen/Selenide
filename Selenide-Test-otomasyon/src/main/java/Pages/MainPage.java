package Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public String getWelcomeUserName(){
        return $(By.cssSelector("#rightPanel > h1")).getText();
    }

    public MainPage userNameController(String userName){
        $(By.cssSelector("#leftPanel > p")).shouldHave(Condition.text(userName));
        return this;
    }

    public MainPage leftMenuSelect(String menu){
        $$("[id='leftPanel'] a").filterBy(Condition.text(menu)).first().click();
        return this;
    }

}
