package br.com.fiap.garagem.view;
import br.com.fiap.garagem.model.Carro;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {


        Carro onix = new Carro();
        onix.setPlaca("ABC1234");
        onix.setSetor('A');
        onix.setNumeroDaVaga(12);
        onix.setHoraEntrada("14:00");
        onix.setHoraSaida("17:00");
        onix.setValor(50);
        onix.setPreferencial(false);

        System.out.println("placa do veiuculo: " + onix.getPlaca());
        System.out.println("setor do veiculo: " + onix.getSetor() + " | na vaga: " + onix.getNumeroDaVaga());
        System.out.println("horario de permanencia " + onix.getHoraEntrada() + " - " + onix.getHoraSaida());
        System.out.println("valor por hora: " + onix.getValor());
        System.out.println("preferencial: " + onix.isPreferencial());
    }
}
