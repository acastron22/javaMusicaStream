package util;

import Controlers.StreamMusica.*;
import interfaces.MenuOption;
import models.streamMusica.Banda;

import java.util.*;


public class ControleDeMenus {

    public static void exibirOpcoesDoMenu(List<Banda> listaBandas) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Menu> opcoes = getIntegerMenuMap();
        System.out.println("Bem vindos ao Music Stream! A sua plataforma de música em Java!\n");
        System.out.println("Digite 1 para registrar uma banda");
        System.out.println("Digite 2 para registrar um álbum de uma banda");
        System.out.println("Digite 3 para mostrar todas as bandas");
        System.out.println("Digite 4 para avaliar uma banda");
        System.out.println("Digite 5 para avaliar um álbum");
        System.out.println("Digite 6 para exibir os detalhes de uma banda");
        System.out.println("Digite -1 para sair");


        int opcaoEscolhida = scanner.nextInt();

        Menu acao = opcoes.get(opcaoEscolhida);
        if (acao != null) {
            acao.executa(listaBandas);
        } else {
            System.out.println("Opção inválida");
        }
            
        scanner.close();

    }

    private static Map<Integer, Menu> getIntegerMenuMap() {
        Map<Integer, Menu> opcoes = new HashMap<>();
        opcoes.put(1, new MenuAdicionarBanda());
        opcoes.put(2, new MenuAdicionarAlbum());
        opcoes.put(3, new MenuMostrarBandas());
        opcoes.put(4, new MenuAvaliarBanda());
        opcoes.put(5, new MenuAvaliarAlbum());
        opcoes.put(6, new MenuExibirDetalhes());
        opcoes.put(-1, new MenuSair());
        return opcoes;
    }
}
