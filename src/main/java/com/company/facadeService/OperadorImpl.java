package com.company.facadeService;

public class OperadorImpl implements Operador {

    public void buscarBodega(String nombreProducto) {
        Bodega b1 = new Bodega();
        b1.buscarBodega(nombreProducto);
    }

    public void realizarPago(String ccCliente, String nombreCliente, String nombreProducto, double valorCompra) {
        Pago b1 = new Pago();
        b1.realizarPago(ccCliente, nombreCliente, nombreProducto, valorCompra);
    }

    public void solicitarDespacho(String ccCliente, String nombreCliente, String nombreProducto, String fechaDespacho) {
        Despacho b1 = new Despacho();
        b1.solicitarDespacho(ccCliente, nombreCliente, nombreProducto, fechaDespacho);
    }

    public void solicitarEntrega(String ccCliente, String nombreCliente, String nombreProducto, String direccionEntrega, String fechaEntrega) {
        Entrega b1 = new Entrega();
        b1.solicitarEntrega(ccCliente, nombreCliente, nombreProducto, direccionEntrega, fechaEntrega);
    }

    public void solicitarGarantia(String ccCliente, String nombreCliente, String nombreProducto, String fechaCompra) {
        Garantia b1 = new Garantia();
        b1.solicitarGarantia(ccCliente, nombreCliente, nombreProducto, fechaCompra);
    }

    public void solicitarDevolucion(String ccCliente, String nombreCliente, String nombreProducto, String fechaCompra) {
        Devolucion b1 = new Devolucion();
        b1.solicitarDevolucion(ccCliente, nombreCliente, nombreProducto, fechaCompra);
    }
}

