package rpg;

import java.util.Scanner;

public class Player extends Personagem {

    //Atributos
    private int tipoPersonagem;

    //Construtor
    public Player(String nome, int ataque, int vida, int tipoPersonagem) {
        //(   (String nome, int ataque, int vida, String tipoPersonagem)
        super(nome, ataque, vida);
        super.setAtaque(5);
        super.setVida(20);
        this.tipoPersonagem = tipoPersonagem;    
        
        
        
        
        
    }

    //Getters & Setters
    public int tipoPersonagem() {
        return tipoPersonagem;
    }
    
    public String setTipoPersonagem(int tipoPersonagem) {
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
    
    //Método cumprimentar() -> com problemas
    
    @Override
    public void atacar(Personagem alvo) {
    //public String atacar(Personagem inimigo) { 
        System.out.println(nome + " atacou " + alvo.nome + "!");
        alvo.diminuirVida(ataque); 
        
        System.out.println(" e diminuiu sua vida para: " + alvo.getVida()); 
    } 
    
    
 }//Fim    


    //Método cumprimentar() -> com problemas
//    @Override
//    public void cumprimentar() {
//        String mensagem =  "Olá, eu sou o terrível " + this.getNome() + "!!";   
//    }
    
//    @Override
//    public void cumprimentar(String mensagem) {
//        mensagem =  "Olá, eu sou o terrível " + this.getNome() + "!!";   
//    }

//    @Override
//    public String cumprimentar(String mensagem) {
//        mensagem = "Olá, eu sou o terrível " + this.getNome() + "!!!";
//        return "Olá, eu sou o terrível " + this.getNome() + "!!!";   
//    }

//    @Override
//    public String toString() {
//	return "\nSeu Personagem: \n" + this.setTipoPersonagem(tipoPersonagem) 
//            + " " + this.getNome() + "\nVidas: " + this.getVida()
//            + "Contagem dos Pontos Especiais: " + this.getAtaque() + "\n\n"; 
//    }
    
//    @Override
//    public String toString() {
//	return "\nSeu Personagem: \n" + this.setTipoPersonagem(tipoPersonagem) 
//            + " " + nome + "\nVidas: " + this.vida;
//        //+ "Contagem dos Pontos Especiais: " + ataque + "\n\n";
//    }
    

//    public String setTipoPersonagem(int tipoPersonagem) {
//        //this.tipoPersonagem = tipoPersonagem;
//        String tipo = null;
//        
//        if(tipoPersonagem == 1 ){
//            tipo = "Bruxo";
//
//        } else if (tipoPersonagem == 2){
//            tipo = "Arqueiro";
//            
//        } else if (tipoPersonagem == 3){
//            tipo = "Paladino";
//            
//        } else if (tipoPersonagem == 4){
//            tipo = "Feiticeiro";
//            
//        } else if (tipoPersonagem == 5){
//            tipo = "Guerreiro";
//            
//        } else {
//            System.out.println("Escolha inválida!!");
//            
//        }
//        
//        return tipo;
//        
//    }

   
    
  //  public String toString() {
//        
//        return "\nSeu jogador: " + tipoPersonagem + "\nNome: " + nome;
//        
////        return "\nSeu jogador: " + this.personagemEscolhido + 
////                "\nNome: " + this.nome "\nVida: " + this.vida;
//        
//        //return "\nSeu jogador: " + this.personagemEscolhido +"\nNome:" + this.nome "\nVida: " + this.vida;
//      
//        
//        
//        
////        return "\nSeu jogador: " + this.personagemEscolhido + 
////                "\nNome: " + this.nome "\nVida: " + this.vida;
//        
//        //return "\nSeu jogador: " + this.personagemEscolhido +"\nNome:" + this.nome "\nVida: " + this.vida;
//    }
//    

     
            //personagem.setTipoPersonagem();
//            String tipo = "Bruxo";
//            System.out.println(ti
            

    



