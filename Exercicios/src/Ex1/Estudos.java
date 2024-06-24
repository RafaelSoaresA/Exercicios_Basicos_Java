package Ex1;

public class Estudos {

    //Declaração das variáveis
    private int valor1;
    private int valor2;
    private int soma;

    //Método construtor
    public Estudos(int valor1, int valor2, int soma) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.soma = soma;
    }


    //Getters and Setters
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
