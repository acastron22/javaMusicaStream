package util;

public class AvisoDeEspera {
    public static void avisoDeEspera() {
        System.out.println("Aguarde, voltando ao menu principal...");
        try {

            Thread.sleep(2500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
