package util;

import Controlers.StreamMusica.*;

import models.streamMusica.Banda;

import java.util.*;


public class ControleDeMenus {
    
    public static Scanner scanner = new Scanner(System.in);
    
    /*
    Na classe ControleDeMenus, há um método estático exibirOpcoesDoMenu(List<Banda> listaBandas). 
    Esta função é responsável por exibir as opções do menu e depois executar 
    a ação correspondente à opção selecionada.
    * */

    public static void exibirOpcoesDoMenu(List<Banda> listaBandas) {

        // Código que mostra as opções de menu
        Map<Integer, Menu> opcoes = getIntegerMenuMap();
        System.out.println("Bem vindos ao Music Stream! A sua plataforma de música em Java!\n");
        System.out.println("Digite 1 para registrar uma banda");
        System.out.println("Digite 2 para registrar um álbum de uma banda");
        System.out.println("Digite 3 para registrar uma música a um álbum");
        System.out.println("Digite 4 para mostrar todas as bandas");
        System.out.println("Digite 5 para avaliar uma banda");
        System.out.println("Digite 6 para avaliar um álbum");
        System.out.println("Digite 7 para exibir os detalhes de uma banda");
        System.out.println("Digite -1 para sair");


        int opcaoEscolhida = scanner.nextInt();
        // A opção escolhida pelo usuário é lida a partir da linha de comando.

        Menu acao = opcoes.get(opcaoEscolhida);
        // O objeto Menu correspondente a ser executado é recuperado a partir do Map.
        if (acao != null) {
            acao.executa(listaBandas);
            // Se uma opção válida foi escolhida, execute a ação correspondente.
        } else {
            System.out.println("Opção inválida");
            exibirOpcoesDoMenu(listaBandas);
            // Se uma opção inválida foi escolhida, exiba o menu novamente.
        }

    }
    
    
    /*
    * O método getIntegerMenuMap() cria um Mapa onde as chaves são inteiros representando as opções do menu, 
    * e os valores são instâncias da classe Menu ou subclasses, que encapsulam as ações correspondentes a cada opção.
    */

    private static Map<Integer, Menu> getIntegerMenuMap() {
        Map<Integer, Menu> opcoes = new HashMap<>();
        opcoes.put(1, new MenuAdicionarBanda());
        opcoes.put(2, new MenuAdicionarAlbum());
        opcoes.put(3, new MenuAdicionarMusica());
        opcoes.put(4, new MenuMostrarBandas());
        opcoes.put(5, new MenuAvaliarBanda());
        opcoes.put(6, new MenuAvaliarAlbum());
        opcoes.put(7, new MenuExibirDetalhes());
        opcoes.put(-1, new MenuSair());
        return opcoes;
    }
}
