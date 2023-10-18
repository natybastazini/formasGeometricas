package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void Menu(){
        System.out.println("**********************************************************************");
        System.out.println("Escolha a forma que deseja cadastrar [1- Circulo 2- Retângulo]");
        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                opcao = 1;
                System.out.println("A forma escolhida foi o CÍRCULO!!");
                System.out.println("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                scanner.nextLine();
                Circulo circulo = new Circulo(raio);
                System.out.println("A área do círculo é: " + circulo.calcularArea());
                System.out.println("O perímetro do círculo é: " + circulo.calcularPerimetro());

            case 2:
                opcao = 2;
                System.out.println("A forma escolhida foi o RETÂNGULO!!");
                System.out.println("Informe o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.println("Informe a largura do retângulo: ");
                double largura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(comprimento, largura);
                System.out.println("A área do retângulo é " + retangulo.calcularArea());
                System.out.println("O perímetro do retângulo é " + retangulo.calcularPerimetro());
        }


    }
}
