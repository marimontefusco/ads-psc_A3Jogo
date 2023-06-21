package rpg;

public class Player extends Personagem {

    //Atributos
    private int tipoPersonagem;

    //Construtor
    public Player(String nome, int ataque, int vida, int tipoPersonagem) {
        super(nome, ataque, vida);
        super.setAtaque(5);
        super.setVida(20);
        this.tipoPersonagem = tipoPersonagem;      
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
            case 4 -> tipo = "Feiticeiro";                  
            case 5 -> tipo = "Guerreiro";
        }
        return tipo;
    }
 
    //Outros métodos
    @Override
    public void cumprimentar(){
        System.out.println("\nOlá, eu sou o terrível "+ this.setTipoPersonagem(tipoPersonagem) + this.nome + "!");
    }
    
    @Override
    public void atacar(Personagem alvo) {
        System.out.println("\n" + this.setTipoPersonagem(tipoPersonagem) + " atacou " + alvo.nome + "!");
        alvo.diminuirVida(ataque); 
        
        if (alvo.vida > 0) {
            System.out.println("E diminuiu a vida dele para: " + alvo.getVida());
        } else {
            System.out.println( "\nParabéns " + this.setTipoPersonagem(tipoPersonagem) 
                + "! \nVocê derrotou o " + alvo.getNome());
        }
    } 
    
    @Override
    public void exibirAtributos() {
        System.out.println( "\n"+ this.setTipoPersonagem(tipoPersonagem) + " " + super.getNome() + 
        "\nVida: " + getVida());
    }
   
}
