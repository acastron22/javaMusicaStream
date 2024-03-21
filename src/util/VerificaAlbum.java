package util;

import models.streamMusica.Album;
import models.streamMusica.Banda;

public class VerificaAlbum {

    /*
    * Metodo q recebe uma banda e então verifica dentro dessa banda, a sua lista
    * de albuns, e verifica se existe um álbum dentro dessa lista
    * */
    public static Album getAlbumPorNome(Banda banda, String albumNome) {
        return banda.getAlbuns().stream()
                .filter(album -> album.getNome().equals(albumNome))
                .findFirst()
                .orElse(null);
    }
}
