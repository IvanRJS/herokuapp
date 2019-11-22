package co.com.choucair.certification.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HerokuappAppoinmentPage extends PageObject {
    public static final Target INPUT_DATE = Target.the("input para desplegar el calendario").located(By.id("datepicker"));
    public static final Target LABEL_YEAR = Target.the("etiqueta del año en el calendario").located(By.xpath("//span[@class='ui-datepicker-year']"));
    public static final Target LABEL_MONTH = Target.the("etiqueta del mes en el calendario").located(By.xpath("//span[@class='ui-datepicker-month']"));
    public static final Target BOTON_PREV = Target.the("boton para buscar fecha anterior").located(By.xpath("//a[starts-with(@class,'ui-datepicker-prev ui-corner-all')]"));
    public static final Target BOTON_NEXT = Target.the("boton para buscar fecha posterior").located(By.xpath("//a[starts-with(@class,'ui-datepicker-next ui-corner-all')]"));
    public static final Target SELECT_DAY = Target.the("area para seleccionar el dia").located(By.xpath("//tr//td//a"));
    public static final Target TEXTO_DOCUMENTO_PACIENTE = Target.the("area para escribir el documento de identidad del paciente").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target TEXTO_DOCUMENTO_DOCTOR = Target.the("area para escribir el documento de identidad del doctor").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target TEXTO_OBSERVACIONES = Target.the("area para escribir las observaciones").located(By.xpath("//textarea[@class='form-control']"));
    public static final Target BOTON_GUARDAR_CITA = Target.the("boton para guardar los datos de la cita").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
