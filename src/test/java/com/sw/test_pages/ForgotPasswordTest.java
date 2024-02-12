package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.ForgotPassword;
import com.sw.pages.Login;
import com.sw.pages.Regestration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends Base {
    Login login;
    Regestration regestration;
    ForgotPassword forgotPassword;

    public ForgotPasswordTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        baseMethod();
        forgotPassword= new ForgotPassword();
        login = new Login();
        regestration=new Regestration();
    }

    @Test(testName = "Forgot Password")
    public void setforgotpassword() throws InterruptedException {
        regestration.existing_User();
        login.forgotpassword();
        forgotPassword.forgotpassword(props.getProperty("phoneNO"), props.getProperty("password"));
    }

    @Test(testName = "For Sing Up")
    public void singup() throws InterruptedException {
       regestration.existing_User();
       login.forgotpassword();
       forgotPassword.singup();

    }


}
