package compraventa3;
import java.util.ArrayList;
import java.util.Scanner;
public class Compraventa_ {

    /**
     * @param args
     */
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //lista de carros disponibles
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Toyota", "Corolla", 2021, 2000, 12000));
        carros.add(new Carro("Honda", "Civic", 2022, 2200, 16000));
        carros.add(new Carro("Nissan", "Sentra", 2021, 1800, 16000));
        carros.add(new Carro("Ford", "Mustang", 2020, 3000, 13000));
        carros.add(new Carro("Chevrolet", "Camaro", 2022, 35000, 13200));
        carros.add(new Carro("Mazda", "3", 2022, 21000, 11000));
        carros.add(new Carro("BMW", "M3", 2022, 50000, 18700));
        carros.add(new Carro("Mercedes-Benz", "C-Class", 2021, 45000, 17000 ));
        carros.add(new Carro("Audi", "A4", 2022, 40000, 17100));
        carros.add(new Carro("Lexus", "ES", 2022, 42000, 18200));
       
        //lista de motos disponibles
        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Harley-Davidson", "Street Glide", 2021, 1200, 15000));
        motos.add(new Moto("Honda", "CBR600RR", 2022, 600, 12000));
        motos.add(new Moto("Yamaha", "R6", 2022, 600, 13000));
        motos.add(new Moto("Kawasaki", "Ninja 650", 2022, 650, 8000));
        motos.add(new Moto("Ducati", "Monster", 2022, 1500, 9800));
        motos.add(new Moto("BMW", "S1000RR", 2022, 1000, 13200));
        motos.add(new Moto("Suzuki", "GSX-R600", 2022, 600, 11400));
        motos.add(new Moto("Triumph", "Street Triple", 2022, 650, 12600));
        motos.add(new Moto("KTM", "Duke 790", 2021, 790, 12400));
        motos.add(new Moto("Aprilia", "Tuono V4", 2022, 1000, 12100));
        
        //usuario
        System.out.println("Bienvenido a la tienda de vehículos");
        System.out.println("==================================");

        System.out.println("Por favor ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Por favor ingrese su cédula:");
        String cedula = sc.nextLine();
        //Crear usuario
        Usuario usuario = new Usuario(nombre, cedula);

        System.out.println("¿Desea comprar un carro o una moto? (C/M)");
        String tipoVehiculo = sc.nextLine();

        if (tipoVehiculo.equalsIgnoreCase("C")) {
            System.out.println("Estos son los carros disponibles:");
            for (int i = 0; i < carros.size(); i++) {
                System.out.println((i+1) + ". " + carros.get(i));
            }

            System.out.println("Por favor ingrese el número correspondiente al carro que desea comprar:");
            int opcion = Integer.parseInt(sc.nextLine());

            System.out.println("¿Desea agregar un seguro? (S/N)");
            String respuesta = sc.nextLine();
            boolean seguro = respuesta.equalsIgnoreCase("S");
            
            System.out.println("Nombre vendedor: ");
            Factura factura = new Vendedor("Sebastian", "1234567890").vender(carros.get(opcion-1), usuario, seguro);
            System.out.println("\nFactura:\n" + factura.facturaFinal());


        } else if (tipoVehiculo.equalsIgnoreCase("M")) {
            System.out.println("Estas son las motos disponibles:");
            for (int i = 0; i < motos.size(); i++) {
                System.out.println((i+1) + ". " + motos.get(i));
            }

            System.out.println("Por favor ingrese el número correspondiente a la moto que desea comprar:");
            int opcion = Integer.parseInt(sc.nextLine());

            System.out.println("¿Desea agregar un seguro? (S/N)");
            String respuesta = sc.nextLine();
            boolean seguro = respuesta.equalsIgnoreCase("S");

            Factura factura = new Vendedor("Daniel", "123456").vender(motos.get(opcion-1), usuario, seguro);
            System.out.println("\nFactura:\n" + factura.facturaFinal());

        } else {
            System.out.println("Opción no válida");
        }
    }
}
