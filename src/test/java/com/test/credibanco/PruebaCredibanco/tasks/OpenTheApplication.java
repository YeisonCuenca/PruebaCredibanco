package com.test.credibanco.PruebaCredibanco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.test.credibanco.PruebaCredibanco.ui.CredibancoTestPage;

public class OpenTheApplication implements Task {

    CredibancoTestPage pageHome;

    @Step("Abrir pagina principal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(pageHome)
        );
    }
}