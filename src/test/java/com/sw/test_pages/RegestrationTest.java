package com.sw.test_pages;

import com.sw.base.Base;
import com.sw.pages.Regestration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegestrationTest extends Base {

    Regestration regestration;

        public RegestrationTest(){
            super();
        }

        @BeforeMethod
        public void setup(){
            baseMethod();
            regestration = new Regestration();
        }

        @Test(testName = "For Regestration")
        public void singup() throws InterruptedException {
            regestration.singup(props.getProperty("name"), props.getProperty("phoneNO"), props.getProperty("password") );
        }

        @Test(testName = "If user Already Exists")
        public void user_allredy_exits(){
            regestration.existing_User();
        }
}
