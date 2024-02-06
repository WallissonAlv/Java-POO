package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    
    Font myFont = new Font("Ink Free", Font.BOLD,30);
    
    double num1=0, num2=0, result=0;
    char operator;
    
    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        textfield = new JTextField(); 
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("<-");
        clrButton = new JButton("C");
        
        functionButtons [0] = addButton;
        functionButtons [1] = subButton;
        functionButtons [2] = mulButton;
        functionButtons [3] = divButton;
        functionButtons [4] = decButton;
        functionButtons [5] = equButton;
        functionButtons [6] = delButton;
        functionButtons [7] = clrButton;
        
        for(int i=0; i<8 ; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        
        for(int i=0; i<10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        
        frame.add(textfield);
        frame.setVisible(true);
        /* AQUI TEREMOS O CONSTRUTOR COM O TITULO "CALCULATOR" COM OS BOTÕES
        PARA FECHAR, MINIMIZAR OU MAXIMIZAR JANELA, PADRONIZAMOS O TAMANHO PARA
        420X550 E NÃO SERÁ AJUSTAVEL!*/
    }
    
    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
