package com.company.facadeService;

public class Garantia {

    public void solicitarGarantia(String ccCliente, String nombreCliente, String nombreProducto, String fechaCompra) {
        System.out.println("******************************************************************");
        System.out.println("El cliente " + nombreCliente + " identificado con C.C. " + ccCliente);
        System.out.println("ha solicitado garantia del producto " + nombreProducto);
        System.out.println("que fue comprado el dia " + fechaCompra);
        System.out.println("******************************************************************");
        System.out.println();
    }
}