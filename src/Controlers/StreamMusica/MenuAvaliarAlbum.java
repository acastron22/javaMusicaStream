package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Avaliacao;
import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaAlbum;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuAvaliarAlbum extends Menu  {
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu avaliando álbum");

        Scanner scanner = new Scanner(System.in);

        System.out.println("De qual banda percente o álbum que quer avaliar?");
        String bandaDigitada = scanner.nextLine();

        Banda bandaExistente = VerificaBanda
                .getBandaPorNome(bandas, bandaDigitada);
        
        if(bandaExistente == null){
            System.out.println("Banda Não encontrada");
            executa(bandas);
        }else {
            System.out.println("Qual o nome do álbum?");
            String albumDigitado = scanner.nextLine();
            Album albumEscolhido = VerificaAlbum
                    .getAlbumPorNome(bandaExistente, albumDigitado);
            
            if (albumEscolhido == null) {
                System.out.println("Álbum Não encontrado");
                executa(bandas);
            } else {
                System.out.println("Qual a nota que você dá para o álbum?");
                double notaDigitada = scanner.nextDouble();
                Avaliacao avaliacao = new Avaliacao(notaDigitada);
                albumEscolhido.adicionaNota(avaliacao);
                System.out.println("Avaliação adicionada com sucesso!");

                System.out.println("O Álbum "+ albumEscolhido
                + "foi avaliado com a nota " + avaliacao.getNota());
                
                
                AvisoDeEspera.avisoDeEspera();
                ControleDeMenus.exibirOpcoesDoMenu(bandas);
            }
            
        }
        


    }
}
