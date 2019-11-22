package co.com.choucair.certification.herokuapp.tasks;

import co.com.choucair.certification.herokuapp.userinterfaces.HerokuappHomePageUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private HerokuappHomePageUrl herokuappHomePageUrl;

    public static Abrir laPaginaDeHerokuapp() {return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(herokuappHomePageUrl));
    }
}
