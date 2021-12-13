import com.dio.banco.*;

public class Main {
    public static void main(String[] args) {

        Client cliente1 = new Client();
        cliente1.setFirstName("Maria Fernanda");
        cliente1.setLastName("Ribeiro");
        cliente1.setCpf("234.568.123-67");

        Account ccCliente1 = new CheckingAccount(cliente1);
        Account cpCliente1 = new SavingsAccount(cliente1);

        System.out.println("*** Extratos Iniciais das Contas Corrente e Poupança ***");
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();

        System.out.println("\nDepósito na Conta Corrente");
        ccCliente1.deposit(200);
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();

        System.out.println("\nTransferência para a Conta Poupança");
        ccCliente1.transfer(100, cpCliente1);
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();

        System.out.println("\nSaque na Conta Poupança");
        cpCliente1.withdraw(30);
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();

        System.out.println("\nRecebimento de Conta para Pagamento");
        ccCliente1.setBill(50);
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();

        System.out.println("\nPagamento da Conta pela Conta Corrente");
        ccCliente1.payBill(50);
        ccCliente1.extractAccount();
        cpCliente1.extractAccount();
    }
}
