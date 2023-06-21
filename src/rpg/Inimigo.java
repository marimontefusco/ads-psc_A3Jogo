package rpg;

import java.util.Random;

public class Inimigo extends Personagem {
    
    //Atributos
    String[] nomes = {"Mago", "Sandmonster", "Zumbi", "Killer"};  
    
    Random random = new Random();
    
    //Construtor
    public Inimigo(String nome, int ataque, int vida) {
        super(nome, ataque, vida);
        super.setVida(15);
        
        int i = random.nextInt(nomes.length -1);

        if (nomes[i].equals("Mago")) { 
            super.setNome(nomes[i]);
            super.setAtaque(2);
            
        } else if (nomes[i].equals("Sandmonster")) {
            super.setNome(nomes[i]);
            super.setAtaque(4);
 
        } else if (nomes[i].equals("Zumbi")) {
            super.setNome(nomes[i]);
            super.setAtaque(3);
        
        } else {
            super.setNome(nomes[i]);//nomes[i].equals("Killer")
            super.setAtaque(5);
        }
    }

    //Outros métodos
    @Override
    public void cumprimentar(){
        System.out.println("\nSou o super " + this.nome + " e agora vou te derrotar!\n");
    }
    
    @Override
    public void atacar(Personagem alvo) {
        System.out.println("\n" + this.nome + " atacou o " + alvo.getNome());
        alvo.diminuirVida(ataque);  

        if (alvo.vida > 0) {
            System.out.println("\nAgora a sua vida diminuiu vale " + alvo.getVida()); 
        } else {
            System.out.println( "\nParabéns " + this.nome + "! Você derrotou o " + alvo.getNome());
        }
        
    } 
    
    
}//Fim


   
//    public void atacar(Personagem player) {
//        Random random = new Random();
//        //int prejuizo = random.nextInt(ataque);
//        
//        //player.diminuirVida(prejuizo);
//        
//        //personagem.diminuirVida(prejuizo);
//        System.out.println(this.getNome() + " atacou " + player.getNome() 
//                + " e diminuiu sua  de dano.");


//    public int atacar(Personagem personagem) {
//        
//        //Valor aleatório de ataque -> o ataque vai ser aumentado aleatoriamente!
//        //Random random = new Random();
//        
//        //return random.nextInt(1, 11) * ataque;


//        if(super.getNome().equals("Mago")) {
//            System.out.println("Ataque de FireBall");
//            
//        } else if(super.getNome().equals("Sandman")) {
//            System.out.println("Ataque murro de Areia");
//            
//        }else if(super.getNome().equals("Zumbi")) {
//            System.out.println("Ataque de Mordida Mortal");
//            
//        } else {
//            System.out.println("Ataque de lançamento de Facas");
//            
//        }
//        return super.getAtaque();
//    }
