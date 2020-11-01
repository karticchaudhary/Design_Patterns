package structural.compositepattern.ShapeExample;

public class ShapeMain {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape cirlce = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(cirlce);

        drawing.draw("Red");
    }

}
