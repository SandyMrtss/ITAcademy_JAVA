package n1exercici1.test;
import java.util.List;
import n1exercici1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthTest {
    List<String> orderedMonths = orderMonths.getList();

    @Test
    void size() {
        assertEquals(12, orderedMonths.size());
    }

    @Test
    void august(){
        int position = orderedMonths.indexOf("agost");
        assertEquals(7, position);
    }


}