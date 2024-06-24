package Ex2;

import java.util.Scanner;

public class Celsius {
    //Método de leitura
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaração de variáveis
        double celsius = 0;
        double fahrenheit;

        //Valores setados
        System.out.println("Digite um valor para convert de Cº para Fº: ");
        celsius = entrada.nextDouble();

        //Conversor de Celsius para Fahrenheit
        fahrenheit = celsius * 1.8 + 32;

        //Resultado printado no console
        System.out.println("O valor convertido é: " + fahrenheit);

    }
}


