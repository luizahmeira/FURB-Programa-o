import java.util.Scanner;
public class ex004Uri {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            int num1 = terminal.nextInt(); int num2 = terminal.nextInt(); int num3 = terminal.nextInt();

            if(num1 > num2 && num2 > num3) { 
                System.out.println(num3 + "\n" + num2 + "\n" + num1);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            } else if (num1 > num3 && num3 > num2) { 
                System.out.println(num2 + "\n" + num3 + "\n" + num1);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3); 
            } else if (num2 > num1 && num1 > num3) { 
                System.out.println(num3 + "\n" + num1 + "\n" + num2);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            } else if (num2 > num3 && num3 > num1){ 
                System.out.println(num1 + "\n" + num3 + "\n" + num2);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            } else if (num3 > num1 && num1 > num2) { 
                System.out.println(num2 + "\n" + num1 + "\n" + num3);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            } else if(num3 > num2 && num2 > num1) { 
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
                System.out.println("");
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            }
        terminal.close();
    }
}
