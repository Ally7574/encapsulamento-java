package br.com.fiap.garagem.view;
import br.com.fiap.garagem.model.Cor;
import br.com.fiap.garagem.model.Carro;

public class Terminal {
    public static void main(String[] args) {
        //criar o objeto cor
        Cor color = new Cor();

        //definir os valores dos atributos da cor
        color.alterarCor(0,0,0, "preto");

        //criar objeto carro
        Carro delorian = new Carro();

        //definir os valores dos atributos do carro
        delorian.setMotor(1);
        delorian.setModelo("DMC-12");
        delorian.setQuantidadeLugares(2);
        delorian.setQuantidadePortas(2);
        delorian.setComprimento(4.27);
        delorian.setPlaca("outatime");


        //exibir os dados do carro (e a cor)
        System.out.println("modelo: " + delorian.getModelo() + " | motor: " + delorian.getMotor());
        System.out.println("quantidade de porta: " + delorian.getQuantidadePortas() + " | quantidade de assentos: " + delorian.getQuantidadeLugares());
        System.out.println("tamanho do veiculo: " + delorian.getComprimento() + " | placa: " + delorian.getPlaca());
        System.out.println("cor do veiculo: " + color.getNome() + " | informações do RGB: " + color.getR() + " | " + color.getG() + " | " + color.getB());
    }
}