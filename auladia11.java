import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class auladia11 {
    public static void main(String[] args) {
        String titulo = "Exercicio 1\n";
        System.out.println(titulo);
        String description = "\nDada uma lista de strings, use a Stream API para ordenar as strings em ordem alfabética e imprimi-las.\n";
        System.out.println(description);
        List<String> a = Arrays.asList("Wagne", "Arthur", "Duart");

        a.stream()
                .sorted() //Ordena os elementos do stream em ordem natural (alfabética para strings)
                .forEach(System.out::println);

        System.out.println("\n//----------------------------------------------------------------//\n");
        //----------------------------------------------------------------//


       titulo = "Exercicio2\n";
        System.out.println(titulo);
        description = "Dada uma lista de números inteiros, use a Stream API para filtrar apenas os números maiores que 5 e limitar o resultado aos primeiros 3 números.";
        System.out.println(description);
        List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        b.stream()
                .filter(n -> n > 5) //Filtra os números no stream para manter apenas aqueles que são maiores
                .limit(3) //Limita o stream a apenas 3 elementos. Esse métd garante que o resultado contenha no máximo 3 números.
                .forEach(System.out::println);
        System.out.println("\n//----------------------------------------------------------------//\n");


        //----------------------------------------------------------------//

        titulo = "Exercicio3\n";
        System.out.println(titulo);
        description = "\nDada uma lista de palavras, use a Stream API para encontrar a palavra com o menor comprimento.\n";
        System.out.println(description);
        List<String> c = Arrays.asList("minecraft", "fortnite", "callofdult", "roblox");

        Optional<String> pcm = c.stream()
                .min                                                             //Encontra o menor elemento do stream com base no comprimento das palavras.
                        ((p1, p2) -> Integer.compare(p1.length(), p2.length())); //. A expressão lambda p1.length() e p2.length() compara os comprimentos das palavras p1 e p2.

        pcm.ifPresent(p -> System.out.println("a apalavra com menor comprimento é: " + p));
        System.out.println("\n//----------------------------------------------------------------// \n");


        //----------------------------------------------------------------//

        titulo = "Exercicio4";
        System.out.println(titulo);
        description = "Dada uma lista de números inteiros, use a Stream API para transformar cada número em seu quadrado e imprimir a nova lista.\n";
        System.out.println(description);

        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
        n.stream()
                .map(n1 -> n1 * n1) //Usa o métd map() para aplicar uma função de transformação a cada elemento do stream.
                .forEach(System.out::println);

        System.out.println("\n//----------------------------------------------------------------// \n");

        titulo = "Exercicio5\n";
        System.out.println(titulo);
        description = "Dada uma lista de palavras, use a Stream API para concatenar todas as palavras em uma única string, separadas por vírgulas.\n";
        System.out.println(description);

        List<String> nme = Arrays.asList("Link", "Jet", "Kratos", "Hallow");

        String lista = nme.stream().collect(Collectors.joining(","));
        System.out.println(lista);


    }
}
