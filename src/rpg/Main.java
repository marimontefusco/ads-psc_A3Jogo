package rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        int jogar;
        
        //Tela inicial - botao jogar e botao sair
        System.out.println("Olá! Vamos jogar?\n\n1 -> Sim, vamos jogar!"
                + "\n2 -> Não, deixa pra outra hora..\n\nDigite 1 ou 2: " );
        jogar = scan.nextInt();

        while (jogar == 1) {
            
            //Tela Iniciar jogo-> Perguntar nome, tipo, Local
            String nome;
            int tipoPersonagem, ataque = 0 ,cenario, vida = 0;

            System.out.println("\nVamos começar!!\nInsira o nome do seu Personagem: ");
            nome = scan.nextLine();
 
            System.out.println("\n\nSeu personagem é: "
                + "\n1 -> Bruxo \n2 -> Arqueiro \n3 -> Paladino "
                + "\n4 -> Feiticeiro \n5 -> Guerreiro \n");
            tipoPersonagem = scan.nextInt();

            System.out.println("\nEscolha o cenario: \n1 -> Floresta \n2 -> Deserto"
                + " \n3 -> Cidade Abandonada \n4 -> Caverna ");
            cenario = scan.nextInt();

            //Instanciando as classes Personagem, Inimigo e Historia
            Player player = new Player(nome, ataque, vida, tipoPersonagem);
            Inimigo inimigo = new Inimigo(nome, ataque, vida);
            Historia historia = new Historia(cenario);
        
            //Contar historia:
            historia.contarHistoria();
            player.cumprimentar();
            inimigo.cumprimentar();
            
            player.exibirAtributos();
            inimigo.exibirAtributos();
            
            //Lutar -> Loop pro jogo rodar
            while(player.getVida() > 0 && inimigo.getVida() > 0) {
                
                player.exibirAtributos();
                inimigo.exibirAtributos();
                
                player.atacar(inimigo);
                player.toString();

                if (inimigo.getVida() > 0) {
                    inimigo.atacar(player);          
                    inimigo.toString();
                }

                player.toString();

            } //Fim while
            
            
            //Mostrar Vencedor

//            //Imprimindo quem ganhou
//            if (player.getVida() > 0) {
//                System.out.println("Você venceu!!");
//            
//            } else {
//                System.out.println("Game over!!! Seu inimigo venceu!!");
//            }
//
//            //Ao finalizar partidas:
//            System.out.println("\n*****************\n\nFim do jogo. Deseja continuar?"
//                    + "\n1 -> Sim \n2 -> Não\n Digite 1 ou 2: ");
//            jogar = scan.nextInt(); 
//
//            scan.close();
            
            if (jogar == 2) {
                jogar = 2;
                System.out.println("Que pena...te esperamos em breve!");
            } //Sai do jogo
            
        }
        
        
        
        
        
        System.out.println("Que pena...te esperamos em breve!");
   
    }//main

}//Main



        
//        System.out.println(player.cumprimentar(Personagem inimigo));
//        System.out.println(inimigo.cumprimentar());
//        
//        player.cumprimentar(inimigo);
//        inimigo.cumprimentar();
//        
//        player.cumprimentar(mensagem);


//player.cumprimentar(mensagem);
        //inimigo.cumprimentar();
        

//Loop pro jogo rodar
//        while(player.getVida() > 0 && inimigo.getVida() > 0) {
//        
//            System.out.println(player.toString());
//            System.out.println(inimigo.toString());
//            
//            player.toString();
//            inimigo.toString();
//        
//
//            //player.escolherAtaque();
//            //player.escolherAtaque(tipoAtaque);
//            
//            
////            System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
////            int tipoAtaque = scan.nextInt();
////            scan.close();
//        
//        
//            //personagem.escolherAtaque(tipoAtaque);
//            //player.atacar();
//            //player.atacar(inimigo);
//                
//            if (inimigo.getVida() > 0) {
//                //inimigo.atacar();  
//                //inimigo.atacar(player);          
//            
//            }
//
//            inimigo.toString();
//            player.toString();
//
//        } //Fim while



//player.escolherAtaque();
            //player.escolherAtaque(tipoAtaque);
            
            
//            System.out.println("\n\nEscolha seu ataque:\n1 -> Soco \n2 -> Especial");
//            int tipoAtaque = scan.nextInt();
//            scan.close();
        
        
            //personagem.escolherAtaque(tipoAtaque);
            