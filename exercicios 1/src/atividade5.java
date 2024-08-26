import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("digite o nome do aluno");
        String name = tec.next();

        System.out.println("primeira nota");
        double nota1 = tec.nextDouble();

        System.out.println("segunda nota");
        double nota2 = tec.nextDouble();

        System.out.println("terceira nota");
        double nota3 = tec.nextDouble();

        double nota = nota1 + nota2 + nota3;

        double media = nota / 3;
        System.out.printf("A media do " + name + " e %.2f", media);
    }
}
