import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("digite um numero!");
        double num1 = tec.nextInt();

        double num2 = (num1 * 0.05);

        double resposta = num1 + num2;
        System.out.println(resposta);




    }
}