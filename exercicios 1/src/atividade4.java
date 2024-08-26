import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("digite sua peso");
        double peso = tec.nextDouble();
        System.out.println("digite sea altura");
        double altura = tec.nextDouble();

        double imc = peso / (altura * 2);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else{
            System.out.println("Obesidade grau III (mórbida)");
        }

    }
}
