package Unidade005.exercícios;
public class Uni5Exe03 {
    public static void main(String[] args) {        
            float numero = 1f;
            int i;
            float resultado = 0f;
            for(i = 1; i <= 100; i++) {
               resultado += numero / i;              
            }
            System.out.println(resultado);
        
    }
}
