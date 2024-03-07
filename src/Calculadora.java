import java.util.Scanner;
// calculadora
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float valor1, valor2, resultado;
        int op;
        Boolean menu = true;

        while(menu) {
            System.out.println(
                "Escolha a operação desejada \n" +
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Divisão \n" +
                "4 - Multiplicação \n" +
                "5 - Potenciação\n " +
                "0 - Sair \n"
            );

            op = entrada.nextInt();

            switch (op) {
                case 1:
                System.out.println("Digite o valor 1");
                valor1= entrada.nextFloat();
                System.out.println("Digite o valor 2");
                valor2 = entrada.nextFloat();
                resultado = (valor1 + valor2);    

                System.out.println(" o resultado da soma eh "+ resultado);
                    break;

                    case 2:
                    System.out.println("Digite o valor 1");
                    valor1= entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();
                    resultado = (valor1 - valor2);    

                    System.out.println(" o resultado da subtração eh "+ resultado);
                        break;
                
            
                        case 3:
                        System.out.println("Digite o valor 1");
                        valor1= entrada.nextFloat();
                        System.out.println("Digite o valor 2");
                        valor2 = entrada.nextFloat();
                        resultado = (valor1 / valor2);    
    
                        System.out.println(" o resultado da divisão eh "+ resultado);
                            break;
                    
                            case 4:
                            System.out.println("Digite o valor 1");
                            valor1= entrada.nextFloat();
                            System.out.println("Digite o valor 2");
                            valor2 = entrada.nextFloat();
                            resultado = (valor1 * valor2);    

                            case 5:
                            System.out.println("Digite o valor 1");
                            valor1= entrada.nextFloat();
                            System.out.println("Digite o valor 2");
                            valor2= (int) entrada.nextFloat();

                            for(float controle = valor1; valor2 > valor1; valor2--){
                                valor1 *= controle;
                            }
                           
                            System.out.println("O resultado da potencia é " + valor1);
                            break;

                            case 0:
                            System.out.println("Sistema encerrado");
                            menu = false;
                                break;
                default:
                System.out.println("Escolha uma operação valida");
                    break;
            }

            
        }

    }
}