import java.util.Scanner;


//EXERCICIO 1


public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para ver números ímpares e 2 para números pares: ");
        int impar_par = scanner.nextInt();

        switch (impar_par) {
            case 1:
                System.out.println("Os números ímpares são:");
                for (int num : vetor) {
                    if (num % 2 != 0) {
                        System.out.println(num);
                    }
                }
                break;
            
            case 2:
                System.out.println("Os números pares são:");
                for (int num : vetor) {
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                }
                break;
        
            default:
                System.out.println("Escolha uma opção válida.");
                break;
        }
    }
}
