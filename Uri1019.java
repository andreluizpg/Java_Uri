//Calculo volume
import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
      int secs,h,min,seg,resto;

      secs = teclado.nextInt();
      h = secs / 3600;
      resto = secs % 3600;
      min = resto / 60;
      seg = resto % 60;
      System.out.println(h+":"+min+":"+seg);
    }
}