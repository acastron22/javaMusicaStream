package models.streamMusica;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private int duracaoTotal;

    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    public void adicionaMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public void adicionaNota(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public void exibeMusicasDoAlbum() {
        System.out.println("Musicas do álbum:");
        for (Musica musica : musicas) {
            musica.exibeFichaTecnica();
        }
    }

    public void exibeDuracaoTotal() {
        musicas.forEach(musica -> duracaoTotal += musica.getDuracao());

        System.out.println("Duração total do álbum: " + duracaoTotal + " segundos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeMedia() {
        double somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaNotas += avaliacao.getNota();
        }
        if( avaliacoes.isEmpty()){
            System.out.println("O álbum "+ getNome() + "Não foi avaliado ainda");
        }else {
        double media = somaNotas / avaliacoes.size();
        System.out.println("Média das avaliações: " + media);
        }
    }
}
