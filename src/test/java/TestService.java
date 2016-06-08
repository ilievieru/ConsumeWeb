import consume.Consume;
import org.junit.Test;

/**
 * Created by Spirit on 6/7/2016.
 */
public class TestService {
    @Test
    public void testService(){
        Consume consume = new Consume();
        System.out.println(consume.Use("salut"));
    }
}
