package util;

import models.streamMusica.Album;
import models.streamMusica.Banda;

public class VerificaAlbum {

    public static Album getAlbumPorNome(Banda banda, String albumNome) {
        return banda.getAlbuns().stream()
                .filter(album -> album.getNome().equals(albumNome))
                .findFirst()
                .orElse(null);
    }
}
