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
        
        int i = random.nextInt(nomes.length);

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

//    
    
    @Override
    public void atacar(Personagem alvo) {
    //public String atacar(Personagem inimigo) { 
    
        System.out.println(nome /*ou this.getNome() */ + " atacou " + alvo.nome + "!");
        alvo.diminuirVida(ataque);  

        System.out.println(" e diminuiu sua vida para: " + alvo.getVida()); 
    } 
    
    
}//Fimm mm




    //Atacar:
    
    
//    public void atacar(Personagem player) {
//        Random random = new Random();
//        //int prejuizo = random.nextInt(ataque);
//        
//        //player.diminuirVida(prejuizo);
//        
//        //personagem.diminuirVida(prejuizo);
//        System.out.println(this.getNome() + " atacou " + player.getNome() 
//                + " e diminuiu sua  de dano.");
//        
//        
//        
//    //System.out.println("Seu novo ataque vai ser:");
//        //return scan.nextInt();
//    } 
//    
   
//    public int atacar(Personagem personagem) {
//        
//        //Valor aleatório de ataque -> o ataque vai ser aumentado aleatoriamente!
//        //Random random = new Random();
//        
//        //return random.nextInt(1, 11) * ataque;
//        
//        
//        
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

  


// @Override
//    public void cumprimentar() {
//        String mensagem =  "Sou o " + this.getNome() + " e agora vou te derrotar!!!";
//    }
//    
//    @Override
//    public String toString() {
//        return "\nSeu adversário:" + this.getNome()+ "\nVida: " + this.getVida();
//    } 

