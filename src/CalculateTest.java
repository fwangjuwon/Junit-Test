import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateTest {

    Calculate cal = new Calculate();

    @Test
    public void add_test() {

        // given
        int n1 = 2;
        int n2 = 4;

        // when
        int result = cal.add(n1, n2);

        // then
        assertEquals(result, n1 + n2);
    }

    @Test
    public void sub_test() {

        // given
        int n1 = 5;
        int n2 = 4;

        // when
        int result = cal.sub(n1, n2);

        // then
        assertEquals(result, n1 - n2);
    }

    @Test
    public void mul_test() {

        // given
        int n1 = 2;
        int n2 = 4;

        // when
        int result = cal.mul(n1, n2);

        // then
        assertEquals(result, n1 * n2);
    }

    @Test
    public void div_test() {

        // given
        int n1 = 4;
        int n2 = 2;

        // when
        int result = cal.div(n1, n2);

        // then
        assertEquals(result, n1 / n2);
    }
}
