package models.streamMusica;

public class Avaliacao {
    private double nota;
    // Uma variável privada chamada nota que armazena 
    // a nota da avaliação como um número decimal (double).

    public Avaliacao(double nota) {
        // O construtor da classe que aceita um argumento de nota. 
        // Quando você cria uma nova avaliação, 
        // você pode fornecer a nota nesta época.
        this.nota = nota;
    }

    public Avaliacao() {
        // Este é um segundo construtor que não aceita nenhum argumento. 
        // Se você quiser criar uma avaliação e definir a nota mais tarde, 
        // você pode usar este construtor.
        // Exemplo usado em algum controlador q grava avaliação a alguem 
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
