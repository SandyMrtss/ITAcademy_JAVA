package n2exercici1;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringSizeTest {
    @Test
    public void tryThisString(){
        assertThat("Mordor",length(is(8)));
    }
    public static Matcher<String> length(Matcher<? super Integer> matcher){
        return new FeatureMatcher<String, Integer>(matcher,"String length","length"){
            @Override
            protected Integer featureValueOf(String string){
                return string.length();
            }
        };
    }

}







