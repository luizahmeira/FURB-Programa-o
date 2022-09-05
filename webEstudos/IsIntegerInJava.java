package webEstudos;

    public class IsIntegerInJava {

        public static void main(String[] args) {
            System.out.println( "A123r85 is Integer: " + isInteger( "A123r85" ) );
            System.out.println( "1235 is Integer: " + isInteger( "1235" ) );
            System.out.println( "1235.58 is Integer: " + isInteger( "1235.58" ) );
            System.out.println( "null is Integer: " + isInteger(null) );
        }
    
        private static boolean isInteger(String str) {
            return str != null && str.matches("[0-9]*");
        }
    }
/*No método isInteger, passamos por parâmetro uma String que será verificada.

Caso a String for null, será retornado false, caso contrário, será verificado usando
 o método matches. Se a String atende a expressão regular [0-9]*, será retornado true. */