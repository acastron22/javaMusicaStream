package models.streamMusica;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private int duracaoTotal;

    // Listas para guardar avaliações do álbum e as músicas no álbum.
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    public void adicionaMusica(Musica musica) {
        // Método que adiciona uma música à lista de músicas.
        
        this.musicas.add(musica);
    }

    public void adicionaNota(Avaliacao avaliacao) {
        // Método que adiciona uma avaliação à lista de avaliações.
        this.avaliacoes.add(avaliacao);
    }

    public void exibeMusicasDoAlbum() {
        // Método que exibe todas as músicas do álbum.
        System.out.println("Musicas do álbum:");
        for (Musica musica : musicas) {
            musica.exibeFichaTecnica();
            // Método da classe Musica que exibe a ficha técnica de uma música.
        }
    }

    public void exibeDuracaoTotal() {
        // Método que calcula e exibe a duração total do álbum.
        musicas.forEach(musica -> duracaoTotal += musica.getDuracao());
        
        /* 
        * Aqui, estamos percorrendo a lista musicas, que são as músicas em seu álbum. 
        * Para cada Musica na lista, estamos pegando a duração da música 
        * (musica.getDuracao()) e somando à variável duracaoTotal. 
        * A variável musica aqui é uma variável temporária que é usada para representar 
        * a música atual à medida que percorremos a lista. 
        * O operador -> é usado em expressões lambda no Java para separar os 
        * parâmetros da ação a ser realizada.
        * */
        // Itera sobre todas as músicas para somar as durações.

        System.out.println("Duração total do álbum: " + duracaoTotal + " segundos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeMedia() {
        // Método que calcula e exibe a média das avaliações do álbum.
        double somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            // Itera sobre todas as avaliações para somar as notas.
            somaNotas += avaliacao.getNota();
        }
        if( avaliacoes.isEmpty()){
            // Se não há avaliações, imprime uma mensagem.
            System.out.println("O álbum "+ getNome() + "Não foi avaliado ainda");
        }else {
        double media = somaNotas / avaliacoes.size();
            // Exibe a média das avaliações.
        System.out.println("Média das avaliações: " + media);
        }
    }
}
