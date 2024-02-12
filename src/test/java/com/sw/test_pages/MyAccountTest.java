package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.Login;
import com.sw.pages.MyAccount;
import com.sw.pages.Regestration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends Base {

    MyAccount myAccount ;
    Login login;
    Regestration regestration;

    public MyAccountTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        baseMethod();
        regestration=new Regestration();
        myAccount = new MyAccount();
       login= regestration.existing_User();
       myAccount= login.login(props.getProperty("phoneNO"), props.getProperty("password") );
    }

    @Test(testName = "Adding Personal Requirement")
    public void personalrequirement() throws InterruptedException {
        myAccount.setPersonalRequirement();
    }
    @Test(testName = "Navigating to New Arrivals")
    public void newarrivals() throws InterruptedException {
        myAccount.setNewBooks();
    }



}
