package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shipping extends Base {

    @FindBy(name = "ctl00$cpBody$txtNewRecipientName")
    WebElement recipient_Name;

    @FindBy(name = "ctl00$cpBody$txtNewAddress")
    WebElement street_Address;

    @FindBy(name = "ctl00$cpBody$ddlNewCountry")
    WebElement country;

    @FindBy(name = "ctl00$cpBody$ddlNewState")
    WebElement state;

    @FindBy(name = "ctl00$cpBody$ddlNewCities")
    WebElement city;
    @FindBy(name = "ctl00$cpBody$txtNewPincode")
    WebElement pincode;

    @FindBy(name = "ctl00$cpBody$txtNewMobile")
    WebElement mobilenumber;

    @FindBy(name = "ctl00$cpBody$imgSaveNew")
    WebElement save_continue_Btn;

    public Shipping(){
        PageFactory.initElements(driver,this);
    }

    public ReviewOrder shipping_address(String fn,String add,String  pincd,String mobileno) throws InterruptedException {

        recipient_Name.sendKeys(fn);
        street_Address.sendKeys(add);

        Select selectcountry = new Select(country);
        selectcountry.selectByValue("India");
        Utility.timing_in_Second(2);

        Select selectstate = new Select(state);
        selectstate.selectByValue("Maharashtra");
        Utility.timing_in_Second(2);

        Select selectcity = new Select(city);
        selectcity.selectByValue("Mumbai");

        pincode.sendKeys(pincd);
        mobilenumber.sendKeys(mobileno);
        save_continue_Btn.click();
        return new ReviewOrder();

    }


}
