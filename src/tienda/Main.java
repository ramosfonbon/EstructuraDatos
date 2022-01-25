package tienda;

public class Main {
    public static void main(String[] args) {
        // tenemos una unifila con clientes
        // tenemos 3 cajas
        //          caja1: pago efectivo
        //          caja2: pago tarjeta y <= 10 articulos
        //          caje3: pago tarjeta y > 10 articulos
        /*
        crear 5 clientes
        crear 3 cajas (cola)
        crear 1 unifila (cola)

        while (hay clientes en unifila)
            clienteActual <- tomar de unifila
            si el pago es efectivo
                agregar a caja1 <- clienteActual
            sino
                si articulos <= 10
                    agregar a caja2 <- clienteActual
                sino
                    agregar a caja3 <- clienteActual
        end while
         */
        Cliente cliente1 = new Cliente("Luis", 15, "TC","45678");
        Cliente cliente2 = new Cliente("Lourdes", 5, "EFECTIVO","65432");
        Cliente cliente3 = new Cliente("Armando", 10, "TC","23475");
        Cliente cliente4 = new Cliente("Andrea", 1, "TC","89053");
        Cliente cliente5 = new Cliente("Miguel", 20, "EFECTIVO","893345");

        Cliente cliente6 = new Cliente();
        cliente6.setNombre("Sofia");
        cliente6.setArticulos(50);
        cliente6.setTipoPago("TD");
        cliente6.setTelefono("000000");
        cliente6.setDireccion( "");


        ColaCliente caja1 = new ColaCliente(15);
        ColaCliente caja2 = new ColaCliente(15);
        ColaCliente caja3 = new ColaCliente(15);

        ColaCliente unifila = new ColaCliente(15);

        unifila.enqueue(cliente1);
        unifila.enqueue(cliente2);
        unifila.enqueue(cliente3);
        unifila.enqueue(cliente4);
        unifila.enqueue(cliente5);
        unifila.enqueue(cliente6);


        while (!unifila.isEmpty()){
            Cliente clienteActual = unifila.dequeue();
            if (clienteActual.getTipoPago() == "EFECTIVO") {
                caja1.enqueue(clienteActual);
            } else{
                if (clienteActual.getArticulos() <= 10){
                    caja2.enqueue(clienteActual);
                } else {
                    caja3.enqueue(clienteActual);
                }
            }
        }

        imprimir("caja 1", caja1);
        imprimir("caja 2", caja2);
        imprimir("caja 3", caja3);
        imprimir("unifila", unifila);
    }

    private static void imprimir(String titulo, ColaCliente caja){
        System.out.println(" --- " + titulo + " --- ");
        while (!caja.isEmpty()){
            Cliente cliente = caja.dequeue();
            System.out.println(cliente.getNombre() + " : " +
                    cliente.getArticulos());
        }

    }
}
