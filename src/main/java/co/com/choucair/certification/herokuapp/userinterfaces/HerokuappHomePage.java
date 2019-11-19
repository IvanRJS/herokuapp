package co.com.choucair.certification.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuappHomePage extends PageObject {
    public static final Target BOTON_AGREGAR_DOCTOR= Target.the("boton para entrar al formulario de agregar doctor").located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
    public static final Target BOTON_AGREGAR_PACIENTE= Target.the("boton para entrar al formulario de agregar paciente").located(By.xpath("//a[contains(text(),'Agregar Paciente')]"));
    public static final Target BOTON_AGREGAR_CITA= Target.the("boton para entrar al formulario de agregar cita").located(By.xpath("//a[contains(text(),'Agendar Cita')]"));
}
