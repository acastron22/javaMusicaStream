package Controlers.StreamMusica;

import interfaces.MenuOption;
import models.streamMusica.Banda;
import util.ControleDeMenus;

import java.util.List;

public class MenuAvaliarBanda extends Menu implements MenuOption {

    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu avaliando banda");
        
        ControleDeMenus.exibirOpcoesDoMenu(bandas);
    }
}
