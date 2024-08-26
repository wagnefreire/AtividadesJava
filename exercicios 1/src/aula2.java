import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("escolha true ou false ai ze");

        boolean num1 = tec.nextBoolean();

        System.out.println("escolha de novo ai ze");

        boolean num2 = tec.nextBoolean();

        boolean finalresultado = false;

        if(num1 && num2){
            finalresultado = true;
            System.out.println("mar e inteligente");
        } else {
            finalresultado = false;
            System.out.println("mar e burro");

        }

        System.out.println(finalresultado);

    }
}
