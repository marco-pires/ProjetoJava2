package com.java.fluxo;
import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {

        int idade = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        if (idade < 0)
            System.out.println("Idade inválida");

        if( idade >= 18 && idade < 70){
            System.out.println("Olá " + nome + ", você é maior de idade");
        }
        else if (idade >= 70){
            System.out.println("Olá " + nome + ", você é de terceira idade");
            if (idade >= 100) {
                System.out.println("Olá " + nome + ", você é Centenário(a)");
            }
        }
        else {
            System.out.println("Menor idade");
        }

    }

}
