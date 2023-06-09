package Pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public RegisterPage fillFirstName(){
        $(By.xpath("//*[@id=\"customer.firstName\"]")).setValue("Test");
        return this;
    }

    public RegisterPage fillLastName(){
        $(By.name("customer.lastName")).setValue("QA");
        return this;
    }

    public RegisterPage fillAddress(){
        $(By.xpath("//*[@id=\"customer.address.street\"]")).setValue("SISLI Mecidiyekoy");
        return this;
    }

    public RegisterPage fillCity(){
        $(By.cssSelector("#customer\\.address\\.city")).setValue("Istanbul");
        return this;
    }

    public RegisterPage fillState(){
        $(By.id("customer.address.state")).setValue("1236455");
        return this;
    }

    public RegisterPage fillZipCode(){
        $(By.id("customer.address.zipCode")).setValue("34000");
        return this;
    }

    public RegisterPage fillPhoneNumber(){
        $(By.id("customer.phoneNumber")).setValue("05456155235625");
        return this;
    }

    public RegisterPage fillUserName(String username){
        $(By.id("customer.username")).setValue(username);
        return this;
    }

    public RegisterPage fillSSN(){
        $(By.id("customer.ssn")).setValue("test");
        return this;
    }

    public RegisterPage fillPassword(){
        $(By.id("customer.password")).setValue("test123");
        return this;
    }

    public RegisterPage fillConfirm(){
        $(By.id("repeatedPassword")).setValue("test123");
        return this;
    }

    public RegisterPage Register(){
        $(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        return this;
    }

 }
