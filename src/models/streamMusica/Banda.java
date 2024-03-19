package models.streamMusica;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private String resumo;
    private List<Album> albuns = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    
    private Avaliacao avaliacao1=new Avaliacao();
    
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

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
