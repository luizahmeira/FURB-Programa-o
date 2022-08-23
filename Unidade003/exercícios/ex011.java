import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        // °F = (9/5) °C + 32
        //dada uma temperatura em graus C tranforme ela em F
        Scanner terminal = new Scanner(System.in);

        System.out.print("Informe a termperatura em graus: ");
        int graus = terminal.nextInt();

        float fa = (1.8f * graus) + 32f;
        System.out.print("A temperatura em fahrenheit é: " + fa);

        terminal.close();
    }
}
