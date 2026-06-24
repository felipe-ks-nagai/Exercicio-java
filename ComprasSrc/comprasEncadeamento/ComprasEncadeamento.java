package comprasEncadeamento;

public class ComprasEncadeamento {
    private String nome;
    private int quantidade;
    private boolean comprado;

    public ComprasEncadeamento(String nome, int quantidade, boolean comprado) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.comprado = comprado;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

      public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}

