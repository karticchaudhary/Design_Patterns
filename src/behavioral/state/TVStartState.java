package behavioral.state;

public class TVStartState implements TVState{
    @Override
    public void doAction() {
        System.out.println("TV ON");
    }
}
