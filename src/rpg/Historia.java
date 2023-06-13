package rpg;

public class Historia {
    
    //Atributos
    int duracao;
    int cenario;
    
    //Construtor
    public Historia(int duracao, int cenario){
        this.duracao = duracao;
        this.cenario = cenario;
        
        switch(cenario) {
            case 1 -> System.out.println("Floresta");
            
            case 2 -> System.out.println("Deserto");
            
            case 3 -> System.out.println("Cidade abandonada");
            
            case 4 -> System.out.println("Caverna");
            
            default -> System.out.println("Opção inexistene, tente novamente!!");
        }
        
    }
    
    //Getters & Setters
    
    
    //Outros métodos
    public void contarHistoria() { 
        if (cenario == 1) {
            System.out.println("Estamos na floresta");
            
        } else if (cenario == 2) {
            System.out.println("Estamos no Deserto!");
            
        } else if (cenario == 3) {
            System.out.println("Estamos numa Cidade Abandonada!");
            
        }
    }
    
//    public void contarInimigos() { 
//        
//        if(cenario == 1) {
//            inimigo.nome;
//        }
//    }
    
    
}
