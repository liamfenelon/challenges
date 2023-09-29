import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class BiggerIsGreaterTest {

    @Test
    public void test(){
        BiggerIsGreater biggerIsGreater = new BiggerIsGreater();
        String ans = biggerIsGreater.biggerIsGreater("bac");
        assertEquals("bca", ans);
        
    }
}
