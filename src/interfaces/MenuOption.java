package interfaces;

import com.sun.tools.javac.Main;
import models.streamMusica.Banda;

import java.util.List;

public interface MenuOption {

    void executa(List<Banda> bandas);
    
}
