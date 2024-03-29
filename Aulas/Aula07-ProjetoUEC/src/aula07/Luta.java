package aula07;

import java.util.Random;

public class Luta {
    
    // Atributos -----------------------------------------------------------
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    // Métodos -------------------------------------------------------------
    public void MarcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && (l1 != l2)) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void Lutar(){
        if(this.aprovado){
            System.out.println("");
            System.out.println("### DESAFIADO ###");
            System.out.println("");
            this.desafiado.Apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.Apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("");
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor){
                case 0 -> {
                    // empate
                    System.out.println("--- Empatou ---");
                    this.desafiado.EmpatarLuta();
                    this.desafiante.EmpatarLuta();
                }
                case 1 -> {
                    // desafiado vence
                    System.out.println("Vitoria do "+ this.desafiado.getNome());
                    this.desafiado.GanharLuta();
                    this.desafiante.PerderLuta();
                }
                case 2 -> {
                    // desafiante vence
                    System.out.println("Vitoria do "+ this.desafiante.getNome());
                    this.desafiado.PerderLuta();
                    this.desafiante.GanharLuta();
                }
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
        System.out.println("========================================");
    }
    
    // Métodos Especiais ---------------------------------------------------
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
