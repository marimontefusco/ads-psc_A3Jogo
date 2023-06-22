package rpg;

import java.util.Scanner;

public class Main {
    
    //Função mostrar Tela Iniciar Jogo-> Perguntar nome, tipo, Local
    static void exibirMenuJogar() {
        
        Scanner scan = new Scanner(System.in);
        
        //Atributos
        String nome;
        int tipoPersonagem, cenario;
        
        try{
            do{
                System.out.println("\nVamos começar!!\nInsira o nome do seu Personagem: ");
                nome = scan.nextLine();

                if(nome.isEmpty()) {
                    System.out.println("\nCampo nome inválido, tente novamente: ");
                }
            
            } while(nome.isEmpty());
            
        } catch(Exception e) {
            System.out.println("Ocorreu um erro no momento de inserir o nome do personagem");
        }
        
        try {
            do {
                System.out.println("\nEscolha o cenário: \n1 -> Floresta "
                + "\n2 -> Deserto \n3 -> Cidade Abandonada \n4 -> Caverna \n");
                cenario = scan.nextInt();
                    
                if(cenario <= 0 || cenario > 4) {
                    System.out.println("\nValor inválido, tente novamente: ");
                }
                
            } while(cenario <= 0 || cenario > 4);
     
        } catch(Exception e) {
            System.out.println("Ocorreu um erro no momento da escolha do cenário");
        }

        try {
            do{
                System.out.println("\nSeu personagem é: \n1 -> Bruxo"
                + "\n2 -> Arqueiro \n3 -> Paladino \n4 -> Feiticeiro "
                + "\n5 -> Guerreiro \n");
                tipoPersonagem = scan.nextInt();
                
                if(tipoPersonagem <= 0 || tipoPersonagem > 5) {
                    System.out.println("\nValor inválido, tente novamente: ");
                }
                
            } while(tipoPersonagem <= 0 || tipoPersonagem > 5);
            
        }  catch(Exception e) {
            System.out.println("Ocorreu um erro no momento da escolha do personagem");
        }  
            
        scan.close();

    }
    
    public static void main(String[] args) {
        exibirMenuJogar();
        
    }
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int jogar;
//        
//        //Tela inicial - botao jogar e botao sair
//        System.out.println("Olá! Vamos jogar?\n\n1 -> Sim, vamos jogar!"
//                + "\n2 -> Não, deixa pra outra hora..\n\nDigite 1 ou 2: " );
//        jogar = scan.nextInt();
//
//        while (jogar == 1) {
//            
//            //Tela Iniciar jogo-> Perguntar nome, tipo, Local
//            String nome;
//            int tipoPersonagem, ataque = 0 ,cenario, vida = 0;
//
//            System.out.println("\nEscolha o cenario: \n1 -> Floresta \n2 -> Deserto"
//                + " \n3 -> Cidade Abandonada \n4 -> Caverna ");
//            cenario = scan.nextInt();
//
// 
//            System.out.println("\n\nSeu personagem é: "
//                + "\n1 -> Bruxo \n2 -> Arqueiro \n3 -> Paladino "
//                + "\n4 -> Feiticeiro \n5 -> Guerreiro \n");
//            tipoPersonagem = scan.nextInt();
//            
//            //System.out.println("\nVamos começar!!\nInsira o nome do seu Personagem: ");
//            System.out.println("\nVamos começar!!\nInsira o nome do seu Personagem: ");
//            nome = scan.nextLine();
//
//            
//            //Instanciando as classes Personagem, Inimigo e Historia
//            Player player = new Player(nome, ataque, vida, tipoPersonagem);
//            Inimigo inimigo = new Inimigo(nome, ataque, vida);
//            Historia historia = new Historia(cenario);
//        
//            //Contar historia:
//            historia.contarHistoria();
//            player.cumprimentar();
//            inimigo.cumprimentar();
//
//            //Lutar -> Loop pro jogo rodar
//            int i = 1; 
//            int vitoriaPlayer = 0, vitoriaInimigo = 0, rodadaP = 0, rodadaI = 0;
//            
//            while(player.getVida() > 0 && inimigo.getVida() > 0) {
//                System.out.println("\nRodada " + i + "\n");
//                
//                player.atacar(inimigo);
//                inimigo.exibirAtributos();
//
//                if(inimigo.getVida() > 0) {
//                    inimigo.atacar(player);          
//                    player.exibirAtributos();
//                }
//                
//                if(player.getVida() > inimigo.getVida()) {
//                    vitoriaPlayer++;
//                    rodadaP++;
//                    System.out.println("\nVencedor da Rodada " + i + ": " 
//                        + player.setTipoPersonagem(tipoPersonagem) + "\n");
//                }
//                if(inimigo.getVida() > player.getVida()) {
//                    vitoriaInimigo++;
//                    rodadaI++;
//                    System.out.println("\nVencedor da Rodada " + i + ": " 
//                        + inimigo.nome + "\n");
//                }
//
//                i++;
//
//            } //Fim while
//
//            //Mostrar Vencedor
//            if (vitoriaPlayer++ > vitoriaInimigo++) {
//                System.out.println(
//                    "\nVencedor: " + player.setTipoPersonagem(tipoPersonagem) +
//                    "\nDe " + --i + " rodadas, você ganhou " + rodadaP );
//           
//            } else if (vitoriaPlayer++ > vitoriaInimigo++) {
//                System.out.println(
//                    "\nVencedor: " + inimigo.getNome() +
//                    "\nAdversário venceu " + --i + " rodadas");
//            }
//
//            //Ao finalizar partidas:
//            System.out.println("\n ***************** \n\nFim do jogo. Deseja continuar?"
//                    + "\n1 -> Sim \n2 -> Não\n\nDigite 1 ou 2: ");
//            jogar = scan.nextInt(); 
//
//            scan.close();
//            
//            if (jogar == 2) {
//                jogar = 2;
//                System.out.println("\n\nQue pena...te esperamos em breve!");
//            } //Sai do jogo
//            
//        }
//
//        System.out.println("\n\nQue pena...te esperamos em breve!");
//   
//    }

}

/* Fazer 
    -> inserir try catch
    -> resolver pq não pega o nome do player
    -> ataque aleatório, está funcionando?
    -> inimigo ->> setar ataques? alterar nome de tipo de ataque


bot jogar ->> 
bot sair


bot atacar -> entra na tela de rodadas -> mostrador de atributos

Rodada 1

textArea = 
Bruxo atacou Mago!
E diminuiu a vida dele para: 10

textArea = 
no final da rodada: quem ganhou
mostrador de novos atributos 




Documentação do projeto:
* Capa com título do projeto ->>> Giovanna
* Nome integrantes e RA ->>> Giovanna
* Descrição do funcionamento do programa - presencial (0,4pts) ->>> Giovanna

* Código fonte explicado (2pts) ->> 


Apresentação do projeto:
* Explicação das partes principais do código-fonte(0,6pts)

* Demonstração do programa funcionando (1pt) ->> video mostrando sistema rodando!!

->> Frontend / interface gráfica/ arquivo txt ->> Caio e Rafa
->> Backend / código pro jogo rodar ->> Mariana 






*/