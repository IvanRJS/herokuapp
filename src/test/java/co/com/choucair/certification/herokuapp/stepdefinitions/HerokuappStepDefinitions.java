package co.com.choucair.certification.herokuapp.stepdefinitions;

import co.com.choucair.certification.herokuapp.models.DataModel;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class HerokuappStepDefinitions {

    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }

@Dado("^que Ivan necesita ingresar al sitio herokuapp$")
public void queIvanNecesitaIngresarAlSitioHerokuapp() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Dado("^que Ivan necesita registrar un nuevo doctor$")
public void queIvanNecesitaRegistrarUnNuevoDoctor() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Cuando("^el realiza el registro del doctor en el aplicativo de Administracion de Hospitales$")
public void elRealizaElRegistroDelDoctorEnElAplicativoDeAdministracionDeHospitales(DataTable arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@Entonces("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Dado("^que Ivan necesita registrar un nuevo paciente$")
public void queIvanNecesitaRegistrarUnNuevoPaciente() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Cuando("^el realiza el registro del paciente en el aplicativo de Administracion de Hospitales$")
public void elRealizaElRegistroDelPacienteEnElAplicativoDeAdministracionDeHospitales(DataTable arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@Entonces("^el verifica que en pantalla se presente el mensaje Datos guardados correctamente$")
public void elVerificaQueEnPantallaSePresenteElMensajeDatosGuardadosCorrectamente() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Dado("^que Ivan necesita asistir al medico$")
public void queIvanNecesitaAsistirAlMedico() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Cuando("^el realiza el agendamiento de una Cita$")
public void elRealizaElAgendamientoDeUnaCita(DataTable arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@Entonces("^el verifica que se muestre en pantalla el mensaje Datos guardados correctamente$")
public void elVerificaQueSeMuestreEnPantallaElMensajeDatosGuardadosCorrectamente() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
    }
