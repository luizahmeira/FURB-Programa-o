import java.util.Scanner;
public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            double X = terminal.nextDouble();
            double Y = terminal.nextDouble();
        
            if (X == 0 && Y == 0) {
                System.out.println("Quadrante 0");
            } else if (X > 0 && Y > 0) {
                System.out.println("Quadrante 1");
            } else if (X < 0 && Y > 0) {
                System.out.println("Quadrante 2");
            } else if (X < 0 && Y < 0) {
                System.out.println("Quadrante 3");
            } else if (X > 0 && Y < 0) {
                System.out.println("Quadrante 4");
            }
                
            terminal.close();
            
        }
    }

