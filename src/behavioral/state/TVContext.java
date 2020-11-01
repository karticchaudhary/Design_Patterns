package behavioral.state.ReadMe;

public class TVContext implements TVState {
    private TVState tvState;

    public void setTvState(TVState tvState) {
        this.tvState = tvState;
    }

    public TVState getTvState() {
        return tvState;
    }

    @Override
    public void doAction() {
        tvState.doAction();
    }

}
