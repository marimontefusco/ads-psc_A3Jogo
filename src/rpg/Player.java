package rpg;

import java.util.Scanner;

public class Player extends Personagem {

    private int tipoPersonagem;

    //Construtor
    public Player(String nome, int vida, int pontosEspeciais, int tipoPersonagem) {
        super(nome, vida, pontosEspeciais);
        this.tipoPersonagem = tipoPersonagem;
    }
        
    //Getters & Setters
    public int tipoPersonagem() {
        return tipoPersonagem;
    }
    
    public String setTipoPersonagem(int tipoPersonagem) {
        //this.tipoPersonagem = tipoPersonagem;
        String tipo = null;
        
        switch (tipoPersonagem) {
            case 1 -> tipo = "Bruxo";
            case 2 -> tipo = "Arqueiro";
            case 3 -> tipo = "Paladino";
            case 4 -> tipo = "Feiticeiro";
            case 5 -> tipo = "Guerreiro";
            default -> System.out.println("Escolha inválida!!");
        }
        return tipo;
    }
 
    //Outros métodos
    @Override
    public void cumprimentar() {
        System.out.println("Olá, eu sou o terrível " + this.nome + "!!!");   
    }
    
    @Override
    public String toString() {
	return "\nSeu Personagem: \n" + this.setTipoPersonagem(tipoPersonagem) 
            + " " + nome + "\nVidas: " + this.vida; //ou this.getVida()??
        //+ "Contagem dos Pontos Especiais: " + pontosEspeciais + "\n\n";
    }
    
    
//    public int??? escolherAtaque() {
    public void escolherAtaque() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
        int tipoAtaque = scan.nextInt();
        scan.close();
        
        int prejuizo = 0;
        
        switch(tipoAtaque) {
            case 1 -> { prejuizo = 7;
                System.out.println("\nVocê deu um soco!");
                
            }
            case 2 -> {prejuizo = 20;
                pontosEspeciais--; 
                System.out.println("\nVocê deu um ataque especial!");
                
            }
            default -> {
                System.out.println("\nOpção inválida!");
            }
         
        }
        
        //return prejuizo;
    }
    
    public String atacar(Personagem inimigo) {
        
        System.out.println(this.nome + " ataca " + inimigo.nome + "!");
        
        inimigo.diminuirVida(vida);
        //inimigo.vida -= prejuizo;
        
        if(inimigo.vida <= 0 ) {
            System.out.println(inimigo.nome + " foi derrotado!");
            
        }

        return this.nome + " atacou " + inimigo.getNome() 
        + " e diminuiu sua vida para: " + inimigo.getVida();
        
//        System.out.println(this.nome + " atacou " + inimigo.getNome() 
//        + " e diminuiu sua vida para: " + inimigo.getVida());
        
        
        //inimigo.diminuirVida();
 
    } 
    
   
    
}
