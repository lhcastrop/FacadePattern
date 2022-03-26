package com.company.facadeService;

public interface Operador {
    void buscarBodega(String var1);

    void realizarPago(String var1, String var2, String var3, double var4);

    void solicitarDespacho(String var1, String var2, String var3, String var4);

    void solicitarEntrega(String var1, String var2, String var3, String var4, String var5);

    void solicitarGarantia(String var1, String var2, String var3, String var4);

    void solicitarDevolucion(String var1, String var2, String var3, String var4);
}