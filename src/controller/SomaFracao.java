package controller;

public class SomaFracao {

    public SomaFracao(){
        super();
    }

    public double FSomaFracoes(int N){
        //Condição de parada --> Quando N for igual a um, a função soma 1 na equação e termina a pilha de chamadas, retornando o
        //resultado final das divisões.
        if(N==1){
            return 1;
        }
        double Soma = 1 / (double) N; // 1 / N
        return Soma + FSomaFracoes(N-1);// Equação recursiva: 1/n + 1/(n-1) + 1(n-2) + ... 1

        /*
           A relação dos passos ocorre da seguinte forma:

           Primeiramente, a função recebe N (valor digitado pelo usuário) como parâmetro e a função já realiza o calculo de
           1 divido por N, onde N é convertido para double e o resultado é armazenado na variavel do tipo double "Soma", e
           então a função retorna essa váriavel somando com a chamada da própria função recursiva, onde N irá diminuir por 1,
           a cada nova chamada, até quando N
           chegar a 1, ou seja quando a função recursiva chegar na sua condição de parada.

           A equação dessa função pode ser dada como 1/N + 1/(n-1) + 1/(n*2) + ... 1

           Detalhe: é importante que a condição de parada seja quando N = 1, e não 0, pois corre o risco da função realizar o calculo
           de 1/0 ou, se ela retorna 1 quando N for igual 0. Pode acontecer de ser somado 1 duas vezes no calculo.
         */
    }
}
