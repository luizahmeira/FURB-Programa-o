import java.util.Scanner;
public class ex005Uri {
    public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            int hora1 = terminal.nextInt(); int hora2 = terminal.nextInt();
    
            if (hora1 > hora2) { 
                System.out.println("O JOGO DUROU " + (24 - (hora1 - hora2)) + " HORA(S)");
            } else if (hora2 > hora1) {
                System.out.println("O JOGO DUROU " + (hora2 - hora1) + " HORA(S)");
            } else {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
            terminal.close();
        }
    }
