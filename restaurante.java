import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum StatusMesa {
    OCUPADA,
    LIVRE
}

class Restaurante {
    private List<Mesa> mesas;
    private List<Cliente> clientes;

    public Restaurante() {
        this.mesas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void removerMesa(Mesa mesa) {
        mesas.remove(mesa);
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Mesa encontrarMesaDisponivel(int qtdLugares) {
        for (Mesa mesa : mesas) {
            if (mesa.getStatus() == StatusMesa.LIVRE && mesa.getQtdLugares() >= qtdLugares) {
                return mesa;
            }
        }
        return null; // Retorna null se nenhuma mesa estiver disponível
    }
}