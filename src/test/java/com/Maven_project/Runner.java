package com.Maven_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Runner extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
	browserLaunch("chrome");
    launchUrl("https://adactinhotelapp.com/");
    WebElement user = driver.findElement(By.id("username"));
	passInput(user,"shailumalar");
	WebElement password = driver.findElement(By.id("password"));
	passInput(password,"malarmalar");
	WebElement login = driver.findElement(By.id("login"));
	clickOnElement(login);
    WebElement loc = driver.findElement(By.id("location"));
	Selectbyvalue(loc, "London");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Selectbyvalue(hotel,"Hotel Cornice");
	WebElement room = driver.findElement(By.id("room_type"));
	Selectbyvalue(room,"Deluxe");
	WebElement nroom = driver.findElement(By.id("room_nos"));
	Selectbyvalue(nroom, "4");
	WebElement idate = driver.findElement(By.id("datepick_in"));
    clear(idate);
    passInput(idate,"19/06/2022");
	WebElement odate = driver.findElement(By.id("datepick_out"));
	clear(odate);
	passInput(odate,"21/06/2022");
    WebElement adult = driver.findElement(By.id("adult_room"));
    SelectbyVisibleText(adult,"3 - Three");
    WebElement child = driver.findElement(By.id("child_room")); 
    Selectbyvalue(child,"1");
    WebElement search = driver.findElement(By.id("Submit"));
    clickOnElement(search);;
    WebElement radio = driver.findElement(By.id("radiobutton_0"));
    clickOnElement(radio);;
    WebElement ok = driver.findElement(By.id("continue"));
    clickOnElement(ok);
    WebElement name = driver.findElement(By.id("first_name"));
    passInput(name,"PONMALAR");
    WebElement lname = driver.findElement(By.id("last_name"));
    passInput(lname,"Sankarapandian");
    WebElement address = driver.findElement(By.id("address"));
    passInput(address,"35,G.T.N salai,dindigul");
    WebElement cardno = driver.findElement(By.id("cc_num"));
    passInput(cardno,"9876543210012345");
    WebElement type = driver.findElement(By.id("cc_type"));
    Selectbyvalue(type,"MAST");
    WebElement emonth = driver.findElement(By.id("cc_exp_month"));
    Selectbyvalue(emonth,"9");
    WebElement eyear = driver.findElement(By.id("cc_exp_year"));
    Selectbyvalue(eyear,"2022");
    WebElement cvv = driver.findElement(By.id("cc_cvv"));
    passInput(cvv,"0861");
    WebElement book = driver.findElement(By.name("book_now"));
    clickOnElement(book);
    Thread.sleep(15000);
    Screenshot("C:\\Users\\PONMALAR\\eclipse-workspace\\Maven_project\\Screenshot\\confirmation.png");
    WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
    clickOnElement(logout);;
   }}
