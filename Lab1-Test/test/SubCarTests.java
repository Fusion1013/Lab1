import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SubCarTests {

    @Test
    public void TestSpeed(){
        TestBrake(new Volvo240());
        TestGas(new Volvo240());

        TestBrake(new Saab95());
        TestGas(new Saab95());
    }

    private void TestGas(Car car){
        double speedb = car.getCurrentSpeed();
        car.gas(0.1);
        assertTrue(speedb < car.getCurrentSpeed() || car.getCurrentSpeed() == car.getEnginePower());

        speedb = car.getCurrentSpeed();
        car.gas(-10);
        assertTrue(speedb == car.getCurrentSpeed());
    }

    private void TestBrake(Car car){
        double speedb = car.getCurrentSpeed();
        car.brake(0.1);
        assertTrue(speedb > car.getCurrentSpeed() || car.getCurrentSpeed() == 0);

        speedb = car.getCurrentSpeed();
        car.brake(-10);
        assertTrue(speedb == car.getCurrentSpeed());
    }
}
