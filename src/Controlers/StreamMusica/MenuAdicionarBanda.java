package Controlers.StreamMusica;


import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;

import java.util.List;
import java.util.Scanner;

public class MenuAdicionarBanda extends Menu {
    
    @Override
    public void executa(List<Banda> bandas){
        super.executa(bandas);
        super.exibeTitulo("Menu de adição de banda");
        System.out.println("Digite o nome da Banda que deseja adicionar");
        Scanner scanner = new Scanner(System.in);
        String nomeBanda = scanner.nextLine();
        Banda banda = new Banda();
        banda.setNome(nomeBanda);
        bandas.add(banda);
        System.out.println("A banda "+ banda.getNome() + 
                " foi registrada com sucesso");


        AvisoDeEspera.avisoDeEspera();

        ControleDeMenus.exibirOpcoesDoMenu(bandas);
    }
}
