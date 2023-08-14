package view;

import controller.SomaFracao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        SomaFracao sf = new SomaFracao();
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um inteiro como limite para a soma: ");
        int Num = s.nextInt();

        double Sum = sf.FSomaFracoes(Num);

        System.out.println("Resultado da soma das fracoes: "+Sum);
    }
}
