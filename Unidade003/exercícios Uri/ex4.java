import java.util.Scanner;
import java.text.DecimalFormat;
public class ex4 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        double A = terminal.nextDouble();
        double B = terminal.nextDouble();
        double MEDIA = (A * 0.35) + (B * 0.75);
        System.out.println("MEDIA = " + df.format(MEDIA));
        terminal.close();
    }
}
