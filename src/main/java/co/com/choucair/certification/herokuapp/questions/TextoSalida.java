package co.com.choucair.certification.herokuapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappDoctorPage.MENSAJE_DOCTOR_AGREGADO;

public class TextoSalida implements Question<Boolean> {

    private String frase;

    public TextoSalida(String frase) {
        this.frase = frase;
    }

    public static TextoSalida es(String frase) {
       return new  TextoSalida(frase);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String salida = Text.of(MENSAJE_DOCTOR_AGREGADO).viewedBy(actor).asString().trim();
        return frase.equals(salida);
    }
}
