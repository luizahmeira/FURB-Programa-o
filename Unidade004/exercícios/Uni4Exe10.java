import java.util.Scanner;
public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe a idade de Marquinhos");
        int idadeMa = terminal.nextInt();
        System.out.println("Informe a idade de Zezinho");
        int idadeZe = terminal.nextInt();
        System.out.println("Informe a idade de Luluzinha");
        int idadeLu = terminal.nextInt();

        if(idadeMa < idadeZe && idadeMa < idadeLu) {
            System.out.println("Marquinhos é o mais novo");
        } else if(idadeZe < idadeMa && idadeZe < idadeLu) {
            System.out.println("Zezinho é o mais novo");
        } else if(idadeLu < idadeZe && idadeLu < idadeMa) {
            System.out.println("Luluzinha é a mais nova");
        }
        
        terminal.close();
    }
}
