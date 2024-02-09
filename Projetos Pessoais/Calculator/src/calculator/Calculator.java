package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    // ATRIBUTOS ---------------------------------------------------------------
    JFrame frame;
    JTextField textfield;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    
    Font myFont = new Font("Ink Free", Font.BOLD,30);
    
    double num1=0, num2=0, result=0;
    char operator;
    
    Calculator(){
        
        // PROPRIEDADES DA JANELA ----------------------------------------------
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        // PROPRIEDADES CAIXA DE TEXTO -----------------------------------------
        textfield = new JTextField(); 
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        
        // PROPRIEDADES DOS BOTÕES ---------------------------------------------
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        negButton = new JButton("(-)");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        
        functionButtons [0] = addButton;
        functionButtons [1] = subButton;
        functionButtons [2] = mulButton;
        functionButtons [3] = divButton;
        functionButtons [4] = decButton;
        functionButtons [5] = equButton;
        functionButtons [6] = negButton;
        functionButtons [7] = delButton;
        functionButtons [8] = clrButton;
        
        for(int i=0; i<9 ; i++){
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
        
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        
        // PROPRIEDADES DO PAINEL (LAYOUT DOS BOTÕES) --------------------------
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    
    // SOBREPOSIÇÃO DE AÇÃO PERFORMADA -----------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource() == numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if(e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource() == clrButton){
            textfield.setText("");
        }
        if(e.getSource() == delButton){
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++){
                textfield.setText(textfield.getText()+ string.charAt(i));
            }
        }
        if(e.getSource() == negButton){
            double temp = Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }
        
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textfield.getText());
            switch(operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
    }
    
}
