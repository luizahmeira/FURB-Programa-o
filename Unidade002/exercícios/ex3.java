import java.util.Scanner; //ler informaçao do teclado

public class ex3 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); //significa que quer fazer a leitura do teclado 
    
       System.out.print("Informe o raio: ");
        float raio = teclado.nextFloat();

        float area = (raio * raio) * 3.14159f;
        System.out.print("A multiplicação dos números é: " + area);

        teclado.close();

    }
}