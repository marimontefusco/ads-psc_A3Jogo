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
        System.out.println("\nOlá, eu sou o terrível "+ this.setTipoPersonagem(tipoPersonagem) + this.getNome() + "!\n");
    }
    
    @Override
    public void atacar(Personagem alvo) {
    //public String atacar(Personagem inimigo) { 
        System.out.println(this.nome + " atacou " + alvo.nome + "!");
        alvo.diminuirVida(ataque); 
        
        System.out.println(" e diminuiu sua vida para: " + alvo.getVida()); 
    } 
    
    @Override
    public String exibirAtributos() {
        String mensagem = this.setTipoPersonagem(tipoPersonagem) +
        "\nNome: " + super.getNome() + "\nVida: " + this.vida;
        
       return mensagem;  
    }

}


//    public String toString() {
//        return "Nome: " + super.getNome() + "\nHP: " + super.getHp() + 
//                "\nAtaque: " + super.getHp() + "\nDefesa: " + this.defesa;
//    }