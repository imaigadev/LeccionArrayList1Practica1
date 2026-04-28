package com.mycompany.estudiar2;
public class Cobrador extends Persona {
    int idempleado;
    String area; //(frutas y verduras, carne, general, panaderia,etc)

    public Cobrador(int idempleado, String area, String nombre, String appaterno, String apmaterno, int telefono, int edad, int sueldo, String RFC, String CURP) {
        super(nombre, appaterno, apmaterno, telefono, edad, sueldo, RFC, CURP);
        this.idempleado = idempleado;
        this.area = area;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    
}
