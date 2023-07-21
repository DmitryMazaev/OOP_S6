package T2;

public class Bus extends Vehicle implements iSpeedCalculation{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed*0.6;
    }
}
