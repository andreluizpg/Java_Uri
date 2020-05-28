import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();
        int cont = 0;
        int seq=1;
        while (cont != linhas ){
            System.out.println(seq + " " + (seq+1) + " " + (seq+2) + " "+ "PUM");
            seq += 4;
            cont++;
        }
    }
}