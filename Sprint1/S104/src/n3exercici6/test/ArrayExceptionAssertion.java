package n3exercici6.test;
import n3exercici6.Friends;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class ArrayExceptionAssertion {
    private Friends myFriends = new Friends() ;
    @Test
    void checkThrowsException(){
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(()
                -> {myFriends.isChilhoodFriend("Lola"); });
    }
    @Test
    void checkDoesntThrowException(){
        assertThatNoException().isThrownBy(()
                -> {myFriends.isChilhoodFriend("Juanito"); });
    }
}
