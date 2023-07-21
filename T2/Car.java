package T2;

public class Car extends Vehicle implements iSpeedCalculation{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    
    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed*0.8;
    }

}
