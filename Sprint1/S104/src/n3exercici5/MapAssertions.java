package n3exercici5;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;
public class MapAssertions {

    private Map<String, String> myMap = new HashMap<>();

    {
        myMap.put("cake", "pastel");
        myMap.put("fruit", "fruta");
        myMap.put("cheesecake", "pastel de queso");
        myMap.put("apple", "manzana");
    }

    @Test
    void checkKeys(){
        assertThat(myMap).containsKey("fruit");
    }
}
