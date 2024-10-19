public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 0001;

  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public int getNome() {
    return agencia;
  };

  public int getNumero() {
    return numero;
  };

  public double getSaldo() {
    return saldo;
  };

    @Override
    public void sacar(double valor) {
      this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
      this.saldo += valor;
    }

    @Override
    public void transferir(Conta ContaDestino, double valor) {
      this.sacar(valor);
      ContaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
      System.out.println(String.format("Agência: %d", this.agencia));
      System.out.println(String.format("Conta: %d", this.numero));
      System.out.println(String.format("Titular: %s", this.cliente.getNome()));
      System.out.println(String.format("Saldo: %.2f", this.saldo));

    }

    public String toString() {
      return String.format("Titular: %s | Agência: %d | Conta: %d | Saldo: %.2f \n", this.cliente.getNome(), this.agencia, this.numero, this.saldo);
    }
}
