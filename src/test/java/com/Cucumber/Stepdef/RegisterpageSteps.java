package com.Cucumber.Stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterpageSteps 
{
	WebDriver driver;
	
	@Given("open register page")
	public void open_register_page() {
	    
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@When("user enter all required data")
	public void user_enter_all_required_data(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(data.get(0).get("address"));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(0).get("email"));

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(data.get(0).get("phonenumber"));

		driver.findElement(By.cssSelector("#firstpassword")).sendKeys(data.get(0).get("password"));

		driver.findElement(By.cssSelector("#secondpassword")).sendKeys(data.get(0).get("cpassword"));

		
	   
	}

	@When("user select gender")
	public void user_select_gender() {
	   driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("user select hobby")
	public void user_select_hobby() {

		driver.findElement(By.cssSelector("#checkbox1")).click();
	}

	@When("user select language")
	public void user_select_language() {
		//click:open list
		driver.findElement(By.cssSelector("#msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
	}

	@When("user select skills")
	public void user_select_skills() throws InterruptedException {
	    
		Select sc=new Select(driver.findElement(By.cssSelector("#Skills")));
		sc.selectByVisibleText("Java");
		Thread.sleep(1000);
	}

	@When("user select country")
	public void user_select_country() throws InterruptedException {
		Select sc=new Select(driver.findElement(By.cssSelector("#countries")));
		sc.selectByVisibleText("Select Country");
		Thread.sleep(1000);
	}

	@When("select specific country")
	public void select_specific_country() {

		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
	}

	@When("select date of birth")
	public void select_date_of_birth() {
		Select sc1=new Select(driver.findElement(By.cssSelector("#yearbox")));
		sc1.selectByVisibleText("2010");
		
		Select sc2=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		sc2.selectByVisibleText("April");
		
		Select sc3=new Select(driver.findElement(By.cssSelector("#daybox")));
		sc3.selectByVisibleText("14");
	}

	@When("click on Submit")
	public void click_on_submit() {
		driver.findElement(By.cssSelector("#submitbtn")).click();
	}

	@Then("user should be register")
	public void user_should_be_register() {
	    
		System.out.println("Title: "+driver.getTitle());
	}


}
