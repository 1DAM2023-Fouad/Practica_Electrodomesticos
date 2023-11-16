import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("ELECTRODOMESTICOS INNOVADORES SL");
                System.out.println("Por favor rellene los datos solicitados para hacer una compra");

                // Crear un nuevo cliente
                Cliente cliente = new Cliente();

                System.out.print("Introduce el DNI del cliente: ");
                String dni = scanner.nextLine();
                cliente.setDni(dni);

                System.out.print("Introduce el nombre del cliente: ");
                String nombre = scanner.nextLine();
                cliente.setNombre(nombre);

                System.out.print("Introduce los apellidos del cliente: ");
                String apellidos = scanner.nextLine();
                cliente.setApellidos(apellidos);

                System.out.print("Introduce la dirección del cliente: ");
                String direccion = scanner.nextLine();
                cliente.setDireccion(direccion);

                // Crear un nuevo electrodoméstico
                Electrodomestico electrodomestico = new Electrodomestico();

                System.out.print("Introduce el número de serie del electrodoméstico: ");
                String numSerie = scanner.nextLine();
                electrodomestico.setNumSerie(numSerie);

                System.out.print("Introduce la marca del electrodoméstico: ");
                String marca = scanner.nextLine();
                electrodomestico.setMarca(marca);

                System.out.print("Introduce el modelo del electrodoméstico: ");
                String modelo = scanner.nextLine();
                electrodomestico.setModelo(modelo);

                System.out.print("Introduce el color del electrodoméstico: ");
                String color = scanner.nextLine();
                electrodomestico.setColor(color);

                System.out.print("Introduce el tipo de electrodoméstico (lavadora, nevera...): ");
                String tipoElectrodomestico = scanner.nextLine();
                electrodomestico.setTipoElectrodomestico(tipoElectrodomestico);

                System.out.print("Introduce la eficiencia energética del electrodoméstico: ");
                String eficienciaEnergetica = scanner.nextLine();
                electrodomestico.setEficienciaEnergetica(eficienciaEnergetica);

                System.out.print("Introduce el precio del electrodoméstico: ");
                String precio = scanner.nextLine();
                electrodomestico.setPrecio(precio);

                // Registrar una venta
                Venta venta = new Venta();

                System.out.print("Introduce el código de la venta: ");
                String codigoVenta = scanner.nextLine();
                venta.setCodigoVenta(codigoVenta);

                System.out.print("Introduce la fecha de la venta: ");
                String fechaVenta = scanner.nextLine();
                venta.setFechaVenta(fechaVenta);

                System.out.print("Introduce la forma de pago: ");
                String formaPago = scanner.nextLine();
                venta.setFormaPago(formaPago);

                System.out.print("Introduce el precio de la venta: ");
                String precioVenta = scanner.nextLine();
                venta.setPrecioVenta(precioVenta);

                venta.setCliente(cliente);
                venta.setElectrodomestico(electrodomestico);

                // Crear un servicio postventa
                Postventa postventa = new Postventa();

                System.out.print("Introduce la descripción del problema: ");
                String descripcionProblema = scanner.nextLine();
                postventa.setDescripcionProblema(descripcionProblema);

                System.out.print("Introduce la fecha de la solicitud de servicio: ");
                String fechaSolicitudServicio = scanner.nextLine();
                postventa.setFechaSolicitudServicio(fechaSolicitudServicio);

                postventa.setElectrodomestico(electrodomestico);
                postventa.setCliente(cliente);


        }
}