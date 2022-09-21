import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite a hora e o minuto de entrada, usando espaço como ':'");
        int hrentrada = terminal.nextInt(); int minentrada = terminal.nextInt();
        System.out.println("Digite a hora e o minuto de saída, usando espaço como ':' ");
        int hrsaida = terminal.nextInt(); int minsaida = terminal.nextInt();
        int qthoras = hrsaida - hrentrada; 
        int minutos = minsaida - minentrada;

        if(minutos >= 30) {
            qthoras += 1;
        } else if(qthoras == 0) {
            qthoras += 1;
        }

        float valor = 0;

        switch(qthoras) {
            case 1: 
                valor = 5;
                break;
            case 2: 
                valor = 10;
                break;
            case 3: 
                valor = 17.50f;
                break;
            case 4: 
                valor = 25;
                break;
            case 5: 
                valor = 35;
                break;
            default:
                valor = 35 + ((qthoras - 5) * 10);
        }

        System.out.println("Valor a pagar: " + df.format(valor));
        
        terminal.close();
    }
} 
    
