//Calculo volume
import java.util.Scanner;
public class Uri1013{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A,B,C,maior1,maior2;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        maior1=(A+B+Math.abs(A-B))/2;
        maior2 = (maior1+C+Math.abs(maior1-C))/2;
        System.out.println(maior2 + " eh o maior");

      //h = secs / 3600;
      //resto = secs % 3600;
      //min = resto / 60;
      //seg = resto % 60;
      //System.out.println(h+":"+min+":"+seg);
    }
}