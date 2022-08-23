import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {
     public static void main(String[] args) {
            
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1 = terminal.nextDouble();
        double x2 = terminal.nextDouble();

        double y1 = terminal.nextDouble();
        double y2 = terminal.nextDouble();

        
        double distancia = (Math.sqrt(((Math.pow(x2 - x1,2)) + (Math.pow(y2 - y1,2)))));
        System.out.println(df.format(distancia));

         terminal.close();
        }
    }

