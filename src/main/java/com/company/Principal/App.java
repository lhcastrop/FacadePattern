package com.company.Principal;
import com.company.facadeCliente.Cliente;
public class App {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("1016054285", "Wilson Sepulveda", "Calle 2 # 3-06, Bogota", "3502463727", "wilson23@email.com", "Calle 2 # 3-06, Bogota");
        Cliente c2 = new Cliente("43511334", "Carlos Castro", "Calle 170 # 93-05, Medellin", "3164940051", "carlos@email.com", "Calle 170 # 93-05, Medellin");
        Cliente c3 = new Cliente("724890", "Joaquin Perez", "Calle 70 # 63-05, Barranquilla", "3123108582", "joaquin@email.com", "Calle 70 # 63-05, Barranquilla");
        c1.realizarSolicitud();
        c2.realizarSolicitud();
        c3.realizarSolicitud();
    }

}
