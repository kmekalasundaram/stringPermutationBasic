import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string:");

        String inputStr = input.nextLine();

        System.out.println("Original input string is : " + inputStr);

        int strLen = inputStr.length();

        long numOfPossibilities = LongStream.rangeClosed(1,strLen)
                .reduce(1,(long a, long b)-> a*b);

        System.out.println("Maximum possible permutation of the given string is " + numOfPossibilities);

        Set<String> result = Permutation.getPermutationsForString(inputStr)
                .collect(Collectors.toSet());

        System.out.println("Permutation of the given string w/o duplicate entry is " + result.size());

        result.forEach(System.out::println);
    }

}
