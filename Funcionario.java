
public class Funcionario extends Pessoa {
  private String cargo;
  private String setor;

  public Funcionario(String nome, String endereco, String dataNascimento, String email, String telefone,
      String cargo, String setor) {
    super(nome, endereco, dataNascimento, email, telefone);
    this.cargo = cargo;
    this.setor = setor;
  }

  // getters e setters
  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }
}
