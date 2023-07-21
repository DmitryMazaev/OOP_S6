package T4;

public class Square extends Rectangle{

    public Square(int width) {
        super(width, width);
    }

    public int area() {
        return getWidth()*getWidth();
    }

}
