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
    // A classe MenuAdicionarMusica herda da classe Menu.
    // É um menu específico para adicionar uma música a um álbum de uma banda.
    
    
    // Atenção, esse método poderia ter métodos isolados aqui dentro,
    // ou em outro tipo de contralador. Sabe dizer quais?
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        // Chama o método da classe pai para algumas operações iniciais.
        super.exibeTitulo("Menu de adição de música");
        // Usa o método exibeTitulo da classe pai para exibir o título deste menu específico.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a banda você vai adicionar a música?");
        String bandaDigitada = scanner.nextLine();

        Banda bandaSelecionada = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);
        // Usa o método getBandaPorNome da classe VerificaBanda para obter a banda correta.

        if (bandaSelecionada == null) {
            System.out.println("Banda não encontrada! Deseja tentar novamente? (s/n)");
            // Se a banda não for encontrada, informa o usuário e chama o método executa novamente.
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
/*
* A classe MenuAdicionarMusica fornece um menu que permite ao 
* usuário adicionar uma música a um álbum de uma banda existente. 
* Junto com o fluxo principal que solicita ao usuário o nome da 
* banda, do álbum e as informações da música, existem verificações 
* para garantir que a banda e o álbum escolhidos existam.
* */
