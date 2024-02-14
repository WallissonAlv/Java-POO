package listadetarefas.todosimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTarefas {
    
    // ATRIBUTOS ---------------------------------------------------------------
    String nome,tarefa;
    String [] opcoesSetor = {"","Piso Loja", "Estoque", "Casa de Máquinas", "Outros"};
    JFrame frame;
    JTextField textField1;
    JLabel label1, label2;
    Font myFont = new Font("Roboto",Font.BOLD,20);
    Font myFontTitulo = new Font("Roboto",Font.BOLD,25);
    
    AddTarefas(){
        
        // PROPRIEDADES DA JANELA --------------------------------------------------
        frame = new JFrame("Adicionar Tarefas");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); //DISPOSE
        frame.setSize(600, 400);
        frame.setResizable(false);
        
        // PROPRIEDADES TEXTFIELD
        textField1 = new JTextField();
        textField1.setBounds(30, 55, 250, 40);
        textField1.setFont(myFont);
        
        // PROPRIEDADES COMBOBOX
        JComboBox<String> comboBoxSetor = new JComboBox<>(opcoesSetor); 
        comboBoxSetor.setBounds(350, 55, 200, 40);
        comboBoxSetor.setFont(myFont);
        
        // PROPRIEDADES JLABELs
        label1 = new JLabel("Nome Funcionário");
        frame.setLayout(null);
        label1.setBounds(30, 25, 250, 25);
        label1.setFont(myFontTitulo);
        
        label2 = new JLabel("Setor");
        frame.setLayout(null);
        label2.setBounds(350, 25, 200, 25);
        label2.setFont(myFontTitulo);
        
        // ADICIONAR -----------------------------------------------------------
        frame.add(textField1);
        frame.add(label1);
        frame.add(comboBoxSetor);
        frame.add(label2);
        
        frame.setVisible(false);
    }
}
