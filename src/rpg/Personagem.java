package rpg;

public class Personagem {
    
    //Atributos
    private String nome;
    private int vida;
    private String tipoDefesa;
    
    //Construtor
    public Personagem(String nome, int vida, String tipoDefesa) {
        this.nome = nome;
        this.vida = vida;
        this.tipoDefesa = tipoDefesa;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public String getTipoDefesa() {
        return tipoDefesa;
    }

    public void setTipoDefesa(String tipoDefesa) {
        this.tipoDefesa = tipoDefesa;
    }
    
    //Outros Métodos
    public void cumprimentar() {
        System.out.println("Olá, eu sou o terrível " + this.nome 
        + "e minha arma de defesa é a " + this.tipoDefesa);
    }
    
    public void morrer() {
        System.out.println("Game over!!!");
    }
    
}
