package co.com.choucair.certification.herokuapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappHomePage.BOTON_AGREGAR_PACIENTE;

public class IngresarAlFormlarioDePaciente implements Task {

    public static IngresarAlFormlarioDePaciente desde() { return Tasks.instrumented(IngresarAlFormlarioDePaciente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_AGREGAR_PACIENTE));
    }
}
