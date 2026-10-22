import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);

       System.out.println("=== CALCULADORA DE IMC ===");

       System.out.print("Digite sua peso em kg (ex: 70.5): ");
       float peso = scanner.nextFloat();

       System.out.print("Digite sua altura em metros (ex: 1.75): ");
       float altura = scanner.nextFloat();

       float imc = peso / (altura * altura);

       System.out.println("-------------------------");
       System.out.printf("Seu IMC: %.2f\n", imc);


         if (imc < 18.5) {
            System.out.println("Abaixo do peso"); 
        } else if (imc < 24.9) {
            System.out.println("Peso normal"); 
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso"); 
        } else if (imc < 34.9) {
            System.out.println("Obesidade Grau I"); 
        } else if (imc < 39.9) {
            System.out.println("Obesidade Grau II"); 
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        } 


        scanner.close();
    }
}    

