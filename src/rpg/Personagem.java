package rpg;

public abstract class Personagem {
    
    //Atributos
    protected String nome;
    protected int ataque; 
    protected int vida;
    
    //Construtor     
    public Personagem(String nome, int ataque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }
     
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
        
    }
    
   
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //Outros Métodos
    public void cumprimentar(){}

    public abstract void atacar(Personagem alvo);
    
    public void diminuirVida(int dano) {
        vida -= dano;
    }
    
    public void exibirAtributos() {
        System.out.println("\nAdversário: " + getNome() + "\nVida: " + getVida());
        System.out.println("\n=====");
    }
     
}
