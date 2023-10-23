package n3exercici4.test;

import n3exercici4.Car;
import n3exercici4.Shop;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class ArrayListAssertions {

    private List<Object> myContainer = new ArrayList<>();
    private Shop mercadona = new Shop("Mercadona", "Someone rich", 9999999);
    private Car myCar = new Car("Citroen", 5, 300);
    private Object[] myElements = new Object[]{mercadona, myCar, "hola", 123, 23.5};

    {
        myContainer.add(mercadona);
        myContainer.add(myCar);
        myContainer.add("hola");
        myContainer.add(123);
        myContainer.add(23.5);
    }
    @Test
    void checkInsertionOrder(){
        assertThat(myContainer.get(0)).isEqualTo(mercadona);
        assertThat(myContainer.get(1)).isEqualTo(myCar);
        assertThat(myContainer.get(2)).isEqualTo("hola");
        assertThat(myContainer.get(3)).isEqualTo(123);
        assertThat(myContainer.get(4)).isEqualTo(23.5);

    }

    @Test
    void checkElementsAnyOrder(){
        assertThat(myContainer).contains(myElements);
    }

    @Test
    void checkAddedOnlyOnce(){
        assertThat(myContainer).containsOnlyOnce(mercadona);
        myContainer.remove(1);
        assertThat(myContainer).doesNotContain(myCar);
    }
}
