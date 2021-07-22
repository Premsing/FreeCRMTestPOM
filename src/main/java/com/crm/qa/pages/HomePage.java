package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: group automation')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//input[@value='New Contact']")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[@title='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[@title='Tasks']")
	WebElement tasksLink;
	
	//Initializing the Page Objects:
		public HomePage(){
			
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifyCorrectUserName() {
			return userNameLabel.isDisplayed();
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public ContactsPage clickOnContactsLink() {
			contactsLink.click();
			return new ContactsPage();
		}
		
		public DealsPage clickOnDealsLink() {
			dealsLink.click();
			return new DealsPage();
		}
		
		public TasksPage clickOnTaksPage() {
			tasksLink.click();
			return new TasksPage();
		}
		
		public void clickOnNewContactLink(){
			
			newContactLink.click();
			
		}

}