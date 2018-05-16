package com.chase.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	 public WebDriver driver;
     
	    public PageObjects(WebDriver driver) {       
	        this.driver = driver;
	    }
	    
	   public By learnmorebutton = By.xpath("//*[@data-pt-name=\"cc_freedom_ulim_ftr_lrn_more\"]");
	   public By Applynowbutton = By.id("ApplyNow");
	   public By Firstname = By.name("value(sFirstName)");
	   public By Lastname = By.name("value(sLastName)");
	   public By streetadd = By.name("value(sStreetAddr1)");
	   public By city = By.name("value(sCity)");
	   
	   public By state = By.name("value(sState1)");
	   public By zip = By.name("value(sZip)");
	   public By nextButton = By.id("next1");
	   public By chekings = By.xpath("//*[@id=\"step2\"]/div[2]/div/div[2]/div[2]/div[1]/div/label/div");
	   public By HouseType = By.name("value(sHousingType)");
	   public By Mortgage = By.name("value(sMonthlyMortgage)");
	   public By annualincome = By.name("value(sAnnualIncome)");
	   
	   public By EmpType = By.name("value(sPosition)");
	   public By Employer = By.name("value(sEmployerOpt)");
	   public By nextButton2 = By.id("next2");
	   
	   
	   public By phonenumber = By.name("value(sHomePhone)");
	   public By email = By.name("value(sEMailAddr2)");
	   public By ssn = By.name("value(sSSN)");
	   public By dob = By.name("value(sDOB)");
	   public By mothersmaiden = By.name("value(sMaidenName)");
	   public By nextButton3 = By.id("next3");
	   

	   
	   
	   
	   
	   
	   
}
