package webEstudos;

public class mathfloor {
    public static void main(String[] args) {
        double numero = 10.10;
        double resto = numero - Math.floor(numero);

        if (resto != 0f){
         //numero tem parte decimal
         System.out.print("tem parte decimal");
        } else {           
        }
    }
}
