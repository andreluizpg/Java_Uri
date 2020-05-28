import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double in1 = teclado.nextDouble();
        double in2 = teclado.nextDouble();
        double in3 = teclado.nextDouble();
        double in4 = teclado.nextDouble();
        double in5 = teclado.nextDouble();
        double in6 = teclado.nextDouble();
        int cont = 0;
        double positivos=0;
        double media;
        
        if (in1 > 0){
            positivos = positivos + in1;
            cont++;
        }
        if (in2 > 0){
            positivos= positivos + in2;
            cont++;
        }
        if (in3 > 0){
            positivos= positivos + in3;
            cont++;
        }
        if (in4 > 0){
            positivos= positivos + in4;
            cont++;
        }
        if (in5 > 0){
            positivos= positivos + in5;
            cont++;
        }
        if (in6 > 0){
            positivos= positivos + in6;
            cont++;
        }
        media = positivos/cont;
        System.out.println(cont+" valores positivos");
        System.out.printf("%.1f\n",media);
    }
}