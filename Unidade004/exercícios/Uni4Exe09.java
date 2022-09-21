import java.util.Scanner;
public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe um primeiro número: ");
        int num1 = terminal.nextInt();
        System.out.println("Informe um segundo número: ");
        int num2 = terminal.nextInt();

        if(num1 > num2 && num1 % num2 == 0) {
            System.out.println("Os números são multiplos.");
        } else if(num1 < num2 && num2 % num1 == 0){
            System.out.println("Os números são multiplos.");
        } else {
            System.out.println("Os números não são multiplos.");
        }
        
        terminal.close();
    }
}
