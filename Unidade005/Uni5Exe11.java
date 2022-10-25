package Unidade005.exercícios;
public class Uni5Exe11 {
    public static void main(String[] args) {
        int x = 3;
        int biscoitosQuebrados = 0;
        for(int i = 0; i <= 16; i++) {
            if(i == 1){
                biscoitosQuebrados++;
            } else if(i == 2) {
                    biscoitosQuebrados = biscoitosQuebrados + 3;
                    System.out.println(biscoitosQuebrados);
                } else if(i > 2) {
                    x = x * 3;
                    biscoitosQuebrados = biscoitosQuebrados + x;
                }
        }
        System.out.println("A quantidade de biscoitos quebrados é: " + biscoitosQuebrados);
    }
}