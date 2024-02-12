package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regestration extends Base {

    @FindBy(name="ctl00$phBody$SignUp$txtName")
    WebElement Full_name;

    @FindBy(name = "ctl00$phBody$SignUp$txtEmail")
    WebElement phonenumber;

    @FindBy(name = "ctl00$phBody$SignUp$btnContinue")
    WebElement continue_Btn;

    @FindBy(name = "ctl00$phBody$SignUp$txtPassword")
    WebElement password;

    @FindBy(name = "ctl00$phBody$SignUp$txtConfirmPwd")
    WebElement confirmPassword;

    @FindBy(id = "ctl00_phBody_SignUp_btnSubmit")
    WebElement singup_Btn;

    @FindBy(xpath = "//a[@class='btn btn-block  themebackground text-white loginlink']")
    WebElement existing_User_Btn;


    public Regestration(){
        PageFactory.initElements(driver,this);
    }

    public void singup(String name1,String phn,String pass) throws InterruptedException {
        Utility.timing_in_Second(3);
        Full_name.sendKeys(name1);
        Utility.timing_in_Second(1);
        phonenumber.sendKeys(phn);
        Utility.timing_in_Second(3);
        continue_Btn.click();
        Utility.timing_in_Second(3);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
        singup_Btn.click();
    }

    public Login existing_User(){
        existing_User_Btn.click();
        return new Login();
    }
}
