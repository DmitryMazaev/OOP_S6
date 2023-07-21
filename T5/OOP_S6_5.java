package T5;


//5) Переписать код в соответствии с Dependency Inversion Principle:
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

public class OOP_S6_5 {
    public static void main(String[] args) {
        iEngine petrolEngine = new PetrolEngine();
        iEngine dieselEngine = new DieselEngine();
        Car car = new Car(petrolEngine);
        Car car2 = new Car(dieselEngine);
        car.start();
        car.stop();
        car2.start();
        car2.stop();
    }
}