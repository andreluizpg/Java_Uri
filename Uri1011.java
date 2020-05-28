//Calculo volume
import java.util.Scanner;
public class Uri1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double raio;
        double volume;//int DIF;
        
        raio = teclado.nextDouble();
        volume = (4.0 / 3 * pi * raio*raio*raio);
        //b = teclado.nextInt();
        //c = teclado.nextInt();
        //d = teclado.nextInt();

        //DIF = (a * b - c * d);
        System.out.printf("VOLUME = %.3f\n",volume);
        
    }
}