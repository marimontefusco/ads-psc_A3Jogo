package rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        //Atributos
        String nome; 
        int personagemEscolhido, duracao = 0, cenario = 0;

        System.out.println("Vamos começar!!");
        System.out.println("Insira o nome do seu Personagem: ");
        nome = scan.next();
        
        System.out.println("Escolha seu personagem: "
                + "\n1 -> Bruxo \n2 -> Arqueiro \n3 -> Paladino "
                + "\n4 -> Feiticeiro \n5 -> Guerreiro \n\n0 -> Sair do jogo");
        personagemEscolhido = scan.nextInt();
        
        System.out.println("\nEscolha o cenario: "
                + "\n1 -> Floresta \n2 -> Deserto \n3 -> Cidade Abandonada \n4 -> Caverna ");
        cenario= scan.nextInt();
        
         System.out.println("\nEscolha a quantidade de Rodadas: "
                + "\n1 -> 3 Rodadas \n2 -> 5 Rodadas \n3 -> 7 Rodadas ");
        duracao= scan.nextInt();
        
        //Instanciando os objetos
        
         Historia historia = new Historia(duracao, cenario);
         historia.contarHistoria();
         
        Inimigo inimigo = new Inimigo();
        System.out.println(inimigo.toString());
        
//        inimigo.cumprimentar();

//Personagem personagem = new Personagem(nome, personagemEscolhido);
////        personagem.atacar();
//        

  
            
//        try {
//            
//            
//        } catch( ) {
//  
//        }

    }
}
