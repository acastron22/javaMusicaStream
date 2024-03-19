package utilitarios.StreamMusica;

public class MensagemBoasVindas {
    
    private String titulo;
    
    public MensagemBoasVindas(String titulo) {
        this.titulo = titulo;
    }
    
    public String colocaHash(){
        String hash = new String(new char[titulo.length()]).replace("\0", "#");


        String aImprimirHash = titulo + hash;
        return  aImprimirHash;
    }
    
    public String retornaTitulo(){
        return this.titulo;
    }
    
}
