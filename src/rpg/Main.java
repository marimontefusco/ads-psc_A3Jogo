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
        
        //Instanciando os objetos
        Personagem personagem = new Personagem(nome, personagemEscolhido);
        personagem.atacar();
        
        Historia historia = new Historia(duracao, cenario);
        
        historia.contarHistoria();
            
//        try {
//            
//            
//        } catch( ) {
//  
//        }

    }
}
