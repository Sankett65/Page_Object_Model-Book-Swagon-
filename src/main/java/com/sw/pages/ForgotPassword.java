package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword  extends Base {

    @FindBy(name = "ctl00$phBody$ForgotPassword$txtFGEmail")
    WebElement name;

    @FindBy(linkText = "Continue")
    WebElement continue_Btn;

    @FindBy(name = "ctl00$phBody$ForgotPassword$txtFGPassword")
    WebElement password;

    @FindBy(name = "ctl00$phBody$ForgotPassword$txtConfirmFGPwd")
    WebElement confirmpassword;

    @FindBy(name = "ctl00$phBody$ForgotPassword$btnFGLogin")
    WebElement login_Btn;
    @FindBy(linkText = "New to Bookswagon? Sign up")
    WebElement singup_Btn;


    public ForgotPassword(){
        PageFactory.initElements(driver,this);
    }

    public void forgotpassword(String fn,String  pass) throws InterruptedException {
        name.sendKeys(fn);
        Utility.timing_in_Second(3);
        continue_Btn.click();
        Utility.timing_in_Second(5);
        password.sendKeys(pass);
        confirmpassword.sendKeys(pass);
        login_Btn.click();
    }

    public void singup(){
        singup_Btn.click();
    }
}
