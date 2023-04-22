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
class Factura {
    private Vehiculo vehiculo;
    private Usuario usuario;
    private Vendedor vendedor;
    public double precioTotal;

    public Factura(Vehiculo vehiculo, Usuario usuario, Vendedor vendedor) {
        this.vehiculo = vehiculo;
        this.usuario = usuario;
        this.vendedor = vendedor;
        this.precioTotal = vehiculo.getPrecio();
        if (usuario.getSeguro() != null) {
            precioTotal += usuario.getSeguro().getPrecio();
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String facturaFinal() {
        return "Vehículo comprado:\n" + vehiculo.toString() + "\n\nUsuario:\n" + usuario.toString() + "\n\nVendedor:\n" + vendedor.getNombre() + "\nCedula vendedor:\n" + vendedor.getCedula() +"\n\nPrecio total: " + precioTotal;
    }
}

