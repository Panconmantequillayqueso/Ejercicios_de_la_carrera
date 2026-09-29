import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       System.out.println("Ingrese un número: ");
       int numero = input.nextInt();
       
       
       if (numero > 0){
        if (numero % 2 == 0){
        System.out.println("Positivo y par");
        } else{
        System.out.println("Positivo e impar");
        } 
       } else if (numero < 0){
        if (numero % 2 == 0){
            System.out.println("Negativo y par");
        } else{
            System.out.println("Negativo e impar");
        }
       }
    }
}
