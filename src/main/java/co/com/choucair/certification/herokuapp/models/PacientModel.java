package co.com.choucair.certification.herokuapp.models;

public class PacientModel {

    String nombre;
    String apellidos;
    String telefono;
    String tipoDocumento;
    String nroDocumento;
    String saludPrepagada;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public String getSaludPrepagada() {
        return saludPrepagada;
    }
}