package models.streamMusica;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private String resumo;
    private List<Album> albuns = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    
    public void avaliaBanda(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    }
    
    public void adicionaAlbum(Album album){
        this.albuns.add(album);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }
    
    public List<Album>getAlbuns(){
        return albuns;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
    public void exibeMedia() {
        double somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaNotas += avaliacao.getNota();
        }
        if (avaliacoes.isEmpty()) {
            System.out.println("A banda " + getNome() + "Não foi avaliada ainda");
        } else {
            double media = somaNotas / avaliacoes.size();
            System.out.println("Média das avaliações: " + media);
        }
    }
}
