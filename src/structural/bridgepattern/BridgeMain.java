package structural.bridgepattern;

public class BridgeMain {

    public static void main(String[] args) {

        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

    }
}
