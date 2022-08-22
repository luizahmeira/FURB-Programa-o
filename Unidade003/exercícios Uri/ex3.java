import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int n1 = terminal.nextInt();
        int n2 = terminal.nextInt();
        int PROD = (n1 * n2);
        System.out.println("PROD = " + PROD);
        terminal.close();
    }
    
}
