import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            
            System.out.println("Entre com o peso da carta: ");
            float peso = terminal.nextFloat();
            float valorPagar = 0f;

            if(peso <= 50) {
                valorPagar = 0.45f;
            } else {
                float pesoEx = peso - 50f;
                float adicional = (pesoEx / 20f);
                valorPagar = 0.45f + (0.45f * adicional);
            }

            System.out.println("Valor a pagar: " + valorPagar);

        terminal.close();
    }   
}
