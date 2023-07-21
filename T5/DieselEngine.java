package T5;

public class DieselEngine extends Engine{

    @Override
    public void start() {
        System.out.println("Дизельный двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Дизельный двигатель остановлен");
    }
    
}
