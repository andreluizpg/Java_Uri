
import java.util.Scanner;
public class Uri1049{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String nivel1,nivel2,nivel3;
        
        nivel1 = teclado.nextLine();
        nivel2 = teclado.nextLine();
        nivel3 = teclado.nextLine();
        
        if(nivel1.equals("vertebrado")){
            if(nivel2.equals("ave")){
                switch(nivel3){
                    case "carnivoro":
                        System.out.println("aguia");
                        break;
                    case "onivoro":
                        System.out.println("pomba");
                        break;
                }        
            }            
            else{
                if(nivel2.equals("mamifero")){
                    switch(nivel3){
                        case "onivoro":
                            System.out.println("homem");
                            break;
                        case "herbivoro":
                            System.out.println("vaca");
                            break;
                    }        
                }
            }
        }
        if(nivel1.equals("invertebrado")){
            if(nivel2.equals("inseto")){
                switch(nivel3){
                    case "hematofago":
                        System.out.println("pulga");
                        break;
                    case "herbivoro":
                        System.out.println("lagarta");
                        break;
                }        
            }            
            else{
                if(nivel2.equals("anelideo")){
                    switch(nivel3){
                        case "hematofago":
                            System.out.println("sanguessuga");
                            break;
                        case "onivoro":
                            System.out.println("minhoca");
                            break;
                    }        
                }
            }
        } 
    }
}