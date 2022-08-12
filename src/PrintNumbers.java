import java.util.Arrays;
import java.util.List;

public class PrintNumbers {
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static void printOddNumbers(){
        //Transformando lista de números em Stream, aplicando filtro via Lambda Expression e chamando método println por referência
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    public static void printCubeOfOddNumbers(){
        numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number).forEach(System.out::println);
    }

}
