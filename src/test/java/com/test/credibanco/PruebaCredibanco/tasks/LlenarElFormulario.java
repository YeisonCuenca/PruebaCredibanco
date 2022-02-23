package com.test.credibanco.PruebaCredibanco.tasks;

import com.test.credibanco.PruebaCredibanco.ui.Formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class LlenarElFormulario implements Task{

	public String firstname; 
	public String lastname; 
	public String email; 
	public String gender; 
	public String mobile;
	public String dateOfBirth; 
	public String subject; 
	public String hobbies; 
	public String currentAdress;	
	
	protected LlenarElFormulario(String firstname, String lastname, String email, String gender, String mobile, String dateOfBirth, String subject, String hobbies, String currentAdress, Actor actor) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		this.subject = subject;
		this.hobbies = hobbies;
		this.currentAdress = currentAdress;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.First_Name));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Last_Name));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Phone));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Subject));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Hobbies));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Date_of_Birth));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Gender));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Email));
		actor.attemptsTo(Enter.theValue(firstname).into(Formulario.Current_Adress));
	}
	
    public static LlenarElFormulario fillform(String firstname, String lastname, String email, String gender, String mobile, String dateOfBirth, String subject, String hobbies, String currentAdress, Actor actor) {
        return instrumented(LlenarElFormulario.class, firstname, lastname, email, gender, mobile, dateOfBirth, subject, hobbies, currentAdress);
    }	
}
