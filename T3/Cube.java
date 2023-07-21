package T3;

public class Cube implements iPlanarShape, iVolumeShape{
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
    
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
