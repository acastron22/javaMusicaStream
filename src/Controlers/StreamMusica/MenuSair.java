package Controlers.StreamMusica;


import models.streamMusica.Banda;

import java.util.List;

public class MenuSair extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        System.out.println("Até uma próxima!");
    }
}
