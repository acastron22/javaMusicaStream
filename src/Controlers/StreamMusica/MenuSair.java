package Controlers.StreamMusica;


import models.streamMusica.Banda;

import java.util.List;
import java.util.Scanner;

public class MenuSair extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        System.out.println("Até uma próxima!");

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
