package com.test.credibanco.PruebaCredibanco.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Formulario {
	public static Target  First_Name = Target.the("First_Name").located(By.id("firstName"));
	public static Target  Last_Name = Target.the("Last_Name").located(By.id("lastName"));
	public static Target  Phone = Target.the("Phone").located(By.id("userNumber"));
	public static Target  Subject = Target.the("Subject").located(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi')]"));
	public static Target  Hobbies = Target.the("Hobbies").located(By.xpath(" (//div[contains(@class,'custom-control custom-checkbox')])"));
	public static Target  Date_of_Birth = Target.the("Date_of_Birth").located(By.id("dateOfBirthInput"));
	public static Target Gender = Target.the("Gender").located(By.name("gender"));
	public static Target  Email = Target.the("Email").located(By.id("userEmail"));
	public static Target  Current_Adress = Target.the("Current_Adress").located(By.id("currentAddress"));
}
