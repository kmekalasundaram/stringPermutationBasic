import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mekala on 2021-07-07.
 */
public class Permutation {

    //if all char are same in string then only one possible value.
    //if string is empty, then return empty set
    public static Stream<String> getPermutationsForString(String str){
        if(str.isEmpty()){
            return Stream.empty();
        }

       if(Stream.of(str).allMatch(a -> a.equals(str.substring(0,1)))){
            return Stream.of(str);
       }

        return IntStream.range(0,str.length()).boxed()
                .flatMap(i -> getPermutationsForString(str.substring(0,i) + str.substring(i+1))
                .map(t -> str.charAt(i)+t));
    }
}
