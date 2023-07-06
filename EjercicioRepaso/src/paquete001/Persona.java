package paquete001;

import paquete002.Ciudad;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String ciudad;

    public Persona(String n, String a, int e, String c, String ciu) {
        nombre = n;
        apellido = a;
        edad = e;
        cedula = c;
        ciudad = ciu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String n) {
        apellido = n;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int n) {
        edad = n;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String n) {
        cedula = n;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String n) {
        ciudad = n;
    }    
}
