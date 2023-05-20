package Assets;
import java.util.*;

public class ArquivoX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean manterPrograma = true;
        double variavelSomaJogos = 1000;

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
                double valorComDesconto = variavelSomaJogos - ((variavelSomaJogos * 10) / 100);

                System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                System.out
                        .println("Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                String numeroCartao = sc.next();
                System.out.println("Digite o código CVV do cartão (***)");
                String cvv = sc.next();
                System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)\n");

                System.out.println("\nMuito obrigado pela a sua compra em nossa loja :)\n"
                        + "Sua compra chegará em 7 dias úteis :)\n\n"
                        + "Muito obrigado e volte sempre");
                System.out.println("Deseja realizar alguma outra ação?\n"
                        + "1- Sim\n"
                        + "2- Não\n");
                int finalzarPrograma = sc.nextInt();

                if (finalzarPrograma == 1) {
                    manterPrograma = true;
                }
                if (finalzarPrograma == 2) {
                    manterPrograma = false;
                }
            }

            if (opcPagamento == 2) {
                System.out.println(
                        "Na sua compra em cartão de crédito haverá um acréssimo de 10% no valor total da compra\n");
                double valorComDesconto = (variavelSomaJogos * 0.1) + variavelSomaJogos;

                System.out.println("Sua compra ficará no valor de R$" + valorComDesconto);
                System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                System.out
                        .println("Digite o número do seu cartão para prosseguir com o pagamento (**** **** **** ****)");
                String numeroCartao = sc.next();
                System.out.println("Digite o código CVV do cartão (***)");
                String cvv = sc.next();
                System.out.println("\nAssim que o pagamento for reconhecido sua compra será enviada :)\n");

                System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n"
                        + "Sua compra chegará em 7 dias úteis :)\n\n"
                        + "Muito obrigado e volte sempre");
                System.out.println("Deseja realizar alguma outra ação?\n"
                        + "1- Sim\n"
                        + "2- Não\n");
                int finalzarPrograma = sc.nextInt();

                if (finalzarPrograma == 1) {
                    manterPrograma = true;
                }
                if (finalzarPrograma == 2) {
                    manterPrograma = false;
                }
            }
            if (opcPagamento == 3) {
                System.out.println("Sua compra ficará no valor de R$" + variavelSomaJogos);

                System.out.println("Realize a transferência para a conta:\n"
                        + "Agência 1234\n"
                        + "Conta 123456\n");

                System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)");
                System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n"
                        + "Sua compra chegará em 7 dias úteis :)\n"
                        + "Muito obrigado e volte sempre");
                System.out.println("Deseja realizar alguma outra ação?\n"
                        + "1- Sim\n"
                        + "2- Não\n");
                int finalzarPrograma = sc.nextInt();

                if (finalzarPrograma == 1) {
                    manterPrograma = true;
                }
                if (finalzarPrograma == 2) {
                    manterPrograma = false;
                }
            }
            if (opcPagamento == 4) {
                System.out.println("Pagando os jogos à vista terá um desconto de 10%\n");
                double valorComDesconto = variavelSomaJogos - ((variavelSomaJogos * 10) / 100);

                System.out.println("O valor final de sua compra será de R$" + valorComDesconto);
                System.out.println("O PIX para a realização de sua traansação será gerado, aguarde um momento...");
                System.out.println("O PIX foi gerado:\n"
                        + "123.456.789.01\n");
                System.out.println("Assim que o pagamento for reconhecido sua compra será enviada :)\n");

                System.out.println("Muito obrigado pela a sua compra em nossa loja :)\n\n"
                        + "Sua compra chegará em 7 dias úteis :)\n"
                        + "Muito obrigado e volte sempre\n\n");

                System.out.println("Deseja realizar alguma outra ação?\n"
                        + "1- Sim\n"
                        + "2- Não\n");
                int finalzarPrograma = sc.nextInt();

                if (finalzarPrograma == 1) {
                    manterPrograma = true;
                }
                if (finalzarPrograma == 2) {
                    manterPrograma = false;
                }
            }
        } while (manterPrograma);
        sc.close();
    }
}