class Pedido {
    private Date dataPedido;
    private List<String> pratos;
    private double valorTotal;

    public Pedido(Date dataPedido) {
        this.dataPedido = dataPedido;
        this.pratos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarPrato(String nomePrato, double preco) {
        pratos.add(nomePrato);
        valorTotal += preco;
    }
}