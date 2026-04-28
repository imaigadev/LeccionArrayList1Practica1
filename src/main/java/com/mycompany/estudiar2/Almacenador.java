package com.mycompany.estudiar2;
public class Almacenador extends Persona {
    int idalmacenador;
    String tipo; //bodega, estantes, reabastecedor 

    public Almacenador(int idalmacenador, String tipo, String nombre, String appaterno, String apmaterno, int telefono, int edad, int sueldo, String RFC, String CURP) {
        super(nombre, appaterno, apmaterno, telefono, edad, sueldo, RFC, CURP);
        this.idalmacenador = idalmacenador;
        this.tipo = tipo;
    }

    public int getIdalmacenador() {
        return idalmacenador;
    }

    public void setIdalmacenador(int idalmacenador) {
        this.idalmacenador = idalmacenador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
