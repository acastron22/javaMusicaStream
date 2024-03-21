package util;

public class AvisoDeEspera {
    
    
    public static void avisoDeEspera() {
        System.out.println("Aguarde, voltando ao menu principal...");
        try {
            Thread.sleep(2500);
            /*
            O método Thread.sleep(2500) pausa a execução do programa por 2500
            segundos. Útil quando quero que ocorra um atraso na minha aplicação
             */
        } catch (InterruptedException e) {
             

            e.printStackTrace();
        }
    }
}
