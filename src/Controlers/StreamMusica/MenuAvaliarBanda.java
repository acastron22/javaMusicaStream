package Controlers.StreamMusica;


import models.streamMusica.Avaliacao;
import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuAvaliarBanda extends Menu {

    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu avaliando banda");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da banda que deseja avaliar");
        String nomeDaBanda = scanner.nextLine();
        
        Banda bandaDigitada = VerificaBanda.getBandaPorNome(bandas, nomeDaBanda);
        
        if (bandaDigitada == null) {
            System.out.println("Banda não encontrada");
            executa(bandas);
        }else {
            System.out.println("Qual nota deseja dar a essa banda?");
            double nota = scanner.nextDouble();
            Avaliacao avaliacao = new Avaliacao(nota);
            bandaDigitada.avaliaBanda(avaliacao);

            System.out.println("A banda " + bandaDigitada.getNome() + 
                    " foi avaliada com a nota " + avaliacao.getNota());

            AvisoDeEspera.avisoDeEspera();
            ControleDeMenus.exibirOpcoesDoMenu(bandas);
        }
    }
}
