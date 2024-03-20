import models.streamMusica.Banda;
import util.ControleDeMenus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banda> listaDeBandas = new ArrayList<>();
        
        ControleDeMenus controleDeMenus = new ControleDeMenus();
        ControleDeMenus.exibirOpcoesDoMenu(listaDeBandas);
        
       
    }
}
