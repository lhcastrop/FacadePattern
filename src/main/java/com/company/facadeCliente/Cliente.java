package com.company.facadeCliente;

import com.company.facadeService.OperadorImpl;

import java.util.Scanner;

public class Cliente {
    public String ccCliente;
    public String nombreCliente;
    public String direccion;
    public String telefono;
    public String email;
    public String direccionEntrega;

    public Cliente(String c, String n, String d, String t, String e, String de) {
        this.ccCliente = c;
        this.nombreCliente = n;
        this.direccion = d;
        this.telefono = t;
        this.email = e;
        this.direccionEntrega = de;
    }

    public Cliente() {
    }

    public void realizarSolicitud() {
        Scanner entradaOpcion = new Scanner(System.in);
        Scanner entradaProducto = new Scanner(System.in);
        Scanner entradaValorCompra = new Scanner(System.in);
        Scanner entradaFechaEntrega = new Scanner(System.in);
        Scanner entradaFechaCompra = new Scanner(System.in);
        Scanner entradaFechaDespacho = new Scanner(System.in);
        System.out.println("_________________________________Por favor escoja una opcion:_________________________________");
        System.out.println("Ingrese 1, si quiere buscar en bodega");
        System.out.println("Ingrese 2, si quiere realizar pago");
        System.out.println("Ingrese 3, si quiere solicitar entrega");
        System.out.println("Ingrese 4, si quiere solicitar devolucion");
        System.out.println("Ingrese 5, si quiere solicitar garantia");
        System.out.println("Ingrese 6, si quiere solicitar despacho");
        int opcion = entradaOpcion.nextInt();
        String nombreProducto = "";
        String fechaEntrega = "";
        String fechaCompra = "";
        String fechaDespacho = "";
        OperadorImpl opciones = new OperadorImpl();
        switch(opcion) {
            case 1:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                opciones.buscarBodega(nombreProducto);
                break;
            case 2:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                System.out.println("Por favor escriba el valor de la compra");
                double valorCompra = entradaValorCompra.nextDouble();
                opciones.realizarPago(this.ccCliente, this.nombreCliente, nombreProducto, valorCompra);
                break;
            case 3:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                System.out.println("Por favor escriba la fecha que desea de entrega");
                fechaEntrega = entradaFechaEntrega.nextLine();
                opciones.solicitarEntrega(this.ccCliente, this.nombreCliente, nombreProducto, this.direccionEntrega, fechaEntrega);
                break;
            case 4:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                System.out.println("Por favor escriba la fecha de compra del producto");
                fechaCompra = entradaFechaCompra.nextLine();
                opciones.solicitarDevolucion(this.ccCliente, this.nombreCliente, nombreProducto, fechaCompra);
                break;
            case 5:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                System.out.println("Por favor escriba la fecha de compra del producto");
                fechaCompra = entradaFechaCompra.nextLine();
                opciones.solicitarGarantia(this.ccCliente, this.nombreCliente, nombreProducto, fechaCompra);
                break;
            case 6:
                System.out.println("Por favor escriba el nombre del producto");
                nombreProducto = entradaProducto.nextLine();
                System.out.println("Por favor escriba la  fecha que desea de despacho");
                fechaDespacho = entradaFechaDespacho.nextLine();
                opciones.solicitarDespacho(this.ccCliente, this.nombreCliente, nombreProducto, fechaDespacho);
                break;
            default:
                System.out.println("*************************Por favor ingrese un numero entero entre 1 y 6*************************");
        }

    }
}


