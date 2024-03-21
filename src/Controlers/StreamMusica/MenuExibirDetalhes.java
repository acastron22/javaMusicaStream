package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Banda;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuExibirDetalhes extends Menu {
    // A classe MenuExibirDetalhes herda a classe Menu.
    // Ela exibe detalhes sobre uma banda específica.
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        // Chama o método da classe pai para algumas operações iniciais.
        super.exibeTitulo("Menu exibindo detalhes da banda");
        // Exibe o título para o menu que mostra detalhes de bandas.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual banda você deseja avaliar?");

        String bandaDigitada = scanner.nextLine();

        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);
        // Usa a entrada do usuário para procurar a banda correspondente.
        if (bandaEscolhida == null) {
            System.out.println("A banda digitada não foi encontrada.");
            executa(bandas);
        } else {
            bandaEscolhida.exibeDetalhesBanda();
            bandaEscolhida.exibeMedia();
            System.out.println("Albuns:");
            for (Album album : bandaEscolhida.getAlbuns()) {
               album.exibeDetalhesDoAlbum();
            }
        }

        System.out.println("Pressione enter para prosseguir");
        String enter = scanner.nextLine();

        ControleDeMenus.exibirOpcoesDoMenu(bandas);
    }
}

/*
* A classe MenuExibirDetalhes fornece um menu que permite ao usuário ver 
* detalhes sobre uma banda específica. Solicita ao usuário o nome da 
* banda que deseja ver detalhes. Se a banda existir, exibe detalhes sobre 
* a banda, incluindo a média das avaliações e detalhes dos álbuns. 
* Se a banda não existir, informa isso ao usuário e repete a solicitação. 
* Depois que os detalhes são exibidos, o usuário pode pressionar enter 
* para retornar ao menu principal.
* */
