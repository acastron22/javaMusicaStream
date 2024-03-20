package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;


public class MenuAdicionarAlbum extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu de Adição de álbuns");

        Scanner scanner = new Scanner(System.in);

        System.out.println("A que banda pertence o álbum a ser criado?");
        String bandaDigitada = scanner.nextLine();
        
        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);
        
        if (bandaEscolhida == null){
            System.out.println("Banda não encontrada. Tente novamente");
            executa(bandas);
        }else {
            System.out.println("Digite o nome do álbum:");
            String nomeAlbum = scanner.nextLine();

            System.out.println("Digite o resumo do álbum:");
            String resumoAlbum = scanner.nextLine();
            Album album = new Album();
            album.setNome(nomeAlbum);
            
            bandaEscolhida.adicionaAlbum(album);
            System.out.println("O álbum "+ album.getNome() + " foi adicionado com sucesso!");

            AvisoDeEspera.avisoDeEspera();

            ControleDeMenus.exibirOpcoesDoMenu(bandas);
        }
    }
}
