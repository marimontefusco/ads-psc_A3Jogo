package rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Início do jogo
        Scanner scan = new Scanner(System.in);
        
        //Atributos
        String nome;
        int tipoPersonagem, pontosEspeciais = 0 ,cenario, vida = 0;

        System.out.println("Vamos começar!!");
        System.out.println("Insira o nome do seu Personagem: ");
        nome = scan.nextLine();
 
        System.out.println("\n\nSeu personagem é: "
            + "\n1 -> Bruxo \n2 -> Arqueiro \n3 -> Paladino "
            + "\n4 -> Feiticeiro \n5 -> Guerreiro \n\n0 -> Sair do jogo\n\n");
        tipoPersonagem = scan.nextInt();
        
        System.out.println("\nEscolha o cenario: \n1 -> Floresta \n2 -> Deserto"
            + " \n3 -> Cidade Abandonada \n4 -> Caverna ");
        cenario = scan.nextInt();
        
        //scan.close();
        
        //Instanciando as classes Personagem, Inimigo e Historia
        Personagem player = new Personagem(nome, vida, pontosEspeciais);
        Personagem inimigo = new Personagem(vida);
        Historia historia = new Historia(cenario);
        
        historia.contarHistoria();
        player.cumprimentar();
//        personagem.toString();
        
        inimigo.cumprimentar();
//        inimigo.toString();
        
          
        //Loop pro jogo rodar
        while(player.getVida() > 0 && inimigo.getVida() > 0) {
            
            player.toString();
            inimigo.toString();
//            System.out.println(inimigo.toString());
//            System.out.println(personagem.toString());
             
            //player.escolherAtaque(tipoAtaque);
            
            
//            System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
//            int tipoAtaque = scan.nextInt();
//            scan.close();
        
        
            //personagem.escolherAtaque(tipoAtaque);
            player.atacar();
            //player.atacar(inimigo);
                
            if (inimigo.getVida() > 0) {
                inimigo.atacar();  
                //inimigo.atacar(player);          
            
            }

            inimigo.toString();
            player.toString();

        }
        
        //Imprimindo quem ganhou
        if(player.getVida() > 0) {
            System.out.println("Você venceu a rodada!!");
        } else {
             System.out.println("Seu inimigo venceu a rodada!!");
        }
        
        //???????System.out.println("Game over!!!");

    }
}
