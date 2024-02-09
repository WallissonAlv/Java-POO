package listadetarefas.todosimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListadeTarefasToDoSimple implements ActionListener {

    // ATRIBUTOS ---------------------------------------------------------------
    JFrame frame;
    JTextField jtextfield;
    JButton addButton, vieButton, ediButton, delButton; 
    JButton[] functionButton = new JButton [4];
    
    ListadeTarefasToDoSimple(){
        
        // PROPRIEDADES DA JANELA ----------------------------------------------
        frame = new JFrame("Lista de Tarefas");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        
        // PROPRIEDADE DOS BOTÕES ----------------------------------------------
        addButton = new JButton("Adicionar");
        vieButton = new JButton("Visualizar");
        ediButton = new JButton("Editar");
        delButton = new JButton("Excluir");
        
        addButton.setBounds(50, 700, 100, 200);
        
        addButton.setVisible(true);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListadeTarefasToDoSimple Lista = new ListadeTarefasToDoSimple();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
