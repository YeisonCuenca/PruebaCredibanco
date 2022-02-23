package com.test.credibanco.PruebaCredibanco.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver.When;

import com.test.credibanco.PruebaCredibanco.tasks.LlenarElFormulario;
import com.test.credibanco.PruebaCredibanco.tasks.OpenTheApplication;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class LlenarFormularioSteps {

	Actor actor = Actor.named("Rosa");
	
	@Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
    	actor.can(BrowseTheWeb.with(herBrowser));
    }
	
	@Test
	public void llenarFormulario() {
		givenThat(actor).wasAbleTo(openTheApplication);
		when(actor).attemptsTo(LlenarElFormulario.fillform("Yeison","Cuenca","ys.cuenca@outlook.com","Male","3143102261","01-Feb-2001","Formulario","Sports","Cra 48 a # 33 b", actor));
		/*then(actor).should(seeThat());*/
	}
}


