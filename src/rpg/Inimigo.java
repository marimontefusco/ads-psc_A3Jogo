package rpg;

import java.util.Random;

public class Inimigo extends Personagem {
    
    Random random = new Random();
    
    String[] nomes = {"Mago", "Sandmonster", "Zumbi", "Killer"};  
    
    //Construtor
    public Inimigo(int vida) {
        super(vida);

        int i = random.nextInt(nomes.length);

        if (nomes[i].equals("Mago")) {
            super.setNome(nomes[i]);
            //super.setAtaque(1);    
            
        } else if (nomes[i].equals("Sandmonster")) {
            super.setNome(nomes[i]);
            //super.setAtaque(3);
 
        } else if (nomes[i].equals("Zumbi")) {
            super.setNome(nomes[i]);
            //super.setAtaque(5);

        } else {
            super.setNome(nomes[i]);
            //super.setAtaque(2);

        }
    }

    @Override
    public void cumprimentar() {
        System.out.println("Sou o " + this.getNome() + " e agora vou te derrotar!!!");
    }
    
    @Override
    public String toString() {
        return "\nSeu adversário:" + this.getNome()+ "\nVida: " + this.getVida();
    }  
    
    public void atacar(Personagem player) {
        Random random = new Random();
        //int prejuizo = random.nextInt(ataque);
        
        player.diminuirVida(vida);
        
        //personagem.diminuirVida(prejuizo);
        System.out.println(this.getNome() + " atacou " + player.getNome() 
                + " e diminuiu sua  de dano.");
        
        
        
    //System.out.println("Seu novo ataque vai ser:");
        //return scan.nextInt();
    } 
    
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

  
}

