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
class Seguro {
    private final Vehiculo vehiculo;
    private final double precio;

    public Seguro(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.precio = vehiculo instanceof Carro ? 0.07 * ((Carro) vehiculo).getPrecio() : 0.05 * ((Moto) vehiculo).getPrecio();
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Precio seguro: " + precio;
    }
}
