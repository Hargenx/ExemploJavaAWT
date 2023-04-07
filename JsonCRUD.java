import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonCRUD {
  private String nomeArquivo = "dados.json";
  private Gson gson;

  public JsonCRUD() {
    this.gson = new GsonBuilder().setPrettyPrinting().create();
  }

  public void salvarDados(List<Funcionario> funcionarios) {
    try (FileWriter writer = new FileWriter(nomeArquivo)) {
      gson.toJson(funcionarios, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<Funcionario> lerDados() {
    List<Funcionario> funcionarios = new ArrayList<>();
    try (FileReader reader = new FileReader(nomeArquivo)) {
      Funcionario[] funcionariosArray = gson.fromJson(reader, Funcionario[].class);
      funcionarios = new ArrayList<>(Arrays.asList(funcionariosArray));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return funcionarios;
  }

  public void atualizarDados(List<Funcionario> funcionarios) {
    salvarDados(funcionarios);
  }

  public void removerDados() {
    try {
      FileWriter writer = new FileWriter(nomeArquivo);
      writer.write("");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
