import java.util.Scanner; //puxando o scanner da biblioteca

public class ex5 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
           
        int A = terminal.nextInt();
        int B = terminal.nextInt();

           
        int C = terminal.nextInt();
        int D = terminal.nextInt();

        int diferença = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferença);

        terminal.close();
    }
}
