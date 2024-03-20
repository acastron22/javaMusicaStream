package Controlers.StreamMusica;


import models.streamMusica.Banda;
import util.ControleDeMenus;

import java.util.List;

public class MenuMostrarBandas extends Menu{
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu mostrando todas as bandas");

        ControleDeMenus.exibirOpcoesDoMenu(bandas);
        
    }
}
