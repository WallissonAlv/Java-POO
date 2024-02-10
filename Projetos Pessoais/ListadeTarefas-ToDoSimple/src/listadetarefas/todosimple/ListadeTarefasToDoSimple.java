package listadetarefas.todosimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListadeTarefasToDoSimple implements ActionListener {

    // ATRIBUTOS ---------------------------------------------------------------
    JFrame frame;
    JPanel panel;
    JLabel lblTitulo;
    JTextField jtextfield;
    JButton addButton, vieButton, ediButton, delButton; 
    JButton[] functionButton = new JButton [4];
    
    Font myFont = new Font("Roboto",Font.BOLD,15);
    Font myFontTitulo = new Font("Roboto",Font.BOLD,25);
    
    ListadeTarefasToDoSimple(){
        
        // PROPRIEDADES DA JANELA ----------------------------------------------
        frame = new JFrame("Lista de Tarefas");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        
        // PROPRIEDADES TITULO -------------------------------------------------
        lblTitulo = new JLabel("Lista de Tarefas");
        lblTitulo.setFont(myFontTitulo);
        
        // PROPRIEDADE DOS BOTÕES ----------------------------------------------
        addButton = new JButton("Adicionar");
        vieButton = new JButton("Visualizar");
        ediButton = new JButton("Editar");
        delButton = new JButton("Excluir");
        
        functionButton[0] = addButton;
        functionButton[1] = vieButton;
        functionButton[2] = ediButton;
        functionButton[3] = delButton;
        
        for(int i=0 ; i<4 ; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFocusable(false);
            functionButton[i].setFont(myFont);
        }
        
        lblTitulo.setBounds(30, 15, 300, 25);
        addButton.setBounds( 30, 495, 120, 40);
        vieButton.setBounds(230, 495, 120, 40);
        ediButton.setBounds(431, 495, 120, 40);
        delButton.setBounds(631, 495, 120, 40);
        
        
        // PROPRIEDADES DO PAINEL ----------------------------------------------
        panel = new JPanel();
        panel.setBounds(30, 50, 720, 420);
        panel.setBackground(Color.GRAY);
        
        
        // ADICIONAR -----------------------------------------------------------
        frame.add(lblTitulo);
        frame.add(panel);
        frame.add(addButton);
        frame.add(vieButton);
        frame.add(ediButton);
        frame.add(delButton);
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
