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

/*
* Em resumo, a classe AvisoDeEspera fornece um método para imprimir 
* uma mensagem de espera e depois pausar a execução do programa por 
* um breve período (2,5 segundos). Isso pode servir para 
* dar feedback ao usuário de que algo está acontecendo (como tarefas 
* de processamento ou carga) antes de retornar ao menu principal.
* */
