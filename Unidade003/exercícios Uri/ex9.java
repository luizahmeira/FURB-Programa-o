import java.util.Scanner;
import java.text.DecimalFormat;
public class ex9 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double pi =  3.14159;
        double a = terminal.nextDouble();
        double b = terminal.nextDouble();
        double c = terminal.nextDouble();

        double areaT = (a * c)/2;
        double areaC = (c * c)*pi;
        double areaTR = ((a + b) * c)/2;
        double areaQ = b * b;
        double areaR = a * b;
       
        System.out.println("TRIANGULO: " + df.format(areaT));
        System.out.println("CIRCULO: " + df.format(areaC));
        System.out.println("TRAPEZIO: " + df.format(areaTR));
        System.out.println("QUADRADO: " + df.format(areaQ));
        System.out.println("RETANGULO: " + df.format(areaR));

        terminal.close();
    }
}
