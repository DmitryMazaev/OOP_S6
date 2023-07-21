package T4;


//4) Переписать код в соответствии с Liskov Substitution Principle:

public class OOP_S6_4 {
    public static void main(String[] args) {
        iGetArea figure1 = new Rectangle(12, 6);
        System.out.println("Площадь прямоугольника составляет " + figure1.area());
        iGetArea figure2 = new Square(10);
        System.out.println("Площадь квадрата составляет " + figure2.area());
    }
    
}