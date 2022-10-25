package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Informe a quantidade total de abastecimentos durante a viagem: ");
            int abastecimentos = terminal.nextInt();
            System.out.println("Valor do odrometro inicial: ");
            double odrometro = terminal.nextDouble();

            double distanciaTotal = 0;
            double gasolinaTotal = 0;
            double gasolina;
            double distancia;

            for (int i = 1; i < abastecimentos + 1; i++) {
                System.out.printf("odometro na parada %d [km]: ", i);
                distancia = terminal.nextDouble() - (odrometro + distanciaTotal);
                distanciaTotal += distancia;
          
                System.out.print("gasolina gasta desde ultima parada [l]: ");
                gasolina = terminal.nextDouble();
                gasolinaTotal += gasolina;
          
                System.out.print("media desde última parada [km/l]: ");
                System.out.println(distancia / gasolina);
              }
              
              System.out.print("media da viagem [km/l]: ");
              System.out.println(distanciaTotal / gasolinaTotal);
          

        terminal.close();
    }
}
