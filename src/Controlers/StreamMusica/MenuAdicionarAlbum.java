package Controlers.StreamMusica;

import models.streamMusica.Banda;
import util.ControleDeMenus;

import java.util.List;


public class MenuAdicionarAlbum extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu de Adição de álbuns");
        ControleDeMenus.exibirOpcoesDoMenu(bandas);
    }
}
