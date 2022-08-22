import java.util.Scanner;
 
public class ex1 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            int a;
            int b;


            a = terminal.nextInt();
            b = terminal.nextInt();

            int x = a + b;
            System.out.println("X = "+ x);

        terminal.close();
    }
}
