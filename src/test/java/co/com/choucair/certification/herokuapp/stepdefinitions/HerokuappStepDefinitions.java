package co.com.choucair.certification.herokuapp.stepdefinitions;

import co.com.choucair.certification.herokuapp.models.AppointmentModel;
import co.com.choucair.certification.herokuapp.models.DoctorModel;
import co.com.choucair.certification.herokuapp.models.PacientModel;
import co.com.choucair.certification.herokuapp.questions.TextoSalida;
import co.com.choucair.certification.herokuapp.tasks.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HerokuappStepDefinitions {

    @Dado("^que (.*) quiere ingresar al sitio herokuapp$")
    public void queIvanQuiereIngresarAlSitioHerokuapp(String ivan) {
        theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeHerokuapp());
    }

    @Dado("^que Ivan necesita registrar un nuevo doctor$")
    public void queIvanNecesitaRegistrarUnNuevoDoctor() {
        theActorInTheSpotlight().attemptsTo(IngresarAlFormlarioDeDoctor.desde());
    }

    @Cuando("^el realiza el registro del doctor en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelDoctorEnElAplicativoDeAdministracionDeHospitales(List<DoctorModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(LlenarDatosFormularioDoctor.desde(dataSet));

    }

    @Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String frase) {
        theActorInTheSpotlight().should(seeThat(TextoSalida.es(frase)));
    }

    @Dado("^que Ivan necesita registrar un nuevo paciente$")
    public void queIvanNecesitaRegistrarUnNuevoPaciente() {
        theActorInTheSpotlight().attemptsTo(IngresarAlFormlarioDePaciente.desde());

    }

    @Cuando("^el realiza el registro del paciente en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelPacienteEnElAplicativoDeAdministracionDeHospitales(List<PacientModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(LlenarDatosFormularioPaciente.desde(dataSet));

    }

    @Entonces("^el verifica que en pantalla se presente el mensaje (.*)$")
    public void elVerificaQueEnPantallaSePresenteElMensajeDatosGuardadosCorrectamente(String frase) {
        theActorInTheSpotlight().should(seeThat(TextoSalida.es(frase)));
    }

    @Dado("^que Ivan necesita asistir al medico$")
    public void queIvanNecesitaAsistirAlMedico() {
        theActorInTheSpotlight().attemptsTo(IngresarAlFormlarioDeAgendarCita.desde());
    }

    @Cuando("^el realiza el agendamiento de una Cita$")
    public void elRealizaElAgendamientoDeUnaCita(List<AppointmentModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(LlenarDatosFormularioAgendarCita.desde(dataSet));
    }

    @Entonces("^el verifica que se muestre en pantalla el mensaje (.*)$")
    public void elVerificaQueSeMuestreEnPantallaElMensajeDatosGuardadosCorrectamente(String frase) {
        theActorInTheSpotlight().should(seeThat(TextoSalida.es(frase)));
    }
}
