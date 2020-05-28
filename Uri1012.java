//Calculo volume
import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        double A,B,C;
        double a_trig;
        double a_circ;
        double a_trap;
        double a_quad;
        double a_ret;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        a_trig = A * C/2;
        a_circ = pi * C * C;
        a_trap = ((A+B)*C/2.0);
        a_quad = B*B;
        a_ret = A*B;
        //b = teclado.nextInt();
        //c = teclado.nextInt();
        //d = teclado.nextInt();

        //DIF = (a * b - c * d);
        System.out.printf("TRIANGULO: %.3f\n",a_trig);
        System.out.printf("CIRCULO: %.3f\n",a_circ);
        System.out.printf("TRAPEZIO: %.3f\n",a_trap);
        System.out.printf("QUADRADO: %.3f\n",a_quad);
        System.out.printf("RETANGULO: %.3f\n",a_ret);
    }
}