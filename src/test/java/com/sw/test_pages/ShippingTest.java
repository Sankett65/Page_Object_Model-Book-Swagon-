package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShippingTest extends Base {

    MyAccount myAccount ;
    Login login;
    Regestration regestration;
    NewArrivals newArrivals;

    Shipping shipping;

    public ShippingTest(){
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
        shipping=newArrivals.clickonBooktogo_ButNow();
    }

    @Test(testName = "Adding Shipping Address")
    public void shipping_address() throws InterruptedException {
        shipping.shipping_address(props.getProperty("name"),props.getProperty("address"), props.getProperty("pincode"), props.getProperty("phoneNO") );
    }

}
