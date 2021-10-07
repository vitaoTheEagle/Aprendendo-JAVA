/*
Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

package digital.innovation.one.desafios.intermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPares {

        public static void main(String[] args) throws IOException {

            String N;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = br.readLine();

            for (int i = 2  ; i <= Integer.parseInt(N); i++) {

                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
}
