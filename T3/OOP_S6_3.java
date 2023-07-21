package T3;

//3) Переписать код в соответствии с Interface Segregation Principle:
//Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

public class OOP_S6_3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Cube cube1 = new Cube(4);
        System.out.println("Площадь круга радиусом "+ circle1.getRadius()+ " м составляет " + circle1.area() + " м2");
        System.out.println("Площадь поверхности куба с длиной грани "+ cube1.getEdge()+ " м составляет " + cube1.area() + " м2");
        System.out.println("Объем куба с длиной грани "+ cube1.getEdge()+ " м составляет " + cube1.volume() + " м3");
    }
}
