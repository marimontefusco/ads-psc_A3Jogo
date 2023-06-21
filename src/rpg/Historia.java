package rpg;

public class Historia {
    
    //Atributos
    private int cenario;
    
    public Historia(){}
    
    //Construtor
    public Historia(int cenario){
        this.cenario = cenario;
        
        switch(cenario) {
            case 1 -> System.out.println("\nEstamos na Floresta...\n");
            
            case 2 -> System.out.println("\nEstamos no Deserto...\n");
            
            case 3 -> System.out.println("\nEstamos numa Cidade abandonada...\n");
            
            case 4 -> System.out.println("\nEstamos na Caverna...\n");
        }
        
    }
    
    //Outros métodos
    public void contarHistoria() { 

    } 
    
}
