public class CaixaEletronico {
  
    public static void main(String[] args) {
        double saldo = 1000.00;
        double valorSaque = 200.00;

        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        }
    }

}
