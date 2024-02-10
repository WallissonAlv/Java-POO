package listadetarefas.todosimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListadeTarefasToDoSimple implements ActionListener {

    // ATRIBUTOS ---------------------------------------------------------------
    JPanel panel;
    JFrame frame;
    JTextField jtextfield;
    JButton addButton, vieButton, ediButton, delButton; 
    JButton[] functionButton = new JButton [4];
    
    Font myFont = new Font("Roboto",Font.TRUETYPE_FONT,20);
    
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
        
        functionButton[0] = addButton;
        functionButton[1] = vieButton;
        functionButton[2] = ediButton;
        functionButton[3] = delButton;
        
        for(int i=0 ; i<4 ; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFocusable(false);
            functionButton[i].setFont(myFont);
        }
        
        addButton.setBounds( 40, 495, 120, 40);
        vieButton.setBounds(240, 495, 120, 40);
        ediButton.setBounds(440, 495, 120, 40);
        delButton.setBounds(640, 495, 120, 40);
        
        
        // PROPRIEDADES DO PAINEL ----------------------------------------------
        panel = new JPanel();
        panel.setBounds(75, 495, 633, 50);
        panel.setBackground(Color.GRAY);
        
        frame.add(addButton);
        frame.add(vieButton);
        frame.add(ediButton);
        frame.add(delButton);
        frame.add(panel);
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
