import java.util.Scanner;
public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float X,Y;
        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        if (X == 0.0f && Y == 0.0f){
            System.out.printf("Origem");
        }
        else{
            if(X == 0.0f){
                System.out.printf("Eixo Y");
            }
            else{
                if(Y == 0.0f){
                    System.out.printf("Eixo X");
                }
                else{
                    if (X > 0.0f && Y > 0.0f){
                        System.out.printf("Q1");
                    }
                    else{
                        if(X > 0.0f && Y < 0.0f){
                            System.out.printf("Q4");
                        }
                        else{
                            if(X < 0.0f && Y < 0.0f){;
                                System.out.printf("Q3");
                            }
                            else{
                                if(X < 0.0f && Y > 0.0f){
                                    System.out.printf("Q2");
                                }
                            }
                        }
                    }
                }
            }
        }    
    }
}        