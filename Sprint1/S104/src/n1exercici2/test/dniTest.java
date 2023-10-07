package n1exercici2.test;
import n1exercici2.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class dniTest {

    @ParameterizedTest
    @ValueSource(strings = {"24554661E", "26944814S", "32379003V", "93523103C", "14861628V", "54792696A", "31898258H", "28396780Z", "77888452X", "57836335Y", "56524355S"})
    void checkLetter(String dni){
        String dniNumber = dni.substring(0, 8);
        int number = Integer.parseInt(dniNumber );
        assertEquals(dni.charAt(8), CalculoDni.calcLetter(number));
    }
}
