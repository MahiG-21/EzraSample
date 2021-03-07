package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@FindBy(id= "username")
    WebElement userName;
	@FindBy(id ="password")
	WebElement passWord;
	@FindBy(xpath="//input [@name= 'submit']")
	WebElement submit;
	
	
public LoginPage() {
	PageFactory.initElements(driver,this);	
}
public void validateTitle() {
	String title = driver.getTitle();
	System.out.println("Show the title of the page " + title);
}

public void validateUrl() {
	String url =driver.getCurrentUrl();
	System.out.println("Shoe the current url" +url);
	
}
public void createaccount(String Uname,String Pass) {
	userName.sendKeys(Uname);
	passWord.sendKeys(Pass);
	submit.click();
}

public void closeBrowser() {
	driver.close();
}
}
