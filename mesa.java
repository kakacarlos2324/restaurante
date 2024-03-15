class Mesa {
    private int numeroMesa;
    private int qtdLugares;
    private StatusMesa status;

    public Mesa(int numeroMesa, int qtdLugares) {
        this.numeroMesa = numeroMesa;
        this.qtdLugares = qtdLugares;
        this.status = StatusMesa.LIVRE;
    }

    public StatusMesa getStatus() {
        return status;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }
}