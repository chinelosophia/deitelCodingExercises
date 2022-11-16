package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatTest {

    @Test
    public void squareTest() {
        kat kat = new kat();
        int result = kat.squareOf(100);
        assertEquals(10000, result);
    }

    @Test
    public void addTest() {
        kat kat = new kat();
        int sum = kat.add(12, 2);
   assertEquals(14, sum);
    }

    @Test
    public void maxTest(){
    kat kat = new kat();
    int maximum = kat.maxOf(23, 23);

    }
}








