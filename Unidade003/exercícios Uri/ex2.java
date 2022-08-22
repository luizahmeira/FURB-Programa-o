import java.util.Scanner;
import java.text.DecimalFormat;

public class ex2 {//botar o Main apenas no class
    public static void main(String[] args) {
       Scanner terminal =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

       double raio = terminal.nextDouble();
       double na =  3.14159d;
       double area = (raio * raio * na);
       System.out.println("A=" + df.format(area));

       terminal.close();
    }
}
