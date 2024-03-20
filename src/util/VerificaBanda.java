package util;

import models.streamMusica.Banda;

import java.util.List;

public class VerificaBanda {
    public static Banda getBandaPorNome(List<Banda> bandas, String bandaNome){
        return bandas.stream().filter(banda -> banda.getNome().equals(bandaNome))
                .findFirst()
                .orElse(null);
    }
}
