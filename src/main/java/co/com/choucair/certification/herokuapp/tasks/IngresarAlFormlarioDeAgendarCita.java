package co.com.choucair.certification.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappHomePage.BOTON_AGENDAR_CITA;

public class IngresarAlFormlarioDeAgendarCita implements Task {

    public static IngresarAlFormlarioDeAgendarCita desde() {
        return Tasks.instrumented(IngresarAlFormlarioDeAgendarCita.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_AGENDAR_CITA));
    }
}
