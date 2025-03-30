package src;

import java.util.Locale;
import java.util.Scanner;

public class EscolhaPesIF {
    public static void main(String[] args) {
        /*
        *Faça um programa que Leia o numero 1 ou numero 2, o numero 1 é para converter de pés para Metros
        * o numero 2 é para converter de Metros para pés. e imprima o resultado.
        *
        **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PE = 0.30; //cm
        final double METRO = 100 ; //cm
        System.out.println("Por favor digite a opção desejada: 1 para conversão de pés para metros: ");
        System.out.println("E 2 para a conversão de Metros para pés: ");
        int entrada = sc.nextInt();



        if(entrada == 1){
            System.out.println("Digite os pés: ");
            double entrada1 = sc.nextDouble();
            double pesMetros = entrada1 * PE;
            double resultP = (pesMetros / METRO) * 100;
            System.out.printf("São %.2f Metros",resultP);

        }else if (entrada == 2) {
            System.out.println("Digite os metros: ");
            double entrada2 = sc.nextDouble();
            double resultado = entrada2 / PE;
            System.out.printf("São %.2f pés",resultado);
        }else {
            System.out.println("Digite uma alternativa válida.");
        }


        sc.close();

    }
}
