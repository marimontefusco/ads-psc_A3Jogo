package rpg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
   
        /******* Tela Inicial - jogar ou sair? *******/
        String nome = null; 
        int jogar, i = 1, rodadaP = 0, rodadaI = 0;  
        int vitoriaPlayer = 0, vitoriaInimigo = 0;
        
        System.out.println("\n====================================");
        System.out.println("\nOlá! Vamos jogar?\n\n1 -> Sim, vamos jogar!"
        + "\n2 -> Não, deixa pra outra hora..\n\nDigite 1 ou 2: " );
        System.out.println("\n====================================");
        jogar = scan.nextInt();
        
        if(jogar < 1 || jogar > 2) {
            while(jogar < 1 || jogar > 2) {
                System.out.println("\n====================================");
                System.out.println("\nValor inválido, tente novamente: "); 
                
                System.out.println("\n====================================");
                System.out.println("Vamos jogar?\n\n1 -> Sim, vamos jogar!"
                + "\n2 -> Não, deixa pra outra hora..\n\nDigite 1 ou 2: " );
                jogar = scan.nextInt();
            }
            
        } else if (jogar == 1) {
            System.out.println("\n====================================");
            System.out.println("\nOba, vamos começar!!");
            System.out.println("\nInsira o nome do seu Personagem: \n");
            nome = scan.next();
 
            
            System.out.println("\n====================================");
            System.out.println("\nNome: " + nome);    
            System.out.println("\n====================================");

        } 

        while (jogar == 1) {
            
            //Atributos
            String tipoAtaque = null; 
            int tipoPersonagem, ataque = 0, cenario, vida = 0;

            /******* Tela Configurações do Personagem *******/
            //try {
                System.out.println("\nEscolha o cenário: \n\n1 -> Floresta "
                + "\n2 -> Deserto \n3 -> Cidade Abandonada \n4 -> Caverna \n");
                cenario = scan.nextInt();

                    if(cenario <= 0 || cenario > 4) {
                        while(cenario <= 0 || cenario > 4) {
                            System.out.println("\n====================================");
                            System.out.println("\nValor inválido, tente novamente: "); 
                            
                            System.out.println("\n====================================");
                            System.out.println("\nEscolha o Cenário: \n\n1 -> Floresta "
                            + "\n2 -> Deserto \n3 -> Cidade Abandonada \n4 -> Caverna \n");
                            cenario = scan.nextInt();
                        }
                                   
                    } else {
                        System.out.println("\n====================================");
                        System.out.println("\nCenário: "+ cenario);    
                        System.out.println("\n====================================");
                   }   
      
                
                System.out.println("\nSeu personagem é: \n\n1 -> Bruxo"
                + "\n2 -> Arqueiro \n3 -> Paladino \n4 -> Guerreiro \n");
                tipoPersonagem = scan.nextInt();

                    if(tipoPersonagem <= 0 || tipoPersonagem > 4) {
                        while(tipoPersonagem <= 0 || tipoPersonagem > 4) {
                            System.out.println("\n====================================");
                            System.out.println("\nValor inválido, tente novamente: ");
                            
                            System.out.println("\n====================================");
                            System.out.println("\nSeu personagem é: \n\n1 -> Bruxo"
                            + "\n2 -> Arqueiro \n3 -> Paladino \n4 -> Guerreiro \n");
                            tipoPersonagem = scan.nextInt(); 
                        }
                        
                    } else {
                        System.out.println("\n====================================");
                        System.out.println("\nPersonagem: "+ tipoPersonagem);    
                        System.out.println("\n====================================");
                    }  

            /******* Instanciando as classes Player, Inimigo e Historia *******/
            Player player = new Player(nome, ataque, vida, tipoPersonagem);
            Inimigo inimigo = new Inimigo(nome, ataque, vida, tipoAtaque);
            Historia historia = new Historia(cenario);
            
            /******* Contar historia *******/
            historia.contarHistoria();
            player.cumprimentar();
            inimigo.cumprimentar();

            /******* Tela de Batalha *******/
            //Loop pro jogo rodar
            while(player.getVida() > 0 && inimigo.getVida() > 0) {
                
                System.out.println("\n====================================");
                System.out.println("\nRodada " + i + ":");
                System.out.println("\n=====");
                
                player.atacar(inimigo);
     
                if(inimigo.getVida() > 0) {
                    inimigo.atacar(player); 
                    
                } else if(inimigo.getVida() == 0) {
                    System.out.println( "\nParabéns " 
                    + player.setTipoPersonagem(tipoPersonagem) + " " + player.nome 
                    + "! \nVocê derrotou seu adversário " + inimigo.getNome());
                }
                
                System.out.println("\n=====");
                System.out.println("\nFim da rodada " + i + ":");
                player.exibirAtributos();
                inimigo.exibirAtributos();
                
                
                if(player.getVida() > inimigo.getVida()) {
                    vitoriaPlayer++;
                    rodadaP++;
                    System.out.println("\nVencedor da Rodada " + i + ": " 
                    + player.setTipoPersonagem(tipoPersonagem) + " " 
                    + player.getNome() + "\n");
                    i++;
                    
                } else if(inimigo.getVida() > player.getVida()) {
                    vitoriaInimigo++;
                    rodadaI++;
                    System.out.println("\nVencedor da Rodada " + i + ": " 
                    + inimigo.nome + "\n");
                    i++;
                }
                
                jogar = 2;
                
            } //Fim while
            
            
            //Mostrar Vencedor
            System.out.println("Vencedor!!!\n");
            if (vitoriaPlayer > vitoriaInimigo) {
            System.out.println(
            "\nVencedor do Jogo: " + player.setTipoPersonagem(tipoPersonagem) +
            "\n!!!De " + (i-1) + " rodadas, você ganhou " + rodadaP );

            } else if (vitoriaPlayer < vitoriaInimigo) {
                System.out.println(
                "\nVencedor do Jogo: " + inimigo.getNome() + 
                "!!\nDe " + (i-1) + " rodadas, seu adversário ganhou "+ rodadaI  + " rodadas");
            }
                
            if (vitoriaPlayer > vitoriaInimigo) {
                System.out.println("\nVencedor: " + player.setTipoPersonagem(tipoPersonagem) +
                "\nDe " + --i + " rodadas, você ganhou " + rodadaP );
           
            } else if (vitoriaPlayer > vitoriaInimigo) {
                System.out.println("\nVencedor: " + inimigo.getNome() +
                    "\nAdversário venceu " + --i + " rodadas");
            }
            
            
            
        } //Fim Jogar
        
        System.out.println("\n====================================");
        System.out.println("\nFim do jogo. "
        + "Deseja continuar jogando? \n1 -> Sim \n2 -> Não\n");
        System.out.print("\nDigite 1 ou 2: ");
        jogar = scan.nextInt(); 

        if (jogar == 1) {
            jogar = 1;
        }
        else if (jogar == 2) {
            jogar = 2;
        }

        scan.close();

        System.out.println("\n\nQue pena...te esperamos em breve!");
     
    }
    
}
