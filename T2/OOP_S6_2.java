package T2;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
//Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), 
//напишите метод calculateAllowedSpeed(). 
//Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
public class OOP_S6_2 {
    public static void main(String[] args) {
        iSpeedCalculation vehicle1 = new Car(100, "Жигули");
        iSpeedCalculation vehicle2 = new Bus(80, "ПАЗ");
        System.out.println("Допустимая скорость ТС "+ vehicle1.getType() + " - " + vehicle1.calculateAllowedSpeed() + " км/ч");
        System.out.println("Допустимая скорость ТС "+ vehicle2.getType() + " - " + vehicle2.calculateAllowedSpeed() + " км/ч");
    }
}
