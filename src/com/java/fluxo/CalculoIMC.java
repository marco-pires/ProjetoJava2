package com.java.fluxo;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        double imc;
        imc = peso / (altura*altura);
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Sua Classificação é de Magreza");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Sua Classificação Está Dentro do Normal");
        } if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else if (imc >= 40.0 ) {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }
    }
}
