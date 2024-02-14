package listadetarefas.todosimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTarefas {
    
    // ATRIBUTOS ---------------------------------------------------------------
    String nome,setor,tarefa;
    JFrame frame;
    
    AddTarefas(){
        
        // PROPRIEDADES DA JANELA --------------------------------------------------
        frame = new JFrame("Adicionar Tarefas");
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        
        frame.setVisible(false);
    }
}
