import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("digite o nome do aluno");
        String name = tec.next();

        System.out.println("digite a primeira nota");
        double not1 = tec.nextDouble();

        System.out.println("segunda nota");
        double not2 = tec.nextDouble();

        System.out.println("teceira nota");
        double not3 = tec.nextDouble();

        System.out.println("quarta nota");
        double not4 = tec.nextDouble();

        double nota = not1 + not2 + not3 + not4;

        double media = nota / 4;
        System.out.println("a media e " + media);

        if(media < 7 ){
            System.out.println("o aluno " + name + " está reprovado");
        }else{
            System.out.println("o aluno " + name + " está aprovado");
        }



    }
}
