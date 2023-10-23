package n3exercici7;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class AssertEmptyOptional {
    Optional emptyOptional = Optional.empty();

    @Test
    void checkOptionalEmpty(){
        assertThat(emptyOptional).isEmpty();
    }
}
