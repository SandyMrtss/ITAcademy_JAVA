package n3exercici1;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class IntegerTest {

    @Test
    void checkEqualIntegers(){
        assertThat(5).isEqualTo(5);
    }

    @Test
    void checkDiffIntegers(){
        assertThat(5).isNotEqualTo(3);
    }

}
