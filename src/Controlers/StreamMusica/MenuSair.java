package Controlers.StreamMusica;


import models.streamMusica.Banda;

import java.util.List;
import java.util.Scanner;

public class MenuSair extends Menu {
    // A classe MenuSair herda da classe Menu.
    // Este é o menu finalizador que encerra a execução do programa.
    @Override
    public void executa(List<Banda> bandas) {
        // Este método é chamado quando o usuário seleciona a opção de sair do programa.        
        System.out.println("Até uma próxima!");

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
/*
* A classe MenuSair fornece um menu que permite ao usuário sair do programa. 
* Quando esta opção é selecionada, o programa se despede do usuário e 
* encerra a execução.
* */
