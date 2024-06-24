package Ex1;

import java.util.Scanner;

public class Perfil {
    //Método de leitura do java
    static Scanner entrada = new Scanner(System.in);

    //Classe principal
    public static void main(String[] args) {

        //Valores setados vazios, para execução inicial
        int valor1 = 0;
        int valor2 = 0;
        int soma = 0;

        //Instância da classe Ex1.Estudos
        Estudos estudos = new Estudos(valor1, valor2, soma);

        //Representação gráfica
        System.out.println("Olá, Rafael! " + "Tudo bem?\n" + "Digite o primeiro valor: ");
        estudos.setValor1(entrada.nextInt());
        System.out.println("Digite o segundo valor: ");
        estudos.setValor2(entrada.nextInt());

        //Identificação dos valores e aplicação da soma
        estudos.setSoma(estudos.getValor1() + estudos.getValor2());
        System.out.println("Resultado da soma: " + estudos.getSoma());

    }
}