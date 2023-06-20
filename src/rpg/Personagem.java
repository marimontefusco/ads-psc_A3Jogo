package rpg;

public class Personagem {
    
    //Atributos
    protected String nome;
    protected int vida;
    protected int pontosEspeciais;
   // private int ataque;
    
    //Construtores
     public Personagem(int vida) {
      this.vida = 130;
      this.pontosEspeciais = 5;
    }
     
    public Personagem(String nome, int vida, int pontosEspeciais) {
        this.nome = nome;
        this.vida = 150;
        this.pontosEspeciais = 5;
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

//    public void setVida(int vida) {
//        this.vida = vida;
//    }

//    public int getPontosEspeciais() {
//        return pontosEspeciais;
//    }
//
//    public void setPontosEspeciais(int pontosEspeciais) {
//        this.pontosEspeciais = pontosEspeciais;
//    }
    
    //Outros Métodos
    public void cumprimentar() {
        
    }
   
    public int diminuirVida(int prejuizo) {
        vida -= prejuizo;
        return vida;
    }
    
    public void atacar() {
       
    }
    
//    public void atacar(Inimigo inimigo) {
//        inimigo.diminuirVida();
//        System.out.println(this.nome + " atacou " + inimigo.getNome() 
//        + " e diminuiu sua vida para: " + inimigo.getVida());
// 
//    }  



}  
    
//    
//    public int tipoPersonagem() {
//        return tipoPersonagem;
//    }
//    
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
    
  
//    public int getAtaque() {
//        return ataque;
//    }
//     
//    public void setAtaque(int ataque) {
//        this.ataque = ataque;
//    }
    
    
    
    //*********Deletar******
    
//    @Override
//    public String toString() {
//	return "\nSeu Personagem: \n" + this.setTipoPersonagem(tipoPersonagem) 
//            + " " + nome + "\nVidas: " + this.vida;
//        //+ "Contagem dos Pontos Especiais: " + pontosEspeciais + "\n\n";
//    }
    
//    public int escolherAtaque() {
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
//        int tipoAtaque = scan.nextInt();
//        scan.close();
//        
//        int prejuizo = 0;
//        
//        switch(tipoAtaque) {
//            case 1 -> { 
//                System.out.println("\nVocê deu um soco!");
//                prejuizo = 7;
//            }
//            case 2 -> {
//                System.out.println("\nVocê deu um ataque especial!");
//                prejuizo = 20;
//                //pontosEspeciais--; 
//            }
//            default -> {
//                System.out.println("\nOpção inválida!");
//            }
//         
//        }
//        
//        return prejuizo;
//    }
    
  //  public void escolherAtaque() {
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
//        int tipoAtaque = scan.nextInt();
//        scan.close();
        
//        switch(tipoAtaque) {
//            case 1 -> { 
//                System.out.println("\nVocê deu um soco!");
//            }
//            case 2 -> {
//                System.out.println("\nVocê deu um ataque especial!");
//                //pontosEspeciais--; 
//            }
//            default -> {
//                System.out.println("\nOpção inválida!");
//            }
//         
//        }
//        
//    }
    
    
    
      

    

    




    
//    
//     public void mostrarAtributos() {
//        System.out.println("\nPersonagem: " + tipoPersonagem + "\nNome: " + nome);
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
            

