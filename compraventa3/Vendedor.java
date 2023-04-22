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
class Vendedor {
    private String nombre;
    private String cedula;

    public Vendedor(String nombre, String cedula) {
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

    public Factura vender(Vehiculo vehiculo, Usuario usuario, boolean seguro) {
        Seguro seguroObj = null;
        if (seguro) {
            seguroObj = new Seguro(vehiculo);
        }
        usuario.setVehiculo(vehiculo);
        usuario.setSeguro(seguroObj);
        return new Factura(vehiculo, usuario, this);
    }
    
}
