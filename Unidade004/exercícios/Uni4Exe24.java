import java.util.Scanner;
public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

            System.out.println("Informe os 3 valores: ");
            int num1 = terminal.nextInt();
            int num2 = terminal.nextInt();
            int num3 = terminal.nextInt();
            System.out.println("se opção = 1, escreva os 3 valores em ordem crescente");
            System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente");
            System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");
            int opcao = terminal.nextInt();

            switch(opcao) {
                case 1:
                    if(num1 > num2 && num2 > num3) {
                        System.out.println(num3 + "\n" + num2 + "\n" + num1);
                    } else if(num1 > num3 && num3 > num2 ) {
                        System.out.println(num2 + "\n" + num3 + "\n" + num1);
                    } else if(num2 > num1 && num1 > num3) {
                        System.out.println(num3 + "\n" + num1 + "\n" + num2);
                    } else if(num2 > num3 && num3 > num1) {
                        System.out.println(num1 + "\n" + num3 + "\n" + num2);
                    } else if(num3 > num1 && num1 > num2) {
                        System.out.println(num2 + "\n" + num1 + "\n" + num3);
                    } else if(num3 > num2 && num2 > num1) {
                        System.out.println(num1 + "\n" + num2 + "\n" + num3);
                    }
                    break;
                case 2:
                    if(num1 > num2 && num2 > num3) {
                        System.out.println(num1 + "\n" + num2 + "\n" + num3);
                    } else if(num1 > num3 && num3 > num2 ) {
                        System.out.println(num1 + "\n" + num3 + "\n" + num2);
                    } else if(num2 > num1 && num1 > num3) {
                        System.out.println(num2 + "\n" + num1 + "\n" + num3);
                    } else if(num2 > num3 && num3 > num1) {
                        System.out.println(num2 + "\n" + num3 + "\n" + num1);
                    } else if(num3 > num1 && num1 > num2) {
                        System.out.println(num3 + "\n" + num1 + "\n" + num2);
                    } else if(num3 > num2 && num2 > num1) {
                        System.out.println(num3 + "\n" + num2 + "\n" + num1);
                    }
                    break;
                case 3:
                    if(num1 > num2 && num2 > num3) {
                        System.out.println(num3 + "\n" + num1 + "\n" + num2);
                    } else if(num2 > num1 && num1 > num3) {
                        System.out.println(num3 + "\n" + num2 + "\n" + num1);
                    }  else if(num3 > num1 && num1 > num2) {
                        System.out.println(num2 + "\n" + num3 + "\n" + num1);
                    }
                    break;
            
            }
        terminal.close();
    }
}
