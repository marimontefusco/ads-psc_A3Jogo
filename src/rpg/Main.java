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

            //System.out.println("\nVamos começar!!\nInsira o nome do seu Personagem: ");
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

            //Lutar -> Loop pro jogo rodar
            int i = 1; 
            int vitoriaPlayer = 0, vitoriaInimigo = 0, rodadaP = 0, rodadaI = 0;
            
            while(player.getVida() > 0 && inimigo.getVida() > 0) {
                System.out.println("\nRodada " + i + "\n");
                
                player.atacar(inimigo);
                inimigo.exibirAtributos();

                if(inimigo.getVida() > 0) {
                    inimigo.atacar(player);          
                    player.exibirAtributos();
                }
                
                if(player.getVida() > inimigo.getVida()) {
                    vitoriaPlayer++;
                    rodadaP++;
                    System.out.println("\nVencedor da Rodada " + i + ": " 
                        + player.setTipoPersonagem(tipoPersonagem) + "\n");
                }
                if(inimigo.getVida() > player.getVida()) {
                    vitoriaInimigo++;
                    rodadaI++;
                    System.out.println("\nVencedor da Rodada " + i + ": " 
                        + inimigo.nome + "\n");
                }

                i++;

            } //Fim while

            //Mostrar Vencedor
            if (vitoriaPlayer++ > vitoriaInimigo++) {
                System.out.println(
                    "\nVencedor: " + player.setTipoPersonagem(tipoPersonagem) +
                    "\nDe " + --i + " rodadas, você ganhou " + rodadaP );
           
            } else if (vitoriaPlayer++ > vitoriaInimigo++) {
                System.out.println(
                    "\nVencedor: " + inimigo.getNome() +
                    "\nAdversário venceu " + --i + " rodadas");
            }

            //Ao finalizar partidas:
            System.out.println("\n*****************\n\nFim do jogo. Deseja continuar?"
                    + "\n1 -> Sim \n2 -> Não\n\nDigite 1 ou 2: ");
            jogar = scan.nextInt(); 

            scan.close();
            
            if (jogar == 2) {
                jogar = 2;
                System.out.println("\n\nQue pena...te esperamos em breve!");
            } //Sai do jogo
            
        }

        System.out.println("\n\nQue pena...te esperamos em breve!");
   
    }

}

/* Fazer 
    -> inserir try catch
    -> resolver pq não pega o nome do player
    -> ataque aleatório, está funcionando?
    -> inimigo ->> setar ataques? alterar nome de tipo de ataque
*/