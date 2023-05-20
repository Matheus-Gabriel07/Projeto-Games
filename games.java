/* Esse programa é uma loja de venda de jogos, com funções de cadastrar novos jogos e usuários, listagem dos jogos e a efetuação da compra
 * 
 * Atenção: Existe variáveis que não são utilizadas, mas fazem parte da estetica do programa.
 * Data: 19/05/2023
 * Criação: Felipe Lima Eça
 *          Kaique Magalhães Santos
 *          Kauã da Silva Lazarim
 *          Matheus Gabriel Santos Silva
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //! O Scanner está fechado, e se colocar ele em outro local, o programa não fica em ciclo;

        String[] tipoAcao = { "Metal Gear Solid 5 - Em desconto: The Phantom Pain -- R$50,00",
                "Elden Ring -- RS70,00", "Resident Evil 4 Remake -- R$70,00" };
        String[] tipoCorrida = { "Forza Horizon 5 -- R$80,00", "Gran Turismo - Em desconto -- R$50,00",
                "F1 2021 -- R$ 80,00" };
        String[] tipoAventura = { "Death Stranding -- R$ 90,00", "Subnautica -- R$90,00",
                "The Elder Scrolls V: Skyrim - Em desconto -- R$50,00" };
        ArrayList<String> aventura = new ArrayList<String>(Arrays.asList(tipoAventura));
        ArrayList<String> acao = new ArrayList<String>(Arrays.asList(tipoAcao));
        ArrayList<String> corrida = new ArrayList<String>(Arrays.asList(tipoCorrida));

        // Declaração das váriaveis globais

        double carrinho = 0;
        double vCorrida = 80.00, vAcao = 70.00, vAventura = 90.00, vDesconto = 50.00;

        boolean continuar = true;
        int opc, resp;
        int opcPagamento = 0;
        int total = 0;

        // Dados adicionais para o pagamento
        // ! Atenção, essas variáveis não utlizadas na lógica. São somente para estética
        String cvv = "";
        String numeroCartao = "";

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

            // Programa encerrado

            if (opc == 8) {
                continuar = false;
                System.out.println("Programa encerrado");
            }

            // Cadastro de usuário

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

            // Lista dos jogos de corrida

            if (opc == 2) {
                continuar = false;
                System.out.println("\n2 - Jogos de corrida\n");

                for (String str : corrida) { // Geração da lista
                    System.out.println("> " + str);
                }

                System.out.println("\nDigite qual jogo você deseja comprar."
                        + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                resp = sc.nextInt();

                while (resp != 0) { // Loop de compra

                    if (resp == 1 || resp == 3) {
                        carrinho += vCorrida;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : corrida) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : corrida) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }

                    if (resp == 2) { // Opção com desconto
                        carrinho += vDesconto;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : corrida) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : corrida) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }
                }
                continuar = true; // Retorna ao menu principal
            }

            // Lista de jogos de ação

            if (opc == 3) {
                continuar = false;
                System.out.println("\n3 - Jogos de ação \n");

                for (String str : acao) { // Geração da lista
                    System.out.println(">" + str);
                }

                System.out.println("\nDigite qual jogo você deseja comprar."
                        + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                resp = sc.nextInt();

                while (resp != 0) { // Loop de compra

                    if (resp == 2 || resp == 3) {
                        carrinho += vAcao;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : acao) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : acao) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }

                    if (resp == 1) { // Opção com desconto
                        carrinho += vDesconto;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : acao) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : acao) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }
                }
                continuar = true; // Retorna ao menu principal
            }

            // Lista de jogos de aventura

            if (opc == 4) {
                continuar = false;
                System.out.println("4 - Jogos de aventura \n");

                for (String str : aventura) {
                    System.out.println(">" + str);
                }

                System.out.println(
                        "\nDigite qual jogo você deseja comprar. Se não seseja comprar nenhum jogo e retornar ao menu digiete 0");
                resp = sc.nextInt();

                while (resp != 0) {
                    if (resp == 1 || resp == 2) {
                        carrinho += vAventura;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : aventura) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : aventura) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }

                    if (resp == 3) { // Opção com desconto
                        carrinho += vDesconto;

                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 0 para não");
                        int questRealizarCompra = sc.nextInt();

                        if (questRealizarCompra == 1) {
                            for (String str : aventura) {
                                System.out.println("> " + str);
                            }

                            System.out.println("\nDigite qual jogo você deseja comprar."
                                    + "\nSe não deseja comprar nenhum jogo, digite 0, para voltar");
                            resp = sc.nextInt();

                            if (resp == 1) {
                                for (String str : aventura) {
                                    System.out.println("> " + str);
                                }
                            }

                        }

                        if (questRealizarCompra == 0) {
                            break;
                        }
                    }
                }
                continuar = true;
            }

            // Lista com todos os Jogos

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

                System.out.println("\nDigite 1 para continuar ou 0 para encerrar:");
                resp = sc.nextInt();

                while (resp != 0) {
                    if (resp == 7 || resp == 8 || resp == 9) {
                        carrinho = vAventura;
                        System.out.println("Jogo Adcionado ao Carrinho\n\n");
                        System.out.println("Deseja realizar mais uma compra?"
                                + "\nDigite 1 para sim"
                                + "\n Digite 2 para não");
                        int questRealizarCompra = sc.nextInt();
                        if (questRealizarCompra == 1) {
                            return;
                        }
                        if (questRealizarCompra == 2) {
                            break;
                        }
                    }
                }
                continuar = true;
            }

            // cadastro de jogo

            if (opc == 6) {
                continuar = false;
                System.out.println("== Cadstro de Jogos == \n");
                System.out.println("Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                resp = sc.nextInt();

                while (resp != 0) {

                    int ac = 0, co = 0, av = 0; // Declaração das variáveis para o controle do armazenamento dos jogos

                    for (total = (co + av + ac); total <= 12; total++) {

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
                        }

                        System.out.println(
                                "Se desejar cadastrar um jogo, digite 1; Para sair desta sessão digite 0");
                        resp = sc.nextInt();

                        if (resp == 0) {
                            break;
                        }
                    }
                    System.out.println("Sistema lotado");/*
                                                          * Caso o armazém atinja o valor máximo de 12 jogos,
                                                          * não é mais possivel adicionar novos jogos
                                                          */
                    continuar = true;
                }
                continuar = true;
            }

            // Compra de produto

            if (opc == 7) {

                do {
                    while (carrinho != 0) { // Caso o carrinho tenha jogos dentro do carrinho
                        continuar = false;

                        System.out.println("=== Escolha a forma de Pagamento ===\n\n"
                                + "1- Cartão de Débito\n"
                                + "2- Cartão de Crédito\n"
                                + "3- Transferência Bancária\n"
                                + "4- PIX\n"
                                + "0- Cancelar compra e encerrar programa\n"
                                + "=======================================");
                        opcPagamento = sc.nextInt();

                        // Programa encerrado

                        if (opcPagamento == 0) {
                            System.out.println("Programa encerrado");
                            continuar = false;
                            break;
                        }

                        // Pagamento à vista no debéito

                        if (opcPagamento == 1) {
                            System.out.println("Pagando os jogos à vista terá um desconto de 10%\n");
                            double valorComDesconto = carrinho - ((carrinho * 10) / 100);

                            System.out.println("O valor final de sua compra será de R$" + valorComDesconto);

                            // Informações Adicionais
                            System.out.println(
                                    "Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                            numeroCartao = sc.next();
                            System.out.println("Digite o código CVV do cartão (***)");
                            cvv = sc.next();
                            System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)\n");

                            System.out.println("\nMuito obrigado pela a sua compra em nossa loja :)\n"
                                    + "Sua compra chegará em 7 dias úteis :)\n\n"
                                    + "Muito obrigado e volte sempre");

                            // Sessão
                            System.out.println("\nDeseja continuar nessa sessão?\n"
                                    + "Digite 1 para sim\n"
                                    + "Digite 2 para não\n");

                            resp = sc.nextInt();

                            if (resp == 1) {
                                continuar = true;
                                break;
                            }

                            else {
                                System.out.println("Programa encerrado");
                                continuar = false;
                                break;
                            }
                        }

                        // Pagamento à vista no crédito

                        if (opcPagamento == 2) {
                            System.out.println(
                                    "Na sua compra em cartão de crédito haverá um acréssimo de 10% no valor total da compra\n");
                            double valorComDesconto = (carrinho * 0.1) + carrinho;

                            System.out.println("Sua compra ficará no valor de R$" + valorComDesconto);
                            System.out.println("O valor final de sua compra será de R$" + valorComDesconto);

                            // Informações Adicionais
                            System.out.println(
                                    "Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                            numeroCartao = sc.next();
                            System.out.println("Digite o código CVV do cartão (***)");
                            cvv = sc.next();
                            System.out.println("\nAssim que o pagamento for reconhecido sua compra será enviada :)\n");

                            System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n"
                                    + "Sua compra chegará em 7 dias úteis :)\n\n"
                                    + "Muito obrigado e volte sempre");

                            // Sessão
                            System.out.println("\nDeseja continuar nessa sessão?\n"
                                    + "Digite 1 para sim\n"
                                    + "Digite 2 para não\n");

                            resp = sc.nextInt();

                            if (resp == 1) {
                                continuar = true;
                                break;
                            }

                            else {
                                System.out.println("Programa encerrado");
                                continuar = false;
                                break;
                            }
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

                            // Sessão
                            System.out.println("\nDeseja continuar nessa sessão?\n"
                                    + "Digite 1 para sim\n"
                                    + "Digite 2 para não\n");

                            resp = sc.nextInt();

                            if (resp == 1) {
                                continuar = true;
                                break;
                            }

                            else {
                                System.out.println("Programa encerrado");
                                continuar = false;
                                break;
                            }

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

                            // Sessão
                            System.out.println("\nDeseja continuar nessa sessão?\n"
                                    + "Digite 1 para sim\n"
                                    + "Digite 2 para não\n");

                            resp = sc.nextInt();

                            if (resp == 1) {
                                continuar = true;
                                break;
                            }

                            else {
                                System.out.println("Programa encerrado");
                                continuar = false;
                                break;
                            }

                        }
                    }

                    System.out.println("Não há nada no carrinho \n");
                    break;
                } while (continuar);

            }

        } while (continuar);

        sc.close();
    }

}