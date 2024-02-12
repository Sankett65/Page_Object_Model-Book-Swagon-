package com.sw.pages;

import com.sw.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewOrder extends Base {

    @FindBy(name = "ctl00$cpBody$ShoppingCart$lvCart$txtInstruction")
    WebElement special_Instructions;

    @FindBy(name = "ctl00$cpBody$ShoppingCart$lvCart$txtGiftMessage")
    WebElement gift_Message;

    @FindBy(name = "ctl00$cpBody$ShoppingCart$lvCart$txtCoupon")
    WebElement apply_Coupon;

    @FindBy(name = "ctl00$cpBody$ShoppingCart$lvCart$savecontinue")
    WebElement save_continue_Btn;

    @FindBy(linkText = "View Cart")
    WebElement cart_review;

    public ReviewOrder(){
        PageFactory.initElements(driver,this);
    }

    public void setSpecial_Instructions(String instu){
        special_Instructions.sendKeys(instu);
        save_continue_Btn.click();
    }

    public void setGift_Message_Instructions(String instu){
        gift_Message.sendKeys(instu);
        save_continue_Btn.click();
    }

    public void apply_coupon_with_special_instruction(String coup,String inst){
        special_Instructions.sendKeys(inst);
        apply_Coupon.sendKeys(coup);
    }

    public void apply_coupon_with_gift_instruction(String coup,String inst){
        gift_Message.sendKeys(inst);
        apply_Coupon.sendKeys(coup);
    }

    public void review_cart(){
        cart_review.click();
    }
}
