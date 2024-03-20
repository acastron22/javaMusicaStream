package Controlers.StreamMusica;

import models.streamMusica.Banda;
import models.streamMusica.Musica;
import utilitarios.StreamMusica.MensagemBoasVindas;

import java.util.List;

public abstract class Menu {

    public void executa(List<Banda> bandas){
        for (int i = 0; i<=2; i++){
            System.out.println("\n");
        }        
    };
    
    public void exibeTitulo(String titulo){
        int quantidadeDeLetras = titulo.length();
        String hashtag = new String(new char[titulo.length()]).replace("\0", "#");

        System.out.println(hashtag);
        System.out.println(titulo);
        System.out.println(hashtag + "\n");
        
    }
}
