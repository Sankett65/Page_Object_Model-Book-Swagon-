package com.sw.pages;

import com.sw.base.Base;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base {



    public Search(){
        PageFactory.initElements(driver,this);
    }
}
