package com.company.facadeService;

public class Despacho {

    public void solicitarDespacho(String ccCliente, String nombreCliente, String nombreProducto, String fechaDespacho) {
        System.out.println("******************************************************************");
        System.out.println("El cliente " + nombreCliente + " identificado con C.C. " + ccCliente);
        System.out.println("ha solicitado despacho del producto " + nombreProducto + ",");
        System.out.println("el producto sera despachado el dia " + fechaDespacho);
        System.out.println("******************************************************************");
        System.out.println();
    }
}
