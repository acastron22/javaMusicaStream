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
    // A classe MenuAvaliarAlbum herda da classe Menu.
    // É um menu específico que permite ao usuário avaliar um determinado álbum de uma banda.
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        // Chama o método da classe pai para algumas operações iniciais.
        super.exibeTitulo("Menu avaliando álbum");
        // Usa o método exibeTitulo da classe pai para exibir o título deste menu específico.

        Scanner scanner = new Scanner(System.in);

        System.out.println("De qual banda percente o álbum que quer avaliar?");
        String bandaDigitada = scanner.nextLine();

        Banda bandaExistente = VerificaBanda
                .getBandaPorNome(bandas, bandaDigitada);
        // Usa o método getBandaPorNome da classe VerificaBanda para obter a banda correta.
        
        if(bandaExistente == null){
            // Se a banda digitada não for encontrada na lista de bandas, 
            // informa o usuário e chama o método executa novamente.
            System.out.println("Banda Não encontrada");
            executa(bandas);
        }else {
            System.out.println("Qual o nome do álbum?");
            String albumDigitado = scanner.nextLine();

            // Usa o método getAlbumPorNome da classe VerificaAlbum 
            // Para obter o álbum correto da banda.
            Album albumEscolhido = VerificaAlbum
                    .getAlbumPorNome(bandaExistente, albumDigitado);
            
            if (albumEscolhido == null) {
                // Se o álbum digitado não for encontrado na banda, 
                // Informa o usuário e chama o método executa novamente.
                System.out.println("Álbum Não encontrado");
                executa(bandas);
            } else {
                System.out.println("Qual a nota que você dá para o álbum?");
                double notaDigitada = scanner.nextDouble();

                // Cria um novo objeto Avaliacao com a nota digitada e 
                // Adiciona essa avaliação ao álbum escolhido.
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
/*
* A classe MenuAvaliarAlbum permite ao usuário avaliar um álbum de 
* uma banda. Solicita ao usuário o nome da banda e do álbum, e então 
* a nota que deseja dar para o álbum. Se a banda ou o álbum não forem 
* encontrados, o usuário é informado e a operação é reiniciada. Se a 
* banda e o álbum forem encontrados, a nota é registrada e o usuário é 
* levado de volta ao menu principal.
* */
