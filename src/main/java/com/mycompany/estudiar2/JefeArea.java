package com.mycompany.estudiar2;
public class JefeArea extends Persona {
    int numempleado;
    String area;

    public JefeArea(int numempleado, String area, String nombre, String appaterno, String apmaterno, int telefono, int edad, int sueldo, String RFC, String CURP) {
        super(nombre, appaterno, apmaterno, telefono, edad, sueldo, RFC, CURP);
        this.numempleado = numempleado;
        this.area = area;
    }

    public int getNumempleado() {
        return numempleado;
    }

    public void setNumempleado(int numempleado) {
        this.numempleado = numempleado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

 

    
    
}
