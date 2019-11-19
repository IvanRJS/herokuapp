package co.com.choucair.certification.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuappDoctorPage extends PageObject {
    public static final Target TEXTO_NOMBRE =Target.the("area para escribir el nombre").located(By.id("name"));
    public static final Target TEXTO_APELLIDOS =Target.the("area para escribir los apellidos").located(By.id("last_name"));
    public static final Target TEXTO_TELEFONO =Target.the("area para escribir el telefono").located(By.id("telephone"));
    public static final Target SELECT_TIPO_DOCUMENTO =Target.the("select para escoger tipo de documento").located(By.id("identification_type"));
    public static final Target TEXTO_NUMERO_DOCUMENTO =Target.the("area para escribir el numero de documento").located(By.id("identification"));
    public static final Target BOTON_GUARDAR_DOCTOR=Target.the("boton para agregar doctor").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final Target BOTON_INICIO=Target.the("boton para regresar al inicio").located(By.xpath("//a[@class='navbar-brand']"));
}
