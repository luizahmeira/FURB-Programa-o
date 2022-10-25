package Unidade005.exercícios;
public class Uni5Exe04 {
    public static void main(String[] args) {
                    //parte de baixo é (x+2) valor de antes mais dois, soma com o valor de antes
            float x = 2;
            int a = 0;
            float y = 3;
            int i = 0;
            float resultado = 0;
            for(i = 0; i < 20; i++ ) {
                a = a + 2;
                x = x + (2 + a);
                y = y + 2;
                resultado += y/x;                
            }
            System.out.println(3/2 + resultado);                    
        }
    }

