import java.util.Scanner;
public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o seu sexo: ");
        System.out.println("Masculino:  [M] ");
        System.out.println("Feminino:   [F] ");
        System.out.println("Inválido:   [I] ");
        
        char sexo = terminal.next().charAt(0);

        if (sexo == 'M') {
            System.out.println("Você escolheu: Masculino");
        } else if (sexo == 'F') {
            System.out.println("Você escolheu: Feminino");
        } else if (sexo == 'I') {
            System.out.println("Sus escolha foi inválida");
        }

        terminal.close();
    }
}

