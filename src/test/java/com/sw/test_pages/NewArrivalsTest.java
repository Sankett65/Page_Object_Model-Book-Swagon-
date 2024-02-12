package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.Login;
import com.sw.pages.MyAccount;
import com.sw.pages.NewArrivals;
import com.sw.pages.Regestration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewArrivalsTest extends Base {

    MyAccount myAccount ;
    Login login;
    Regestration regestration;
    NewArrivals newArrivals;

    public NewArrivalsTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        baseMethod();
        regestration=new Regestration();
        myAccount = new MyAccount();
        login= regestration.existing_User();
        myAccount= login.login(props.getProperty("phoneNO"), props.getProperty("password") );
        newArrivals=myAccount.setNewBooks();
    }


    @Test(testName = "Selecting Particular Book")
    public void clickBook(){
        newArrivals.clickonBooktogocart();
    }

    @Test(testName = "Selecting book based on Language")
    public void setalanguage() throws InterruptedException {
        int number = Integer.parseInt((props.getProperty("Portuguese")));
        newArrivals.setLanguages(number);
    }

    @Test(testName = "Selecting book using Binding")
    public void setBinding() throws InterruptedException {
        int bind = Integer.parseInt((props.getProperty("Hard_Cover")));
        newArrivals.setBindinglist(bind);
    }

    @Test(testName = "Buying the Book")
    public void click_on_Buy_Now(){
        newArrivals.clickonBooktogo_ButNow();
    }
}
