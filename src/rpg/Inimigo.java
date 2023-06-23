package rpg;

import java.util.Random;

public class Inimigo extends Personagem {
      
    //Atributos
    private String tipoAtaque;
    String[] nomes = {"Mago", "Sandmonster", "Zumbi", "Feiticeiro"};  
    
    Random random = new Random();
    
    //Construtor
    public Inimigo(String nome, int ataque, int vida, String tipoAtaque) {
        super(nome, ataque, vida);
        this.vida = 100;
        this.ataque = random.nextInt(10,51);
        
        int i = random.nextInt(nomes.length);

        if (nomes[i].equals("Mago")) { 
            super.setNome(nomes[i]);
            this.tipoAtaque = " Ataque de FireBall";
        } else if (nomes[i].equals("Sandmonster")) {
            super.setNome(nomes[i]);
            this.tipoAtaque = " Ataque murro de Areia";
 
        } else if (nomes[i].equals("Zumbi")) {
            super.setNome(nomes[i]);
            this.tipoAtaque = " Ataque de Mordida Mortal";
        
        } else {
            super.setNome(nomes[i]);
            this.tipoAtaque = " Ataque Lançamento de fumaça enfeitiçada";
        }
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }
    
    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }     
    
    //Outros métodos
    @Override
    public void cumprimentar(){
        System.out.println("Sou o super " + this.nome 
        + " e agora vou te derrotar com meu" + tipoAtaque + "!!");
    }
    
    @Override
    public void atacar(Personagem alvo) {
        System.out.println("\n" + this.nome + " atacou o " + alvo.getNome() + 
        " com uma força de " + this.ataque + " pontos") ;
        alvo.diminuirVida(ataque);  

        if (alvo.vida > 0) {
            System.out.println("\nAgora a sua vida diminuiu, e vale " + alvo.getVida()); 
        } else {
            System.out.println( "\nParabéns " + this.nome + "! Você derrotou o " + alvo.getNome());
        }
        
    } 
   
}