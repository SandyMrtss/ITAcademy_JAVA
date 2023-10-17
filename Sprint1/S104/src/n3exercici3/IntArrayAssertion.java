package n3exercici3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;

public class IntArrayAssertion {
    @Test
    void checkIntArray(){
        ArrayList<Integer> firstList = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            firstList.add(i);
        }
        ArrayList<Integer> secondList = new ArrayList<>();
        secondList = (ArrayList)firstList.clone();

        assertThat(firstList).isEqualTo(secondList);
    }
}
