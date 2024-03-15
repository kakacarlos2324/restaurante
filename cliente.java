class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private List<Pedido> pedidos;

    public Cliente(String nome, String cpf, Date dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.pedidos = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}