/*
Leia dois valores inteiros. 
A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.    

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
Como todos os problemas, não esqueça de imprimir
o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada   |     Exemplos de Saída
3                     |     PROD = 27
9                     |
-30                   |     PROD = -300
10                    |
0                     |     PROD = 0
9                     |
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("PROD = %d\n", a * b);


    }

}