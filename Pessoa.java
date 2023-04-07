

public class Pessoa {
  private String nome;
  private String endereco;
  private String dataNascimento;
  private String email;
  private String telefone;

  public Pessoa(String nome, String endereco, String dataNascimento, String email, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.dataNascimento = dataNascimento;
    this.email = email;
    this.telefone = telefone;
  }

  // getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}
