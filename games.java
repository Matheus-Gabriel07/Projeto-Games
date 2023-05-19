/* Esse programa é uma loja de venda de jogos, com funções de cadastrar novos jogos e usuários, listagem dos jogos e a efetuação da compra
 * 
 * Atenção: Existe variáveis que não são utilizadas, mas fazem parte da estetica do programa.
 * Data: 19/05/2023
 * Criação: Felipe Lima Eça
 *          Kaique Magalhães Santos
 *          Kauã da Silva Lazarim
 *          Matheus Gabriel Santos Silva
*/

import java.util.*;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tipoAcao = { "1- Metal Gear Solid 5 - Em desconto: The Phantom Pain -- R$50,00",
                "2- Elden Ring -- RS80,90", "3- Resident Evil 4 Remake -- R$95,00" };
        String[] tipoCorrida = { "4- Forza Horizon 5 -- R$70,00", "5- Gran Turismo - Em desconto -- R$70,00",
                "6- F1 2021 -- R$ 70,00" };
        String[] tipoAventura = { "7- Death Stranding -- R$ 90,80", "8- Subnautica -- R$99,99",
                "9- The Elder Scrolls V: Skyrim -- R$110,00'" };
        ArrayList<String> aventura = new ArrayList<String>(Arrays.asList(tipoAventura));
        ArrayList<String> acao = new ArrayList<String>(Arrays.asList(tipoAcao));
        ArrayList<String> corrida = new ArrayList<String>(Arrays.asList(tipoCorrida));

        double carrinho = 0;
        double vCorrida = 80.00, vAcao = 70.00, vAventura = 90.00, vDesconto = 50.00;
        // +40
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

            if (opc == 1) {
                
                System.out.println("===Area do dev===");
                System.out.println("Quantos cadastros temos?");
                int numCad2 = sc.nextInt();
                
                System.out.println("Você já tem cadastro? Sim(1) Não(2)");
                
                int respCad = sc.nextInt();

                while (respCad != 1) {
                    if (respCad == 1) {
                        System.out.println("Digite seu número de cadastro");
                        int numCad = sc.nextInt();

                        if (numCad >= 1 && numCad <= numCad2) {
                            System.out.println("Concluído! Você está logado");
                        } else {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println(
                                "Desculpe, não estamos fazendo cadastros nesse momento, tente novamente mais tarde");
                        break;
                    }
                }
            }

            if (opc == 2) {
                System.out.println("2 - Jogos de corrida\n");
                continuar = false;

                for (String str : corrida) {
                    System.out.println(">" + str);
                }

                System.out.println(
                        "\nDigite qual jogo você deseja comprar. Se não seseja comprar nenhum jogo e retornar ao menu digiete 0");
                resp = sc.nextInt();
                if (resp == 4 || resp == 6) {
                    carrinho += vCorrida;
                }
                if (resp == 5) {
                    carrinho += vDesconto;
                }
                if (resp == 0) {
                    System.out.println("Esse programa foi encerrado");
                    break;
                }
            }

            if (opc == 3) {
                System.out.println("3 - Jogos de ação \n");
                continuar = false;

                for (String str : acao) {
                    System.out.println(">" + str);
                }

                System.out.println(
                        "\nDigite qual jogo você deseja comprar. Se não seseja comprar nenhum jogo e retornar ao menu digiete 0");
                resp = sc.nextInt();
                if (resp == 2 || resp == 3) {
                    carrinho = vAcao;
                    System.out.println("Deseja realizar mais uma compra?"
                    +   "\nDigite 1 para sim")
                    +;
                    int questRealizarCompra = sc.nextInt();
                    if (questRealizarCompra == 1) {
                        continue;
                    }
                    if ()
                }
                if (resp == 1) {
                    carrinho = vDesconto;
                }
                if (resp == 0) {
                    System.out.println("Esse programa foi encerrado");
                    break;
                }
            }

            if (opc == 4) {
                System.out.println("4 - Jogos de aventura \n");
                continuar = false;

                for (String str : aventura) {
                    System.out.println(">" + str);
                }

                System.out.println(
                        "\nDigite qual jogo você deseja comprar. Se não seseja comprar nenhum jogo e retornar ao menu digiete 0");
                resp = sc.nextInt();
                if (resp == 7 || resp == 8 || resp == 9) {
                    carrinho = vAventura;
                }
                if (resp == 0) {
                    System.out.println("Esse programa foi encerrado");
                    break;
                }
            }

            if (opc == 5) {
                System.out.println("5 - Todos os jogos  \n");
                continuar = false;

                ArrayList<String> jogosTotal = new ArrayList<String>(acao.size() + aventura.size() + corrida.size());
                jogosTotal.addAll(acao);
                jogosTotal.addAll(aventura);
                jogosTotal.addAll(corrida);

                for (String str : jogosTotal) {
                    System.out.println(">" + str);
                }

                System.out.println("\nDigite 1 para continuar ou 2 para encerrar:");
                resp = sc.nextInt();
                if (resp == 1) {
                    continuar = true;
                }
                if (resp == 2) {
                    System.out.println("Esse programa foi encerrado");
                    break;
                }
            }

            // cadastro de jogo
            if (opc == 6) {
                continuar = false;
                System.out.println("== Cadstro de Jogos == \n");
                System.out.println("Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                int op = sc.nextInt();

                while (op != 0) {
                    int ac = 0, co = 0, av = 0;
                    for (int total = (co + av + ac); total <= 12; total++) {

                        System.out.println("Digite o nome do Jogo");
                        String nomeJogo = sc.next();
                        System.out.println("Digite o gênero jogo");
                        System.out.println("1 - Corrida");
                        System.out.println("2 - Ação");
                        System.out.println("3 - Aventura");
                        int genero = sc.nextInt();

                        switch (genero) { // Envio dos dados cadastrados para as listas
                            case 1:
                                for (co = 3; 3 >= 0;) {
                                    corrida.add(nomeJogo);
                                    co++;
                                    break;
                                }

                            case 2:
                                for (ac = 3; ac >= 0;) {
                                    acao.add(nomeJogo);
                                    ac++;
                                    break;
                                }

                            case 3:
                                for (av = 3; av >= 0;) {
                                    aventura.add(nomeJogo);
                                    av++;
                                    break;
                                }

                                System.out.println(
                                        "Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                                op = sc.nextInt();
                                if (op == 0) {
                                    System.out.println("Esse programa foi encerrado");
                                    break;
                                }
                        }
                    }
                    System.out.println("Sistema lotado");
                    continuar = true;
                }
            }

            if (opc == 7) { // Compra de produto

                do {
                    System.out.println("=== Escolha a forma de Pagamento ===\n\n"
                            + "1- Cartão de Débito\n"
                            + "2- Cartão de Crédito\n"
                            + "3- Transferência Bancária\n"
                            + "4- PIX\n"
                            + "0- Cancelar compra e encerrar programa\n"
                            + "=======================================");
                    int opcPagamento = sc.nextInt();

                    if (opcPagamento == 1) {
                        System.out.println("Pagando os jogos à vista terá um desconto de 10%\n");
                        double valorComDesconto = carrinho - ((carrinho * 10) / 100);

                        System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                        System.out
                                .println(
                                        "Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                        String numeroCartao = sc.next();
                        System.out.println("Digite o código CVV do cartão (***)");
                        String cvv = sc.next();
                        System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)\n");

                        System.out.println("\nMuito obrigado pela a sua compra em nossa loja :)\n"
                                + "Sua compra chegará em 7 dias úteis :)\n\n"
                                + "Muito obrigado e volte sempre");
                        continuar = false;
                    }

                    if (opcPagamento == 2) {
                        System.out.println(
                                "Na sua compra em cartão de crédito haverá um acréssimo de 10% no valor total da compra\n");
                        double valorComDesconto = (carrinho * 0.1) + carrinho;

                        System.out.println("Sua compra ficará no valor de R$" + valorComDesconto);
                        System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                        System.out
                                .println(
                                        "Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                        String numeroCartao = sc.next();
                        System.out.println("Digite o código CVV do cartão (***)");
                        String cvv = sc.next();
                        System.out.println("\nAssim que o pagamento for reconhecido sua compra será enviada :)\n");

                        System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n"
                                + "Sua compra chegará em 7 dias úteis :)\n\n"
                                + "Muito obrigado e volte sempre");
                        continuar = false;
                    }

                    if (opcPagamento == 3) {
                        System.out.println("Sua compra ficará no valor de R$" + carrinho);

                        System.out.println("Realize a transferência para a conta:\n"
                                + "Agência 1234\n"
                                + "Conta 123456\n");

                        System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)");
                        System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n"
                                + "Sua compra chegará em 7 dias úteis :)\n"
                                + "Muito obrigado e volte sempre");
                        continuar = false;

                    }

                    if (opcPagamento == 4) {
                        System.out.println("Pagando os jogos à vista terá um desconto de 10%\n");
                        double valorComDesconto = carrinho - ((carrinho * 10) / 100);

                        System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                        System.out.println(
                                "O PIX para a realização de sua traansação será gerado, aguarde um momento...");
                        System.out.println("O PIX foi gerado:\n"
                                + "123.456.789.01\n");
                        System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)\n");

                        System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n\n"
                                + "Sua compra chegará em 7 dias úteis :)\n"
                                + "Muito obrigado e volte sempre\n\n");
                        continuar = false;

                    }
                } while (continuar);

            }
        } while (continuar);
        sc.close();
    }
}