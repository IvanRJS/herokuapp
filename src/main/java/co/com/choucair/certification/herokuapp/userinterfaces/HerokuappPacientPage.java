package co.com.choucair.certification.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuappPacientPage extends PageObject {
    public static final Target TEXTO_NOMBRE = Target.the("area para escribir el nombre").located(By.name("name"));
    public static final Target TEXTO_APELLIDOS= Target.the("area para escribir los apellidos").located(By.name("last_name"));
    public static final Target TEXTO_TELEFONO= Target.the("area para escribir el telefono").located(By.name("telephone"));
    public static final Target SELECT_TIPO_DOCUMENTO= Target.the("select para elegir el tipo de identificacion").located(By.name("identification_type"));
    public static final Target TEXTO_NUMERO_DOCUMENTO= Target.the("area para escribir el numero de identificacion").located(By.name("identification"));
    public static final Target CHECKBOX_PREPAGADA= Target.the("checkbox para elegir si tiene salud prepagada").located(By.name("prepaid"));
    public static final Target BOTON_GUARDAR_PACIENTE= Target.the("boton para guardar los datos del paciente").located(By.xpath("//a[contains(text(),'Guardar')]"));


}
