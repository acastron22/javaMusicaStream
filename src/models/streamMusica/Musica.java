package models.streamMusica;

public class Musica {
    //Toda música tem um nome, duração e descrição resumida.
    private String nome;
    private int duracao;
    private String descricaoResumida;

    public Musica(String nome, int duracao, String descricaoResumida) {
        // Este é o construtor da classe que aceita nome, duração e descrição resumida.
        this.nome = nome;
        this.duracao = duracao;
        this.descricaoResumida = descricaoResumida;
    }

    public Musica(String nome, int duracao) {
        // Este é um segundo construtor da classe que aceita somente nome e duração. 
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
        // Método para exibir a ficha técnica da música.
        System.out.println("Nome da música: " + nome + 
                "\nDuração total: " + duracao);
    }
}
