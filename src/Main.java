import java.util.List;

public class Main {

  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNome("Ciclano");

    Conta cc = new ContaCorrente(cliente);
    cc.depositar(100);

    Conta cp = new ContaPoupanca(cliente);

    Banco banco = new Banco("Banco de Java");
    banco.setContas(List.of(cc, cp));

    cc.transferir(cp, 100);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    System.out.println(banco.getContas());

  }
}
