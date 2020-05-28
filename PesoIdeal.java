import java.util.Scanner;
public class PesoIdeal{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sexo;
        float altura, pesoideal;
        System.out.println("Entre com sua altura:");
        altura = teclado.nextFloat();
        System.out.println("Entre com seu sexo (0 - Homem / 1 - Mulher):");
        sexo = teclado.nextInt();

        if (sexo == 0){
            pesoideal = (72.7f*altura)-58f;
        }
        else{
            pesoideal = (62.1f*altura)-44.7f;
        }

        System.out.printf("Seu peso ideal eh: %.3f\n",pesoideal);

      //h = secs / 3600;
      //resto = secs % 3600;
      //min = resto / 60;
      //seg = resto % 60;
      //System.out.println(h+":"+min+":"+seg);
    }
}