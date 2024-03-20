package models.streamMusica;

public class Avaliacao {    
    private double nota;

    public Avaliacao(double nota) {
        this.nota = nota;
    }    public Avaliacao() {
       
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
