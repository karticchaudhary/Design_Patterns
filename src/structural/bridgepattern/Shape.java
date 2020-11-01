package structural.bridgepattern;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
