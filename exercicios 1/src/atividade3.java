import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num1, num2, num3;

        while (true){
            System.out.println("digite um numer");
            num1 = tec.nextInt();
            System.out.println("digite outro numero");
            num2 = tec.nextInt();
            System.out.println("digite mais um numero");
            num3 = tec.nextInt();

            if (num1 != num2 && num1 != num3 && num2 != num3){
                break;
            }else {
                System.out.println("os numeros devem ser diferentes. tente novamente!");
            }
        }
        int[] nums = {num1, num2, num3};

        Arrays.sort(nums);

        for ( int x =0; x <nums.length; x++){
            System.out.println(nums[x] + ", ");
        }
        tec.close();
    }
}
