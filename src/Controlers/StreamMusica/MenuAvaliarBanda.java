package Controlers.StreamMusica;


import models.streamMusica.Avaliacao;
import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuAvaliarBanda extends Menu {
    // A classe MenuAvaliarBanda é uma subclasse de Menu.
    // Ela permite que o usuário avalie uma banda específica.

    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        // Chama o método executa da classe pai, realizando operações iniciais.
        super.exibeTitulo("Menu avaliando banda");
        // Exibe título específico para o menu de avaliação de banda.

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da banda que deseja avaliar");
        String nomeDaBanda = scanner.nextLine();
        
        Banda bandaDigitada = VerificaBanda.getBandaPorNome(bandas, nomeDaBanda);
        // Usa o método getBandaPorNome para tentar encontrar a 
        // Banda na lista de bandas.
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

/*
* A classe MenuAvaliarBanda fornece um menu que permite ao usuário 
* avaliar uma determinada banda. O usuário é solicitado a fornecer o 
* nome da banda que deseja avaliar, e é então pedido para fornecer uma 
* nota de avaliação. A nota é registrada e o usuário é informado do 
* sucesso da operação. Se a banda não for encontrada, o usuário é 
* informado e a operação é reiniciada.
* */
