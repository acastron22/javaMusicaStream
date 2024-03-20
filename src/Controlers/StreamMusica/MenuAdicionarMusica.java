package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Banda;
import models.streamMusica.Avaliacao;
import models.streamMusica.Musica;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaAlbum;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuAdicionarMusica extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu de adição de música");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a banda você vai adicionar a música?");
        String bandaDigitada = scanner.nextLine();

        Banda bandaSelecionada = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);


        if (bandaSelecionada == null) {
            System.out.println("Banda não encontrada! Deseja tentar novamente? (s/n)");

            executa(bandas);
        } else {
            System.out.println("Qual o nome do álbum?");
            String nomeAlbum = scanner.nextLine();

            Album existeAlbum = VerificaAlbum.getAlbumPorNome(bandaSelecionada, nomeAlbum);

            if (existeAlbum == null) {
                System.out.println("Álbum não encontrado!");
                executa(bandas);
               
            } else {
                System.out.println("Qual o nome da música?");
                String nomeMusica = scanner.nextLine();

                System.out.println("Qual a duração da musica?");
                int duracaoMusica = scanner.nextInt();

                Musica novaMusica = new Musica(nomeMusica, duracaoMusica);

                existeAlbum.adicionaMusica(novaMusica);

                System.out.println("A música " + nomeMusica
                        + " foi adicionada com sucesso!");


                AvisoDeEspera.avisoDeEspera();
                ControleDeMenus.exibirOpcoesDoMenu(bandas);
            }
        }
        

    }
}
