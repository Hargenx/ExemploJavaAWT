import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Collections;

public class TelaCadastro extends JFrame implements ActionListener {
  private JTextField nomeTextField, enderecoTextField, dataNascimentoTextField, emailTextField, telefoneTextField,
      cargoTextField, setorTextField;
  private JButton salvarButton, cancelarButton;
  private JsonCRUD jsonCRUD;

  public TelaCadastro() {
    super("Cadastro de Funcionário");
    this.jsonCRUD = new JsonCRUD();
    JPanel mainPanel = new JPanel(new BorderLayout());
    JPanel formPanel = new JPanel(new GridLayout(7, 2, 5, 5));
    nomeTextField = new JTextField();
    enderecoTextField = new JTextField();
    dataNascimentoTextField = new JTextField();
    emailTextField = new JTextField();
    telefoneTextField = new JTextField();
    cargoTextField = new JTextField();
    setorTextField = new JTextField();
    formPanel.add(new JLabel("Nome:"));
    formPanel.add(nomeTextField);
    formPanel.add(new JLabel("Endereço:"));
    formPanel.add(enderecoTextField);
    formPanel.add(new JLabel("Data de Nascimento:"));
    formPanel.add(dataNascimentoTextField);
    formPanel.add(new JLabel("Email:"));
    formPanel.add(emailTextField);
    formPanel.add(new JLabel("Telefone:"));
    formPanel.add(telefoneTextField);
    formPanel.add(new JLabel("Cargo:"));
    formPanel.add(cargoTextField);
    formPanel.add(new JLabel("Setor:"));
    formPanel.add(setorTextField);
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    salvarButton = new JButton("Salvar");
    salvarButton.addActionListener(this);
    buttonPanel.add(salvarButton);
    cancelarButton = new JButton("Cancelar");
    cancelarButton.addActionListener(this);
    buttonPanel.add(cancelarButton);
    mainPanel.add(formPanel, BorderLayout.CENTER);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    this.add(mainPanel);
    this.setPreferredSize(new Dimension(400, 300));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == salvarButton) {
      Funcionario novoFuncionario = new Funcionario(nomeTextField.getText(), enderecoTextField.getText(),
          dataNascimentoTextField.getText(), emailTextField.getText(), telefoneTextField.getText(),
          cargoTextField.getText(), setorTextField.getText());
      jsonCRUD.salvarDados(Collections.singletonList(novoFuncionario));
      dispose();
    } else if (e.getSource() == cancelarButton) {
      dispose();
    }
  }
}