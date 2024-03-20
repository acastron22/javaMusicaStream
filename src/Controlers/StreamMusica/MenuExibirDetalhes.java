package Controlers.StreamMusica;


import models.streamMusica.Album;
import models.streamMusica.Banda;
import util.ControleDeMenus;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class MenuExibirDetalhes extends Menu {
    @Override
    public void executa(List<Banda> bandas) {
        super.executa(bandas);
        super.exibeTitulo("Menu exibindo detalhes da banda");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual banda você deseja avaliar?");
        
        String bandaDigitada = scanner.nextLine();
        
        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(bandas, bandaDigitada);
        
        if(bandaEscolhida == null){
            System.out.println("A banda digitada não foi encontrada.");
            executa(bandas);
        }else {
            System.out.println("Detalhes da banda:");
            System.out.println("Nome: " + bandaEscolhida.getNome());
            System.out.println("Resumo: " + bandaEscolhida.getResumo());
            bandaEscolhida.exibeMedia();
            System.out.println("Albuns:");
            for (Album album : bandaEscolhida.getAlbuns()) {
                System.out.println("- "+album.getNome());
                System.out.print("    ");
                album.exibeDuracaoTotal();
                album.exibeMedia();
            }
        }

        System.out.println("Pressione enter para prosseguir");
        String enter = scanner.nextLine();
        
        ControleDeMenus.exibirOpcoesDoMenu(bandas);
    }
}
