package T5;

public class Car {
    private iEngine engine;

    public Car(iEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }
}
