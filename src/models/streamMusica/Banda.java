package models.streamMusica;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    // Declaração da classe Banda. Toda banda tem um nome, 
    // resumo, lista de álbuns e lista de avaliações.
    private String nome;
    private String resumo;
    private List<Album> albuns = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    
    public void avaliaBanda(Avaliacao avaliacao){
        // Método usado para adicionar uma avaliação para a banda.
        this.avaliacoes.add(avaliacao);
        // Adiciona a avaliação à lista de avaliações.
    }
    
    public void adicionaAlbum(Album album){
        // Método usado para adicionar um álbum à lista de álbuns da banda.
        this.albuns.add(album);
        // Adiciona o álbum à lista de álbuns.
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
        // Método getter para obter a lista de álbuns da banda.
        return albuns;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
    public void exibeMedia() {
        double somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            // Itera sobre todas as avaliações para somar as notas.
            somaNotas += avaliacao.getNota();
            // Adiciona a nota de cada avaliação à soma total.
        }
        if (avaliacoes.isEmpty()) {
            // Verifica se a lista de avaliações está vazia.
            System.out.println("A banda " + getNome() + "Não foi avaliada ainda");
            // Se estiver vazia, imprime uma mensagem.
        } else {
            double media = somaNotas / avaliacoes.size();
            System.out.println("Média das avaliações: " + media);
            // Exibe a média das avaliações.
        }
    }
    
    public void exibeDetalhesBanda(){
        System.out.println("Detalhes da banda:");
        System.out.println("Nome: " + getNome());
        System.out.println("Resumo: " + getResumo());
    }
}
