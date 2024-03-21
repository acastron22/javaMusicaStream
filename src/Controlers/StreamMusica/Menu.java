package Controlers.StreamMusica;

import models.streamMusica.Banda;
import models.streamMusica.Musica;
import utilitarios.StreamMusica.MensagemBoasVindas;

import java.util.List;

public abstract class Menu {
    // Declaração da classe Menu como abstrata. Na programação Java, 
    // uma classe abstrata é uma classe que 
    // não pode ser instanciada (você não pode criar um objeto do tipo Menu 
    // diretamente).

    public void executa(List<Banda> bandas){
        // Declaração do método executa, que leva uma lista de Bandas como parâmetro. 
        // Cada classe concreta que herda de Menu precisará implementar este método.
        for (int i = 0; i<=2; i++){
            System.out.println("\n");
        }        
    };
    
    public void exibeTitulo(String titulo){
        // Método para exibir um título de maneira formatada com hashtags.
        int quantidadeDeLetras = titulo.length();

        // Cria uma sequência de caracteres de hashtags (#) 
        // do mesmo tamanho que o título.
        // Por exemplo, se o titulo é "Menu", a hashtag seria "####".
        String hashtag = new String(new char[titulo.length()]).replace("\0", "#");

        System.out.println(hashtag);
        System.out.println(titulo);
        System.out.println(hashtag + "\n");
        
    }
}
/*
* A classe Menu é uma classe abstrata que tem como objetivo fornecer um 
* esqueleto para como um menu deveria se comportar. Classes que herdam 
* de Menu precisam implementar o método executa(). Além disso, a classe 
* fornece um método conveniente exibeTitulo() para exibir um título de 
* maneira formatada.
* */
