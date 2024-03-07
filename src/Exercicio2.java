import java.util.Scanner;


//EXERCICIO 2

public class Exercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // PRODUTO 1

        System.out.println("Digite a porcentagem de IPI: ");
        double IPI = scanner.nextDouble();

        System.out.println("Digite o código do produto 1: ");
        int prod1 = scanner.nextInt();

        System.out.println("Digite o valor unitário do produto 1: ");
        double val1 = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto 1: ");
        int quant1 = scanner.nextInt();

        System.out.println("Digite o código do produto 2: ");
        int prod2 = scanner.nextInt();

        System.out.println("Digite o valor unitário do produto 2: ");
        double val2 = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto 2: ");
        int quant2 = scanner.nextInt();

        double total = (val1 * quant1) + (val2 * quant2);

        double totalIPI = total * (1 + (IPI / 100));

        System.out.println("\nDetalhamento da compra:");
        System.out.println("Código do produto 1: " + prod1);
        System.out.println("Valor unitário do produto 1: R$" + val1);
        System.out.println("Quantidade do produto 1: " + quant1);
        System.out.println("Código do produto 2: " + prod2 );
        System.out.println("Valor unitário do produto 2: R$" + val2 );
        System.out.println("Quantidade do produto 2: " + quant2 );
        System.out.println("Total sem IPI: R$" + total);
        System.out.println("Porcentagem do IPI: " + IPI + "%");
        System.out.println("Total com IPI: R$" + totalIPI);
    }
}
