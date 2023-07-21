package T5;

public class PetrolEngine extends Engine{
    @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Бензиновый двигатель остановлен");
    }
}
