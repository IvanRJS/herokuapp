package co.com.choucair.certification.herokuapp.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hook {
    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }
}
