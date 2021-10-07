/*
Desafio
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores.
Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade
*/

package digital.innovation.one.desafios.basicos;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int A, B, PROD;

        A = leitura.nextInt();
        B = leitura.nextInt();

        PROD = A * B; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD);

        leitura.close();
    }
}
