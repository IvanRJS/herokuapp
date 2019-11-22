package co.com.choucair.certification.herokuapp.tasks;

import co.com.choucair.certification.herokuapp.interactions.SeleccionarFecha;
import co.com.choucair.certification.herokuapp.models.AppointmentModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappAppoinmentPage.*;
import static co.com.choucair.certification.herokuapp.utils.Constantes.CERO;

public class LlenarDatosFormularioAgendarCita implements Task {
    private List<AppointmentModel>dataSet;

    public LlenarDatosFormularioAgendarCita(List<AppointmentModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static LlenarDatosFormularioAgendarCita desde(List<AppointmentModel> dataSet) {
        return Tasks.instrumented(LlenarDatosFormularioAgendarCita.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(BOTON_GUARDAR_CITA),
                Click.on(INPUT_DATE),
                SeleccionarFecha.desde(dataSet.get(CERO).getDiaCita()),
                Enter.theValue(dataSet.get(CERO).getDocumentoPaciente()).into(TEXTO_DOCUMENTO_PACIENTE),
                Enter.theValue(dataSet.get(CERO).getDocumentoDoctor()).into(TEXTO_DOCUMENTO_DOCTOR),
                Enter.theValue(dataSet.get(CERO).getObservaciones()).into(TEXTO_OBSERVACIONES),
                Click.on(BOTON_GUARDAR_CITA));
    }
}
