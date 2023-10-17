package n3exercici2.test;
import n3exercici2.Person;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class ReferenceAssertion {

    @Test
    void checkSameReference(){
        Person Sandy = new Person("Sandy", "Martos", 23);
        Person Sandy2 = new Person("Sandy", "Martos", 23);
        assertThat(Sandy).hasSameHashCodeAs(Sandy);
        assertThat(Sandy).doesNotHaveSameHashCodeAs(Sandy2);
    }
}
