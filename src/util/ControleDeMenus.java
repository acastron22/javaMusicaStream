package util;

import Controlers.StreamMusica.*;
import interfaces.MenuDisplayer;
import interfaces.MenuOption;
import models.streamMusica.Banda;

import java.util.*;


public class ControleDeMenus implements MenuDisplayer {

    public static void exibirOpcoesDoMenu(List<Banda> listaBandas) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, MenuOption> opcoes = getIntegerMenuOptionMap();
        System.out.println("Bem vindos ao Music Stream! A sua plataforma de música em Java!\n");
        System.out.println("Digite 1 para registrar uma banda");
        System.out.println("Digite 2 para registrar um álbum de uma banda");
        System.out.println("Digite 3 para mostrar todas as bandas");
        System.out.println("Digite 4 para avaliar uma banda");
        System.out.println("Digite 5 para avaliar um álbum");
        System.out.println("Digite 6 para exibir os detalhes de uma banda");
        System.out.println("Digite -1 para sair");


        int opcaoEscolhida = scanner.nextInt();

        MenuOption acao = opcoes.get(opcaoEscolhida);
        if (acao != null) {
            acao.executa(listaBandas);
        } else {
            System.out.println("Opção inválida");
        }
            
        scanner.close();

    }

    private static Map<Integer, MenuOption> getIntegerMenuOptionMap() {
        Map<Integer, MenuOption> opcoes = new HashMap<>();
        opcoes.put(1, (bandas) -> new MenuAdicionarBanda().executa(bandas));
        opcoes.put(2, (bandas) -> new MenuAdicionarAlbum().executa(bandas));
        opcoes.put(3, (bandas) -> new MenuMostrarBandas().executa(bandas));
        opcoes.put(4, (bandas) -> new MenuAvaliarBanda().executa(bandas));
        opcoes.put(5, (bandas) -> new MenuAvaliarAlbum().executa(bandas));
        opcoes.put(6, (bandas) -> new MenuExibirDetalhes().executa(bandas));
        opcoes.put(-1, (bandas) -> new MenuSair().executa(bandas));
        return opcoes;
    }
}
