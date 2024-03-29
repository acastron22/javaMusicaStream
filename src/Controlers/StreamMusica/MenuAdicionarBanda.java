package Controlers.StreamMusica;


import models.streamMusica.Banda;
import util.AvisoDeEspera;
import util.ControleDeMenus;

import java.util.List;
import java.util.Scanner;

public class MenuAdicionarBanda extends Menu {
    // A classe MenuAdicionarBanda herda da classe abstrata Menu.
    // É um menu específico para a adição de uma banda.
    
    @Override
    public void executa(List<Banda> bandas){
        // Implementação do método abstrato 'executa' da classe pai.
        // O método recebe uma lista de bandas e adiciona uma nova 
        // banda à lista após fazer algumas perguntas ao usuário.
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
/*
* A classe MenuAdicionarBanda é um menu específico que permite ao 
* usuário adicionar uma nova banda à lista de bandas existentes. 
* Coleta o nome da banda do usuário, cria um novo objeto Banda com 
* o nome fornecido e, em seguida, adiciona a nova banda à lista de 
* bandas. Após a adição bem-sucedida, o usuário é redirecionado de 
* volta para o menu principal.
* */
