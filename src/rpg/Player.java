package rpg;

import java.util.Random;

public class Player extends Personagem {

    Random random= new Random(); 
    
    //Atributos
    private int tipoPersonagem;

    //Construtor
    public Player(String nome, int ataque, int vida, int tipoPersonagem) {
        super(nome, ataque, vida);
        this.vida = 100;
        this.tipoPersonagem = tipoPersonagem; 
        this.ataque = random.nextInt(10,51);
    }

    //Getters & Setters
    public int getTipoPersonagem() {
        return tipoPersonagem;
    }
    
    public String setTipoPersonagem(int tipoPersonagem) {
        String tipo = null;
        
        switch (tipoPersonagem) {
            case 1 -> tipo = "Bruxo";         
            case 2 -> tipo = "Arqueiro";                    
            case 3 -> tipo = "Paladino";                     
            case 4 -> tipo = "Guerreiro";                  
        }
        return tipo;
    }
 
    //Outros métodos
    @Override
    public void cumprimentar(){
        System.out.println("\nOlá, eu sou o terrível "
        + this.setTipoPersonagem(tipoPersonagem) + " " +  this.getNome() + "!");
    }
    
    @Override
    public void atacar(Personagem alvo) {
        System.out.println("\n" + this.setTipoPersonagem(tipoPersonagem) + " "
        + this.getNome() + " atacou " + alvo.nome + " com uma força de " 
        + this.ataque + " pontos");
        
        alvo.diminuirVida(this.ataque); 
        
        if (alvo.vida > 0) {
            System.out.println("E diminuiu a vida do " + alvo.getNome() 
            + ", que agora vale: " + alvo.getVida());
        } else {
            System.out.println( "\nParabéns " 
            + this.setTipoPersonagem(tipoPersonagem) + " " + this.nome 
            + "! \nVocê derrotou seu adversário " + alvo.getNome());
        }
    } 
    
    @Override
    public void exibirAtributos() {
        System.out.println("\n=====");
        System.out.println("\n" + this.setTipoPersonagem(tipoPersonagem) + " " 
        + super.getNome() + "\nVida: " + getVida());
        System.out.println("\n=====");
    }
   
}
