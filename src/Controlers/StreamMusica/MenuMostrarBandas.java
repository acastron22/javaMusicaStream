package Controlers.StreamMusica;


import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;

import java.util.List;

public class MenuMostrarBandas extends Menu{
    // A classe MenuMostrarBandas herda da classe Menu.
    // Este menu exibe todas as bandas registradas no sistema.
    @Override
    public void executa(List<Banda> bandas) {
        // Este método é chamado para executar a funcionalidade de exibição de todas as bandas.
        super.executa(bandas);
        // Chama o método da classe pai para algumas operações iniciais.
        super.exibeTitulo("Menu mostrando todas as bandas");
        // Usa o método exibeTitulo da classe pai para exibir o título deste menu.
        System.out.println("AS bandas registradas no nosso sistema são:\n");
        
        for (Banda banda : bandas) {
            // Para cada banda na lista de bandas, imprime o nome da banda.
            System.out.println("- "+banda.getNome());
        }
        System.out.println("\n");

        AvisoDeEspera.avisoDeEspera();
        ControleDeMenus.exibirOpcoesDoMenu(bandas);
        
    }
}
/*
* A classe MenuMostrarBandas fornece um menu que permite ao 
* usuário ver uma lista de todas as bandas registradas no sistema. 
* A lista de bandas é exibida para o usuário, e então o usuário é 
* direcionado de volta para o menu principal.
* */
