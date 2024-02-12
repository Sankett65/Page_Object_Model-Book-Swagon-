package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {


    @FindBy(name = "ctl00$phBody$SignIn$txtEmail")
    WebElement phonenumber;

    @FindBy(name = "ctl00$phBody$SignIn$txtPassword")
    WebElement password;

    @FindBy(id = "ctl00_phBody_SignIn_btnLogin")
    WebElement login_Btn;

    @FindBy(id = "ctl00_phBody_SignIn_btnRequestOTP")
    WebElement request_Otp_Btn;

    @FindBy(linkText = "Forgot your Password?")
    WebElement forgot_password_Link;

    @FindBy(linkText = "New to Bookswagon? Sign up")
    WebElement singup_Btn;


    @FindBy(name = "ctl00$phBody$SignIn$btnOTP")
    WebElement verify_Btn;

    public  Login(){
        PageFactory.initElements(driver,this);
    }

    public MyAccount login(String phn,String pass) throws InterruptedException {
        Utility.timing_in_Second(2);
        phonenumber.sendKeys(phn);
        Utility.timing_in_Second(2);
        password.sendKeys(pass);
        login_Btn.click();
        return new MyAccount();
    }

    public void login_With_OTP(String phn) throws InterruptedException {
        phonenumber.sendKeys(phn);
        Utility.timing_in_Second(2);
        request_Otp_Btn.click();
        Utility.timing_in_Second(5);
        verify_Btn.click();

    }

    public void singup(){
        singup_Btn.click();
    }

    public void forgotpassword(){
        forgot_password_Link.click();
    }
}
