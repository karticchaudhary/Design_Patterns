package behavioral.state.ReadMe;

public class TVStopState implements TVState {

    @Override
    public void doAction() {
        System.out.println("TV OFF");
    }

}
