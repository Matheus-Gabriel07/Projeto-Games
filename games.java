/* Esse programa é uma loja de venda de jogos, com funções de cadastrar novos jogos e usuários, listagem dos jogos e a efetuação da compra
 * 
 * Criação: Felipe Lima Eça
 *          Kaique Magalhães Santos
 *          Kauã da Silva Lazarim
 *          Matheus Gabriel Santos Silva
*/

import java.util.*;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> aventura = new ArrayList<String>();
        ArrayList<String> acao = new ArrayList<String>();
        ArrayList<String> corrida = new ArrayList<String>();

        boolean continuar = true;
        int opc, resp;

        do {
                System.out.println("*** Menu de jogos ***\n");
                System.out.println("1 - Cadastro");
                System.out.println("2 - Jogos de corrida");
                System.out.println("3 - Jogos de ação");
                System.out.println("4 - Jogos de aventura");
                System.out.println("5 - Todos os jogos");
                System.out.println("6 - Cadastrar um novo jogo");
                System.out.println("7 - Efetuar compra");
                System.out.println("8 - Sair do Menu \n");

                System.out.println("Digite a opção desejada: ");
                opc = sc.nextInt();

                if (opc == 8) {
                    continuar = false;
                    System.out.println("Programa encerrado");
                }

                if (opc == 2) {
                    System.out.println("2 - Jogos de corrida\n");
                    continuar = false;

                    corrida.add("Forza Horizon 5");
                    corrida.add("Gran Turismo 7");
                    corrida.add("F1 2021 ");
                    System.out.println(corrida);

                    System.out.println("Digite 1 para continuar ou 2 para encerrar:");
                    resp = sc.nextInt();
                    if (resp == 1) {
                        continuar = true;
                    }
                }

                if (opc == 3) {
                    System.out.println("3 - Jogos de ação \n");
                    continuar = false;

                    System.out.println("Metal Gear Solid 5: The Phantom Pain");
                    System.out.println("Elden Ring");
                    System.out.println("Resident Evil 4 Remake");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar:");
                    resp = sc.nextInt();
                    if (resp == 1) {
                        continuar = true;
                    }
                }

                if (opc == 4) {
                    System.out.println("4 - Jogos de aventura \n");
                    continuar = false;

                    System.out.println("Death Stranding");
                    System.out.println("Subnautica");
                    System.out.println("The Elder Scrolls V: Skyrim");
                    

                    System.out.println("Digite 1 para continuar ou 2 para encerrar:");
                    resp = sc.nextInt();
                    if (resp == 1) {
                        continuar = true;
                    }
                }

                if (opc == 5) {
                    System.out.println("5 - Todos os jogos  \n");
                    continuar = false;

                    System.out.println("Digite 1 para continuar ou 2 para encerrar:");
                    resp = sc.nextInt();
                    if (resp == 1) {
                        continuar = true;
                    }
                }
                
                // cadastro de jogo
                if (opc == 6) {
                    System.out.println("== Cadstro de Jogos == \n");
                    System.out.println("Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                    int op = sc.nextInt();
                
                    while (op != 0){
                    System.out.println("Digite o nome do Jogo");
                    String nomeJogo = sc.next();
                    System.out.println("Digite o gênero jogo");
                    System.out.println("1 - Corrida");
                    System.out.println("2 - Ação");
                    System.out.println("3 - Aventura");
                    int genero = sc.nextInt();
                
                        switch (genero) { // Envio dos dados cadastrados para as listas
                            case 1:
                                corrida.add(nomeJogo);
                                break;
                            /*case 2:
                                jogoAcao += nomeJogo;
                                break;
                            case 3:
                                jogoAventura += nomeJogo;
                                break;*/
                        }
                
                    System.out.println("Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                    op = sc.nextInt();
                    }
                }  

            } while (continuar);

            sc.close();
        }
    }
