import java.util.List;

public class Banco {
  public String nome;
  private List<Conta> contas;

  public Banco(String nome) {
    this.nome = nome;
  }


  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setContas(List<Conta> contas) {
    this.contas = contas;
  }

  public List<Conta> getContas() {
    return contas;
  };


}
