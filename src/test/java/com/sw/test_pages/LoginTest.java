package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.Login;
import com.sw.pages.Regestration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class LoginTest extends Base {

    Login login;
    Regestration regestration;
    Logger log = Logger.getLogger(Login.class);


    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
       log.info("Setting up application");
        baseMethod();
        regestration=new Regestration();
        login = regestration.existing_User();
    }

    @Test(testName = "For Login")
    public void login() throws InterruptedException {
      //  regestration.existing_User();
        login.login(props.getProperty("phoneNO"), props.getProperty("password") );
        System.out.println("Test case is sucessfully executrd with data as Mobile number: "+props.getProperty("phoneNO")+" and Password: "+props.getProperty("password"));
    }

    @Test(testName = "For Login With OTP")
    public void loginWithOtp() throws InterruptedException {
      //  regestration.existing_User();
        login.login_With_OTP(props.getProperty("phoneNO"));
    }

    @Test(testName = "For Sing Up")
    public void singup(){
       // regestration.existing_User();
        login.singup();
        log.info("Test case is sucessfully executrd with data as Mobile number: "+props.getProperty("phoneNO")+" and Password: "+props.getProperty("password"));
    }
}
