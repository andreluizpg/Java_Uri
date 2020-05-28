import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Hinicio,Hfim,duracao;

        Hinicio = teclado.nextInt();
        Hfim = teclado.nextInt();

        if (Hinicio == Hfim){
            System.out.println("O JOGO DUROU 24 HORA (S)");
        }
        else{
            if(Hinicio > Hfim){
                duracao = 24 - Hinicio + Hfim;
                System.out.println("O JOGO DUROU "+duracao+" HORA (S)");
            }
            else{
                duracao = Hfim - Hinicio;
                System.out.println("O JOGO DUROU "+duracao+" HORA (S)");
            }
        }
    }
}    