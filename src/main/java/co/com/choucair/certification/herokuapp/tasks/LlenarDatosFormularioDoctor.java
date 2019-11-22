package co.com.choucair.certification.herokuapp.tasks;

import co.com.choucair.certification.herokuapp.models.DoctorModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappDoctorPage.*;
import static co.com.choucair.certification.herokuapp.utils.Constantes.CERO;

public class LlenarDatosFormularioDoctor implements Task {
    private List<DoctorModel>dataSet;

    public LlenarDatosFormularioDoctor(List<DoctorModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static LlenarDatosFormularioDoctor desde(List<DoctorModel>dataSet) { return Tasks.instrumented(LlenarDatosFormularioDoctor.class,dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataSet.get(CERO).getNombre()).into(TEXTO_NOMBRE),
                Enter.theValue(dataSet.get(CERO).getApellidos()).into(TEXTO_APELLIDOS),
                Enter.theValue(dataSet.get(CERO).getTelefono()).into(TEXTO_TELEFONO),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getTipoDocumento()).from(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(dataSet.get(CERO).getNroDocumento()).into(TEXTO_NUMERO_DOCUMENTO),
                Click.on(BOTON_GUARDAR_DOCTOR)
                );


    }
}
