import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
     
        for (int cont = 1; cont <= num; cont++){
            System.out.println( cont + " " + (cont*cont) + " " + (cont*cont*cont));
        }
    }
}