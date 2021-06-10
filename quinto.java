
import java.util.Scanner;

public class quinto {
    public static void main(String[] args) {
        int edad, fem=0,masc=0,aux3=0, contador=0,cantPersonas;
        char sexo;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a analizar");
        cantPersonas=ent.nextInt();
        while(contador<=cantPersonas){
            System.out.println("Ingrese el sexo");
            sexo=ent.next().charAt(0);
            System.out.println("Ingrese la edad");
            edad= ent.nextInt();
            if((sexo=='f'|| sexo=='F') && edad>=18){
                fem++;
            }else if((sexo=='m'|| sexo=='M') && edad<18){
                masc++;
            }
            contador++;

        }

        System.out.println("La cantidad de mujeres mayores de edad son: "+fem);
        System.out.println("La cantidad de hombres menores de edad son: "+masc);
    }
    
}