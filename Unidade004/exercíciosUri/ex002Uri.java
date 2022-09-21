import java.util.Scanner;
public class ex002Uri {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        float num = terminal.nextFloat();
        if(num >= 0 && num <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if(num >= 25.0001 && num <= 50.0000) {
            System.out.println("Intervalo (25,50]");
        } else if(num >= 50.0001 && num <= 75.0000) {
            System.out.println("Intervalo (50,75]");
        } else if(num >= 75.0001 && num <= 100.0000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        terminal.close();
    }
}
