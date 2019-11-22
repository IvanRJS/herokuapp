package co.com.choucair.certification.herokuapp.tasks;

import co.com.choucair.certification.herokuapp.models.PacientModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappPacientPage.*;
import static co.com.choucair.certification.herokuapp.utils.Constantes.CERO;

public class LlenarDatosFormularioPaciente implements Task {
    private List<PacientModel>dataSet;

    public LlenarDatosFormularioPaciente(List<PacientModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static LlenarDatosFormularioPaciente desde(List<PacientModel> dataSet) {
        return Tasks.instrumented(LlenarDatosFormularioPaciente.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataSet.get(CERO).getNombre()).into(TEXTO_NOMBRE),
                Enter.theValue(dataSet.get(CERO).getApellidos()).into(TEXTO_APELLIDOS),
                Enter.theValue(dataSet.get(CERO).getTelefono()).into(TEXTO_TELEFONO),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getTipoDocumento()).from(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(dataSet.get(CERO).getNroDocumento()).into(TEXTO_NUMERO_DOCUMENTO),
                Check.whether(dataSet.get(CERO).getSaludPrepagada().equals("Salud prepagada"))
                     .andIfSo(Click.on(CHECKBOX_PREPAGADA)),
                Click.on(BOTON_GUARDAR_PACIENTE));
    }
}
