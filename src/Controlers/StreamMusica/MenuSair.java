package Controlers.StreamMusica;

import interfaces.MenuDisplayer;
import interfaces.MenuOption;
import models.streamMusica.Banda;

import java.util.List;

public class MenuSair extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        System.out.println("Até uma próxima!");
    }
}
