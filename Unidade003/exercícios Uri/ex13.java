import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int numero = terminal.nextInt();
        int segundos = numero;

        int horas = segundos / 3600;
        segundos = segundos - (horas * 3600);

        int minutos = segundos / 60;
        segundos = segundos - (minutos * 60);

        System.out.println(horas + ":" + minutos + ":" + segundos);
        terminal.close();
    }
}
