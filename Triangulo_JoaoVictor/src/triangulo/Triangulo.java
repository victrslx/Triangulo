package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a, b, c;
        
        System.out.print("Insira o lado a do triângulo: ");
        a= entrada.nextDouble();
        System.out.print("Insira o lado b do triângulo: ");
        b= entrada.nextDouble();
        System.out.print("Insira o lado c do triângulo: ");
        c= entrada.nextDouble();
        
        if ((a == 0) || (b == 0) || (c == 0)) {
	System.out.println("Não pode ser Triangulo pois tem lado 0");
	} if ((a + b > c) && (a + c > b) && (b + c > a)) {
	System.out.println("Forma um triãngulo");
	} if ((a == b) && (a == c) && (b == c)) {
	System.out.println("Triagulo Equilátero");
	} else if ((a == b) && (a != c) || (a == c) && (a != b) || (b == c) && (b != a)) {
	System.out.println("Triangulo isósceles");
	} else if ((a != b) && (a != c) && (b != c)) {
	System.out.println("Triangulo escaleno");
	}
    }
    
}
