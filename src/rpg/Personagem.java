package rpg;

import java.util.Random;

public class Personagem {
//public class Personagem {
    
    //Atributos
    private String nome;
    private int personagemEscolhido;
    private int vida;
    private int ataque;
    private int defesa;
    
    //Construtor
    public Personagem() {
      
    }
    
    public Personagem(String nome, int personagemEscolhido, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.personagemEscolhido = personagemEscolhido;
        
        if( personagemEscolhido == 1 ){
            vida = 100;
            ataque = 10;
            defesa = 5;
            
        } else if( personagemEscolhido == 2 ) {
            vida = 60;
            ataque = 12;
            defesa = 4;
            
        } else if( personagemEscolhido == 3 ) {
            vida = 100;
            ataque = 10;
            defesa = 5;
            
        } else if( personagemEscolhido == 4 ) {
            vida = 100;
            ataque = 10;
            defesa = 5;
 
        } else  {
            vida = 100;
            ataque = 13;
            defesa = 5;
        
        }
        
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

      public void setNome(String nome) {
        this.nome = nome;
    }
    
      public int getPersonagemEscolhido() {
        return personagemEscolhido;
    }
    
      public void setPersonagemEscolhido(int personagemEscolhido) {
        this.personagemEscolhido = personagemEscolhido;
    }
      
    public int getVida() {
        return vida;
    }

     public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getAtaque() {
        return ataque;
    }
     
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    //Outros Métodos
    public void cumprimentar() {
        System.out.println("Olá, eu sou o terrível " + this.nome);
    }
    
    public int atacar() {
        //System.out.println("Seu novo ataque vai ser:");
        
        //Valor aleatório de ataque -> o ataque vai ser aumentado aleatoriamente!
        Random random = new Random();
        
        return random.nextInt(1, 11) * ataque;
    
//        if(Personagem1.tipoDeDefesa > Personagem2.tipoDeDefesa) {
//            Personagem2. vida == -10;
//        }

    }
    
    public void defender() {
        
    }
    
    public void morrer() {
        if (vida == 0) {
           System.out.println("Game over!!!");  
        }
       
    }
    
}
/*


problema x -> requisitos Funcionais - não funcionais

cadastrar fornecedor
ver estoque

DER - diagrama de entidade relacionamento -> 1 N, N N, 1 1 -> nome, cpf, endereço
    - fluxograma

    - de classes e instâncias UML


*/