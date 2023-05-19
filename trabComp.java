import java.util.*;

public class trabComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respCad, numCad;

        System.out.println("===Area do dev===");
        System.out.println("Quantos cadastros temos?");
        int numCad2 = sc.nextInt();

        System.out.println("===Area do usuario===");

        System.out.println("Você já tem cadastro? Sim(1) Não(2)");
        respCad = sc.nextInt();


        if (respCad == 1) {
            System.out.println("Digite seu número de cadastro");
            numCad = sc.nextInt();

            if (numCad >=1 && numCad <= numCad2) {
                System.out.println("Concluído! Você está logado");
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Desculpe, não estamos fazendo cadastros nesse momento, tente novamente mais tarde");
        }
    }
}
