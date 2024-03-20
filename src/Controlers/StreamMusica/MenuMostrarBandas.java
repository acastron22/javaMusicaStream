package Controlers.StreamMusica;


import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;

import java.util.List;

public class MenuMostrarBandas extends Menu{
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu mostrando todas as bandas");
        System.out.println("AS bandas registradas no nosso sistema são:\n");
        
        for (Banda banda : bandas) {
            System.out.println("- "+banda.getNome());
        }
        System.out.println("\n");

        AvisoDeEspera.avisoDeEspera();
        ControleDeMenus.exibirOpcoesDoMenu(bandas);
        
    }
}
