import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TelaDeCadastro {

    private LinkedList<Funcionario> lista;

    public TelaDeCadastro() {

        lista = new LinkedList<>();

        JFrame tela = new JFrame("Tela de cadastro de funcionarios");
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // DEFINIÇÃO DA ESTRUTURA GRÁFICA DA TELA
        JPanel containerEsquerda, containerDireita;
        containerEsquerda = new JPanel();
        containerEsquerda.setLayout(new BoxLayout(containerEsquerda, BoxLayout.Y_AXIS));
        containerEsquerda.add(new JLabel("Funcionário"));

        JPanel ctrNome = new JPanel(new FlowLayout());
        ctrNome.add(new JLabel("Nome: "));
        TextField tfNome = new TextField(50);
        ctrNome.add(tfNome);
        containerEsquerda.add(ctrNome);

        JPanel ctrSalario = new JPanel(new FlowLayout());
        ctrSalario.add(new JLabel("Salario: "));
        TextField tfSalario = new TextField(50);
        ctrSalario.add(tfSalario);
        containerEsquerda.add(ctrSalario);

        JPanel ctrTipo = new JPanel(new FlowLayout());
        ctrTipo.add(new JLabel("Tipo: "));
        JRadioButton jrbTipoA = new JRadioButton("A");
        JRadioButton jrbTipoB = new JRadioButton("B");
        ButtonGroup bgTipo = new ButtonGroup();
        bgTipo.add(jrbTipoA);
        bgTipo.add(jrbTipoB);
        ctrTipo.add(jrbTipoA);
        ctrTipo.add(jrbTipoB);
        containerEsquerda.add(ctrTipo);

        JButton cadastra = new JButton("Cadastrar");
        containerEsquerda.add(cadastra);


        tela.getContentPane().setLayout(new FlowLayout());
        tela.getContentPane().add(containerEsquerda);
        TextArea ta = new TextArea();
        tela.getContentPane().add(ta);

        // DEFINIÇÃO DAS AÇÕES NA TELA
        cadastra.addActionListener(
            e -> {
                Funcionario padrao;

                String nome=tfNome.getText();
                String salario=tfSalario.getText();
                
                try{

                    if(jrbTipoA.isSelected())
                        padrao=new FuncA(nome, Double.parseDouble(salario));
                    else
                        padrao=new FuncB(nome, Double.parseDouble(salario));
                    
                    lista.add(padrao);
                }
                catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "Valor de salário com formato errado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
                finally{
                    StringBuilder sb = new StringBuilder();
                    for(Funcionario f : lista)
                        sb.append(f);

                    ta.setText(sb.toString());

                }
            }
            
        );


        tela.pack();
        tela.setVisible(true);
    }
    
}
