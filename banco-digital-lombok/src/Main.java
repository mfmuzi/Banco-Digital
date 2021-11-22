import com.dio.banco.*;

public class Main {
    public static void main(String[] args) {
        Cliente maria = new Cliente();
        maria.setNome("Maria Fernanda Ribeiro");

        Conta ccMaria = new ContaCorrente(maria);
        Conta cpMaria = new ContaPoupanca(maria);

        ccMaria.extratoConta();
        cpMaria.extratoConta();

        ccMaria.depositar(200);

        ccMaria.extratoConta();
        cpMaria.extratoConta();
        ccMaria.transferir(100, cpMaria);

        ccMaria.extratoConta();
        cpMaria.extratoConta();
        cpMaria.sacar(30);

        ccMaria.extratoConta();
        cpMaria.extratoConta();
        ccMaria.setBoleto(50);

        ccMaria.extratoConta();
        cpMaria.extratoConta();
        ccMaria.setBoleto(0);
        ccMaria.pagarBoleto(50);

        ccMaria.extratoConta();
        cpMaria.extratoConta();
    }
}
