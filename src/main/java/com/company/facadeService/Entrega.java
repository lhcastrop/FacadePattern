package com.company.facadeService;
public class Entrega {


    public void solicitarEntrega(String ccCliente, String nombreCliente, String nombreProducto, String direccionEntrega, String fechaEntrega) {
        System.out.println("******************************************************************");
        System.out.println("El producto " + nombreProducto + " sera entregado");
        System.out.println("al cliente " + nombreCliente + " identificado con C.C. " + ccCliente);
        System.out.println("en la direccion de entrega " + direccionEntrega);
        System.out.println("a mas tardar el dia " + fechaEntrega);
        System.out.println("******************************************************************");
        System.out.println();
    }
}