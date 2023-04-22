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
class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, String modelo, int anio, int cilindraje, double precio) {
        super(marca, modelo, anio, precio);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString() + " " + cilindraje + "cc";
    }
}
