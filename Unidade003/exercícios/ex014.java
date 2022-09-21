import java.util.Scanner;
import java.text.DecimalFormat;
public class ex014 {
    public static void main(String[] args) {
       Scanner terminal = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.00");
       
       System.out.println("Informe a distância percorrida: ");
       double distancia = terminal.nextDouble();
       System.out.println("Informe o tempo decorrido: ");
       double tempo = terminal.nextDouble();
       double velocidade = distancia / tempo;
       System.out.println("A velocidade média é: " + velocidade + " Km/h");
       double combustivel = distancia / 12;
       System.out.println("A quantidade de combustivel gasto é: " + df.format(combustivel) + " litros.");
       terminal.close();
    }
}
