package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReviewOrderTest extends Base {

    MyAccount myAccount ;
    Login login;
    Regestration regestration;
    NewArrivals newArrivals;

    Shipping shipping;
    ReviewOrder reviewOrder;

    public ReviewOrderTest(){
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
        reviewOrder=shipping.shipping_address(props.getProperty("name"),props.getProperty("address"), props.getProperty("pincode"), props.getProperty("phoneNO") );
    }

    @Test(testName = "Adding the Special Instruction")
    public void add_special_instruction(){
        reviewOrder.setSpecial_Instructions(props.getProperty("specialInst"));
    }

    @Test(testName = "Gift Instruction")
    public void add_gift_instruction(){
        reviewOrder.setGift_Message_Instructions(props.getProperty("giftInst"));
    }

    @Test(testName = "Adding the Gift Instruction along With Coupon")
    public void add_gift_instruction_along_with_coupon(){
        reviewOrder.apply_coupon_with_gift_instruction(props.getProperty("coupon"), props.getProperty("giftInst"));
    }

    @Test(testName = "Adding coupon and Special Instruction")
    public void add_special_instruction_along_with_coupon(){
        reviewOrder.apply_coupon_with_special_instruction(props.getProperty("coupon"), props.getProperty("specialInst"));
    }

    @Test(testName = "Reviewing Cart")
    public void review_cart_from_reviewOder(){
        reviewOrder.review_cart();
    }

}
