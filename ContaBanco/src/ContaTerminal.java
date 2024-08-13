public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Passo 1: Criação da variável saldo
        double saldo = 1000.0;

        // Passo 2: Criação da variável valorSolicitado
        double valorSolicitado = 180.0;

        // Passo 3: Verificação se o saldo é suficiente
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Passo 4: Imprimir o valor do saldo
        System.out.println("Saldo atual: " + saldo);

    //     // Passo 5: Nova execução com outros valores
    //     saldo = 15.0;
    //     valorSolicitado = 22.0;

    //     if (saldo >= valorSolicitado) {
    //         saldo -= valorSolicitado;
    //         System.out.println("Saque realizado com sucesso.");
    //     } else {
    //         System.out.println("Saldo insuficiente.");
    //     }

    //     System.out.println("Saldo atual: " + saldo);
     }
    
}
