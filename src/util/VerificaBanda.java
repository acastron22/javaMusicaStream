package util;

import models.streamMusica.Banda;

import java.util.List;

public class VerificaBanda {

    /*
     * Metodo que recebe uma lista de bandas e um nome de uma banda.
     * Verifica se há nessa lista de bandas, uma banda com o nome correspondente
     * */
    public static Banda getBandaPorNome(List<Banda> bandas, String bandaNome){
        return bandas.stream().filter(banda -> banda.getNome().equals(bandaNome))
                .findFirst()
                .orElse(null);
    }
}
