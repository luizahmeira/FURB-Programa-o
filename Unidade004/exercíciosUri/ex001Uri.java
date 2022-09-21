import java.util.Scanner;
public class ex001Uri {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            int numA = terminal.nextInt(); int numB = terminal.nextInt(); int numC = terminal.nextInt(); int numD = terminal.nextInt();
            if (numB > numC && numD > numA && numC + numD > numA + numB && numC > 0 && numD > 0 && numA %2 == 0 ) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }
        terminal.close();
    }
}