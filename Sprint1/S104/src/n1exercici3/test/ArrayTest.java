package n1exercici3.test;
import n1exercici3.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayTest {

    @Test
    void checkArray(){
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class,() ->{
            arrayIterator.arrayIteration(15);
        });
    }
}
