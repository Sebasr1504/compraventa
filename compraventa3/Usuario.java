/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa3;

/**
 *
 * @author dahdz
 */

class Usuario {
    private String nombre;
    private String cedula;
    private Vehiculo vehiculo;
    private Seguro seguro;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
     @Override
    public String toString() {
        String resultado = "Nombre: " + nombre + "\nCédula: " + cedula + "\nVehículo: " + vehiculo.toString();
        if (seguro != null) {
            resultado += "\nSeguro: " + seguro.toString();
        }
        return resultado;
    }
}

