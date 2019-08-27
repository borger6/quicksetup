import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Week1Test {

    @Test
    void findMaximumPositive(){
        int[] values = {1,2,4,3,354,5433,4,-23};
        int størst = Week1.findMaximum(values);

        assertEquals(5433,størst);
    }

    @Test
    void findMaximumNegative(){
        int[] values = {-1,-2,-4,-3,-354,-5433,-23};
        int størst = Week1.findMaximum(values);

        assertEquals(-1,størst);
    }
}