package com.company.facadeService;
public class Pago {

       public void realizarPago(String ccCliente, String nombreCliente, String nombreProducto, double valorCompra) {
        System.out.println("******************************************************************");
        System.out.println("El cliente " + nombreCliente + " identificado con C.C. " + ccCliente);
        System.out.println("ha realizado el pago del producto " + nombreProducto);
        System.out.println("por un valor de " + valorCompra + " pesos");
        System.out.println("******************************************************************");
        System.out.println();
    }
}

