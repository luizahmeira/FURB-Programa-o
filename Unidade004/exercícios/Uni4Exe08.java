import java.util.Scanner;
public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        char letra = terminal.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Sua letra é uma vogal");
        } else {
            System.out.println("Sua letra é uma consoante");
        }
        terminal.close();
    }
}
