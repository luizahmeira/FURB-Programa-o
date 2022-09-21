import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt(); 

        int um = numero; 

        int cem = um /100; 
        um = um - (cem * 100); 

        int cinquenta = um / 50;
        um = um - (cinquenta * 50);

        int vinte = um /20;
        um = um - (vinte * 20);

        int dez = um / 10;
        um = um - (dez * 10);

        int cinco = um / 5;
        um = um - (cinco * 5);

        int dois = um / 2;
        um = um - (dois * 2);

        System.out.println(numero);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
        scanner.close();    }
}