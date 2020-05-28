import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo,qnt;
        float conta;
        System.out.println("Entre com o codigo: ");
        codigo = teclado.nextInt();
        System.out.println("Entre com a quantidade: ");
        qnt = teclado.nextInt();

        if (codigo == 1){
            conta = qnt * 4.00f;
            System.out.printf("Total: R$ %.2f\n",conta);
        }
        else{
            if (codigo == 2){
                conta = qnt * 4.50f;
                System.out.printf("Total: R$ %.2f\n",conta);
            }
            else{
                if(codigo == 3){
                    conta = qnt * 5.00f;
                    System.out.printf("Total: R$ %.2f\n",conta);
                }
                else{
                    if(codigo == 4){
                        conta = qnt * 2.00f;
                        System.out.printf("Total: R$ %.2f\n",conta);
                    }
                    else{
                        if(codigo == 5){
                            conta = qnt * 1.50f;
                            System.out.printf("Total: R$ %.2f\n",conta);
                        }
                    }
                }
            }
        }
    }
}