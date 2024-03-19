package models.streamMusica;

public class Musica {
    private String nome;
    private int duracao;
    private String descricaoResumida;

    public Musica(String nome, int duracao, String descricaoResumida) {
        this.nome = nome;
        this.duracao = duracao;
        this.descricaoResumida = descricaoResumida;
    }

    public Musica(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome da música: " + nome + 
                "\nDuração total: " + duracao);
    }
}
