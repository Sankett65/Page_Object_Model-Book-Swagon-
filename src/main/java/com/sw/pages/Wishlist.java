package com.sw.pages;

import com.sw.base.Base;
import com.sw.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Wishlist extends Base {

    @FindBy(linkText = "Add to Wishlist")
    WebElement wishList;

    @FindBy(xpath = "//span[text()='Happy Jadhav']")
    WebElement profile;

    @FindBy(xpath = "//div[@class='roundbgcontent']//ul//li")
    List<WebElement> list_of_book_in_Wishlist;

    @FindBy(xpath = "//a[text()='REMOVE']")
    List<WebElement> remove_book_from_wishlist;

    @FindBy(linkText = "ADD TO CART")
    List<WebElement> move_to_cart;

    @FindBy(xpath = "//*[@id='sub']")
    WebElement minusing_Quantity_of_book;

    @FindBy(id = "add")
    WebElement adding_Quantity_of_book;

    @FindBy(id = "ctl00_phBody_WishList_lvWishList_chkAll")
    WebElement slecting_all_Books;

    @FindBy(id = "ctl00_phBody_WishList_lvWishList_imgDelete")
    WebElement removing_all_Books;

    @FindBy(id = "imgAddtoCart")
    WebElement moving_all_Books_to_cart;

    public Wishlist(){
        PageFactory.initElements(driver,this);
    }

    public void add_a_book_to_WishList(){
        wishList.click();
    }

    public void display_wishlist(){
        profile.click();
    }

    public void remove_a_book_from_wishlist(int number){
        list_of_book_in_Wishlist.get(number);
        remove_book_from_wishlist.get(number).click();
    }

    public void move_book_to_cart(int number){
        list_of_book_in_Wishlist.get(number);
        move_to_cart.get(number).click();
    }

    public void minising_book(int number){
        list_of_book_in_Wishlist.get(number);
        minusing_Quantity_of_book.click();
    }

    public void adding_book(int number){
        list_of_book_in_Wishlist.get(number);
        adding_Quantity_of_book.click();
    }

    public void removing_all_books_from_wishlist() throws InterruptedException {
        slecting_all_Books.click();
        Utility.timing_in_Second(3);
        removing_all_Books.click();
    }

    public void moving_all_books_to_cart() throws InterruptedException {
        slecting_all_Books.click();
        Utility.timing_in_Second(3);
        moving_all_Books_to_cart.click();
    }
}
