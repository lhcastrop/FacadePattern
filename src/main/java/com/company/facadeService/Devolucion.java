package com.company.facadeService;

public class Devolucion {


    public void solicitarDevolucion(String ccCliente, String nombreCliente, String nombreProducto, String fechaCompra) {
        System.out.println("******************************************************************");
        System.out.println("El cliente " + nombreCliente + " identificado con C.C. " + ccCliente);
        System.out.println("ha solicitado el cambio del producto " + nombreProducto);
        System.out.println("que fue comprado el dia " + fechaCompra);
        System.out.println("******************************************************************");
        System.out.println();
    }
}
