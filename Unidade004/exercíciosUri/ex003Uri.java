import java.util.Scanner;
public class ex003Uri {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            double X = terminal.nextDouble();
            double Y = terminal.nextDouble();

            if (X == 0 && Y == 0) {
                System.out.println("Origem");
            } else if (X == 0 && Y != 0) {
                System.out.println("Eixo Y");
            } else if (X != 0 && Y == 0) {
                System.out.println("Eixo X");
            } else if (X > 0 && Y > 0) {
                System.out.println("Q1");
            } else if (X < 0 && Y > 0) {
                System.out.println("Q2");
            } else if (X < 0 && Y < 0) {
                System.out.println("Q3");
            } else if (X > 0 && Y < 0) {
                System.out.println("Q4");
            }
        terminal.close();
    }
}