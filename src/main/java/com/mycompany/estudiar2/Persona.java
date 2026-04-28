package com.mycompany.estudiar2;
public abstract class Persona {
    protected String nombre;
    protected String appaterno;
    protected String apmaterno;
    protected int telefono;
    protected int edad;
    protected int sueldo;
    protected String RFC;
    protected String CURP;

    public Persona(String nombre, String appaterno, String apmaterno, int telefono, int edad, int sueldo, String RFC, String CURP) {
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.telefono = telefono;
        this.edad = edad;
        this.sueldo = sueldo;
        this.RFC = RFC;
        this.CURP = CURP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

}
