import java.util.InputMismatchException;
import java.util.Scanner;
class inserçoes {
    Scanner sc = new Scanner(System.in);
    operacao op = new operacao();

    public void print() {

        boolean continuar = false;

        while(!continuar)
            try {
                System.out.println("Deseja fazer qual operação?");
                System.out.println("Soma: 1 | Subtração: 2 | Multi: 3 | Divisão: 4");
                int p1 = sc.nextInt();

                    switch (p1) {
                case 1:
                    System.out.println("Insira o 1° número:");
                    op.a = sc.nextInt();
                    System.out.println("Insira o 2° número:");
                    op.b = sc.nextInt();
                    int resultado1 = op.somar(op.a, op.b);
                    System.out.println("O resultado dessa operação é: " + resultado1);
                    continuar = true;
                    break;
                    
                case 2:
                    System.out.println("Insira o 1° número:");
                    op.a = sc.nextInt();
                    System.out.println("Insira o 2° número:");
                    op.b = sc.nextInt();
                    int resultado2 = op.sub(op.a, op.b);
                    System.out.println("O resultado dessa operação é: " + resultado2);
                    continuar = true;
                    break;

                case 3:
                    System.out.println("Insira o 1° número:");
                    op.a = sc.nextInt();
                    System.out.println("Insira o 2° número:");
                    op.b = sc.nextInt();
                    int resultado3 = op.multi(op.a, op.b);
                    System.out.println("O resultado dessa operação é: " + resultado3);
                    continuar = true;
                    break;

                case 4:
                    try {
                        System.out.println("Insira o 1° número:");
                        op.a = sc.nextInt();
                        System.out.println("Insira o 2° número:");
                        op.b = sc.nextInt();
                        int resultado4 = op.div(op.a, op.b);
                        System.out.println("O resultado dessa operação é: " + resultado4);
                        continuar = true;
                    } catch (ArithmeticException e) {
                    System.out.println("Entrada inválida! Tente novamente.");
                    continue;
                    }

                default:
                    System.out.println("Insira uma entrada válida entre 1 e 4");
                    sc.next();
                    continue;
            }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Tente novamente.");
        }
    }
}
