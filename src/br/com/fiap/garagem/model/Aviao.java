package br.com.fiap.garagem.model;

public class Aviao {

    private String nome;
    private int quantidadeDeLugares;
    private String prefixo;
    private double comprimento;
    private int anoFabricado;
    private Cor cor;
    private int quantidadeDeTurbinas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public void setQuantidadeDeLugares(int quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricado() {
        return anoFabricado;
    }

    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }

    public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }
}
