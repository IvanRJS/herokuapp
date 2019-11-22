package co.com.choucair.certification.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappHomePage.BOTON_AGREGAR_DOCTOR;

public class IngresarAlFormlarioDeDoctor implements Task {

    public static IngresarAlFormlarioDeDoctor desde() {
        return Tasks.instrumented(IngresarAlFormlarioDeDoctor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_AGREGAR_DOCTOR));
    }
}
