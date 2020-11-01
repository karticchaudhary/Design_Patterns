package behavioral.state.ReadMe;

public class TVMain {

    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        TVState startState = new TVStartState();
        TVState stopState = new TVStopState();

        tvContext.setTvState(startState);
        tvContext.doAction();
        tvContext.setTvState(stopState);
        tvContext.doAction();

    }
}
