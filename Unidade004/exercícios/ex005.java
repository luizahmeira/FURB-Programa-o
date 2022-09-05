package exercícios;
import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("A cor é azul? ");
        boolean cor = terminal.nextBoolean();

        if(cor == true) {
            System.out.print("Sim");

        } else if(cor == false) {
            System.out.print("Não");
        }


        terminal.close();
    }
}
