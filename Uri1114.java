import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha=0;
        System.out.println("Digite a senha: ");
        senha = teclado.nextInt();
        while(senha != 2002){
            System.out.println("Senha Invalida");
           // System.out.println("Digite a senha: ");
            senha=teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}