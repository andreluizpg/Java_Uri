import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A,B,C;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        double calculo;

        if (A < B+C && B < A+C && C < A+B){
            calculo = A + B + C;
            System.out.printf("Perimetro = %.1f", calculo);
        }
        else{
            calculo = (A+B)*C/2.0;
            System.out.printf("Area = %.1f", calculo);
        }
    }
}
