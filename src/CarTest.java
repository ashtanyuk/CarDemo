import static org.junit.Assert.*;

public class CarTest {

    @org.junit.Test
    public void gaz() {
        Car a = new Car(0,0);
        a.gaz();
        int result = a.getSpeed();
        assertEquals(5,result);
    }

    @org.junit.Test
    public void tormoz() {
    }

    @org.junit.Test
    public void step() {
    }

    @org.junit.Test
    public void average() {
    }

    @org.junit.Test
    public void km() {
    }
}