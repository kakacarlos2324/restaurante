public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        
        // Adicionando mesas ao restaurante
        restaurante.adicionarMesa(new Mesa(1, 4));
        restaurante.adicionarMesa(new Mesa(2, 6));
        restaurante.adicionarMesa(new Mesa(3, 2));
        
        // Encontrando mesa disponível para um cliente
        Mesa mesaDisponivel = restaurante.encontrarMesaDisponivel(4);
        if (mesaDisponivel != null) {
            System.out.println("Mesa disponível encontrada: " + mesaDisponivel.getNumeroMesa());
        } else {
            System.out.println("Não há mesas disponíveis para o número de lugares desejado.");
        }
        
        // Criando um cliente
        Cliente cliente1 = new Cliente("João", "12345678901", new Date(), "Rua A, 123");

        // Criando um pedido para o cliente
        Pedido pedidoCliente1 = new Pedido(new Date());
        pedidoCliente1.adicionarPrato("Pizza", 30.0);
        pedidoCliente1.adicionarPrato("Refrigerante", 5.0);

        // Cliente fazendo o pedido
        cliente1.fazerPedido(pedidoCliente1);
    }
}