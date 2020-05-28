import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario;
        double imposto;
        double resto_salario;
        salario = teclado.nextDouble();

        if(salario >= 0.00f && salario <= 2000.00f){
            System.out.println("Isento");
        }
        else{
            if(salario >= 2000.01f && salario <= 3000.0f){
                resto_salario = salario - 2000.0f;
                imposto = resto_salario * 0.08f;
                System.out.printf("R$ %.2f\n",imposto);
            }
            else{
                if(salario>=3000.1f && salario <= 4500.0f){
                    resto_salario = salario - 3000.00;
                    imposto = 1000.0f*0.08f + resto_salario * 0.18f;
                    System.out.printf("R$ %.2f\n",imposto);
                }
                else{
                    resto_salario = salario - 4500;
                    imposto = 1000.0f*0.08f + 1500.0f * 0.18f + resto_salario * 0.28f;
                    System.out.printf("R$ %.2f\n",imposto);
                }
            }
        }
    }
}