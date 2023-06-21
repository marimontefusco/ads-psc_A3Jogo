package rpg;

public abstract class Personagem {
    
    //Atributos
    protected String nome;
    protected int ataque; 
    protected int vida;
    
    //Construtores     
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
    //public abstract void cumprimentar();
        
    //public abstract String cumprimentar(String mensagem); 
    
    //    public void cumprimentar(String mensagem) {
    //        System.out.println(mensagem);
    //    };
    
    //    public String cumprimentar(String mensagem) {
    //        return mensagem;
    //    }
    
    public abstract void atacar(Personagem alvo);
    
    public void diminuirVida(int dano) {
        vida -= dano;
        
        if(vida <= 0)
        System.out.println(nome + " foi derrotado!");
    }
    
//     public void mostrarAtributos() {
//        System.out.println("\nPersonagem: " + tipoPersonagem + "\nNome: " + nome);
//    }
    
    
}  //Fim da Classe Personagem()
