import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by mekala on 2021-07-07.
 */

public class PermutationTest {

    @Test
    public void testPermutationForStringWithSameChar(){
        Set<String> result = Permutation.getPermutationsForString("aaaaaa")
                .collect(Collectors.toSet());
        Assert.assertEquals(1,result.size());
    }

    @Test
    public void testPermutationForStringWithDupeChar(){
        Set<String> result = Permutation.getPermutationsForString("mekala")
                .collect(Collectors.toSet());
        Assert.assertEquals(360,result.size());
    }

    @Test
    public void testPermutationForStringWODupeChar(){
        Set<String> result = Permutation.getPermutationsForString("mastercd")
                .collect(Collectors.toSet());
        Assert.assertEquals(40320,result.size());
    }

}
