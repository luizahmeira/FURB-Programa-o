import java.util.Scanner;
public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro homem: ");
        int homem1 = terminal.nextInt();
        System.out.println("Informe a idade do segundo homem: ");
        int homem2 = terminal.nextInt();
        System.out.println("Informe a idade da primeira mulher: ");
        int mulher1 = terminal.nextInt();
       System.out.println("Informe a idade da segunda mulher: ");
        int mulher2 = terminal.nextInt();

        
        if (homem1 > homem2 && mulher1 > mulher2) {
            System.out.println("A soma das idades é: " + (homem1 + mulher2));
            System.out.println("O produto das idades é: " + (homem2 * mulher1));
        } else if (homem1 < homem2 && mulher1 < mulher2) {
            System.out.println("A soma das idades é: " + (homem2 + mulher1));
            System.out.println("O produto das idades é: " + (homem1 * mulher2));
        } else if (homem1 > homem2 && mulher1 < mulher2) {
            System.out.println("A soma das idades é: " + (homem1 + mulher1) );
            System.out.println("O produto das idades é: " + (homem2 * mulher2));
        } else if (homem1 < homem2 && mulher1 > mulher2) {
            System.out.println("A soma das idades é: " + (homem2 + mulher2) );
            System.out.println("O produto das idades é: " + (homem1 + mulher1));
        } 
        terminal.close();
    }
}
