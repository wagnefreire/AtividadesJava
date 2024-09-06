package newativite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ativit1 {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


    List<Integer> filtrarpares = l1.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());

        System.out.println(filtrarpares);

    int soma = filtrarpares.stream().reduce(0, (a, b) -> a + b);

        System.out.println(soma);

        List<String> l2 = new ArrayList<>();

        l2.add("uva");
        l2.add("pera");
        l2.add("manga");
        l2.add("melao");
        l2.add("melancia");

        List<String> frutasfiltradas = l2.stream().filter(s -> s.length() < 5).toList();

        System.out.println(l1);
        System.out.println(frutasfiltradas);




        List<String> nomes = Arrays.asList("Pedro","Afonso","Jubileu","Tateu","Golias");

        String juntarNomes = nomes.stream().reduce((a,b) -> a + ", " + b).orElse("");
        System.out.println(juntarNomes);

        List<String> name = Arrays.asList("Arthur", "Adão", "abacaxi", "maça", "beterraba");

        System.out.println(name);

        long contarAs = name.stream().filter(s -> s.toLowerCase().startsWith("a")).count();

        System.out.println(contarAs);





    }
}