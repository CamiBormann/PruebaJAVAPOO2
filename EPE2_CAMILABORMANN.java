/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.epe2_camilabormann;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class EPE2_CAMILABORMANN {

    public static void main(String[] args) {
       
        // instancio la clase scanner
        Scanner scanner = new Scanner(System.in);
        String NombreEmpresa = "El Gran Kaiman 2.0";
        String RutEmpresa = "80.752.567-8";
        String GIROEmpresa = "Comida Express Al paso";
        
        // Se piden los datos del cliente.
        System.out.println("Estimado Cliente ingrese sus nombres:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Estimado Cliente ingrese sus pellidos:");
        String apellidosCliente = scanner.nextLine();
        System.out.println("Estimado Cliente ingrese su edad:");
        int edadCliente = scanner.nextInt();
        System.out.println("Estimado Cliente ingrese su rut:");
        String rutCliente = scanner.nextLine();
        double totalVentas=0;
        System.out.println("Ingrese la fecha de la atencion en sucursal:");
        String fechaVenta=scanner.next();
        System.out.println("Ingrese descripcion de la compra");
        String descripcionVenta=scanner.next();
        System.out.println("Ingrese la cantidad de productos seleccionados:");
        int cantidadProductos=scanner.nextInt();
        System.out.println("Ingrese el numero de factura/boleta:");
        String numeroFactura=scanner.next();
        System.out.println("Ingrese el metodo de pago:");
        String metodoPago=scanner.next();
        System.out.println("Estimado Cliente el total de su boleta es:");
        double montoVentas = scanner.nextDouble();
        String estadoVenta="";
        //valido para ingresar de nuevo los datos
        if(montoVentas !=0.0 && cantidadProductos <0){
            System.out.println("debe Volver a ingresar todo nuevamente!");
        }else{
            estadoVenta="completada";
        }
        
        // Crea una instancia la clase DATOSFACTURA_PADRE
        DATOSFACTURA_PADRE factura = new DATOSFACTURA_PADRE(
                nombreCliente, apellidosCliente, edadCliente, rutCliente,
                NombreEmpresa, RutEmpresa, GIROEmpresa, totalVentas, montoVentas
        );
        VENTAS VENTAS=new VENTAS(fechaVenta, descripcionVenta, cantidadProductos, numeroFactura, metodoPago, estadoVenta);
        
        double iva = factura.getMontoIVA();
        double utilidades = factura.getUtilidades();

        // se imprimen los resultados en consola como si fuera una boleta o una factura-.
        System.out.println(RutEmpresa+" "+NombreEmpresa+" "+GIROEmpresa+" n° factura/boleta:" +numeroFactura);
        System.out.println("se ha realizado una venta a: "+nombreCliente+" "+apellidosCliente+" RUT "+rutCliente+" de "+edadCliente+" años.");
        System.out.println(cantidadProductos+" "+descripcionVenta+": $"+montoVentas+".- "+metodoPago+" - estado:" +estadoVenta);
        System.out.println("IVA 19%: "+iva);
        System.out.println("Utilidades: "+utilidades);
        System.out.println("Fecha Venta: "+fechaVenta);
    }
    }

