package br.com.fiap.garagem.model;

public class Carro {

    private String placa;
    private int numeroDaVaga;
    private boolean preferencial;
    private char setor;
    private String horaEntrada;
    private String horaSaida;
    private double valor;
    private Cor cor;

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public int getNumeroDaVaga() {
        return numeroDaVaga;
    }

    public void setNumeroDaVaga(int numeroDaVaga) {
        this.numeroDaVaga = numeroDaVaga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


