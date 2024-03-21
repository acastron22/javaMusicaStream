package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;


public class MenuAdicionarAlbum extends Menu {
    // A classe MenuAdicionarAlbum extends, ou seja, herda, da classe abstrata Menu. 
    // Ela é um menu específico para adicionar um álbum a uma banda.
    // Dada uma lista de bandas, ela solicita ao usuário por entradas 
    // para criar um novo álbum e adicioná-lo a uma banda específica.
    @Override
    public void executa(List<Banda> bandas) {
        // Este método é chamado quando queremos executar a 
        // funcionalidade de adicionar um álbum no menu.

        // Chama o mesmo método da classe pai (Menu), que 
        // imprime algumas linhas em branco.        
        super.executa(bandas);
        
        // Usa o método exibeTitulo() da classe pai para exibir 
        // o título deste menu particular.        
        super.exibeTitulo("Menu de Adição de álbuns");

        Scanner scanner = new Scanner(System.in);

        // Solicitamos ao usuário que insira a banda à qual o novo 
        // álbum pertence e armazenamos a entrada na variável bandaDigitada.

        System.out.println("A que banda pertence o álbum a ser criado?");
        String bandaDigitada = scanner.nextLine();

        // Procuramos a banda na lista de bandas usando um método estático 
        // VerificaBanda.getBandaPorNome().
        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);

        // Se a banda não for encontrada, nós informamos ao usuário e chamamos 
        // este mesmo método executa() de novo.
        if (bandaEscolhida == null){
            System.out.println("Banda não encontrada. Tente novamente");
            executa(bandas);
        }else {
            // Se a banda for encontrada, solicitamos ao usuário 
            // que digite o nome e o resumo do álbum,
            // depois criamos um novo objeto Álbum e associamos essas 
            // informações a ele.
            System.out.println("Digite o nome do álbum:");
            String nomeAlbum = scanner.nextLine();

            System.out.println("Digite o resumo do álbum:");
            String resumoAlbum = scanner.nextLine();
            Album album = new Album();
            album.setNome(nomeAlbum);

            // Adicionamos esse álbum à banda escolhida e exibimos 
            // uma mensagem de sucesso ao usuário.
            bandaEscolhida.adicionaAlbum(album);
            System.out.println("O álbum "+ album.getNome() 
                    + " foi adicionado com sucesso!");

            AvisoDeEspera.avisoDeEspera();

            ControleDeMenus.exibirOpcoesDoMenu(bandas);
        }
    }
}
/*
* A MenuAdicionarAlbum é uma classe de menu especializado que 
* permite ao usuário adicionar um álbum a uma banda de uma lista 
* dada de bandas. Solicita ao usuário o nome da banda, em seguida, 
* pede que nomeie o álbum e o adicione à banda selecionada. Uma vez 
* concluído, o menu principal é exibido novamente.
*/
