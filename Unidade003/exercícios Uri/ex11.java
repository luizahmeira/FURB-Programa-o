import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
       
        int km = terminal.nextInt();
        int kmFinal = (km * 2);
        System.out.println(kmFinal + " minutos");

        terminal.close();
    }
}