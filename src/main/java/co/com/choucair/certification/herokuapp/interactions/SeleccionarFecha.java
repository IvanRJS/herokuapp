package co.com.choucair.certification.herokuapp.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.choucair.certification.herokuapp.userinterfaces.HerokuappAppoinmentPage.*;
import static co.com.choucair.certification.herokuapp.utils.Constantes.*;
import static java.lang.Integer.parseInt;

public class SeleccionarFecha implements Interaction {

    private String fecha;

    public SeleccionarFecha(String fecha) {
        this.fecha = fecha;
    }

    public static SeleccionarFecha desde(String fecha) {
        return Tasks.instrumented(SeleccionarFecha.class, fecha);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //February 20 2020
        String[] vectorFecha = fecha.split(" ");
        int year = parseInt(vectorFecha[DOS]);
        String mes = vectorFecha[CERO];
        Target boton=null;
        if(year == parseInt(LABEL_YEAR.resolveFor(actor).getText())){
            boton = (contarMes(mes)>contarMes(LABEL_MONTH.resolveFor(actor).getText()))
                    ?BOTON_NEXT
                    :BOTON_PREV;
        }
        if (year > parseInt(LABEL_YEAR.resolveFor(actor).getText())){
               boton=BOTON_NEXT;
        }else
        if(year < parseInt(LABEL_YEAR.resolveFor(actor).getText())){
                boton=BOTON_PREV;
        }

        while (year != parseInt(LABEL_YEAR.resolveFor(actor).getText())) {
            actor.attemptsTo(Click.on(boton));
        }

        while (!mes.equals(LABEL_MONTH.resolveFor(actor).getText())) {
            actor.attemptsTo(Click.on(boton));
        }

        seleccionarDia(actor,vectorFecha[UNO]);

    }

    private <T extends Actor> void seleccionarDia(T actor,String dato){
        List<WebElementFacade> listOpciones= SELECT_DAY.resolveAllFor(actor);
        for (WebElementFacade opcion : listOpciones) {
            if (opcion.getText().trim().equals(dato)){
                actor.attemptsTo(Click.on(opcion));
                break;
            }
        }
    }

    private int contarMes(String mes) {

        switch (mes) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 0;
        }

    }
}
