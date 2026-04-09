package br.com.fiap.garagem.model;

public class lancha {
    private String modelo;
    private int quantidadeLugares;
    private double comprimento;
    private int anoFabricado;
    private Cor cor;
    private int quantidadeMotores;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public int getAnoFabricado() {
        return anoFabricado;
    }

    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }
}
